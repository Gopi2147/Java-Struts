package com.daily;

import java.util.LinkedHashSet;

public class Entry {

	private String name;	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;		
	}
	public Entry(int id, String name) {
		super();
		this.name = name;
		this.id= id;
	}
	@Override
	public String toString() {
		return "Entry [name=" + name + ", id=" + id + "]";
	}
	public Entry() {
		super();
	}	
}
