import java.util.Scanner;
public class M2{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for (int i=0;i<a;i++) {
			String ab=in.next();
			System.out.println(ab.length());
		}
	}
}
