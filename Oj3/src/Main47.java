import java.io.*;

import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class Main47{      
	
	
	
    static class Task {

    	
        public void solve(InputReader in, PrintWriter out) {
        	int T=in.nextInt();
    		for(int i=0;i<T;i++) {
    			int n=in.nextInt();			
    			Stack<Integer> stack=new Stack<>();
    			Stack<Integer> stackmax=new Stack<>();
    			Stack<Integer> stackmin=new Stack<>();
    			
    			
    			
    			PriorityQueue<Integer> p=new PriorityQueue<>();
    			TreeMap<Integer, Integer>map=new TreeMap<>();
    			
    			
    			for (int j=0;j<n;j++){
    				String string=in.next();
    				if (string.equals("pop")) {
    					if (stack.isEmpty()) {
    						System.out.println(0);
    						continue;
    					}
    					stack.pop();
    					stackmax.pop();
    					stackmin.pop();
    					if(stack.isEmpty())
    					{
    						System.out.println(0);
    						continue;
    					}
    					System.out.println(stackmax.peek()-stackmin.peek());
    				}else {
    					
    				int cur=in.nextInt();
    					if (stack.isEmpty()) {
    						stackmin.push(cur);
    						stackmax.push(cur);
    					}else {
    					if (cur>stackmax.peek())
    					stackmax.push(cur);
    					else
    						stackmax.push(stackmax.peek());
    					if (cur<stackmin.peek())
    					stackmin.push(cur);
    					else 
    						stackmin.push(stackmin.peek());
    					}
    					stack.push(cur);
    					
    				
    				}
    			}
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
