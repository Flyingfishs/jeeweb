package com.thinkgem.jeesite.modules.tz.spider.http;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

	public static String pattern(String rule,String pageContent){
		try{
			Pattern p = Pattern.compile(rule, Pattern.DOTALL);
			Matcher m = p.matcher(pageContent);
			if (m.find()){
				int i = 2;
				while ((m.group(i) == null) && (i < rule.length())){
					i+=2;
				}
				return m.group(i);
			}else {
				return "";
			}
		}catch(Exception e){
			return "";
		}
	}
	
}
