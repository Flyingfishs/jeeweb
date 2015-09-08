/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.service.spider;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundInfoDao;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundInfo;

/**
 * 基金信息Service
 * @author giles
 * @version 2015-08-11
 */
@Service
@Transactional(readOnly = true)
public class TsFundInfoService extends CrudService<TsFundInfoDao, TsFundInfo> {

	public TsFundInfo get(String id) {
		return super.get(id);
	}
	
	public TsFundInfo getByEnt(TsFundInfo tsFundInfo) {
		return super.getByEnt(tsFundInfo);
	}
	
	public TsFundInfo getSpider(TsFundInfo tsFundInfo) {
		return dao.getSpider(tsFundInfo);
	}
	
	public List<TsFundInfo> findList(TsFundInfo tsFundInfo) {
		return super.findList(tsFundInfo);
	}
	
	public Page<TsFundInfo> findPage(Page<TsFundInfo> page, TsFundInfo tsFundInfo) {
		return super.findPage(page, tsFundInfo);
	}
	
	@Transactional(readOnly = false)
	public void save(TsFundInfo tsFundInfo) {
		super.save(tsFundInfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(TsFundInfo tsFundInfo) {
		super.delete(tsFundInfo);
	}
	
}