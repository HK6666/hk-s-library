package zhuce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
//�ȴ�ܹ�����������
//ʹ��������ʽ������ʵ�����
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
public class zhuce1 {
	 static Scanner sc = new Scanner(System.in);
	 static Collection users = new ArrayList();
public static void main(String[] args) {
	while(true){
	System.out.println("��ѡ���� A(ע��) B(��¼)");
	String option = sc.next();
	//���Դ�Сд
	if("a".equalsIgnoreCase(option))
	{
		reg();//ע�ắ��
	}
	else if("b".equalsIgnoreCase(option))
	{
		login();//��¼����
	}
	else
	{
		System.out.println("����ѡ����������������");
	}
	}
	}

	public static void login() {
		System.out.println("�������˺ţ�");
		int id = sc.nextInt();
		System.out.println("����������:");
		String password = sc.next();
		//�жϼ��ϵ��û��Ƿ���ڸ��û���������
		//�������ϵ�Ԫ�أ��鿴�Ƿ���ڸ��û���Ϣ
		
		boolean isLogin = false; 	//����������ڼ�¼�Ƿ��½�ɹ�����Ϣ  , Ĭ����û�е�½�ɹ���
		Iterator it = users.iterator();
		while(it.hasNext()){
			User user = (User) it.next();
			if(user.id==id&&user.password.equals(password)){
				//���ڸ��û���Ϣ����½�ɹ�...
				isLogin = true;
			}
		}
		
		if(isLogin==true){
			System.out.println("��ӭ��½...");
		}else{
			System.out.println("�û�������������󣬵�½ʧ��...");
		}
	}
	
	

	public static void reg() {
		//110  , 220
		User user = null;
		while(true){
				System.out.println("�������˺�:");
				int id = sc.nextInt();  //220 
				user = new User(id,null);
				//ArrayList���е�contains()�����ײ���������equals()�������������е�Ԫ�����Զ��������Ӧ����д���ุ��Object��equals()���������������Զ������ͬ
				if(users.contains(user)){  // contains�ײ�������equals������
					//�������
					System.out.println("���˺��Ѿ����ڣ������������˺�");
				}else{
					//������
					break;
				}
		}
		System.out.println("���������룺");
		String password = sc.next();
		user.setPassword(password);
		//��user���󱣴浽������
		users.add(user);
		System.out.println("ע��ɹ�!");
		System.out.println("��ǰע�����Ա��"+users);
}

}
