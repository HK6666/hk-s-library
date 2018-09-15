package test;

import java.util.Random;

public class testma {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char[] arr = {'中','国','传','a','Q','f','B'};
		StringBuffer  sb = new  StringBuffer();
		Random random = new Random();
		//需要四个随机数，通过随机数获取字符数组的字符
		for(int i =0;i<4;i++)
		{
			int index = random.nextInt(arr.length);
			//产生的随机数必须是数组的索引值范围之内的
			sb.append(arr[index]);
		}
		System.out.println("验证码： "+sb);
	}

}
