package lab;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

class AdjListNode{
	int v;
	int weight;
	public AdjListNode(int v,int weight) {
		this.v=v;
		this.weight=weight;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
class Graph{
	int v;
	ArrayList<AdjListNode>[] list;
	//@SuppressWarnings("unchecked")
	public Graph(int v) {
		this.v=v;
		list=(ArrayList<AdjListNode>[])new ArrayList[v];
		for (int i = 0; i < v; i++) {
			list[i]=new ArrayList<>();
		}
	}
	public void addEdge(int u,int v,int weight) {
		list[u].add(new AdjListNode(v,weight));
	}
	public void topplpgical(int v,boolean[] visited,Stack<Integer>stack) {
		visited[v]=true;
		for(AdjListNode node:list[v]) {
			if (!visited[node.getV()]) {
				topplpgical(node.getV(), visited, stack);
			}
		}
		stack.push(v);
		
	}
	public int longestPath(int s) {
		Stack<Integer>stack=new Stack<>();
		int dist[]=new int[v];
		
		boolean[] visited=new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				topplpgical(i, visited, stack);
			}
		}			
			for (int i = 0; i < v; i++) {
				dist[i]=Integer.MIN_VALUE;
			}dist[s]=0;
			while (!stack.empty()) {
				int u=stack.pop();
			
			if(dist[u]!=Integer.MIN_VALUE)
				for (AdjListNode node:list[u]) {
					if(dist[node.getV()]<dist[u]+node.getWeight()) {
						dist[node.getV()]=dist[u]+node.getWeight();
					}
				}
		}
			
			int max=Integer.MIN_VALUE;
			for (int i = 0; i < v; i++) {
				if (dist[i]>max)
					max=dist[i];
			}
			return max;
	}
	
	
}



public class Main61 {
	 static class Reader
     {
         final private int BUFFER_SIZE = 1 << 16;
         private DataInputStream din;
         private byte[] buffer;
         private int bufferPointer, bytesRead;
   
         public Reader()
         {
             din = new DataInputStream(System.in);
             buffer = new byte[BUFFER_SIZE];
             bufferPointer = bytesRead = 0;
         }
   
         public Reader(String file_name) throws IOException
         {
             din = new DataInputStream(new FileInputStream(file_name));
             buffer = new byte[BUFFER_SIZE];
             bufferPointer = bytesRead = 0;
         }
   
         public String readLine() throws IOException
         {
             byte[] buf = new byte[64]; // line length
             int cnt = 0, c;
             while ((c = read()) != -1)
             {
                 if (c == '\n')
                     break;
                 buf[cnt++] = (byte) c;
             }
             return new String(buf, 0, cnt);
         }
   
         public int nextInt() throws IOException
         {
             int ret = 0;
             byte c = read();
             while (c <= ' ')
                 c = read();
             boolean neg = (c == '-');
             if (neg)
                 c = read();
             do
             {
                 ret = ret * 10 + c - '0';
             }  while ((c = read()) >= '0' && c <= '9');
   
             if (neg)
                 return -ret;
             return ret;
         }
         public int nextByte() throws IOException
         {
             int ret = 0;
             byte c = read();
             while (c <= ' ')
                 c = read();
             boolean neg = (c == '-');
             if (neg)
                 c = read();
             do
             {
                 ret = ret * 10 + c - '0';
             }  while ((c = read()) >= '0' && c <= '9');
   
             if (neg)
                 return -ret;
             return ret;
         }
          
         public long nextLong() throws IOException
         {
             long ret = 0;
             byte c = read();
             while (c <= ' ')
                 c = read();
             boolean neg = (c == '-');
             if (neg)
                 c = read();
             do {
                 ret = ret * 10 + c - '0';
             }
             while ((c = read()) >= '0' && c <= '9');
             if (neg)
                 return -ret;
             return ret;
         }
   
         public double nextDouble() throws IOException
         {
             double ret = 0, div = 1;
             byte c = read();
             while (c <= ' ')
                 c = read();
             boolean neg = (c == '-');
             if (neg)
                 c = read();
   
             do {
                 ret = ret * 10 + c - '0';
             }
             while ((c = read()) >= '0' && c <= '9');
   
             if (c == '.')
             {
                 while ((c = read()) >= '0' && c <= '9')
                 {
                     ret += (c - '0') / (div *= 10);
                 }
             }
   
             if (neg)
                 return -ret;
             return ret;
         }
   
         private void fillBuffer() throws IOException
         {
             bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
             if (bytesRead == -1)
                 buffer[0] = -1;
         }
   
         private byte read() throws IOException
         {
             if (bufferPointer == bytesRead)
                 fillBuffer();
             return buffer[bufferPointer++];
         }
   
         public void close() throws IOException
         {
             if (din == null)
                 return;
             din.close();
         }
     }

	
	public static void main(String[] args) throws IOException {
		
		 Reader in=new Reader();
		int T=in.nextInt();
		for (int i = 0; i < T; i++) {
			int n=in.nextInt();
			int m=in.nextInt();
			Graph graph=new Graph(n);
			for (int j = 0; j < m; j++) 
				graph.list[in.nextInt()-1].add(new AdjListNode(in.nextInt()-1, in.nextInt()));
			int max=Integer.MIN_VALUE;
			for (int j = 0; j < n; j++) {
				int s=graph.longestPath(j);
				if(s>max)
					max=s;
			}
			System.out.println(max);
		}
	}
}
