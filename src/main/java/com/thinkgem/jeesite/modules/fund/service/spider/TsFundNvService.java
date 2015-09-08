/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.service.spider;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundNv;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundNvDao;

/**
 * 基金净值Service
 * @author giles
 * @version 2015-08-11
 */
@Service
@Transactional(readOnly = true)
public class TsFundNvService extends CrudService<TsFundNvDao, TsFundNv> {

	public TsFundNv get(String id) {
		return super.get(id);
	}
	
	public List<TsFundNv> findList(TsFundNv tsFundNv) {
		return super.findList(tsFundNv);
	}
	
	public Page<TsFundNv> findPage(Page<TsFundNv> page, TsFundNv tsFundNv) {
		return super.findPage(page, tsFundNv);
	}
	
	@Transactional(readOnly = false)
	public void save(TsFundNv tsFundNv) {
		super.save(tsFundNv);
	}
	
	@Transactional(readOnly = false)
	public void delete(TsFundNv tsFundNv) {
		super.delete(tsFundNv);
	}
	
}