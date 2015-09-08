<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>基金经理管理</title>
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
		<li class="active"><a href="${ctx}/fund/spider/tsFundMember/">基金经理列表</a></li>
		<shiro:hasPermission name="fund:spider:tsFundMember:edit"><li><a href="${ctx}/fund/spider/tsFundMember/form">基金经理添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="tsFundMember" action="${ctx}/fund/spider/tsFundMember/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>用户名：</label>
				<form:input path="mname" htmlEscape="false" maxlength="255" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>m_id</th>
				<th>用户名</th>
				<th>学历</th>
				<th>职务</th>
				<th>资产管理规模</th>
				<th>是否有公募背景</th>
				<th>target_url</th>
				<th>target_code</th>
				<th>基金id</th>
				<th>更新时间</th>
				<shiro:hasPermission name="fund:spider:tsFundMember:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="tsFundMember">
			<tr>
				<td><a href="${ctx}/fund/spider/tsFundMember/form?id=${tsFundMember.id}">
					${tsFundMember.mId}
				</a></td>
				<td>
					${tsFundMember.mname}
				</td>
				<td>
					${tsFundMember.meducation}
				</td>
				<td>
					${tsFundMember.mduty}
				</td>
				<td>
					${tsFundMember.assetMgtScale}
				</td>
				<td>
					${tsFundMember.isPublicPlacement}
				</td>
				<td>
					${tsFundMember.targetUrl}
				</td>
				<td>
					${tsFundMember.targetCode}
				</td>
				<td>
					${tsFundMember.fundId}
				</td>
				<td>
					<fmt:formatDate value="${tsFundMember.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="fund:spider:tsFundMember:edit"><td>
    				<a href="${ctx}/fund/spider/tsFundMember/form?id=${tsFundMember.id}">修改</a>
					<a href="${ctx}/fund/spider/tsFundMember/delete?id=${tsFundMember.id}" onclick="return confirmx('确认要删除该基金经理吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>