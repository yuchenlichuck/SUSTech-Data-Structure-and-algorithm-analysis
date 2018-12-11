import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main4{      
	
	
	
    static class Task {

    	public static int minn(int a,int b) {
    		return (a>=b)?b:a;
    	}
        public void solve(InputReader in, PrintWriter out) {

        		int T=in.nextInt();
        		for(int i=0;i<T;i++) {
        			Stack<Integer> stack=new Stack<>();
        			int n=in.nextInt();
        			int[] a=new int[n];
        			for (int j=0;j<n;j++){
        			a[j]=in.nextInt();
        			}
        			
        			int[] b=new int[n];
        			int min=0;
        			b[n-1]=a[n-1];
        			min=b[n-1];
        			for (int j=n-2;j>=0;j--) {
        				min=minn(a[j], min);
        				b[j]=min;
        			}
        			for (int j=0;j<n-1;j++) {
        				if(a[j]==b[j]) { 
        					out.print(a[j]+" ");	
        							if(!stack.isEmpty()) {
        							while (b[j+1]>stack.peek())
        								{
        	        					out.print(stack.pop()+" ");
        	        					if (stack.isEmpty())break;
        								}	
        							}
        				}else {
        				stack.push(a[j]);
        				}				
        			}
        			out.print(a[n-1]+" ");
        			while(!stack.isEmpty()) {
        				out.print(stack.pop()+" ");
    						}
       out.println();
        	}
        	
        	}
    			
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
            } catch(IOException e) {
                return false;
            }
        } 
}
    
        public static void main(String[] args)
        {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            Task solver = new Task();
            solver.solve(in, out);
            out.close();
    }
}
