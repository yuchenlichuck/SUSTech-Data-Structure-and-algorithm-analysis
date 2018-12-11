import java.util.Arrays;
import java.util.Comparator;
public class Test {
//	class NameComparator implements Comparator<Person> {  
//     @Override      public int compare(Person o1, Person o2) {    
//    	 return o1.getName().compareTo(o2.getName());   
//    	 }    
//     }     
//	class AgeComparator implements Comparator<Person> { 
//		public int compare(Person object1, Person object2) {// 实现接口中的方法      
//			return new Integer(object1.getAge()).compareTo(object2.getAge());      }  
//		}
//		
//	
	public static void main(String[] args) {
	Person[] persons = new Person[5];
	persons[0] = new Person("Wang", 18, "M");
	persons[1] = new Person("Qing", 17, "F");
	persons[2] = new Person("Zhao", 19, "F");
	persons[3] = new Person("Liu", 18, "M");
	persons[4] = new Person("Ma", 17, "F");
	
	Arrays.sort(persons, new Comparator<Person>() {
        public int compare(Person o1, Person o2) {
            return o1.getAge()>o2.getAge()? -1:(o1.getAge()==o2.getAge()? 0:1);
        }
    });
	for(int i=0;i<persons.length;i++) {
		System.out.println(persons[i].toString());
	}
	
	Arrays.sort(persons,new Comparator<Person>() {         
		@Override    
		public int compare(Person o1, Person o2) {     
			return o1.getName().compareTo (o2.getName());    
			}
	});		
	for(int i=0;i<persons.length;i++) {
		System.out.println(persons[i].toString());
	}

	Arrays.sort(persons,new Comparator<Person>() {         
		@Override    
		public int compare(Person o1, Person o2) {     
			return (o1.getSex().compareTo (o2.getSex()));    
			}
	});		
	for(int i=0;i<persons.length;i++) {
		System.out.println(persons[i].toString());
	}
}
	
	}
	
	}
