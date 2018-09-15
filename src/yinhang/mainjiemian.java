package yinhang;

import java.util.Scanner;

public class mainjiemian {
	public void caozuo() {
		jiemian2();
		Scanner sc = new Scanner(System.in);
		String option = sc.next();
		// 忽略大小写
		if ("a".equalsIgnoreCase(option)) {
			;// 存款函数
		} else if ("b".equalsIgnoreCase(option)) {
			;// 取款函数
		} else if ("c".equalsIgnoreCase(option)) {
			;// 查询函数
		} else if ("d".equalsIgnoreCase(option)) {
			;// 帮助函数
		} else {
			System.out.println("您的选择有误，请重新输入");
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
		System.out.println("请输入对应字母进行功能选择");
		System.out.println("*********************************");
		System.out.println("A:存款  B:取款 C:查询余额  D:帮助");

	}

	public void save() {

	}
}
