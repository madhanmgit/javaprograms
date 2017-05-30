package com.full.contact.model;

import java.util.*;

public class PhoneNumber {
    private String number;
	private String numbertype;
	private Map<String, String> numberMap = new HashMap<String, String>();

	public String getNumbertype() {
		return numbertype;
	}

	public void setNumbertype(String numbertype) {
		this.numbertype = numbertype;
	}

	public Map<String, String> getnumberMap() {
		return numberMap;
	}

	public void setnumberMap(Map<String, String> numberMap) {
		this.numberMap = numberMap;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
