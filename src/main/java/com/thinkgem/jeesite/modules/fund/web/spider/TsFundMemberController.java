/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.web.spider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundMember;
import com.thinkgem.jeesite.modules.fund.service.spider.TsFundMemberService;

/**
 * 基金经理Controller
 * @author giles
 * @version 2015-08-11
 */
@Controller
@RequestMapping(value = "${adminPath}/fund/spider/tsFundMember")
public class TsFundMemberController extends BaseController {

	@Autowired
	private TsFundMemberService tsFundMemberService;
	
	@ModelAttribute
	public TsFundMember get(@RequestParam(required=false) String id) {
		TsFundMember entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = tsFundMemberService.get(id);
		}
		if (entity == null){
			entity = new TsFundMember();
		}
		return entity;
	}
	
	@RequiresPermissions("fund:spider:tsFundMember:view")
	@RequestMapping(value = {"list", ""})
	public String list(TsFundMember tsFundMember, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<TsFundMember> page = tsFundMemberService.findPage(new Page<TsFundMember>(request, response), tsFundMember); 
		model.addAttribute("page", page);
		return "modules/fund/spider/tsFundMemberList";
	}

	@RequiresPermissions("fund:spider:tsFundMember:view")
	@RequestMapping(value = "form")
	public String form(TsFundMember tsFundMember, Model model) {
		model.addAttribute("tsFundMember", tsFundMember);
		return "modules/fund/spider/tsFundMemberForm";
	}

	@RequiresPermissions("fund:spider:tsFundMember:edit")
	@RequestMapping(value = "save")
	public String save(TsFundMember tsFundMember, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, tsFundMember)){
			return form(tsFundMember, model);
		}
		tsFundMemberService.save(tsFundMember);
		addMessage(redirectAttributes, "保存基金经理成功");
		return "redirect:"+Global.getAdminPath()+"/fund/spider/tsFundMember/?repage";
	}
	
	@RequiresPermissions("fund:spider:tsFundMember:edit")
	@RequestMapping(value = "delete")
	public String delete(TsFundMember tsFundMember, RedirectAttributes redirectAttributes) {
		tsFundMemberService.delete(tsFundMember);
		addMessage(redirectAttributes, "删除基金经理成功");
		return "redirect:"+Global.getAdminPath()+"/fund/spider/tsFundMember/?repage";
	}

}