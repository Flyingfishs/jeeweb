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
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundOrg;
import com.thinkgem.jeesite.modules.fund.service.spider.TsFundOrgService;

/**
 * 基金机构Controller
 * @author giles
 * @version 2015-08-11
 */
@Controller
@RequestMapping(value = "${adminPath}/fund/spider/tsFundOrg")
public class TsFundOrgController extends BaseController {

	@Autowired
	private TsFundOrgService tsFundOrgService;
	
	@ModelAttribute
	public TsFundOrg get(@RequestParam(required=false) String id) {
		TsFundOrg entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = tsFundOrgService.get(id);
		}
		if (entity == null){
			entity = new TsFundOrg();
		}
		return entity;
	}
	
	@RequiresPermissions("fund:spider:tsFundOrg:view")
	@RequestMapping(value = {"list", ""})
	public String list(TsFundOrg tsFundOrg, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<TsFundOrg> page = tsFundOrgService.findPage(new Page<TsFundOrg>(request, response), tsFundOrg); 
		model.addAttribute("page", page);
		return "modules/fund/spider/tsFundOrgList";
	}

	@RequiresPermissions("fund:spider:tsFundOrg:view")
	@RequestMapping(value = "form")
	public String form(TsFundOrg tsFundOrg, Model model) {
		model.addAttribute("tsFundOrg", tsFundOrg);
		return "modules/fund/spider/tsFundOrgForm";
	}

	@RequiresPermissions("fund:spider:tsFundOrg:edit")
	@RequestMapping(value = "save")
	public String save(TsFundOrg tsFundOrg, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, tsFundOrg)){
			return form(tsFundOrg, model);
		}
		tsFundOrgService.save(tsFundOrg);
		addMessage(redirectAttributes, "保存基金机构成功");
		return "redirect:"+Global.getAdminPath()+"/fund/spider/tsFundOrg/?repage";
	}
	
	@RequiresPermissions("fund:spider:tsFundOrg:edit")
	@RequestMapping(value = "delete")
	public String delete(TsFundOrg tsFundOrg, RedirectAttributes redirectAttributes) {
		tsFundOrgService.delete(tsFundOrg);
		addMessage(redirectAttributes, "删除基金机构成功");
		return "redirect:"+Global.getAdminPath()+"/fund/spider/tsFundOrg/?repage";
	}

}