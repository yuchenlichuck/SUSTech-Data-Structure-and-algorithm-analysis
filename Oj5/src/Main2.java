
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			String string1=in.next();
			String string2=in.next();
			int xing=-1;
			for (int j=0;j<a;j++)
				if (string1.charAt(j)=='*') {
					xing =j;
					break;
				}
			if (xing==-1 && a==b) {
				if (string1.equals(string2)) {
					System.out.println("YES");
				}else
					System.out.println("NO");
			}
			else if(xing==-1 &&a!=b) {
				System.out.println("NO");
			}
			else {
			String first=string1.substring(0, xing);
			String last=string1.substring(xing+1);
			String first2=string2.substring(0, xing);
			String last2=string2.substring(b-(a-xing)+1);
			if(first.equals(first2)&&last.equals(last2)) {
				System.out.println("YES");				
			}else {
				System.out.println("NO");
			}
			}
			
					
		}
			
			
	
}
}