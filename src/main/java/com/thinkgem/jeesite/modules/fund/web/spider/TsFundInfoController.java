/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.web.spider;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundInfo;
import com.thinkgem.jeesite.modules.fund.service.spider.TsFundInfoService;
import com.thinkgem.jeesite.modules.fund.spider.temp.HawBuy_ListImpl;
import com.thinkgem.jeesite.modules.fund.spider.temp.HawBuy_ProductImpl;

/**
 * 基金信息Controller
 * @author giles
 * @version 2015-08-11
 */
@Controller
@RequestMapping(value = "${adminPath}/fund/spider/tsFundInfo")
public class TsFundInfoController extends BaseController {

	@Autowired
	private TsFundInfoService tsFundInfoService;
	
	@ModelAttribute
	public TsFundInfo get(@RequestParam(required=false) String fundId) {
		TsFundInfo entity = null;
		if (StringUtils.isNotBlank(fundId)){
			TsFundInfo f = new TsFundInfo();
			f.setFundId(fundId);
			entity = tsFundInfoService.getByEnt(f);
		}
		if (entity == null){
			entity = new TsFundInfo();
		}
		return entity;
	}
	
	@RequiresPermissions("fund:spider:tsFundInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(TsFundInfo tsFundInfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<TsFundInfo> page = tsFundInfoService.findPage(new Page<TsFundInfo>(request, response), tsFundInfo); 
		model.addAttribute("page", page);
		return "modules/fund/spider/tsFundInfoList";
	}

	@RequiresPermissions("fund:spider:tsFundInfo:view")
	@RequestMapping(value = "form")
	public String form(TsFundInfo tsFundInfo, Model model) {
		model.addAttribute("tsFundInfo", tsFundInfo);
		return "modules/fund/spider/tsFundInfoForm";
	}

	@RequiresPermissions("fund:spider:tsFundInfo:edit")
	@RequestMapping(value = "save")
	public String save(TsFundInfo tsFundInfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, tsFundInfo)){
			return form(tsFundInfo, model);
		}
		tsFundInfoService.save(tsFundInfo);
		addMessage(redirectAttributes, "保存基金信息成功");
		return "redirect:"+Global.getAdminPath()+"/fund/spider/tsFundInfo/?repage";
	}
	
	@RequiresPermissions("fund:spider:tsFundInfo:edit")
	@RequestMapping(value = "delete")
	public String delete(TsFundInfo tsFundInfo, RedirectAttributes redirectAttributes) {
		tsFundInfoService.delete(tsFundInfo);
		addMessage(redirectAttributes, "删除基金信息成功");
		return "redirect:"+Global.getAdminPath()+"/fund/spider/tsFundInfo/?repage";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "runList")
	public Map<String,Object> runList(TsFundInfo tsFundInfo, RedirectAttributes redirectAttributes) {
		HawBuy_ListImpl hawInpl = new HawBuy_ListImpl();
		//SimuListImpl hawInpl = new SimuListImpl();
		hawInpl.max_page_number=1000;
		hawInpl.processList();
		Map<String,Object> res = new HashMap<String,Object>();
		res.put("info", "成功");
		return res;
	}
	
	@ResponseBody
	@RequestMapping(value = "runFund")
	public Map<String,Object> runFund(TsFundInfo tsFundInfo, RedirectAttributes redirectAttributes) {
		HawBuy_ProductImpl hawInpl = new HawBuy_ProductImpl();
		//int max = 1000;
		//tsFundInfo.setTargetType("simu");
		boolean isRun = true;
		while(isRun){
			TsFundInfo t =  tsFundInfoService.getSpider(tsFundInfo);
			if(t==null){
				break;
			}
			logger.debug("搜取基金{} url: {}",t.getFundName(),t.getTargetUrl());
			hawInpl.process(t);
		}
		Map<String,Object> res = new HashMap<String,Object>();
		res.put("info", "成功");
		return res;
	}

}