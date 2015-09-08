<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>基金信息管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/fund/spider/tsFundInfo/">基金信息列表</a></li>
		<shiro:hasPermission name="fund:spider:tsFundInfo:edit"><li><a href="${ctx}/fund/spider/tsFundInfo/form">基金信息添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="tsFundInfo" action="${ctx}/fund/spider/tsFundInfo/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>基金简称：</label>
				<form:input path="fundName" htmlEscape="false" maxlength="255" class="input-medium"/>
			</li>
			<li><label>基金全称：</label>
				<form:input path="fundFullName" htmlEscape="false" maxlength="255" class="input-medium"/>
			</li>
			
			<li><label>targer_run：</label>
				<form:input path="targerRun" htmlEscape="false" maxlength="1" class="input-medium"/>
			</li>
			
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
			<a class="btn btn-primary" target="_blank" href="${ctx}/fund/spider/tsFundInfo/runList"> runlist</a>
			<a class="btn btn-primary" target="_blank" href="${ctx}/fund/spider/tsFundInfo/runFund"> runFund</a>
			</li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>基金简称</th>
				<th>基金全称</th>
				<th>成立日期</th>
				<th>终止日期</th>
				<th>类别</th>
				<th>净值日期</th>
				<th>单位净值</th>
				<th>累计净值</th>
				<th>基金机构</th>
				<th>url</th>
				<th>更新时间</th>
				<shiro:hasPermission name="fund:spider:tsFundInfo:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="tsFundInfo">
			<tr>
				<td><a href="${ctx}/fund/spider/tsFundInfo/form?fundId=${tsFundInfo.fundId}">
					${tsFundInfo.fundName}
				</a></td>
				<td>
					${tsFundInfo.fundFullName}
				</td>
				<td>
					${tsFundInfo.foundationDate}
				</td>
				<td>
					${tsFundInfo.endDate}
				</td>
				<td>
					${tsFundInfo.type}
				</td>
				
				<td>
					${tsFundInfo.navDate}
				</td>
				<td>
					${tsFundInfo.nav}
				</td>
				<td>
					${tsFundInfo.addNav}
				</td>
				<td>
					${tsFundInfo.orgName}
				</td>
				<td>
					${tsFundInfo.targetUrl}
				</td>
				<%--<td>
					${tsFundInfo.targetCode}
				</td>
				--%><td>
					<fmt:formatDate value="${tsFundInfo.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="fund:spider:tsFundInfo:edit"><td>
    				<a href="${ctx}/fund/spider/tsFundInfo/form?id=${tsFundInfo.id}">修改</a>
					<a href="${ctx}/fund/spider/tsFundInfo/delete?id=${tsFundInfo.id}" onclick="return confirmx('确认要删除该基金信息吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>