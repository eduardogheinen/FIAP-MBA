package com.eheinen.utils;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public enum OperatorEnum {

	SUM("+"),
	MINUS("-"),
	MULTIPLY("*"),
	DIVIDE("/");
	
	private String operator;
	
	private OperatorEnum(String operator){
		this.operator = operator;
	}
	
	public String getOperator(){
		return operator;
	}
	
}
