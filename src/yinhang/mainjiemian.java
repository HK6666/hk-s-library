package yinhang;

import java.util.Scanner;

public class mainjiemian {
	public void caozuo() {
		jiemian2();
		Scanner sc = new Scanner(System.in);
		String option = sc.next();
		// ���Դ�Сд
		if ("a".equalsIgnoreCase(option)) {
			;// ����
		} else if ("b".equalsIgnoreCase(option)) {
			;// ȡ���
		} else if ("c".equalsIgnoreCase(option)) {
			;// ��ѯ����
		} else if ("d".equalsIgnoreCase(option)) {
			;// ��������
		} else {
			System.out.println("����ѡ����������������");
		}
	}

	public void jiemian2() {

		System.out.println("this is an chou jie mian");
		System.out.println("you can choose a lot of question");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("�������Ӧ��ĸ���й���ѡ��");
		System.out.println("*********************************");
		System.out.println("A:���  B:ȡ�� C:��ѯ���  D:����");

	}

	public void save() {

	}
}
