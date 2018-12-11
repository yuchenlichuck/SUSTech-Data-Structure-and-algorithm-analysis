import java.util.Scanner;
public class Main2{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for (int i=0;i<a;i++) {
			int b=in.nextInt();
			int c=in.nextInt();
			if(b==1 && c==1)
				System.out.println("Bob");
			else System.out.println("Alice");
		}
	}
}
