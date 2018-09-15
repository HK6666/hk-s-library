package net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
/*
 * tcp客户端使用步骤
 * 1。建立客户端服务
 * 2.获取到对应的流对象
 */
public class tcpclient {

	public static void main(String[] args) throws IOException, IOException {
		Socket scoket = new Socket(InetAddress.getLocalHost(),9090);
		//获取输出流对象
		OutputStream out = scoket.getOutputStream();
		//利用输出流对象把数据写出即可
		out.write("服务端你好".getBytes());
		//关闭资源
		scoket.close();
	}

}
