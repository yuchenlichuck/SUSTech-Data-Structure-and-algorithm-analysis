import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main7{      
    static class Task {

        public void solve(InputReader in, PrintWriter out) {
            while (in.hasNext()) {
                
                int n=in.nextInt();	
                int k=in.nextInt();
               // int[] ar=new int[a];
                int[][] ar=new int[n][2];
//                for (int i=0;i<a;i++)
//                           ar[i]=in.nextInt();
                boolean boo=true;
                int zi=0;int mu=0;
                		for (int j=0;j<2;j++) {
                	for (int i=0;i<n;i++) {
                			ar[i][j]=in.nextInt();
                		}
                	}
                		for (int i=0;i<n;i++) {
                			zi+=ar[i][0]*ar[i][0];
                			mu+=ar[i][0];
                		}
                		double gpa=(double)zi/mu;
                	  	
                		Arrays.sort(ar);
                		for(int i=0;i<n;i++)
                		System.out.println(ar[i][0]+" "+ar[i][1]);
//                        while(true) {
//                       	 int qq=0;
//                            int nn=0;
//                            int j=0;
//                            for (j=1;j<n+1;j++) {
//                       	if (qq>=m-1) {
//                       		break;
//                       	}else if
//                       	(arr[j]-arr[j-1]>mid1) {
//                       		mid1=arr[j]-arr[j-1];
//                        		qq+=2;
//                       		nn=arr[j];
//                       	}else 
//                       	if (arr[j]-nn>mid1)
//                       	{
//                       		nn=arr[j-1];
//                       		qq++;
//                       	}	
//                       }
//                       if ((arr[n]-nn<=mid1 && qq<=m-1) ||(qq==m&&j==n+1))break;
//                       else gpa+=0.001;
//                       }
//                		
//                		
//                for (int i=0;i<b && boo;i++) {
//                	int r=br[i][0];
//                    for (int j=br[i][1];j<=br[i][2];j++)  {
//                        if (ar[j-1]>=r) {   
//                            ar[j-1]-=r;
//                        }
//                        else{             
//                            boo=false;System.out.println(-1);
//                            System.out.println(i+1);break;
//                    }
//                }
//            }
                
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
