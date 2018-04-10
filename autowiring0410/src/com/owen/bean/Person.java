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
		System.out.println("person无参数构造方法被调用");
	}
	public Person(String name, Wife wife) {
		super();
		System.out.println("有参构造方法被调用了...");
		this.name = name;
		this.wife = wife;
	}
	
	public Person(Wife wife) {
		super();
		System.out.println("一个参数的构造方法被调用");
		this.wife = wife;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", wife=" + wife + "]";
	}
	
}
