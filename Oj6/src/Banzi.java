import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Banzi{      
	
	
	
    static class Task {
    	static int sum;
    	static int[] a=new int[100000];
    	static int[] tem=new int[100000];
    	static void merge(int l,int mid,int r) {
    		int i=l;
    		int j=mid+1;
    		int k=1;
    		while(i<=mid && j<=r) {
    			if (a[i]>a[j]) {
    			tem[k++]=a[j++];
    			sum+=mid-i+1;
    			}
    			else 
    				tem[k++]=a[i++];
    			}
    		while(i<=mid)
    			tem[k++]=a[i++];
    		while(j<=r)
    			tem[k++]=a[j++];
    		for (i = l,k=1; i <=r; i++,k++) {
    			a[i]=tem[k];
    		}
    		}
    	
    		static void merge_sort(int l,int r) {
    		if (l<r) {
    			int mid= (l+r)/2;
    			merge_sort(l, mid);
    			merge_sort(mid+1,r);
    			merge(l, mid, r);
    		}
    	}
    	    public void solve(InputReader in,PrintWriter out) 
    	    { 
    	    
    	    	int T=in.nextInt();
    	    	
    			for(int i=0;i<T;i++) {
    			
    			int n=in.nextInt();
    			for (int j = 0; j < n; j++) {
    				a[j]=in.nextInt();
    			}
    			sum=0;
    			
    			merge_sort(0, n-1);
    			System.out.println(sum);
    			
    			}
    	    }
    	} 
    	
        public void solve(InputReader in, PrintWriter out) {

    			
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
