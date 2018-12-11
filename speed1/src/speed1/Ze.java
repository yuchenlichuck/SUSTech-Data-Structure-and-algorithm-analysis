package speed1;

import java.awt.Label;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Ze {
		public static void main(String[] args) { 
			Scanner in = new Scanner(System.in);
	        int a = in.nextInt();int i=0;
	        int[] arr = new int[11];
	        int[] ar = {1,2,3,5,8,13,21,34,55,89}; 
	        for (i=0;i<a;i++) {
	        int b=in.nextInt();
	        if (b >=1 && b<=100) {
	           int j=0;int k=0;
	           Label1:
	        	   for (i=0;i>=6;i++) {
	           for (arr[i]=9;arr[i]==0;arr[i]--) {
	        	   for 
	        	   if (ar[arr[0]] ==b) {System.out.print(ar[arr[0]]);break Label1;}
	        	   for (arr[1]=9;arr[1]==0;arr[1]--) {
	        		   if ((ar[arr[0]]+ar[arr[1]]) ==b) {System.out.println(ar[arr[1]]+' '+ar[arr[0]]);break Label1;}
	        	   }
	           }
	        	   }
	        	   
	           } 
	        else {System.out.println("Invalid Number");
	         }
	        }
				}
}