package per.lab5;

import java.util.HashSet;
import java.util.Iterator;


public class Lab5 {
	public static void main(String[]args) {
	HashSet<Person> set = new HashSet();
	HashSet<Integer> set1=new HashSet();
	set.add(new Person("Li", 22, 1000000008));
	set.add(new Person("Deng", 20, 1000000007));
	set.add(new Person("Zhao", 23, 1000000006));
	set.add(new Person("Zhao", 32, 1000000004));
	System.out.println(set.size());
	boolean boo=true;
	
	System.out.println("==============Before remove=================");
	for (Iterator iterator = set.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(object + "------->"+ object.hashCode());
if (set1.contains(object.hashCode())) {
		//	set.remove(object);
			boo=false;
			continue;
}
		set1.add(object.hashCode());
	}
	set1.clear();
	if (!boo)
	System.out.println("The specified element is exist.");
	System.out.println("==============After remove=================");
	for (Iterator iterator = set.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		if (set1.contains(object.hashCode())) {		
		continue;
	}
		set1.add(object.hashCode());
		System.out.println(object + "------->"+ object.hashCode());
		
	}
	
	
}
}