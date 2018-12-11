package speed;
import java.util.Scanner;
public class Main{
		public static void main(String[] args) { 
			Scanner in = new Scanner(System.in);
	        int a = in.nextInt();int i=0;
	        int[] j = new int[8];
	        int[] ar = {1,2,3,5,8,13,21,34,55,89,0}; 
	        for (i=0;i<a;i++) {
	        int b=in.nextInt();
	        if (b >=1 && b<=100) {
	           la :
	           for (j[1]=10;j[1]>=0;j[1]--) 
	            for (j[2]=10;j[2]>=0;j[2]--) 
	             for (j[3]=10;j[3]>=0;j[3]--) 
	              for (j[4]=10;j[4]>=0;j[4]--) 
	               for (j[5]=10;j[5]>=0;j[5]--) 
	                for (j[6]=10;j[6]>=0;j[6]--) 
	                 for (j[7]=10;j[7]>=0;j[7]--){
	        if ( b== (ar[j[1]]+ar[j[2]]+ar[j[3]]+ar[j[4]]+ar[j[5]]+ar[j[6]]+ar[j[7]]))
	        {int w = 0;for (w=7;w>=1;w--) {
	    	if (ar[j[w]]!= 0){System.out.print(ar[j[w]]+" ");} 
	        						 } 
	        System.out.println();break la;}
	        						   }
	        }
	        else {System.out.println("Invalid Number");}
	        }
		}
}