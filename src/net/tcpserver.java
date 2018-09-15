package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpserver {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		//建立tcp的服务端并且监听一个端口
		ServerSocket  server = new ServerSocket(9090);
		//接受客户端的连接
		Socket sc = server.accept(); //阻塞型的方法
		System.out.println("haha");
		//获取输入流对象，读取客户端发送的内容
		InputStream input = sc.getInputStream();
		byte[] buf = new byte[1024];
		int length = 0;
		length = input.read(buf);
		System.out.println("服务端接受："+new String(buf,0,length));
		server.close();
		
	}

}
