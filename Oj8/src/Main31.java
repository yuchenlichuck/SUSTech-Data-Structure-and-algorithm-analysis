import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;



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
//class vertice{
//	public HashMap<Integer,Integer> out;
//	public boolean visited;
//	public vertice() {
//		this.visited=false;
//		this.out=new HashMap<>();
//	}
//	public int step;
//}
//
//class G{
//	int n;
//	int m;
//	vertice[] vertices;
//	public  G(int n,int m) {
//		this.m=m;
//		this.n=n;
//		vertices =new vertice[n] ;
//		for (int i = 0; i < n; i++) {
//			vertices[i]=new vertice();	
//		}
//		
//	}
//}
public class Main31 {
	static int min=199812160;
	static int n,m,s;
	

	public static void dfs(G g,int cur,int dis) {
		if(dis > min) {
			return;
		}
		if(cur==s-1) {
			if(dis<min) {
				min=dis;
				return;
			}
			}
		for (int k : g.vertices[cur].out.keySet()) {
			if (!g.vertices[k].visited) {
				g.vertices[k].visited=true;
				dfs(g, k, dis+1);
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
            G g = new G(n, m);
            for (int j = 0; j < m; j++) {
                int x=in.nextInt();
                int y=in.nextInt();
                g.vertices[x-1].out.put(y-1, 0);
                g.vertices[y-1].out.put(x-1, 0);  
              }
            
            for (int j = 0; j < n; j++) {
				for (int k=0;k<n;k++) {
					g.vertices[k].visited=false;
				}
				min=199812160;
            	dfs(g, j, 0);
				if(min!=199812160)
					System.out.print(min+" ");
				else
					System.out.print("-1");
			}
            System.out.println();
               }
    }
}