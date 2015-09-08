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
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundNv;
import com.thinkgem.jeesite.modules.fund.service.spider.TsFundNvService;

/**
 * 基金净值Controller
 * @author giles
 * @version 2015-08-11
 */
@Controller
@RequestMapping(value = "${adminPath}/fund/spider/tsFundNv")
public class TsFundNvController extends BaseController {

	@Autowired
	private TsFundNvService tsFundNvService;
	
	@ModelAttribute
	public TsFundNv get(@RequestParam(required=false) String id) {
		TsFundNv entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = tsFundNvService.get(id);
		}
		if (entity == null){
			entity = new TsFundNv();
		}
		return entity;
	}
	
	@RequiresPermissions("fund:spider:tsFundNv:view")
	@RequestMapping(value = {"list", ""})
	public String list(TsFundNv tsFundNv, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<TsFundNv> page = tsFundNvService.findPage(new Page<TsFundNv>(request, response), tsFundNv); 
		model.addAttribute("page", page);
		return "modules/fund/spider/tsFundNvList";
	}

	@RequiresPermissions("fund:spider:tsFundNv:view")
	@RequestMapping(value = "form")
	public String form(TsFundNv tsFundNv, Model model) {
		model.addAttribute("tsFundNv", tsFundNv);
		return "modules/fund/spider/tsFundNvForm";
	}

	@RequiresPermissions("fund:spider:tsFundNv:edit")
	@RequestMapping(value = "save")
	public String save(TsFundNv tsFundNv, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, tsFundNv)){
			return form(tsFundNv, model);
		}
		tsFundNvService.save(tsFundNv);
		addMessage(redirectAttributes, "保存基金净值成功");
		return "redirect:"+Global.getAdminPath()+"/fund/spider/tsFundNv/?repage";
	}
	
	@RequiresPermissions("fund:spider:tsFundNv:edit")
	@RequestMapping(value = "delete")
	public String delete(TsFundNv tsFundNv, RedirectAttributes redirectAttributes) {
		tsFundNvService.delete(tsFundNv);
		addMessage(redirectAttributes, "删除基金净值成功");
		return "redirect:"+Global.getAdminPath()+"/fund/spider/tsFundNv/?repage";
	}

}