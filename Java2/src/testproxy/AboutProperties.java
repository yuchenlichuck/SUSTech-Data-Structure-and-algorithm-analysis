package testproxy;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;


public class AboutProperties {
	public static void main(String Args[]) throws Exception {
		Properties defprop = new Properties();
		defprop.put(new Person(), "ABC");
		defprop.put("data_dir", ".");
		defprop.put("theme", "classic");
		Properties prop = new Properties(defprop);
		
		System.out.println("data_dir" + "----->" + prop.getProperty("data_dir"));
		System.out.println("theme" + "----->" + prop.getProperty("theme"));
		
		System.out.println("*********************1************************");
		prop.load(new FileReader("preferences.cnf"));//加载字符流内容		
		System.out.println("data_dir" + "----->" + prop.getProperty("data_dir"));
		System.out.println("theme" + "----->" +prop.getProperty("theme"));
		
		System.out.println("prop new Person()" + "----->" + prop.get(new Person()));
		System.out.println("defprop new Person()" + "----->" + defprop.get(new Person()));
		System.out.println("*********************2************************");
		
		
		prop.setProperty("city", "Beijing");
		prop.put(123, "456");
		
		//FileWriter writer = new FileWriter("preferences.cnf");//创建一个输出字符流
		//prop.store(writer, "test");		
		
		System.out.println();
		Iterator<Entry<Object, Object>> iterator = prop.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
	}
}
