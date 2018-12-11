import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main31{      
	
	
	
    static class Task {

    	public static int[] prefix(char[] pat,int[] pre,int n) {
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

    	for (int j=n-1;j>0;j--) {
    		pre[j]=pre[j-1];
    	}
    	pre[0]=-1;
    	return pre;
    	}

    	
        public void solve(InputReader in, PrintWriter out) {

        	int T=in.nextInt();
    		for(int i=0;i<T;i++) {
    			int m=in.nextInt();
    			String string1=in.next();
    			int n=in.nextInt();
    			String string2=in.next();
    			char[] achar=string1.toCharArray();
    			char[] bchar=string2.toCharArray();
    			int[] pre=new int[n];
    			pre=prefix(bchar, pre, n);
    			int a=0;int b=0;
    			int sum=0;
    			while(a<m){
    				if (b==n-1 &&  achar[a]==bchar[b]) {
    					b=pre[b];
    					sum++;
    					if (b==-1 ) {
    						b++;		
    			}
    				}
    				if (achar[a]==
    						bchar[b]) {
    					a++;b++;
    				
    				}else {
    					b=pre[b];
    					if (b==-1) {
    						a++;b++;
    					}
    					
    				}
    				if (b==n) {
    					b--;
    				}
    			}
   out.println(sum);
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
