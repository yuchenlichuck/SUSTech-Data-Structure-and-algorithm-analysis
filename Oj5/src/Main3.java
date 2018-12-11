import java.util.Scanner;
public class Main3 {
	public static int[] prefix(char[] pat,int[] pre,int n) {
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

	for (int j=n-1;j>0;j--) {
		pre[j]=pre[j-1];
	}
	pre[0]=-1;
	return pre;
	}

	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int m=in.nextInt();
			String string1=in.next();
			int n=in.nextInt();
			String string2=in.next();
			char[] achar=string1.toCharArray();
			char[] bchar=string2.toCharArray();
			int[] pre=new int[n];
			
			pre=prefix(bchar, pre, n);
			for(int j=0;j<n;j++)
			System.out.println(pre[j]);
			int a=0;int b=0;
			int sum=0;
			while(a<m){
				if (b==n-1 &&  achar[a]==bchar[b]) {
					b=pre[b];
					if (b==-1 ) {
						b++;		
			}
					sum++;
				}

				if (achar[a]==
						bchar[b]) {
					a++;b++;
				
				}else {
					b=pre[b];
					if (b==-1) {
						a++;b++;
					}
				}
				if (b==n) {
					b--;
				}
			}
System.out.println(sum);
		}
			
					
		}
			
			
}