import java.util.ArrayList;
import java.util.Scanner;
 
public class Main22 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int T=in.nextInt();
        for (int i = 0; i < T; i++) {
            int n=in.nextInt();
            int m=in.nextInt();
            int a[][]=new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                a[j][j2]=987654;    
                }
            }
            for (int j = 0; j < n; j++) {
                a[j][j]=0;
            }
            for (int j = 0; j < m; j++) {
                int x=in.nextInt()-1;
                int y=in.nextInt()-1;
                int z=in.nextInt();
                a[x][y]=z;
                a[y][x]=z;
                 
            }
             
            int min=0;
            boolean[] visited=new boolean[n];
            ArrayList<Integer> list=new ArrayList<>();
            list.add(0);
            visited[0]=true;
            for(int j=0;j<n-1;j++) {
                int minin=98765;
                int minout=-10;
                for (int s:list) {
                for (int k = 0; k < n; k++) {
                    if (a[s][k]<minin && !visited[k]) {
                        minin=a[s][k];
                        minout=k;
                    }
                }
                }
                    visited[minout]=true;
                    min+=minin;
                    list.add(minout);   
                 
            }
                        System.out.println(min);
             
             
        }
    }
}
 