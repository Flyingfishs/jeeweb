package com.thinkgem.jeesite.modules.fund.spider.core;

import java.util.HashMap;
import java.util.Map;

/**
 * 状态计步器
 * @author giles
 *
 */
public class SpiderStatus {
	
	static Map<String,String> SPIDER_STATUS=new HashMap<String,String>();

	synchronized static void run(String threadname){
		SPIDER_STATUS.put(threadname,"run");
	}
	synchronized static void stop(String threadname){
		SPIDER_STATUS.put(threadname,"stop");
	}
	synchronized static String status(String threadname){
		if(SPIDER_STATUS.containsKey(threadname)){
			return SPIDER_STATUS.get(threadname);
		}
		return "stoped";
	}
	static boolean isRun(String threadname){
		if(SPIDER_STATUS.containsKey(threadname)){
			return SPIDER_STATUS.get(threadname)=="run";
		}
		return false;
	}
	static boolean isStop(String threadname){
		if(SPIDER_STATUS.containsKey(threadname)){
			return SPIDER_STATUS.get(threadname)=="stop";
		}
		return false;
	}
	
	synchronized static void removeThreadStatus(String threadname){
		SPIDER_STATUS.remove(threadname);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
