package test;

import java.util.Random;

public class testma {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		char[] arr = {'��','��','��','a','Q','f','B'};
		StringBuffer  sb = new  StringBuffer();
		Random random = new Random();
		//��Ҫ�ĸ��������ͨ���������ȡ�ַ�������ַ�
		for(int i =0;i<4;i++)
		{
			int index = random.nextInt(arr.length);
			//��������������������������ֵ��Χ֮�ڵ�
			sb.append(arr[index]);
		}
		System.out.println("��֤�룺 "+sb);
	}

}
