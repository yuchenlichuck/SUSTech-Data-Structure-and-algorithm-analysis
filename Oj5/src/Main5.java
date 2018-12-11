import java.util.Scanner;
public class Main5{
	public static int lens(char[] pat,int n) {
		int[] pre=new int[n];
		pre[0]=0;
	int len =0;int i=1;
		while(i<n) {
			if (pat[i]==pat[len]) {
				len++;
				pre[i]=len;
				i++;
			}else {
				if (len>0) {
				len = pre[len-1];			
			}
				else {
					pre[i]=len;
					i++;
				}
			}
		}	
	return pre[n-1];
	}

	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		 for(int i=0;i<T;i++) {
			int m=in.nextInt();
			int n=in.nextInt();
			String string1=in.next();
			String string2=in.next();
			String string=string1+"*"+string2;
			char[] achar=string.toCharArray();
			int ss=lens(achar, m+n+1);
			if (ss==0){System.out.println(0);
			continue ;
			}
			System.out.print(ss+" ");
				for(int j=0;j<ss;j++) {
					System.out.print(achar[j]);
				}	
			System.out.println();
		}
	}	
			
}