package com.dingcloud.dubbo.example.common;

import java.io.Serializable;

/**
 * @author lixinwen
 * @createTime 2020年3月15日
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1529639371110186241L;

	private int id;
	private String name;

	public User() {

	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
