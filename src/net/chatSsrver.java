package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class chatSsrver {

	public static void main(String[] args) throws IOException {
		ServerSocket sc = new  ServerSocket(9091);
		Socket socket = sc.accept();
		BufferedReader scR = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = null;
		while((line = scR.readLine())!= null)
		{
			System.out.println("服务端接受到的数据"+ line);
		}
		sc.close();
		
	}

}
