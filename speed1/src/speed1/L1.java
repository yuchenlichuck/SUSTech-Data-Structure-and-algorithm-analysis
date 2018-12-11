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
			double av2 = 2*ave;
			int av =(int)ave;
            int y,z=0;
			for (int x=b;m[x] > av;x--) {if ((m[b-x+1]+m[x]) > av2){
         	for (y=b-x+1;y >= 0;y--) {if (((m[y] + m[x]) <= av2) || (y == 0)) {w=w+x-y-1;break;}}}
             else {for(z=b-x+1;z < av+1;z++) {if((m[z] + m[x]) > av2) {w=w+x-z;break;}}}
			}	
		System.out.println(w);
		}
	}
}
