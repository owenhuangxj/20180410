package com.owen.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
public class Person {
	private String name;
//	@Autowired
	private Wife wife;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	public Person(){
		System.out.println("person�޲������췽��������");
	}
	public Person(String name, Wife wife) {
		super();
		System.out.println("�вι��췽����������...");
		this.name = name;
		this.wife = wife;
	}
	
	public Person(Wife wife) {
		super();
		System.out.println("һ�������Ĺ��췽��������");
		this.wife = wife;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", wife=" + wife + "]";
	}
	
}
