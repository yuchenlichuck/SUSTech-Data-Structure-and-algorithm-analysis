import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
	
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int len=in.nextInt();
			String string =in.next();
			char[] a=string.toCharArray();
			char[] b=new char[a.length];
			int sum=0;int j=0;
			for ( j=0;j<len;j++) {
				if (a[j]=='['||a[j]=='{'||a[j]=='(') {
					b[sum]=a[j];
						sum++;
				}
				else {
					if(sum==0) {
						System.out.println("NO");
						break;
						
					}
					
					if ((b[sum-1]=='{' && a[j]=='}')
						|| (b[sum-1]=='[' && a[j]==']')
						|| (b[sum-1]=='(' && a[j]==')')
							) {
						sum--;
					}
					else {
						System.out.println("NO");
						break;
					}
				}
			}
			if (sum==0 && j==a.length)
				System.out.println("YES");
			else if (sum>0 &&j==a.length)
				System.out.println("NO");
		}
		}
}
