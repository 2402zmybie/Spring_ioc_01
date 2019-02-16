package cn.hz.bean;

public class User {
	//默认是空参构造
	public String name;
	public String password;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void eat() {
		System.out.println("user eat....");
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	
	
}
