<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="gb2312"%>
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
			<td width="17" height="29" valign="top"
				background="../images/mail_leftbg.gif"><img
				src="../images/left-top-right.gif" width="17" height="29" /></td>
			<td width="935" height="29" valign="top"
				background="../images/content-bg.gif"><table width="100%"
					height="31" border="0" cellpadding="0" cellspacing="0"
					class="left_topbg" id="table2">
					<tr>
						<td height="31"><div class="titlebt">图书管理</div></td>
					</tr>
				</table></td>
			<td width="16" valign="top" background="../images/mail_rightbg.gif"><img
				src="../images/nav-right-bg.gif" width="16" height="29" /></td>
		</tr>
		<tr>
			<td height="71" valign="middle"
				background="../images/mail_leftbg.gif">&nbsp;</td>
			<td valign="top" bgcolor="#F7F8F9"><table width="100%"
					height="138" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td height="13" valign="top">&nbsp;</td>
					</tr>
					<tr>
						<td valign="top"><table width="98%" border="0" align="center"
								cellpadding="0" cellspacing="0">
								<tr>
									<td class="left_txt">当前位置：图书管理</td>
								</tr>

								<tr>
									<td><table width="100%" height="31" border="0"
											cellpadding="0" cellspacing="0" class="nowtable">
											<tr class="left_bt2">
											</tr>
										</table>
									</td>
								</tr>

								<tr>
									<td><table width="100%" border="0" cellspacing="0"
											cellpadding="0">
											<form name="form1" method="POST" action="admintitlechk.asp">
												<tr>
													<td width="20%" height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">设定网站名称：</td>
													<td width="3%" bgcolor="#f2f2f2">&nbsp;</td>
													<td width="32%" height="30" bgcolor="#f2f2f2"><input
														name="title" type="text" id="title" size="30" /></td>
													<td width="45%" height="30" bgcolor="#f2f2f2"
														class="left_txt">网站名称</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">网站访问地址：</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="web"
														size="30" /></td>
													<td height="30" class="left_txt">网站的网址</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">网站备案证号：</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="logo" size="25" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">信息产业部备案号</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">联系电话信息：
													</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="tel"
														size="30" /></td>
													<td height="30" class="left_txt">设置网站联系电话</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">网站客服QQ：</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="myqq" size="30" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">设置网站客服QQ号</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#F7F8F9"
														class="left_txt2">网站客服QQ2：</td>
													<td bgcolor="#F7F8F9">&nbsp;</td>
													<td height="30" bgcolor="#F7F8F9"><input type="text"
														name="myqq2" size="30" /></td>
													<td height="30" bgcolor="#F7F8F9" class="left_txt">设置网站客服QQ2号</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#F2F2F2"
														class="left_txt2">管理员邮箱：</td>
													<td bgcolor="#F2F2F2">&nbsp;</td>
													<td height="30" bgcolor="#F2F2F2"><input name="mymail"
														type="text" id="mymail" size="30" /></td>
													<td height="30" bgcolor="#F2F2F2"><span
														class="left_txt">设置网站客服Email</span></td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">网站滚动通知：</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="addinfo"
														size="30" /></td>
													<td height="30"><span class="left_txt">设置网站滚动公告内容，支持HTML</span></td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">关键词设置为：</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="ci" size="30" /></td>
													<td height="30" bgcolor="#f2f2f2"><span
														class="left_txt">设置网站的关键词，更容易被搜索引挚找到。</span></td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">是否开启复制功能：</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="kkk" size="4" /></td>
													<td height="30" class="left_txt">是否禁止外部复制功能 0关闭，1开启</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">网站风格设置：</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="css" size="24" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">尾部加/
														CSS样式定义内容用</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">程序授权注册码：</td>
													<td>&nbsp;</td>
													<td height="30"><input name="zhengban" type="text"
														id="zhengban" size="24" /></td>
													<td height="30" class="left_txt">网站正版授权注册码！</td>
												</tr>

												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">51LA网站统计ID：</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input name="tongj"
														type="text" id="tongj" size="15" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">51la统计ID，换成您的统计ID号即可
														（<a href="http://www.51.la/reg.asp" target="_blank">免费注册51la统计</a>）
													</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">后台管理文件夹：</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="foxa"
														size="24" /></td>
													<td height="30" class="left_txt">加强安全性，修改后请将后台管理文件夹改为此名</td>
												</tr>
												<tr>
													<td height="17" colspan="4" align="right">&nbsp;</td>
												</tr>
										</table></td>
								</tr>
							</table></td>
					</tr>
				</table></td>
			<td background="../images/mail_rightbg.gif">&nbsp;</td>
		</tr>
		<tr>
			<td valign="middle" background="../images/mail_leftbg.gif"><img
				src="../images/buttom_left2.gif" width="17" height="17" /></td>
			<td height="17" valign="top" background="../images/buttom_bgs.gif"><img
				src="../images/buttom_bgs.gif" width="17" height="17" /></td>
			<td background="../images/mail_rightbg.gif"><img
				src="../images/buttom_right2.gif" width="16" height="17" /></td>
		</tr>
	</table>

</body>
