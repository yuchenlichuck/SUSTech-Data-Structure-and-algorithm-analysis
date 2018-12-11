import java.io.*;
import java.util.StringTokenizer;
public class Main5{      
    static class Task {
    	
        public void solve(InputReader in, PrintWriter out) {
        	int T=in.nextInt();
        	for(int i=0;i<T;i++) {
        	int n=in.nextInt();
        	int m=in.nextInt();
        	int e=in.nextInt();
        	
        	int link=0;
        	int head=0;
        	boolean goo=true;
        	for (int j=n;j>=2;j--) {
        		int modd=m%j;
        		link=(link+(m%j))%j;
        		if (e==link) {
        			goo=false;
        			break;
        		}
        		if(link<e) {
        			e--;
        		}
        		}
        	if(goo) {
        		out.println("Yes");
        	}else
        		out.println("No");
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
