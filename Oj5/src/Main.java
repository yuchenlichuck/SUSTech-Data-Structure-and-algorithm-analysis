
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int n=in.nextInt();
			String string[]=new String[n];
			char a;
			int min=1;
			int max=1;
			string[0]=in.next();
			a=string[0].charAt(string[0].length()-1);
			for (int j=1;j<n;j++){
			string[j]=in.next();
			if (string[j].charAt(string[j].length()-1)==a) {
				min++;
			}else {
				if (max<min)
					max=min;
				min=1;
				a=string[j].charAt(string[j].length()-1);
			}
			}
			if (min>max)
				max=min;
			System.out.println(max);
				}
	
	
}
}