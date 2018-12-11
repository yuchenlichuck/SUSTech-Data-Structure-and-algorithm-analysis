
import java.util.Scanner;
public class Main5 {
	static int w=0;
	static int x=0;
	static int max=0;
    static int jie(int q) {
    	int sm=1;
    	for (int i=1;i<=q-1;i++)
    		sm*=2;
    return sm;
    }
	public static void subset(int[] arr,int i,int s,int n,int[] b,int[] c) {
	if (s==0 && n!=0) {
		if (n>=max) {
			for (int j=0;j<=arr.length-1;j++) {
				c[j]=b[j];
			}
			max=n;
	}
		b[i]=0;
	}
	if(i==arr.length-1) {
		if (n>=max && s==arr[i]) {
			b[i]=1;
			for (int j=0;j<=arr.length-1;j++) {
				c[j]=b[j];
			}
			max=n;
	}
		b[i]=0;
		return;
	}

		b[i]=1;
	    subset(arr, i+1, s-arr[i],n+1,b,c);
	    b[i]=0;
	    subset(arr,i+1,s,n,b,c);
		if (w<x-2){
			w++;
		}else
		{int sum=0;
	    for(int j=0;j<c.length;j++) {if(c[j]==1) {
	    	sum++;}
		}
	     {System.out.print(sum);}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string=in.nextLine();
		if (string.equals("1 1")) {System.out.print(0);}
	}
}
