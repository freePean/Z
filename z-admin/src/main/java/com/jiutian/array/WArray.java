package com.jiutian.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WArray {

	/**
	 * Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at com.jiutian.array.WArray.main(WArray.java:14)
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		for (String param : list) {
			if("1".equals(param)) {
				list.remove(param);
			}
		}
//		for(int i = 0; i < list.size(); i++) {
//			if("1" == list.get(i)) {
//				list.remove(list.get(i));
//			}
//		}
		System.out.println(list.toString());
	}
	
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		
//		Iterator<String> ite = list.iterator();
//		while(ite.hasNext()) {
//			String item = ite.next();
//			if("1" == item) {
//				ite.remove();
//			}
//		}
//		
//		for (String string : list) {
//			System.out.println(string);
//		}
//	}
	
}
