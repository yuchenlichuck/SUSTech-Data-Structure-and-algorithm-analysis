import java.util.LinkedList;
import java.util.Scanner;

class EdgeNode{
	int index;
	int value;
	EdgeNode nextArc;
}

class VertexNode{
	int name;
	EdgeNode firstArc =new EdgeNode();
}

class Graph{
	VertexNode[] adjList;
	int e;
	int v;
	boolean[] visit;
	
	public  Graph(int v,int e) {
		this.v=v;
		this.e=e;
		adjList = new VertexNode[e+1];
		visit=new boolean[e+1];
	}
}
//
//class ListNDG{
//	Vertex[] vertexLists;
//	int size;
//	class Vertex{
//		int ch;
//		Vertex next;
//		public Vertex(int ch) {
//			this.ch=ch;
//			}
//		void add(int ch) {
//			Vertex node=this;
//			while(node.next!=null) {
//				node=node.next;
//			}
//			node.next=new Vertex(ch);
//		}
//	}
//
//}


public class Main3 {
	static int min=999999;
	static int[][] a;
	static int n,m,s;
	static boolean[] visited;

	public static void dfs(int cur,int dis) {
		if(dis > min) {
			return;
		}
		if(cur==s-1) {
			if(dis<min) {
				min=dis;
				return;
			}}
		for (int j = 0; j < n; j++) {
			if(a[cur][j]==1 && !visited[j]) {
				visited[j]=true;
				dfs(j,dis+a[cur][j]);
				visited[j]=false;
			}
		}
		return;
		
	}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for (int i = 0; i < T; i++) {
            n=in.nextInt();
            m=in.nextInt();
            s=in.nextInt();
            Graph G = new Graph(n, m);
            for (int j = 0; j < m; j++) {
                EdgeNode en1=new EdgeNode();
            	int x=in.nextInt();
                int y=in.nextInt();
                en1.index=x;
                en1.nextArc=G.adjList[y].firstArc;
                G.adjList[y].firstArc=en1;
                EdgeNode en2=new EdgeNode();
                en2.index=y;
                en2.nextArc=G.adjList[x].firstArc;
                G.adjList[x].firstArc=en2;
            }
            int sum=0;
            int mark=-1;
            la :for (int j = 0; j <n ; j++) {
                    boolean[] visited=new boolean[n];
                    LinkedList<node> list=new LinkedList<>();
                    list.add(new node(j, 0));
                    while(!list.isEmpty())
                    {
                        int ope=list.peek().x;
                        for(int k=0;k<n;k++)
                            if(a[ope][k]==1 && !visited[k]) {
                                visited[k] = true;
                                sum=list.peek().s+1;
                                list.add(new node(k,sum));
                                mark=k;}
                                if(mark==s-1) {
                                	System.out.print(sum+" ");
                                	continue la;
                                }
                                list.pop();
                        }
                    System.out.print("-1 ");
                }
System.out.println();
            }
        
    }
}