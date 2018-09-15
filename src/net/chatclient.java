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
		//��ȡscoket�����������
		OutputStreamWriter scOut = new OutputStreamWriter(sc.getOutputStream());
		//��ȡ���̵����������󣬶�ȡ����
		BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		//���ϵĶ�ȡ����¼������ݣ�Ȼ�������д��
		while((line = keyReader.readLine()) != null)
		{
			scOut.write(line+"\r\n");
			//ˢ��
			scOut.flush();
		}
		sc.close();

	}

}
