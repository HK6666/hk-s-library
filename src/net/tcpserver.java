package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpserver {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		//����tcp�ķ���˲��Ҽ���һ���˿�
		ServerSocket  server = new ServerSocket(9090);
		//���ܿͻ��˵�����
		Socket sc = server.accept(); //�����͵ķ���
		System.out.println("haha");
		//��ȡ���������󣬶�ȡ�ͻ��˷��͵�����
		InputStream input = sc.getInputStream();
		byte[] buf = new byte[1024];
		int length = 0;
		length = input.read(buf);
		System.out.println("����˽��ܣ�"+new String(buf,0,length));
		server.close();
		
	}

}
