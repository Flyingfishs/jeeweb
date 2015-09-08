<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>基金净值管理</title>
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
		<li class="active"><a href="${ctx}/fund/spider/tsFundNv/">基金净值列表</a></li>
		<shiro:hasPermission name="fund:spider:tsFundNv:edit"><li><a href="${ctx}/fund/spider/tsFundNv/form">基金净值添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="tsFundNv" action="${ctx}/fund/spider/tsFundNv/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>基金日期：</label>
				<form:input path="nvDate" htmlEscape="false" maxlength="30" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>id</th>
				<th>基金ID</th>
				<th>基金日期</th>
				<th>单位净值</th>
				<th>累计净值</th>
				<th>涨幅</th>
				<th>更新时间</th>
				<shiro:hasPermission name="fund:spider:tsFundNv:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="tsFundNv">
			<tr>
				<td><a href="${ctx}/fund/spider/tsFundNv/form?id=${tsFundNv.id}">
					${tsFundNv.id}
				</a></td>
				<td>
					${tsFundNv.fundId}
				</td>
				<td>
					${tsFundNv.nvDate}
				</td>
				<td>
					${tsFundNv.nav}
				</td>
				<td>
					${tsFundNv.addNav}
				</td>
				<td>
					${tsFundNv.nvRate}
				</td>
				<td>
					<fmt:formatDate value="${tsFundNv.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="fund:spider:tsFundNv:edit"><td>
    				<a href="${ctx}/fund/spider/tsFundNv/form?id=${tsFundNv.id}">修改</a>
					<a href="${ctx}/fund/spider/tsFundNv/delete?id=${tsFundNv.id}" onclick="return confirmx('确认要删除该基金净值吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>