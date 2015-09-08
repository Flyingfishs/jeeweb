package com.thinkgem.jeesite.modules.fund.spider.core.parser;

public interface IHtmlParser<T> {
	public T parser(String html);
}
