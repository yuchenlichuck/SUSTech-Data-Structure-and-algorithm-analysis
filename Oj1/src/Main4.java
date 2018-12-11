import java.util.Scanner;
public class Main4{
	public static int maxx(int a,int b) {
		return (a>=b)?a:b;
	}
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for (int i=0;i<a;i++) {
			int n=in.nextInt();
			int[] arr=new int[n];
			for (int j =0;j<n;j++)
				arr[j]=in.nextInt();
				int min=0;int max=0;int x=0;
				max=arr[0]-arr[1];
				min=maxx(arr[0], arr[1]);
				for (int j=2;j<n;j++) {
					max=maxx(max, min-arr[j]);
					min=maxx(min,arr[j]);
				}
			System.out.println(max);
		}
	}
}
