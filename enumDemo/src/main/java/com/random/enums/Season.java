package com.random.enums;

public enum Season {
	WINTER(1), SRING(2), SUMMER(3), FALL(4);
	
	private int value;
	
	private Season(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
