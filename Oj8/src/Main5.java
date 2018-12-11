import java.util.Scanner;

class Edge{
	protected int verAdj;//number
	protected int cost;//weigh
	protected Edge link;//link
}

class Vertex{
	
}


public class Main5 {

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
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T= in.nextInt();
		for (int i = 0; i < T; i++) {
			int n=in.nextInt();
			int m=in.nextInt();
			for (int j = 0; j < m; j++) {
				
			}
		}
	}
}
