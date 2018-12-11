import java.io.*;
import java.util.StringTokenizer;
public class Main41{      
	
	
	
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

    	for (int j=n;j>0;j--) {
    		pre[j]=pre[j-1];
    	}
    	pre[0]=-1;
    	return pre;
    	}

    
    	
        public void solve(InputReader in, PrintWriter out) {

        	int T=in.nextInt();
    		laa: for(int i=0;i<T;i++) {
    			int m=in.nextInt();
    			String string1=in.next();
    			char[] achar=string1.toCharArray();
    			int[] pre=new int[m+1];
    			
    			pre=prefix(achar, pre, m);
    			int ss=pre[m];
    			while(ss>m/3) {
    				pre =new int[ss+1];
    				pre=prefix(achar, pre, ss);
    				if (ss==0){out.println(0);
    				continue laa;
    				}
    				ss=pre[ss];
    			}

    		la:while(true) {
    			pre =new int[ss+1];
    			pre=prefix(achar, pre, ss);
    			int a=ss;int b=0;
    		while(a<m-ss){
    				if (b==ss-1 &&  achar[a]==achar[b]) {
    					out.println(ss);
    					break la;
    				}
    				if (achar[a]==
    						achar[b]) {
    					a++;b++;
    				
    				}else {
    					b=pre[b];
    					if (b==-1) {
    						a++;b++;
    					}
    				}
    				if (b==ss) {
    					b--;
    				}
    			}
    			if (a>=m-ss) {
    				pre =new int[ss+1];
    				pre=prefix(achar, pre, ss);
    				if (ss==0) {out.println(0);
    				continue laa;
    				}
    				ss=pre[ss];
    				
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
