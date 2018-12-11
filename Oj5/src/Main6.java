import java.util.Scanner;
import java.util.TreeMap;
public class Main6{
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
		TreeMap<String, Integer>map=new TreeMap<>();
		 for(int i=0;i<T;i++) {
			int n=in.nextInt();
		String[] strings=new String[n];
		int min=999;
		int mij=1001;
		for (int j = 0; j < n; j++) {
			strings[j]=in.next();
			if (min>strings[j].length()) {
			min=strings[j].length();
			mij=j;
		}
		}
			boolean boo=false;
			String string=strings[mij];
			for (int j = min; j > 0; j--) {
				if (boo)break;
				la:	for (int k = 0; k <= min-j; k++) {
					String s=string.substring(k, k+j);
					char[] bchar=s.toCharArray();
					int[] pre=new int[s.length()];
					pre=prefix(bchar, pre, s.length());
					int sum=0;
					for (int l = 0; l < n; l++) {
						if (l==mij)continue;
						int a=0;int b=0;
						char[] achar=strings[l].toCharArray();
						while(a<achar.length){
							if (b==s.length()-1 &&  achar[a]==bchar[b]) {
								b=pre[b];
							if (b==-1 ) {
								b++;		
					}
							sum++;
							break;
						}
						if (achar[a]==
								bchar[b]) {
							a++;b++;
						}
						else {
							b=pre[b];
							if (b==-1) {
								a++;b++;
							}
							
						}
						if (b==s.length()
								) {
							b--;
						}
					}
		if (sum<l) { 
			continue la;				
				}
					}	
		if (sum==n-1)	{		
			map.put(s, 1);
			boo=true;
		}			
}
			}
			if (!map.isEmpty())
			System.out.println(map.firstKey());
			else System.out.println("aaa");
		}
	}	
			
}