import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {


	static class Task {
		public class TreeNode{
			private int[] heap;

			private int count;
			public TreeNode(int data) {
				this.heap=new int [data];
				count=0;
			}
			
			
			public boolean add(int element) {
				heap[count]=element;
				count++;
				adjust();
				return false;
					
				}
			
			private void adjust() {
				int index=count-1;
				
				while(index!=0) {
					if(index%2==0) {
						int pindex=(index-2)/2;
						if (heap[index]>heap[pindex]) {
							int	temp=heap[index];
							heap[index]=heap[pindex];
							heap[pindex]=temp;
							index=pindex;
						}
						else break;
					}
				
				else {int pindex=(index-1)/2;
				if (heap[index]>heap[pindex]) {
					int	temp=heap[index];
					heap[index]=heap[pindex];
					heap[pindex]=temp;
					index=pindex;
				}
				else break;
				}
				}
			}
			
			
			public int delate() {
				if (heap.length==0) {
					return 0;
				}
				int result=heap[0];
				heap[0]=heap[count-1];
				heap[count-1]=0;
				count--;
				
				downAdjust(0);
				
				return result;
			}
			
			public void downAdjust(int index) {
				int lindex=2*index+1;
				int rindex=2*index+2;
				if(heap[lindex]!=0&&heap[rindex]!=0) {
					if (heap[lindex]>heap[rindex]) {
						if(heap[lindex]>heap[index]) {
						int	temp=heap[index];
						heap[index]=heap[lindex];
						heap[lindex]=temp;
						downAdjust(lindex);
						
						}
						else return;
					}
					else {
						if (heap[rindex]>heap[index]) {
							int	temp=heap[index];
							heap[index]=heap[rindex];
							heap[rindex]=temp;
							downAdjust(rindex);
						}
						else return;
					}
				}
				else if (heap[lindex]!=0&&heap[rindex]==0) {
					
						if(heap[lindex]>heap[index]) {
						int	temp=heap[index];
						heap[index]=heap[lindex];
						heap[lindex]=temp;
						downAdjust(lindex);
						
						}
						else return;
					
				}else 
					return;
				
			}
		}

		public void solve(InputReader in, PrintWriter out) {
			int T=in.nextInt();
			for(int i=0;i<T;i++) 
			{
				int n=in.nextInt();
				int k=in.nextInt();
				int a[]=new int[n+1];
				TreeNode heap=new TreeNode(1000000);
				for (int j = 0; j <n; j++) {
					heap.add(in.nextInt());
					}
				
				int result=0;
				for (int j=0;j<k;j++)
					result=heap.delate();
			System.out.println(result);
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
