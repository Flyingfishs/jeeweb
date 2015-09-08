/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.fund.dao.spider;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundMember;

/**
 * 基金经理DAO接口
 * @author giles
 * @version 2015-08-11
 */
@MyBatisDao
public interface TsFundMemberDao extends CrudDao<TsFundMember> {
	
}