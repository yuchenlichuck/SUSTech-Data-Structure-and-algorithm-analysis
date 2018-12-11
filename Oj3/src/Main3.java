import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
public class Main3{      
    static class Task {
    	
        public void solve(InputReader in, PrintWriter out) {
        	while(in.hasNext()) {
        		int a=in.nextInt();
        		if (a==0)break;
        		
        		String string=in.next();
        		char[] ss=string.toCharArray();
        		HashMap<Character, Integer> map=new HashMap<>();
        		HashMap<Character, Integer> map1=new HashMap<>();
        		int e=0;
        		for (char s:ss) {
        			if (map.containsKey(s)) {
        				map.remove(s);a++;
        			}
        			else {
        				if (a==0)
        				{
        				if (map1.containsKey(s))	
        					{e++;
        					map1.remove(s);
        					}
        				else {
        					map1.put(s, 1);
        				}
        				}
        				else {
        					if (map1.containsKey(s)) {
		        				map1.remove(s);e++;
		        				}
        					else{map.put(s, 1);
    						a--;
    						}
        							
//        							for(char key:map1.keySet())
//        		        {
//        			        map.put(key, 1);
//        			        map1.remove(key);
//        			        a--;
//        					if (a==0)break;
//        		        }
        						
        						
        						}
        						}
        			}
        			out.println(e);
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
