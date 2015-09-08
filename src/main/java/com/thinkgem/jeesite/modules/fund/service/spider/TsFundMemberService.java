/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.service.spider;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundMember;
import com.thinkgem.jeesite.modules.fund.dao.spider.TsFundMemberDao;

/**
 * 基金经理Service
 * @author giles
 * @version 2015-08-11
 */
@Service
@Transactional(readOnly = true)
public class TsFundMemberService extends CrudService<TsFundMemberDao, TsFundMember> {

	public TsFundMember get(String id) {
		return super.get(id);
	}
	
	public List<TsFundMember> findList(TsFundMember tsFundMember) {
		return super.findList(tsFundMember);
	}
	
	public Page<TsFundMember> findPage(Page<TsFundMember> page, TsFundMember tsFundMember) {
		return super.findPage(page, tsFundMember);
	}
	
	@Transactional(readOnly = false)
	public void save(TsFundMember tsFundMember) {
		super.save(tsFundMember);
	}
	
	@Transactional(readOnly = false)
	public void delete(TsFundMember tsFundMember) {
		super.delete(tsFundMember);
	}
	
}