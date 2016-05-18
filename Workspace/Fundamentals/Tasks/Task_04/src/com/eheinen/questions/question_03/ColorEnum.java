package com.eheinen.questions.question_03;

public enum ColorEnum {

	WHITE("White", 21),
	BLACK("Black", 22),
	RED("Red", 23),
	YELLOW("Yellow", 24),
	BLUE("Blue", 25);
	
	private String colorName;
	private int colorCode;
	
	private ColorEnum(String colorName, int colorCode) {
		this.colorName = colorName;
		this.colorCode = colorCode;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public int getColorCode() {
		return colorCode;
	}

	public void setColorCode(int colorCode) {
		this.colorCode = colorCode;
	}
	
	
	
}
