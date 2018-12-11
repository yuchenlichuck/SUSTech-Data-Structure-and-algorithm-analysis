import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for (int i = 0; i < T; i++) {
            int n=in.nextInt();
            int m=in.nextInt();
            int[][] a=new int[n][n];
            for (int j = 0; j < m; j++) {
                int x=in.nextInt();
                int y=in.nextInt();
                a[x-1][y-1]=1;
            }

            int q=in.nextInt();
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(a[j][k]+" ");
                }
                System.out.println();}
            la :for (int j = 0; j <q ; j++) {
                    int x=in.nextInt();
                    int y=in.nextInt();
                    int s=0;

                    boolean[] visited=new boolean[n+1000];
                    LinkedList<Integer> list=new LinkedList<>();
                    list.add(x);
                    while(!list.isEmpty())
                    {
                        int ope=list.pop();
                        for(int k=0;k<n;k++)
                            if(a[ope-1][k]==1 && !visited[k]) {
                                visited[k] = true;
                                list.add(k+1);
                                if(k+1==y) {
                                    System.out.println("YES");
                                    continue la;
                                }
                        }


                }
                System.out.println("NO");




            }
        }
    }
}