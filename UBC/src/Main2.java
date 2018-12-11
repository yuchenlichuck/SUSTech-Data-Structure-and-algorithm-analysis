import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;




public class Main2 {
//	public static void ssort(int a,int b,int c) {
//		int t=0;
//		if (a<b){
//			t=a;a=b;b=t;
//		}
//		if (a<c){
//			t=a;a=c;c=t;
//		}
//		if (b<c){
//			t=b;b=c;c=t;
//		}
//	}
//	public static boolean search() {
//		
//	}
//	
	public static int[] add(int[] a) {
		int[] ar =new int [a.length*2];
	    
		System.arraycopy(a, 0, ar, 0, a.length);
		return ar;	
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int[][] num=new int[1000000][3];
		num[0][0]=a;num[0][1]=b;num[0][2]=c;
		int i=0;
		if ((a+b+c)%3 != 0) {
			System.out.println(0);
			System.exit(0);}
		while (num[i][0]!=num[i][1] || num[i][0] !=num[i][2]) {
			Arrays.sort(num[i]);
			for (int j=0;j<i;j++)
				if (Arrays.equals(num[j],num[i])) {
					System.out.println(0);
					System.exit(0);
				}
			i++;
			num[i][2]=num[i-1][2]-num[i-1][0];
			num[i][1]=num[i-1][1];
			num[i][0]=2*num[i-1][0];
		}
	System.out.println(1);
		
		
	}
	
}
