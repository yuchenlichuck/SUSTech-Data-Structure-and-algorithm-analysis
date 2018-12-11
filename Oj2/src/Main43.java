import java.io.*;
import java.util.StringTokenizer;
public class Main43{      
    static class Task {

        public void solve(InputReader in, PrintWriter out) {
            while (in.hasNext()) {
                
                int a=in.nextInt();	
                int b=in.nextInt();
                int[] ar=new int[a];
                int[][] br=new int[b][3];
                for (int i=0;i<a;i++)
                           ar[i]=in.nextInt();
                boolean boo=true;
              
                
               
                	for (int i=0;i<=b-1;i++) {
                		for (int j=0;j<=2;j++) {
                			br[i][j]=in.nextInt();
                		}
                	}
                for (int i=0;i<b && boo;i++) {
                	int r=br[i][0];
                    for (int j=br[i][1];j<=br[i][2];j++)  {
                        if (ar[j-1]>=r) {   
                            ar[j-1]-=r;
                        }
                        else{             
                            boo=false;System.out.println(-1);
                            System.out.println(i+1);break;
                    }
                }
            }
                if (boo)System.out.println(0);
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
