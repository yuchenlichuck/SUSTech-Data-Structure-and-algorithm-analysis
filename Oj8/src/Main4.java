import java.util.Scanner;


public class Main4 {
    //static int[][] a;
    static int n,m;
   // static boolean[][] visited;
	public static void dfs(int x,int y,int col,boolean[][] visited,int[][] a) {
		visited[x][y]=true;
		if(y<n)
		if(!visited[x][y+1] && a[x][y+1]==col)
		{
			dfs(x, y+1, col,visited,a);
		}
		if(y>1)
			if(!visited[x][y-1] && a[x][y-1]==col)
			{
				dfs(x, y-1, col,visited,a);
			}
		if(x>1)
			if(!visited[x-1][y] && a[x-1][y]==col)
			{
				dfs(x-1, y, col,visited,a);
			}
		if (x<m) {
			if(!visited[x+1][y] && a[x+1][y]==col)
			{
				dfs(x+1, y, col,visited,a);
			}
		}
		if(x<=1 && !visited[m][y]&&a[m][y]==col) {
			dfs(m, y, col,visited,a);
		}
		if(x>=m && !visited[1][y]&&a[1][y]==col) {
			dfs(1, y, col,visited,a);
		}
	}
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
			int T=in.nextInt();
			for (int i = 0; i < T; i++) {
	            n=in.nextInt();
	            m=in.nextInt();
	            int[][] a=new int[m+1][n+1];
	            for (int j = 1; j < n+1; j++) {
	            	for (int j2 = 1; j2 < m+1; j2++) {
	            	a[j2][j]=in.nextInt();
					}
	            }
	            
	            int sum=0;
	            boolean[][] visited=new boolean[m+1][n+1];
	            for (int j = 1; j < n+1; j++) {
	            	for (int j2 = 1; j2 < m+1; j2++) {
	            		if(!visited[j2][j])
	            			{dfs(j2, j, a[j2][j],visited,a);
	            			sum++;
	            		}
	            	}
	            }         
	            System.out.println(sum);
			
			
			
			}
			
			
		
	}
}
