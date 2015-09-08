package com.thinkgem.jeesite.modules.tz.spider.main;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.tools.BaseJunit4Test;

public class ListTest extends BaseJunit4Test{ 
	protected Logger logger = LoggerFactory.getLogger(getClass());
	//@Resource  //自动注入,默认按名称  
    //private IBaseDao baseDao;  
	
	@Autowired
	SpiderHawBuyList spiderHawBuyList;
 
	@Test   //标明是测试方法  
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void insert( ) {
		spiderHawBuyList.processList();
	}  


}
