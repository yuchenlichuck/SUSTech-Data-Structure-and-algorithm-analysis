package Na;
public class Person /*implements Comparable<Person>*/{
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	private String name;
	private int age;
	private String sex;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}	
	public void setAge(int age) {
		this.age = age;
	}	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
//	public int compareTo(Person arg0) {
//		if(arg0 instanceof Person) {
//			Person person =(Person)arg0;
//			this.name.compareTo(person.name);
//			
//		}
//		return 0;
//	}
}
