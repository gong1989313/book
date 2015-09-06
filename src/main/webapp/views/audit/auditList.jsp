<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #F8F9FA;
}
-->
</style>
	<script type="text/javascript" src="/book/views/js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">

	</script>
<link href="/book/views/images/skin.css" rel="stylesheet" type="text/css" />
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="17" height="29" valign="top"
				background="/book/views/images/mail_leftbg.gif"><img
				src="/book/views/images/left-top-right.gif" width="17" height="29" /></td>
			<td width="935" height="29" valign="top"
				background="/book/views/images/content-bg.gif"><table width="100%"
					height="31" border="0" cellpadding="0" cellspacing="0"
					class="left_topbg" id="table2">
					<tr>
						<td height="31"><div class="titlebt">日志管理</div></td>
					</tr>
				</table></td>
			<td width="16" valign="top" background="/book/views/images/mail_rightbg.gif"><img
				src="/book/views/images/nav-right-bg.gif" width="16" height="29" /></td>
		</tr>
		<tr>
			<td height="71" valign="middle"
				background="/book/views/images/mail_leftbg.gif">&nbsp;</td>
			<td valign="top" bgcolor="#F7F8F9"><table width="100%" height="138" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td valign="top"><table width="98%" border="0" align="center"
								cellpadding="0" cellspacing="0">
								<tr>
									<td class="left_txt">当前位置：日志管理</td>
								</tr>
								<tr>
									<td>
										<table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="nowtable">
											<tr class="left_bt2">
												<td width="10%" height="10" >操作用户ID</td>
												<td width="10%" height="10" >操作用户名称</td>
												<td width="20%" height="20" >操作时间</td>
												<td width="20%" height="30" >操作事件记录</td>
												<td width="10%" height="30" >事件类型</td>
												<td width="10%" height="30" >操作状态</td>
												<td width="10%" height="30" >操作</td>
											</tr>
										</table>
									</td>
								</tr>
								
								<tr>
									<td>
										<table width="100%" border="0" cellspacing="0"
											cellpadding="0">
											<form name="form1" method="POST" action="">
												<s:iterator value="#session.auditList.list" status="statu" id="item"> 
												<tr>
													<td width='10%' height='10' bgcolor='#f2f2f2'><s:property value="userId"/></td>
													<td width='10%' height='10' bgcolor='#f2f2f2'><s:property value="userName"/></td>
													<td width='20%' height='20' bgcolor='#f2f2f2'><s:property value="dateTime"/></td>
													<td width='20%' height='30' bgcolor='#f2f2f2'><s:property value="event"/></td>
													<td width='10%' height='30' bgcolor='#f2f2f2'><s:property value="type"/></td>
													<td width='10%' height='30' bgcolor='#f2f2f2'><s:property value="status"/></td>
													<td width='10%' height='30' bgcolor='#f2f2f2'>
														<a href='<s:url action="auditFind.action"><s:param name="id" value="id" /></s:url>'>详情 </a>
													</td>
												</tr>
												</s:iterator>  
												<tr>
													<td colspan='6'>
														<a href='<s:url action="auditView.action?pageSize=10"><s:param name="pageNo" value="1" /></s:url>'>首页</a>
														<s:if test="#session.auditList.pageNo != 1">
															<a href='<s:url action="auditView.action?pageSize=10"><s:param name="pageNo" value="#session.auditList.pageNo-1" /></s:url>'>上一页</a>
														</s:if>
														<s:if test="#session.auditList.pageNo != #session.auditList.totalPages">
														<a href='<s:url action="auditView.action?pageSize=10"><s:param name="pageNo" value="#session.auditList.pageNo+1" /></s:url>'>下一页</a>
														</s:if>
														<a href='<s:url action="auditView.action?pageSize=10"><s:param name="pageNo" value="#session.auditList.totalPages" /></s:url>'>尾页</a>
														<a href="javascript:void(0);">第<s:property value="#session.auditList.pageNo"/>页
															/共<s:property value="#session.auditList.totalPages"/>页</a>
														<a href="javascript:void(0);">共<s:property value="#session.auditList.totalRecords"/>条</a>
													</td>
													<td>
														<a href="/book/views/book/bookAdd.jsp">新增图书</a>
													</td>
												</tr>
												<tr>
													<td height="17" colspan="5" align="right">&nbsp;</td>
												</tr>
										</table>
									</td>
								</tr>
							</table></td>
					</tr>
				</table></td>
			<td background="/book/views/images/mail_rightbg.gif">&nbsp;</td>
		</tr>
		<tr>
			<td valign="middle" background="/book/views/images/mail_leftbg.gif">
				<img src="/book/views/images/buttom_left2.gif" width="17" height="17" />
			</td>
			<td height="17" valign="top" background="/book/views/images/buttom_bgs.gif">
				<img src="/book/views/images/buttom_bgs.gif" width="17" height="17" />
			</td>
			<td background="/book/views/images/mail_rightbg.gif">
				<img src="/book/views/images/buttom_right2.gif" width="16" height="17" />
			</td>
		</tr>
	</table>

</body>
