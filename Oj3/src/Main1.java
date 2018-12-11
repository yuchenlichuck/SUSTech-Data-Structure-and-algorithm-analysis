import java.io.*;
import java.util.StringTokenizer;
public class Main1{      
    static class Task {
    	public static void merge(int []a,int low,int mid,int high){
    		
    		 int [] temp=new int[high+1];
    			for(int i=low;i<=high;i++){
    				temp[i]=a[i];
    				
    			}
    			int i=low,j=mid+1,k=low;
    			for(;i<=mid&&j<=high;k++){
    				if(temp[i]<temp[j])a[k]=temp[i++];
    				else a[k]=temp[j++];
    				
    			}
    			while(j<=high)
    				a[k++]=temp[j++];
    						
    			while(i<=mid)
    				a[k++]=temp[i++];	
    		}
        public void solve(InputReader in, PrintWriter out) {
        	int T=in.nextInt();
            	for(int i=0;i<T;i++) {
            		int n=in.nextInt();
            		
                    int m=in.nextInt();
                    
                    
                    
                    int[] a=new int[n+m];
                    
                    for(int j=0;j<n+m;j++) {
                    	a[j]=in.nextInt();
                    }
                    
                    merge(a, 0, n-1, n+m-1);
                    
                    for(int w:a) {
                    	out.print(w+" ");
                    }
                    
                    
                    out.println();
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