import java.io.*;
import java.math.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class Main73 {
    public static void main(String[] args){
        InputStream inputStream = System.in;//new FileInputStream("C:\\Users\\wavator\\Downloads\\test.in");
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
    	static final double eps=0.000001;
        public void solve(InputReader in, PrintWriter out) {
            while (in.hasNext()) {
                
            	 int n,k;
                 n=in.nextInt();
                 k=in.nextInt();
                 if(n==0&&k==0) {
                     break;
                 }
                 int a[]=new int [n];
                 int b[]=new int [n];
                 Double c[]=new Double [n];
                 for(int i=0;i<n;i++) {
                     a[i]=in.nextInt();
                 }
                 for(int i=0;i<n;i++) {
                     b[i]=in.nextInt();
                 }
                 for(int i=0;i<n;i++) {
                     a[i]=b[i]*a[i];
                 }
                 
                 double L=0.0;
                 double R=1000.0;
                 double Mid,fl=0.0;
                 while(R-L>eps) {
                     Mid=(L+R)/2;
                     for(int i=0;i<n;i++) {
                         c[i]=a[i]-Mid*b[i];
                     }
                     CMP cmp=new CMP();
                     Arrays.sort(c,cmp);
                     fl=0.0;
                     for(int i=0;i<n-k;i++) {
                         fl+=c[i];
                     }
                     if(fl>0) {
                         L=Mid;
                     }else {
                         R=Mid;
                     }
                 }
                 System.out.printf("%.4f\n",L);
             }
         }
     }
     class CMP implements Comparator<Double>{

         @Override
         public int compare(Double o1, Double o2) {
             // TODO Auto-generated method stub
             if(o1<o2) {
                 return 1;
             }else if(o1>o2){
                 return -1;
             }
             return 0;
                
            
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

        public long nextLong() {
            return Long.parseLong(next());
        }
        
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        
        public char[] nextCharArray() {
            return next().toCharArray();
        }
        
//         public boolean hasNext() {
//             try {
//                 return reader.ready();
//             } catch(IOException e) {
//                 throw new RuntimeException(e);
//             }
//         }
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
        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        
        public BigDecimal nextBigDecinal() {
            return new BigDecimal(next());
        }
    }
}