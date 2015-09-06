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
						<td height="31"><div class="titlebt">图书管理</div></td>
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
									<td class="left_txt">当前位置：图书管理</td>
								</tr>
								<tr>
									<td>
										<table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="nowtable">
											<tr class="left_bt2">
												<td width="20%" height="30" >ISBN</td>
												<td width="20%" height="30" >图书名称</td>
												<td width="20%" height="30" >作者</td>
												<td width="10%" height="30" >出版社</td>
												<td width="10%" height="30" >类型</td>
												<td width="10%" height="30" >状态</td>
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
												<s:iterator value="#session.bookList.list" status="statu" id="item"> 
												<tr>
												<%-- <s:debug></s:debug> --%>
													<td width='20%' height='30' bgcolor='#f2f2f2'><s:property value="ISBN"/></td>
													<td width='20%' height='30' bgcolor='#f2f2f2'><s:property value="name"/></td>
													<td width='20%' height='30' bgcolor='#f2f2f2'><s:property value="author"/></td>
													<td width='10%' height='30' bgcolor='#f2f2f2'><s:property value="publisher"/></td>
													<td width='10%' height='30' bgcolor='#f2f2f2'><s:property value="type"/></td>
													<td width='10%' height='30' bgcolor='#f2f2f2'><s:property value="status"/></td>
													<td width='10%' height='30' bgcolor='#f2f2f2'>
														<a href='<s:url action="bookFind.action"><s:param name="bookId" value="bookId" /></s:url>'>修改 </a>&nbsp;
														<a href='<s:url action="bookDelete.action"><s:param name="bookId" value="bookId" /></s:url>'>删除 </a>
													</td>
												</tr>
												</s:iterator>  
												<tr>
													<td colspan='6'>
														<a href='<s:url action="bookView.action?pageSize=10"><s:param name="pageNo" value="1" /></s:url>'>首页</a>
														<s:if test="#session.bookList.pageNo != 1">
															<a href='<s:url action="bookView.action?pageSize=10"><s:param name="pageNo" value="#session.bookList.pageNo-1" /></s:url>'>上一页</a>
														</s:if>
														<s:if test="#session.bookList.pageNo != #session.bookList.totalPages">
														<a href='<s:url action="bookView.action?pageSize=10"><s:param name="pageNo" value="#session.bookList.pageNo+1" /></s:url>'>下一页</a>
														</s:if>
														<a href='<s:url action="bookView.action?pageSize=10"><s:param name="pageNo" value="#session.bookList.totalPages" /></s:url>'>尾页</a>
														<a href="javascript:void(0);">第<s:property value="#session.bookList.pageNo"/>页
															/共<s:property value="#session.bookList.totalPages"/>页</a>
														<a href="javascript:void(0);">共<s:property value="#session.bookList.totalRecords"/>条</a>
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
