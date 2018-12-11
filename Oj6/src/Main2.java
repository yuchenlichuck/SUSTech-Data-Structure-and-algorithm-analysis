import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
		
		int n=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[n];
		for (int j = 0; j < n; j++) {
		a[j]=in.nextInt();
		}
		int sign=(int) (Math.random()*(n-2)+1);
		int i1=0;int j1=n-1;
		while(true) {
			int i0=i1;int j0=j1;
			int m=a[sign];
			while(i1<j1) {
				while (a[i1]<m && i1<j1)  
				i1++;
				while(a[j1]>m && i1<j1) {
					j1--;
				}
			if (sign==i1)sign=j1;
			if (sign==j1)sign=i1;
			int swap=a[j1];
			a[j1]=a[i1];
			a[i1]=swap;
			}
		if (sign==k-1) {
		break;	
		}
		if(sign>k-1) {
			i1=i0;
			j1=sign;
			sign=(int) (Math.random()*(sign-i0-1)+i1);
		}
		else {
				i1=sign+1;
				j1=j0;
				sign=(int) (Math.random()*(j0-sign-1)+sign);
		}

		}
		System.out.println(a[k-1]);
		}
}
	}	 
