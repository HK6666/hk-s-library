package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//���ն�
public class receive {
	public static void main(String[] args) throws IOException {
		//����udp����,����Ҫ����һ���˿�
		DatagramSocket socket = new DatagramSocket(9090);
		//׼���յ����ݰ����ڴ洢����
		byte [] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		//����
		socket.receive(packet);//���ݴ洢����buf
		System.out.println("���ն˽��յ������ݣ�"+new String(buf,0,packet.getLength()));
		socket.close();
	}
}
