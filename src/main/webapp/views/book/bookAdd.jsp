<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
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
<link href="../images/skin.css" rel="stylesheet" type="text/css" />
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="17" height="29" valign="top" background="../images/mail_leftbg.gif">
				<img src="../images/left-top-right.gif" width="17" height="29" /></td>
			<td width="935" height="29" valign="top" background="../images/content-bg.gif">
				<table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
					<tr>
						<td height="31"><div class="titlebt">新增图书</div></td>
					</tr>
				</table>
			</td>
			<td width="16" valign="top" background="../images/mail_rightbg.gif">
				<img src="../images/nav-right-bg.gif" width="16" height="29" />
			</td>
		</tr>
		<tr>
			<td height="71" valign="middle" background="../images/mail_leftbg.gif">&nbsp;</td>
			<td valign="top" bgcolor="#F7F8F9">
				<table width="100%" height="138" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td valign="top">
							<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
								<tr>
									<td class="left_txt">当前位置：新增图书</td>
								</tr>
								<tr>
									<td>
										<table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="nowtable">
											<tr>
												<td class="left_bt2">&nbsp;&nbsp;&nbsp;&nbsp;图书信息设置</td>
											</tr>
										</table>
									</td>
								</tr>
								<tr>
									<td>
										<form name="form1" method="POST" action="/book/book/bookAdd.action">
											<table width="100%" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="10%" height="30" align="left" bgcolor="#f2f2f2" class="left_txt2">
														ISBN
													</td>
													<td width="40%" height="30" align="left" bgcolor="#f2f2f2">
														<input name="isbn" type="text" id="isbn" size="30" />
													</td>
													<td width="10%" height="30" align="left" bgcolor="#f2f2f2" class="left_txt2">
														图书名称
													</td>
													<td width="40%" height="30" align="left" bgcolor="#f2f2f2">
														<input name="name" type="text" id="name" size="30" />
													</td>
												</tr>
												<tr>
													<td width="10%" height="30" align="left" bgcolor="#f2f2f2" class="left_txt2">
														图书作者
													</td>
													<td width="40%" height="30" align="left" bgcolor="#f2f2f2">
														<input name="author" type="text" id="author" size="30" />
													</td>
													<td width="10%" height="30" align="left" bgcolor="#f2f2f2" class="left_txt2">
														出版社
													</td>
													<td width="40%" height="30" align="left" bgcolor="#f2f2f2">
														<input name="publisher" type="text" id="publisher" size="30" />
													</td>
												</tr>
												<tr>
													<td width="10%" height="30" align="left" bgcolor="#f2f2f2" class="left_txt2">
														类别
													</td>
													<td width="40%" height="30" align="left" bgcolor="#f2f2f2">
														<input name="type" type="text" id="type" size="30" />
													</td>
													<td width="10%" height="30" align="left" bgcolor="#f2f2f2" class="left_txt2">
														价格
													</td>
													<td width="40%" height="30" align="left" bgcolor="#f2f2f2">
														<input name="price" type="text" id="price" size="30" />
													</td>
												</tr>
												<tr>
													<td width="10%" height="30" align="left" bgcolor="#f2f2f2" class="left_txt2">
														图书版本
													</td>
													<td width="40%" height="30" align="left" bgcolor="#f2f2f2">
														<input name="version" type="text" id="version" size="30" />
													</td>
													<td width="10%" height="30" align="left" bgcolor="#f2f2f2" class="left_txt2">
														出版时间
													</td>
													<td width="40%" height="30" align="left" bgcolor="#f2f2f2">
														<input name="publishDate" type="text" id="publishDate" size="30" />
													</td>
												</tr>
											</table>
											<table width="100%" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="40%" height="30" align="right">
														<input type="submit" value="提交" name="B1" />
													</td>
													<td width="6%" height="30" align="right">&nbsp;</td>
													<td width="6%" height="30" align="right">&nbsp;</td>
													<td width="44%" height="30">
														<input type="reset" value="取消" onclick="javascript:history.back(-1);" name="B12" />
													</td>
												</tr>
											</table>
										</form>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
			<td background="../images/mail_rightbg.gif">&nbsp;</td>
		</tr>
		<tr>
			<td valign="middle" background="../images/mail_leftbg.gif"><img
				src="../images/buttom_left2.gif" width="17" height="17" /></td>
			<td height="17" valign="top" background="../images/buttom_bgs.gif">
				<img src="../images/buttom_bgs.gif" width="17" height="17" />
			</td>
			<td background="../images/mail_rightbg.gif"><img
				src="../images/buttom_right2.gif" width="16" height="17" /></td>
		</tr>
	</table>

</body>
