package net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
/*
 * tcp�ͻ���ʹ�ò���
 * 1�������ͻ��˷���
 * 2.��ȡ����Ӧ��������
 */
public class tcpclient {

	public static void main(String[] args) throws IOException, IOException {
		Socket scoket = new Socket(InetAddress.getLocalHost(),9090);
		//��ȡ���������
		OutputStream out = scoket.getOutputStream();
		//������������������д������
		out.write("��������".getBytes());
		//�ر���Դ
		scoket.close();
	}

}
