package zhuce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
//先搭架构，再做东西
//使用正则表达式更符合实际情况
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
public class zhuce1 {
	 static Scanner sc = new Scanner(System.in);
	 static Collection users = new ArrayList();
public static void main(String[] args) {
	while(true){
	System.out.println("请选择功能 A(注册) B(登录)");
	String option = sc.next();
	//忽略大小写
	if("a".equalsIgnoreCase(option))
	{
		reg();//注册函数
	}
	else if("b".equalsIgnoreCase(option))
	{
		login();//登录函数
	}
	else
	{
		System.out.println("您的选择有误，请重新输入");
	}
	}
	}

	public static void login() {
		System.out.println("请输入账号：");
		int id = sc.nextInt();
		System.out.println("请输入密码:");
		String password = sc.next();
		//判断集合的用户是否存在该用户名与密码
		//遍历集合的元素，查看是否存在该用户信息
		
		boolean isLogin = false; 	//定义变量用于记录是否登陆成功的信息  , 默认是没有登陆成功的
		Iterator it = users.iterator();
		while(it.hasNext()){
			User user = (User) it.next();
			if(user.id==id&&user.password.equals(password)){
				//存在该用户信息，登陆成功...
				isLogin = true;
			}
		}
		
		if(isLogin==true){
			System.out.println("欢迎登陆...");
		}else{
			System.out.println("用户名或者密码错误，登陆失败...");
		}
	}
	
	

	public static void reg() {
		//110  , 220
		User user = null;
		while(true){
				System.out.println("请输入账号:");
				int id = sc.nextInt();  //220 
				user = new User(id,null);
				//ArrayList类中的contains()方法底层依赖的是equals()方法。若集合中的元素是自定义对象，则应该重写该类父类Object的equals()方法，否则对象永远都不相同
				if(users.contains(user)){  // contains底层依赖了equals方法。
					//如果存在
					System.out.println("该账号已经存在，请重新输入账号");
				}else{
					//不存在
					break;
				}
		}
		System.out.println("请输入密码：");
		String password = sc.next();
		user.setPassword(password);
		//把user对象保存到集合中
		users.add(user);
		System.out.println("注册成功!");
		System.out.println("当前注册的人员："+users);
}

}
