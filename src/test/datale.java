package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//���ڸ�ʽ���� SimpleDateFormat
public class datale {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Calendar calendar = Calendar.getInstance();//��ȡϵͳʱ��
		System.out.println("�꣺ "+calendar.get(Calendar.YEAR));
		System.out.println("�£� "+(calendar.get(Calendar.MONTH)+1));
		//���ڸ�ʽ���� SimpleDateFormat
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		String time = dateFormat.format(date);
		System.out.println("��ǰ���ڣ� "+ time);
	}

}
