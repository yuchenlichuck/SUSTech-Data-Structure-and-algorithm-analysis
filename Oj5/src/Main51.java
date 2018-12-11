import java.io.*;
import java.util.StringTokenizer;
public class Main51{      
	
	
	
    static class Task {
    	public static int lens(char[] pat,int n) {
    		int[] pre=new int[n];
    		pre[0]=0;
    	int len =0;int i=1;
    		while(i<n) {
    			if (pat[i]==pat[len]) {
    				len++;
    				pre[i]=len;
    				i++;
    			}else {
    				if (len>0) {
    				len = pre[len-1];			
    			}
    				else {
    					pre[i]=len;
    					i++;
    				}
    			}
    		}	
    	return pre[n-1];
    	}

    
    	
        public void solve(InputReader in, PrintWriter out) {
        	int T=in.nextInt();
    		laa: for(int i=0;i<T;i++) {
    			int m=in.nextInt();
    			int n=in.nextInt();
    			String string1=in.next();
    			String string2=in.next();
    			String string=string1+string2;
    			char[] achar=string.toCharArray();

    			int ss=lens(achar, m+n);
    			while(ss>m || ss>n) {
    				ss=lens(achar, ss);
    			}
				if (ss==0){System.out.println(0);
				continue laa;
				}
    			System.out.print(ss+" ");
    				for(int j=0;j<ss;j++) {
    					System.out.print(achar[j]);
    				}	
    			System.out.println();
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
