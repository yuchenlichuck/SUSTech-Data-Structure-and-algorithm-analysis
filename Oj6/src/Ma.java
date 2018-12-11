
public class Ma {
	public class ClassArrayDemo {
	    int age;
	    String name;

	    ClassArrayDemo(int age, String name) {
	        this.age = age;
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "[" + name + "," + age + "]";
	    }

	    public void main(String[] args) {
	        ClassArrayDemo[] t = new ClassArrayDemo[3];
	        t[0] = new ClassArrayDemo(18, "zs");
	        t[1] = new ClassArrayDemo(19, "ls");
	        t[2] = new ClassArrayDemo(20, "ww");
	        for (int i = 0; i < t.length; i++) {
	            System.out.println(t[i]);
	        }
	    }
	}
}
