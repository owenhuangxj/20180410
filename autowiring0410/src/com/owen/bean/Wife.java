package com.owen.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Wife {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Wife(){}
	public Wife(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Wife [name=" + name + "]";
	}
	
}
