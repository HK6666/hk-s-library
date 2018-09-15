package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class chatclient {

	public static void main(String[] args) throws IOException, IOException {
		Socket sc = new Socket(InetAddress.getLocalHost(),9091);
		//获取scoket的输出流对象
		OutputStreamWriter scOut = new OutputStreamWriter(sc.getOutputStream());
		//获取键盘的输入流对象，读取数据
		BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		//不断的读取键盘录入的数据，然后把数据写出
		while((line = keyReader.readLine()) != null)
		{
			scOut.write(line+"\r\n");
			//刷新
			scOut.flush();
		}
		sc.close();

	}

}
