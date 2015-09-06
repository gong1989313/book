package com.gxq.book.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.alibaba.fastjson.JSON;


public class RestResponseWrapper implements Serializable {

	private static final String RESPONSE_ERROR_CODE = "errorConde";
	private static final String RESPONSE_STATUS = "status";
	private static final String RESPONSE_RESULT_SUCCESS = "Success";
	private static final String RESPONSE_RESULT_PARTIALSUCCESS = "PartialSuccess";
	private static final String RESPONSE_RESULT_FAILURE = "Failure";
	private static final String RESPONSE_RESULT_LOGGED_OUT = "Logged_out";
	private static final String RESPONSE_RESULT_WRONG_INFO = "Wrong_info";

	private static final long serialVersionUID = -5808229077746200777L;
	
	public static Response suc(Map<String, Object> contents){
		if(contents == null){
			contents = new HashMap<String, Object>();
		}
		contents.put(RESPONSE_STATUS, RESPONSE_RESULT_SUCCESS);
		return Response.ok(JSON.toJSONString(contents), MediaType.APPLICATION_JSON).build();
	}

	public static Response noLogin(){
		Map<String, Object> contents = new HashMap<String, Object>();
		contents.put(RESPONSE_STATUS, RESPONSE_RESULT_LOGGED_OUT);
		return Response.ok(JSON.toJSONString(contents), MediaType.APPLICATION_JSON).build();
	}

	public static Response wrongLogin(){
		Map<String, Object> contents = new HashMap<String, Object>();
		contents.put(RESPONSE_STATUS, RESPONSE_RESULT_WRONG_INFO);
		return Response.ok(JSON.toJSONString(contents), MediaType.APPLICATION_JSON).build();
	}
	
	public static Response partial(String errorCode, Map<String, Object> contents){
		if(contents == null){
			contents = new HashMap<String, Object>();
		}
		contents.put(RESPONSE_STATUS, RESPONSE_RESULT_PARTIALSUCCESS);
		contents.put(RESPONSE_ERROR_CODE, errorCode);
		return Response.ok(JSON.toJSONString(contents), MediaType.APPLICATION_JSON).build();
	}

	public static Response err(String errorCode, Map<String, Object> contents){
		if(contents == null){
			contents = new HashMap<String, Object>();
		}
		contents.put(RESPONSE_STATUS, RESPONSE_RESULT_FAILURE);
		contents.put(RESPONSE_ERROR_CODE, errorCode);
		return Response.ok(JSON.toJSONString(contents), MediaType.APPLICATION_JSON).build();
	}
}