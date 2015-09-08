package com.thinkgem.jeesite.tools;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.modules.fund.entity.spider.TsFundInfo;
import com.thinkgem.jeesite.modules.fund.service.spider.TsFundInfoService;
import com.thinkgem.jeesite.modules.fund.spider.temp.HawBuy_ProductImpl;

public class HawBuyTest extends BaseJunit4Test{ 
	protected Logger logger = LoggerFactory.getLogger(getClass());
	@Resource  //自动注入,默认按名称  
    //private IBaseDao baseDao;  
	
	@Autowired
	private TsFundInfoService tsFundInfoService;
 
	@Test   //标明是测试方法  
	@Transactional   //标明此方法需使用事务  
	@Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚  
	public void insert( ) {
		HawBuy_ProductImpl hawInpl = new HawBuy_ProductImpl();
		boolean isRun = true;
		TsFundInfo tsFundInfo = new TsFundInfo();
		tsFundInfo.setTargetUrl("http://simu.howbuy.com/zexi/P00511/");
		//while(isRun){
			TsFundInfo t =  tsFundInfoService.getSpider(tsFundInfo);
			logger.debug("搜取基金{} url: {}",t.getFundName(),t.getTargetUrl());
			hawInpl.process(t);
		//}
    }  


}
