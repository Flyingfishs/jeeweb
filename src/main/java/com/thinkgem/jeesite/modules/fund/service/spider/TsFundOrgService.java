/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.service.spider;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundOrg;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundOrgDao;

/**
 * 基金机构Service
 * @author giles
 * @version 2015-08-11
 */
@Service
@Transactional(readOnly = true)
public class TsFundOrgService extends CrudService<TsFundOrgDao, TsFundOrg> {

	public TsFundOrg get(String id) {
		return super.get(id);
	}
	
	public List<TsFundOrg> findList(TsFundOrg tsFundOrg) {
		return super.findList(tsFundOrg);
	}
	
	public Page<TsFundOrg> findPage(Page<TsFundOrg> page, TsFundOrg tsFundOrg) {
		return super.findPage(page, tsFundOrg);
	}
	
	@Transactional(readOnly = false)
	public void save(TsFundOrg tsFundOrg) {
		super.save(tsFundOrg);
	}
	
	@Transactional(readOnly = false)
	public void delete(TsFundOrg tsFundOrg) {
		super.delete(tsFundOrg);
	}
	
}