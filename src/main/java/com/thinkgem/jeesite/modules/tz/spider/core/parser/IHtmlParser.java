package com.thinkgem.jeesite.modules.tz.spider.core.parser;

public interface IHtmlParser<T> {
	public T parser(String html);
}
