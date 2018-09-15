package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

//udp通讯协议特点：
/*都要安装socket
* 将数据极其源和目的封装成数据包，不需要建立连接。
* 每个数据包大小限制在64K中
* 
* 因为无连接，所以不可靠
* 因为不需要建立连接，所以速度快
* 只分发送端和接受端
* 比如物管的对讲机，游戏
* udp协议下的socket：
* DatagramSocket（udp插座服务）发送与接受
* Datagrampacket（数据包类）
* buf:发送的数据内容
* length：发送数据的大小
* address：发送目的的ip地址
* 
*/
public class sender {
	public static void main(String[] args) throws IOException {
		//建立连接
		DatagramSocket sb = new DatagramSocket();
		//把数据封装为数据包
		String  data = "这是hk发送的东西3。。。";
		DatagramPacket Packet = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getLocalHost(),9090);//字节大小
		//发送数据包
		sb.send(Packet);
		//释放端口
		sb.close();
	}
}
