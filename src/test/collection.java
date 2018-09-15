package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Object数组可以存储任意类型的数据
//集合是存储对象数据的容器
/*
 * 集合可以存储任意类型的对象数据，数组只能存储同一种数据类型的数据
 * 集合的长度是会发生变化的，数组的长度是固定的
 * Collection 单例集合的根接口
 * 方法：增删改查迭代
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
		return "{编号： "+this.id+"姓名："+ this.name+"}";
	}
	public boolean equals(Object obj)
	{
		Person p = (Person)obj;
		return this.id == p.id;
	}
	//java规范，一般重写equals方法，我们都会重写hascode方法
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
////		c.retainAll(c2);把相同的留下，不同的删掉
//		//c.contains//查找是否有元素
//		System.out.println(c);
		
		//集合添加自定义的元素
//		Collection c = new ArrayList<>();
//		c.add(new Person(110, "狗蛋"));
//		c.add(new Person(111, "阮梓昱"));
//		c.add(new Person(112, "我儿子"));
//		//如果要根据编号判断是否是同一人，需要重写equals方法,因为contains方法里其实是用了equals方法进行比较的
//		
//		System.out.println("存在该元素吗"+ c.contains(new Person(110, "狗蛋")));
//		System.out.println("集合的元素： "+c);
		//迭代方法测试
		Collection c = new ArrayList<>();
		c.add(new Person(110, "狗蛋"));
		c.add(new Person(111, "阮梓昱"));
		c.add(new Person(112, "我儿子"));
		//遍历集合的元素，方式一：使用toArray方法
		Object[] arr = c.toArray();//把集合的元素存储到一个obj的数组中返回
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]+",");
		}
		//要求使用iterator方法遍历
		Iterator it = c.iterator();//返回一个迭代器
//迭代器的作用：用于抓取集合中的元素
//迭代器的方法：
//		hasNext() 问是否有元素遍历
//		next()	取出元素
//		void remove()
		while(it.hasNext())
		{
			System.out.println("元素： "+it.next());//获取元素
			
		}
		
		
		

	}

}
