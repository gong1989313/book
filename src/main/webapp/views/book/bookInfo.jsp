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
						<td height="31"><div class="titlebt">ͼ�����</div></td>
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
									<td class="left_txt">��ǰλ�ã�ͼ�����</td>
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
														class="left_txt2">�趨��վ���ƣ�</td>
													<td width="3%" bgcolor="#f2f2f2">&nbsp;</td>
													<td width="32%" height="30" bgcolor="#f2f2f2"><input
														name="title" type="text" id="title" size="30" /></td>
													<td width="45%" height="30" bgcolor="#f2f2f2"
														class="left_txt">��վ����</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">��վ���ʵ�ַ��</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="web"
														size="30" /></td>
													<td height="30" class="left_txt">��վ����ַ</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">��վ����֤�ţ�</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="logo" size="25" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">��Ϣ��ҵ��������</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">��ϵ�绰��Ϣ��
													</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="tel"
														size="30" /></td>
													<td height="30" class="left_txt">������վ��ϵ�绰</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">��վ�ͷ�QQ��</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="myqq" size="30" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">������վ�ͷ�QQ��</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#F7F8F9"
														class="left_txt2">��վ�ͷ�QQ2��</td>
													<td bgcolor="#F7F8F9">&nbsp;</td>
													<td height="30" bgcolor="#F7F8F9"><input type="text"
														name="myqq2" size="30" /></td>
													<td height="30" bgcolor="#F7F8F9" class="left_txt">������վ�ͷ�QQ2��</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#F2F2F2"
														class="left_txt2">����Ա���䣺</td>
													<td bgcolor="#F2F2F2">&nbsp;</td>
													<td height="30" bgcolor="#F2F2F2"><input name="mymail"
														type="text" id="mymail" size="30" /></td>
													<td height="30" bgcolor="#F2F2F2"><span
														class="left_txt">������վ�ͷ�Email</span></td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">��վ����֪ͨ��</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="addinfo"
														size="30" /></td>
													<td height="30"><span class="left_txt">������վ�����������ݣ�֧��HTML</span></td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">�ؼ�������Ϊ��</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="ci" size="30" /></td>
													<td height="30" bgcolor="#f2f2f2"><span
														class="left_txt">������վ�Ĺؼ��ʣ������ױ�������ֿ�ҵ���</span></td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">�Ƿ������ƹ��ܣ�</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="kkk" size="4" /></td>
													<td height="30" class="left_txt">�Ƿ��ֹ�ⲿ���ƹ��� 0�رգ�1����</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">��վ������ã�</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="css" size="24" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">β����/
														CSS��ʽ����������</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">������Ȩע���룺</td>
													<td>&nbsp;</td>
													<td height="30"><input name="zhengban" type="text"
														id="zhengban" size="24" /></td>
													<td height="30" class="left_txt">��վ������Ȩע���룡</td>
												</tr>

												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">51LA��վͳ��ID��</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input name="tongj"
														type="text" id="tongj" size="15" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">51laͳ��ID����������ͳ��ID�ż���
														��<a href="http://www.51.la/reg.asp" target="_blank">���ע��51laͳ��</a>��
													</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">��̨�����ļ��У�</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="foxa"
														size="24" /></td>
													<td height="30" class="left_txt">��ǿ��ȫ�ԣ��޸ĺ��뽫��̨�����ļ��и�Ϊ����</td>
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
