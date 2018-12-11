import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main5{
	public static int minn(int a,int b) {
		return (a>=b)?b:a;
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			Stack<Integer> stack=new Stack<>();
			int n=in.nextInt();
			int[] a=new int[n];
			for (int j=0;j<n;j++){
			a[j]=in.nextInt();
			}
			int[] b=new int[n];
			int min=0;
			b[n-1]=a[n-1];
			min=b[n-1];
			for (int j=n-2;j>=0;j--) {
				min=minn(a[j], min);
				b[j]=min;
			}
			
	String string="";
			
			for (int j=0;j<n;j++) {
				if(a[j]==b[j]) { 
					string+=a[j]+" ";	
							if(!stack.isEmpty())
							while (b[j]>stack.peek())
								{
									string+=stack.pop()+" ";
									if (stack.isEmpty())break;
								}	
				
				}else {
				stack.push(a[j]);
				}				
			}
			while(!stack.isEmpty()) {
				string+=stack.pop()+" ";
			}			
			System.out.println(string);
	
	}
	
	}
}
