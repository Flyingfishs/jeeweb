package com.thinkgem.jeesite.tools;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.modules.tz.dao.TzSfNvMapper;
import com.thinkgem.jeesite.modules.tz.entity.TzSfNv;
import com.thinkgem.jeesite.modules.tz.entity.TzSfNvExample;

public class TzNavTest extends BaseJunit4Test{ 
	protected Logger logger = LoggerFactory.getLogger(getClass());
	@Resource  //自动注入,默认按名称  
    //private IBaseDao baseDao;  
	
	@Autowired
	private TzSfNvMapper tzSfNvMapper;
 
	@Test   //标明是测试方法  
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void insert( ) {
		TzSfNv nv = new TzSfNv();
		nv.setNavDate("2015-09-09");
		nv.setNavRate("23");
		nv.setCreateUserName("admin");
		tzSfNvMapper.insertSelective(nv);
		System.out.println(nv.getId());
	
		
	}  

	
	@Test   //标明是测试方法  
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void select( ) {
		TzSfNvExample nv = new TzSfNvExample();
		nv.createCriteria().andNavDateIsNotNull();
		List<TzSfNv> list = tzSfNvMapper.selectByExample(nv);
		for(TzSfNv item : list){
			System.out.println(item.getId() +" "+item.getNavDate());
		}
	
		
	}

}
