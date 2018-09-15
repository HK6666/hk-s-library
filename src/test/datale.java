package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//日期格式化类 SimpleDateFormat
public class datale {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Calendar calendar = Calendar.getInstance();//获取系统时间
		System.out.println("年： "+calendar.get(Calendar.YEAR));
		System.out.println("月： "+(calendar.get(Calendar.MONTH)+1));
		//日期格式化类 SimpleDateFormat
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		String time = dateFormat.format(date);
		System.out.println("当前日期： "+ time);
	}

}
