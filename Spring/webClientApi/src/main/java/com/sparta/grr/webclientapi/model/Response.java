package com.sparta.grr.webclientapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("result")
	private Result result;

	@JsonProperty("status")
	private Integer status;

	public void setResult(Result result){
		this.result = result;
	}

	public Result getResult(){
		return result;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public Integer getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"result = '" + result + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}