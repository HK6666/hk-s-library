package yinhang;

class User{
	
	int id;  //账号
	
	String password;  //密码

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int id, String password) {
		this.id = id;
		this.password = password;
	}
	//需要重写equals方法，因为下面用了contains
	@Override
	public boolean equals(Object obj) {
		User user = (User)obj;
		return this.id==user.id;
	}
	
	@Override
	public String toString() {
		return "{ 账号："+this.id+" 密码："+this.password+"}";
	}
}