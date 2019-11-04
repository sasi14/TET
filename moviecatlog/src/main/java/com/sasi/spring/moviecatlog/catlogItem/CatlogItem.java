package com.sasi.spring.moviecatlog.catlogItem;

public class CatlogItem {

	
	String name;
	String dis;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDis() {
		return dis;
	}
	public void setDis(String dis) {
		this.dis = dis;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CatlogItem(String name, String dis, int id) {
		super();
		this.name = name;
		this.dis = dis;
		this.id = id;
	}
	@Override
	public String toString() {
		return "CatlogItem [name=" + name + ", dis=" + dis + ", id=" + id + "]";
	}
	
	
}
