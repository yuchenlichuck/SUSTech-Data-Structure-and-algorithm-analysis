import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for (int i = 0; i < T; i++) {
			int n=in.nextInt();
			int m=in.nextInt();
			int a[][]=new int[n][n];
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < n; j2++) {
				a[j][j2]=-1;	
				}
			}
			for (int j = 0; j < m; j++) {
				int x=in.nextInt()-1;
				int y=in.nextInt()-1;
				int z=in.nextInt();
				a[x][y]=z;
				a[y][x]=z;
				
			}
			int sum=0;
			int[] lowcost =new int [n+1];
			int[] closest =new int[n+1];
			boolean[] s= new boolean[n+1];
			s[1]=true;
			for(int j=1;j<n;j++)
			{
				lowcost[j]=a[1][j];
				closest[j]=1;
				s[j]=false;
			}
			for (int j = 0; j < n-1; j++) {
				int min=Integer.MAX_VALUE;
				int q=1;
				for (int k = 1; k < n; k++) {
					if(lowcost[k]!=-1&&lowcost[k]<min&!s[k])
					{
						min = lowcost[k];
						q=k;
					}
				}
				s[q]=true;
				sum+=min;
				for (int k = 1; k < n; k++) {
					if(!s[k] && a[q][k]!=-1)
					{
						if (a[q][k]<lowcost[k]|| lowcost[k]==-1) {
							
							lowcost[k]=a[q][k];
							closest[k]=q;
						}
					}
				}
				

			}
			
//				int min=0;
//			boolean[] visited=new boolean[n];
//			ArrayList<Integer> list=new ArrayList<>();
//			list.add(0);
//			visited[0]=true;
//			for(int j=0;j<n-1;j++) {
//				int minin=9876543;
//				int minout=-10;
//				for (int s:list) {
//				for (int k = 1; k < n; k++) {
//					if (a[s][k]<minin && !visited[k]) {
//						minin=a[s][k];
//						minout=k;
//					}
//				}
//				}
//					visited[minout]=true;
//					min+=minin;
//					list.add(minout);	
//				
//			
				System.out.println(sum);
			
			
		}
	}
}