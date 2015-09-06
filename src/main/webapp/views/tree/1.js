var setting = {
	data : {
		simpleData : {
			enable : true,
		 id:"id",
		 code: "code",
		 pId:"pId",
		}
	},
	async : {
		enable : true,
		url : "/book/tree/aaa.action",
		autoParam : [ "id", "name" ],
		otherParam : {
			"otherParam" : "zTreeAsyncTest"
		},
		// dataType: "text",//默认text
		// type:"get",//默认post
		dataFilter : filter
	// 异步返回后经过Filter
	},
	callback : {
		// beforeAsync: zTreeBeforeAsync, // 异步加载事件之前得到相应信息
		asyncSuccess : zTreeOnAsyncSuccess,// 异步加载成功的fun
		asyncError : zTreeOnAsyncError, // 加载错误的fun
		beforeClick : beforeClick // 捕获单击节点之前的事件回调函数
	}
};
// treeId是treeDemo
function filter(treeId, parentNode, childNodes) {
	if (!childNodes)
		return null;
	for (var i = 0, l = childNodes.length; i < l; i++) {
		childNodes[i].name = childNodes[i].name.replace('', '');
	}
	return childNodes;
}
function beforeClick(treeId, treeNode) {
	if (!treeNode.isParent) {
		alert("请选择父节点");
		return false;
	} else {
		return true;
	}
}
function zTreeOnAsyncError(event, treeId, treeNode) {
	alert("异步加载失败!");
}
function zTreeOnAsyncSuccess(event, treeId, treeNode, msg) {

}
/** *********************当你点击父节点是,会异步访问servlet,把id传过去**************************** */
var zNodes = [];
/*
 * var zNodes =[ { id:1, pId:0, name:"parentNode 1", open:true}, { id:11, pId:1,
 * name:"parentNode 11"}, { id:111, pId:11, name:"leafNode 111"}, { id:112,
 * pId:11, name:"leafNode 112"}, { id:113, pId:11, name:"leafNode 113"}, {
 * id:114, pId:11, name:"leafNode 114"}, { id:12, pId:1, name:"parentNode 12"}, {
 * id:121, pId:12, name:"leafNode 121"}, { id:122, pId:12, name:"leafNode 122"}, {
 * id:123, pId:12, name:"leafNode 123"}, { id:13, pId:1, name:"parentNode 13",
 * isParent:true}, { id:2, pId:0, name:"parentNode 2", isParent:true} ];
 */
$(document).ready(function() {
	$.fn.zTree.init($("#treeDemo"), setting, zNodes);
});
