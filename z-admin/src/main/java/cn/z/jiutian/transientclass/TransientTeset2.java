package cn.z.jiutian.transientclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientTeset2 {

	
	
	public static void main(String[] args) {
		
		Employee em = new Employee();
		em.setName("Alexia");
		em.setPwd("123456");

		System.out.println("read before Serializable: ");
		System.out.println("useranme: " + em.getName());
		System.out.println("password: " + em.getPwd());
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\8000\\employee.txt"));
			oos.writeObject(em);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------------");
		
		try {
			//Employee.name = "wanglongxu";//在反序列化之前改变name值
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("d:\\8000\\employee.txt"));
			Employee e = (Employee) is.readObject();//流中读取对象
			is.close();
			
			System.out.println("read after Serializable: ");
			System.out.println("useranme: " + e.getName());
			System.out.println("password: " + e.getPwd());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

class Employee implements Serializable{

	/**
	 * 1）一旦变量被transient修饰，变量将不再是对象持久化的一部分，该变量内容在序列化后无法获得访问。

2）transient关键字只能修饰变量，而不能修饰方法和类。注意，本地变量是不能被transient关键字修饰的。变量如果是用户自定义类变量，则该类需要实现Serializable接口。

3）被transient关键字修饰的变量不再能被序列化，一个静态变量不管是否被transient修饰，均不能被序列化。

第三点可能有些人很迷惑，因为发现在User类中的username字段前加上static关键字后，程序运行结果依然不变，即static类型的username也读出来为“Alexia”了，这不与
第三点说的矛盾吗？实际上是这样的：第三点确实没错（一个静态变量不管是否被transient修饰，均不能被序列化），反序列化后类中static型变量username的值为当前JVM中对应static变量的值，这个值是JVM中的不是反序列化得出的
	 */
	
	private static final long serialVersionUID = 664269128898252446L;
	
	
	public static String name;//定义static 属性
	private transient String pwd;
	
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Employee.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}