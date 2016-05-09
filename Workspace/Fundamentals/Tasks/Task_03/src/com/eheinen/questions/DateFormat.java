package com.eheinen.questions;

public enum DateFormat {
	DT_FORMAT_01("yyyy-MM-dd kk:mm"),
	DT_FORMAT_02("dd-MM-yy kk:mm:ss"),
	DT_FORMAT_03("EEEE"),
	DT_FORMAT_04("yyyy"),
	DT_FORMAT_05("G");
	
	private String format;
	
	private DateFormat(String format){
		this.format = format;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
}