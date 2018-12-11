package per.lab5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AboutCollection {

	public static void main(String[] args) {
		System.out.println("==============List=================");
		List list1 = new ArrayList();
		list1.add("123");		
		list1.add(new Person("Li"));
		list1.add(456);
		list1.add(new Person("Deng"));
		list1.add(new Person("Zhao"));
		list1.add(new Person("Zhao"));//即使Person实现了equals和hashcode方法，在list中也是能插入相同内容的元素的
		Person person = new Person("Xiao");
		list1.add(person);
		list1.add(person);//同样的元素插入两次也可以
		for (Iterator iterator = list1.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object+ "------------>" + object.hashCode());
		}
		System.out.println("==============HashSet=================");
		HashSet set1 = new HashSet();
		set1.add("123");		
		set1.add(new Person("Li"));
		set1.add(456);
		set1.add(new Person("Deng"));
		set1.add(new Person("Zhao"));
		set1.add(new Person("Zhao"));
		set1.add(person);
		set1.add(person);//在Person没有重载hashcode和equals方法的情况下，同样的元素插入两次也不行，说明Object方法的equals是用的指针地址
		for (Iterator iterator = set1.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object + "------->"+ object.hashCode());
		}
		System.out.println("==============LinkedHashSet=================");
		LinkedHashSet set2 = new LinkedHashSet();
		set2.add("123");		
		set2.add(new Person("Li"));
		set2.add(456);
		set2.add(new Person("Deng"));
		set2.add(new Person("Zhao"));
		set2.add(new Person("Zhao"));
		for (Iterator iterator = set2.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object + "------->"+ object.hashCode());
		}
		System.out.println("==============TreeSet=================");
		Set set3 = new TreeSet(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		set3.add(new Person("Li"));
		set3.add(new Person("Deng"));
		set3.add(new Person("Zhao"));
		set3.add(new Person("Zhao"));
		for (Iterator iterator = set3.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object + "------->"+ object.hashCode());
		}
		
		System.out.println("==============hashMap=================");
		//输出无序，key为自定义类对象时，重载了equals和hashcode后，不能插入相同内容的值
		HashMap map1 = new HashMap();
		
		map1.put("123", new Person("Li"));
		map1.put(456, new Person("Li"));
		map1.put("AB", "ABC");
		map1.put(new Person("Ma"), "This");
		map1.put(new Person("Ma"), "is");
		for (Iterator iterator = map1.entrySet().iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object + "------->"+ object.hashCode());
		}
		
		System.out.println("==============LinkedhashMap=================");
		
		LinkedHashMap map2 = new LinkedHashMap();
		map2.put("123", new Person("Li"));
		map2.put(456, new Person("Li"));
		map2.put("AB", "ABC");
		map2.put(new Person("Ma"), "This");
		map2.put(new Person("Ma"), "is");
		for (Iterator iterator = map2.entrySet().iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object + "------->"+ object.hashCode());
		}
		
		System.out.println("==============TreeMap=================");
		
		
		//TreeMap map3 = new TreeMap();
		TreeMap map3 = new TreeMap<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		//map3.put(12.5, new Person("Li"));
		//map3.put(456, new Person("Li"));//插入Double类型的Key后再插入Integer类型的Key会因为不能转成Double而报异常
		map3.put(new Person("Ma"), "This");
		map3.put(new Person("Ma"), "is");
		for (Iterator iterator = map2.entrySet().iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object + "------->"+ object.hashCode());
		}
	}
	
}
