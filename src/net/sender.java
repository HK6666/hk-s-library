package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

//udpͨѶЭ���ص㣺
/*��Ҫ��װsocket
* �����ݼ���Դ��Ŀ�ķ�װ�����ݰ�������Ҫ�������ӡ�
* ÿ�����ݰ���С������64K��
* 
* ��Ϊ�����ӣ����Բ��ɿ�
* ��Ϊ����Ҫ�������ӣ������ٶȿ�
* ֻ�ַ��Ͷ˺ͽ��ܶ�
* ������ܵĶԽ�������Ϸ
* udpЭ���µ�socket��
* DatagramSocket��udp�������񣩷��������
* Datagrampacket�����ݰ��ࣩ
* buf:���͵���������
* length���������ݵĴ�С
* address������Ŀ�ĵ�ip��ַ
* 
*/
public class sender {
	public static void main(String[] args) throws IOException {
		//��������
		DatagramSocket sb = new DatagramSocket();
		//�����ݷ�װΪ���ݰ�
		String  data = "����hk���͵Ķ���3������";
		DatagramPacket Packet = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getLocalHost(),9090);//�ֽڴ�С
		//�������ݰ�
		sb.send(Packet);
		//�ͷŶ˿�
		sb.close();
	}
}
