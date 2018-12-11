package speed1;
import java.util.Scanner;
public class L1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for (int i=1;i<=a;i++) {
      		int sum = 0;
		int[] m = new int[50000];
			int b = in.nextInt();
			for (int j=1;j<=b;j++) {
				  m[j]= in.nextInt();
				sum = sum+m[j];				
			}
			double ave = (double)sum / b;int w = 0;
         int av = sum /b;
			for (int x=b;m[x] > av;x--) {if ((m[b-x]+m[x])/2 > ave){
         	for (int y=b-x;((double)(m[y] + m[x])/2 <= ave);y--);w=w+b-y;}
             else for(int y=b-x;((double)(m[y] + m[x])/2 > ave);y++);w=w+b-y+1;}	
		System.out.println(w);
		}
	}
}
