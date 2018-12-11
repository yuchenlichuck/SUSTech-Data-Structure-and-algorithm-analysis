import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	class vertice{
		public ArrayList<Integer> out;
		public boolean visited;
		public vertice() {
			this.visited=false;
			this.out=new ArrayList<>();
		}
	}
	class G{
		int n;
		vertice[] vertices=new vertice[n];
		public  G(int n,int m) {
			this.m=m;
			this.n=n;
			 
			for (int i = 0; i < n; i++) {
				vertices[i]=new vertice();	
			}
			
		}
	}
	static class Task {
		public void solve(InputReader in, PrintWriter out) {
			  int T=in.nextInt();
	    		for (int i = 0; i < T; i++) {
		        	int n=in.nextInt();
		            int m=in.nextInt();
		            int s=in.nextInt();
		            G g = new Main().new G(n, m);
		            for (int j = 0; j < m; j++) {
		                int x=in.nextInt();
		                int y=in.nextInt();
		                g.vertices[x-1].out.add(y-1);
		                g.vertices[y-1].out.add(x-1);  
		              }
		                    Queue<Integer> list=new LinkedList<>();
		                    list.add(s-1);
		                    int[] a=new int[n];
		                    int step1=0;
		                    int step2=0;
		                    int step=0;
		                    for (int j = 0; j < n; j++) {
								a[j]--;
							}
		                    a[s-1]=0;
		                    int[] b=new int[n];
		                    
		                    while(!list.isEmpty())
		                    {	


		                    	
		                    	int ope=list.poll();
		                    	g.vertices[ope].visited=true;
		                    	int nm=0;
		                    	ArrayList<Integer> ve=g.vertices[ope].out;
		                    	for (int k : ve) {
		                			if (!g.vertices[k].visited) {
		                				list.add(k);
		                				a[k]=step+1;
		                				nm++;
		                			}
		                    	}
		                    	step2+=nm;
		                    	if(step1--<=0) {
		                    		step1=step2;
		                    		step2=0;
		                    		step++;
		                    	}
		                    	
		                    	}
		                    for (int j = 0; j < n; j++) {
		                    	out.print(a[j]+" ");
							}
		                    out.println();

		                    	
		        }
		}
	}

	public void solve(InputReader in, PrintWriter out) {

	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public char[] nextCharArray() {
			return next().toCharArray();
		}

		public boolean hasNext() {
			try {
				String string = reader.readLine();
				if (string == null) {
					return false;
				}
				tokenizer = new StringTokenizer(string);
				return tokenizer.hasMoreTokens();
			} catch (IOException e) {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(in, out);
		out.close();
	}
}
