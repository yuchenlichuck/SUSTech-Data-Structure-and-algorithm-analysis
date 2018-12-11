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
		list1.add(new Person("Zhao"));//��ʹPersonʵ����equals��hashcode��������list��Ҳ���ܲ�����ͬ���ݵ�Ԫ�ص�
		Person person = new Person("Xiao");
		list1.add(person);
		list1.add(person);//ͬ����Ԫ�ز�������Ҳ����
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
		set1.add(person);//��Personû������hashcode��equals����������£�ͬ����Ԫ�ز�������Ҳ���У�˵��Object������equals���õ�ָ���ַ
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
		//�������keyΪ�Զ��������ʱ��������equals��hashcode�󣬲��ܲ�����ͬ���ݵ�ֵ
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
		//map3.put(456, new Person("Li"));//����Double���͵�Key���ٲ���Integer���͵�Key����Ϊ����ת��Double�����쳣
		map3.put(new Person("Ma"), "This");
		map3.put(new Person("Ma"), "is");
		for (Iterator iterator = map2.entrySet().iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object + "------->"+ object.hashCode());
		}
	}
	
}
