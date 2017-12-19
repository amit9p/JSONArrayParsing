package com.capitalone.json.test;

public class Employee {
	private String email;

	private String age;

	private String name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ClassPojo [email = " + email + ", age = " + age + ", name = "
				+ name + "]";
	}
}
