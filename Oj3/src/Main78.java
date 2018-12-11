import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class Main78{      
    static class Task {
    	
    	public static int swap(int a,int b,int c) {
    	if ((c>a&&c>b) || (c==b&&a<b)||(c==a&&c<b))
    		return 1;
    	else if ((c<=a&&c<=b) || (c==b&&a>b)||(c==a&&c>b))
    		return -1;
    	else return 0;
    	}
    	
        public void solve(InputReader in, PrintWriter out) {
    		int T=in.nextInt();


    		for(int i=0;i<T;i++) {
    			TreeMap<Integer, Integer> map=new TreeMap<Integer,Integer>();
    			TreeMap<Integer, Integer> map1=new TreeMap<Integer,Integer>();
    			int n=in.nextInt();
    			int [] a=new int[n];
    			int [] a1=new int[n];
    			for(int j=0;j<n;j++) {
    				int q=in.nextInt();
    				a[j]=q;
    				a1[j]=q;
    				if(map.containsKey(q)) {
            			Integer sInteger=map.get(q);
            				map.put(q, sInteger+1);		
            			}else {
            				map.put(q, 1);
            		}
    				}
    			Arrays.sort(a);
    			int w=n/2;
    			int mid=a[w];
    			String string=mid+" ";
    			for (int j=n-1;j>=4;j-=2) {
    				mid=a[w];
    				int e=a1[j];
    				int f=a1[j-1];
    				if(map1.containsKey(e)) {
            			Integer sInteger=map1.get(e);
            				map1.put(e, sInteger+1);		
            			}else {
            				map1.put(e, 1);
            		}
    			if(map1.containsKey(f)) {
            			Integer sInteger=map1.get(f);
        				map1.put(f, sInteger+1);		
        			}else {
            				map1.put(f, 1);

        		}
    				int d=swap(e, f, mid);
    				w+=d;
    				if (d==0) {
    					string=mid+" "+string;
    				continue;}
    				while(true) {
    				mid=a[w];
    				if (map1.containsKey(mid) && (map1.get(mid) >= map.get(mid))) {
    				w+=d;
    				}else {
    					string = mid +" "+string;break;
    				}
    				
    			}
    			
    			}
    			string=a1[0]+" "+string;
out.println(string);
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
