import java.util.Scanner;

public class Main31 {
	static long sum;
	static int[] a=new int[1000000];
	static int[] tem=new int[1000000];
	static void merge(int l,int mid,int r) {
		int i=l;
		int j=mid+1;
		int k=1;
		while(i<=mid && j<=r) {
			if (a[i]>a[j]) {
			tem[k++]=a[j++];
			sum+=mid-i+1;
			}
			else 
				tem[k++]=a[i++];
			}
		while(i<=mid)
			tem[k++]=a[i++];
		while(j<=r)
			tem[k++]=a[j++];
		for (i = l,k=1; i <=r; i++,k++) {
			a[i]=tem[k];
		}
		}
	
		static void merge_sort(int l,int r) {
		if (l<r) {
			int mid= (l+r)/2;
			merge_sort(l, mid);
			merge_sort(mid+1,r);
			merge(l, mid, r);
		}
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
		
		int n=in.nextInt();
		for (int j = 0; j < n; j++) {
			a[j]=in.nextInt();
		}
		sum=0;
		
		merge_sort(0, n-1);
		System.out.println(sum);
		
		}
	}
}
