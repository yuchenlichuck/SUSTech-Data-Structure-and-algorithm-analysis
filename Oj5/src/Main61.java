import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class Main61{      
	
	
	
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
    				TreeMap<String, Integer>map=new TreeMap<>();	
    		int n=in.nextInt();
    		String[] strings=new String[n];
    		int min=999;
    		int mij=1001;
    		for (int j = 0; j < n; j++) {
    			strings[j]=in.next();
    			if (min>strings[j].length()) {
    			min=strings[j].length();
    			mij=j;
    		}
    		}
    			boolean boo=false;
    			String string=strings[mij];
    			for (int j = min; j > 0; j--) {
    				if (boo)break;
    				la:	for (int k = 0; k <= min-j; k++) {
    					String s=string.substring(k, k+j);
    					char[] bchar=s.toCharArray();
    					int[] pre=new int[s.length()];
    					pre=prefix(bchar, pre, s.length());
    					int sum=0;
    					for (int l = 0; l < n; l++) {
    						if (l==mij)continue;
    						int a=0;int b=0;
    						char[] achar=strings[l].toCharArray();
    						while(a<achar.length){
    							if (b==s.length()-1 &&  achar[a]==bchar[b]) {
    								b=pre[b];
    							if (b==-1 ) {
    								b++;		
    					}
    							sum++;
    							break;
    						}
    						if (achar[a]==
    								bchar[b]) {
    							a++;b++;
    						}
    						else {
    							b=pre[b];
    							if (b==-1) {
    								a++;b++;
    							}
    							
    						}
    						if (b==s.length()
    								) {
    							b--;
    						}
    					}
    		if (sum<l) { 
    			continue la;				
    				}
    					}	
    		if (sum==n-1)	{		
    			map.put(s, 1);
    			boo=true;
    		}			
    }
    			}
    			if (!map.isEmpty())
    			System.out.println(map.firstKey());
    			else System.out.println("Hong");
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
