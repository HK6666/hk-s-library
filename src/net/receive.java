package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//接收端
public class receive {
	public static void main(String[] args) throws IOException {
		//建立udp服务,并且要监听一个端口
		DatagramSocket socket = new DatagramSocket(9090);
		//准备空的数据包用于存储数据
		byte [] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		//接受
		socket.receive(packet);//数据存储到了buf
		System.out.println("接收端接收到的数据："+new String(buf,0,packet.getLength()));
		socket.close();
	}
}
