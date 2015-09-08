package com.thinkgem.jeesite.modules.fund.spider.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 消息计步器
 * @author giles
 *
 */
public class SpiderMessage {

	static Map<String,List<String>> SPIDER_MESSAGE = new LinkedHashMap<String,List<String>>();
	
	synchronized static List<String> getMessage(String threadname){
		if(SPIDER_MESSAGE.containsKey(threadname)){
			return SPIDER_MESSAGE.get(threadname);
		}
		return null;
	}
	//threadname:string  value:[]
	synchronized static void setMessage(String threadname,String value){
		List<String> msgs = new ArrayList<String>();
		msgs.add(value);
		SPIDER_MESSAGE.put(threadname,msgs);
	}
	
	//threadname:string  value:string
	synchronized static void addMessage(String threadname,String value){
		if(SPIDER_MESSAGE.containsKey(threadname)){
			SPIDER_MESSAGE.get(threadname).add(value);
		}else{
			List<String> msgs = new ArrayList<String>();
			msgs.add(value);
			SPIDER_MESSAGE.put(threadname,msgs);
		}
	}

	//threadname:string
	synchronized static void removeThreadMessage(String threadname){
		SPIDER_MESSAGE.remove(threadname);
	}

	public static void main(String[] args) {

	}

}
