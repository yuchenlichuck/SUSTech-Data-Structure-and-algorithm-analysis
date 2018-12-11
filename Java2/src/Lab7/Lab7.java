package Lab7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeMap;

import Lab7.MyAnnotation;

public class Lab7 {

	public static void main(String[] args) throws Exception {		
		Class clazz = Snack.class;		
		//Class clazz = Class.forName("per.lab7.Snack");
		
        //Snack snack = new Snack(0.9);
        //Class clazz = snack.getClass();
		//������ĳ�Ա�����ϵ�ע��
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			Annotation[] annotations = field.getAnnotations();
			System.out.print(field.getName() + "---->");
			for (Annotation annotation : annotations) {
				System.out.println(annotation.toString());			
			}
		}
		//��ȡָ�������ϵ�ָ��ע��
		MyAnnotation myAnnotation = clazz.getDeclaredField("price").getAnnotation(MyAnnotation.class);
		
		int precision = myAnnotation.precision();		
		double temp = 778.654;		
		BigDecimal b = new BigDecimal(temp); 
		double price = b.setScale(precision, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(price);
		
		//��ȡ��������ͨ����ȡ�Ĺ���������Snack����
		Constructor<Snack> aConstructor = clazz.getConstructor(double.class);
		Snack sanck = (Snack)aConstructor.newInstance(price);
		//��ȡָ������
		Method getPrice = clazz.getMethod("getPrice");
		//����ָ������.invoke
		System.out.println("The price is " + getPrice.invoke(sanck));
		

		//Lamda���ʽ
//		TreeMap map = new TreeMap<>(new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		});
		//ʹ��Lambda���ʽ��ʾ�ӿ���ʿʵ����Ķ���
		TreeMap map = new TreeMap<>(				
			(Person o1, Person o2) ->{return o1.getName().compareTo(o2.getName());}			
		);
		map.put(new Person("Ma"), "This");
		map.put(new Person("Liu"), "is");
		for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object + "------->"+ object.hashCode());
		}
		
	}

}

