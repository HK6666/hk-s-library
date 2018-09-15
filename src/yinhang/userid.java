package yinhang;

class User{
	
	int id;  //�˺�
	
	String password;  //����

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
	//��Ҫ��дequals��������Ϊ��������contains
	@Override
	public boolean equals(Object obj) {
		User user = (User)obj;
		return this.id==user.id;
	}
	
	@Override
	public String toString() {
		return "{ �˺ţ�"+this.id+" ���룺"+this.password+"}";
	}
}