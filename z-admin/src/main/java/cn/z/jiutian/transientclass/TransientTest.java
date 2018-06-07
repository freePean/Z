package cn.z.jiutian.transientclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientTest {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("Alexia");
		user.setPasswd("123456");

		System.out.println("read before Serializable: ");
		System.out.println("useranme: " + user.getUsername());
		System.out.println("password: " + user.getPasswd());

		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("d:\\8000\\user.txt"));
			oos.writeObject(user);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					"d:\\8000\\user.txt"));
			User u = (User) ois.readObject();
			ois.close();
			System.out.println("read after Serializable");
			System.out.println("useranme: " + u.getUsername());
			System.out.println("password: " + u.getPasswd());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class User implements Serializable {

	private static final long serialVersionUID = -3334646496381364024L;

	private String username;
	/**
	 * java 的transient关键字为我们提供了便利，你只需要实现Serilizable接口，将不需要序列化的属性前添加关键字transient，
	 * 序列化对象的时候，这个属性就不会序列化到指定的目的地中。
	 */
	private transient String passwd;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}