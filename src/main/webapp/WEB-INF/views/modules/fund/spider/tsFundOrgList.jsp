<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>基金机构管理</title>
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
		<li class="active"><a href="${ctx}/fund/spider/tsFundOrg/">基金机构列表</a></li>
		<shiro:hasPermission name="fund:spider:tsFundOrg:edit"><li><a href="${ctx}/fund/spider/tsFundOrg/form">基金机构添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="tsFundOrg" action="${ctx}/fund/spider/tsFundOrg/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>机构简称：</label>
				<form:input path="orgName" htmlEscape="false" maxlength="50" class="input-medium"/>
			</li>
			<li><label>机构全名：</label>
				<form:input path="orgFullName" htmlEscape="false" maxlength="255" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>机构号</th>
				<th>机构简称</th>
				<th>机构全名</th>
				<th>联系地址</th>
				<th>traget_url</th>
				<th>traget_code</th>
				<th>更新时间</th>
				<shiro:hasPermission name="fund:spider:tsFundOrg:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="tsFundOrg">
			<tr>
				<td><a href="${ctx}/fund/spider/tsFundOrg/form?id=${tsFundOrg.id}">
					${tsFundOrg.orgId}
				</a></td>
				<td>
					${tsFundOrg.orgName}
				</td>
				<td>
					${tsFundOrg.orgFullName}
				</td>
				<td>
					${tsFundOrg.address}
				</td>
				<td>
					${tsFundOrg.tragetUrl}
				</td>
				<td>
					${tsFundOrg.tragetCode}
				</td>
				<td>
					<fmt:formatDate value="${tsFundOrg.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="fund:spider:tsFundOrg:edit"><td>
    				<a href="${ctx}/fund/spider/tsFundOrg/form?id=${tsFundOrg.id}">修改</a>
					<a href="${ctx}/fund/spider/tsFundOrg/delete?id=${tsFundOrg.id}" onclick="return confirmx('确认要删除该基金机构吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>