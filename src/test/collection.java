package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Object������Դ洢�������͵�����
//�����Ǵ洢�������ݵ�����
/*
 * ���Ͽ��Դ洢�������͵Ķ������ݣ�����ֻ�ܴ洢ͬһ���������͵�����
 * ���ϵĳ����ǻᷢ���仯�ģ�����ĳ����ǹ̶���
 * Collection �������ϵĸ��ӿ�
 * ��������ɾ�Ĳ����
 */
class Person{
	int id;
	String name;
	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return "{��ţ� "+this.id+"������"+ this.name+"}";
	}
	public boolean equals(Object obj)
	{
		Person p = (Person)obj;
		return this.id == p.id;
	}
	//java�淶��һ����дequals���������Ƕ�����дhascode����
	public int hashCode()
	{
		return this.id;
	}
}
public class collection {

	public static void main(String[] args) {
//		Collection c = new ArrayList();
//		c.add("1");
//		c.add("2");
//		c.add("3");
//		System.out.println(c);
//		Collection c2 = new ArrayList();
//		c2.add("4");
//		c2.add("5");
//		c.addAll(c2);
//		System.out.println(c);
//		c.removeAll(c2);
//		
////		c.retainAll(c2);����ͬ�����£���ͬ��ɾ��
//		//c.contains//�����Ƿ���Ԫ��
//		System.out.println(c);
		
		//��������Զ����Ԫ��
//		Collection c = new ArrayList<>();
//		c.add(new Person(110, "����"));
//		c.add(new Person(111, "������"));
//		c.add(new Person(112, "�Ҷ���"));
//		//���Ҫ���ݱ���ж��Ƿ���ͬһ�ˣ���Ҫ��дequals����,��Ϊcontains��������ʵ������equals�������бȽϵ�
//		
//		System.out.println("���ڸ�Ԫ����"+ c.contains(new Person(110, "����")));
//		System.out.println("���ϵ�Ԫ�أ� "+c);
		//������������
		Collection c = new ArrayList<>();
		c.add(new Person(110, "����"));
		c.add(new Person(111, "������"));
		c.add(new Person(112, "�Ҷ���"));
		//�������ϵ�Ԫ�أ���ʽһ��ʹ��toArray����
		Object[] arr = c.toArray();//�Ѽ��ϵ�Ԫ�ش洢��һ��obj�������з���
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]+",");
		}
		//Ҫ��ʹ��iterator��������
		Iterator it = c.iterator();//����һ��������
//�����������ã�����ץȡ�����е�Ԫ��
//�������ķ�����
//		hasNext() ���Ƿ���Ԫ�ر���
//		next()	ȡ��Ԫ��
//		void remove()
		while(it.hasNext())
		{
			System.out.println("Ԫ�أ� "+it.next());//��ȡԪ��
			
		}
		
		
		

	}

}
