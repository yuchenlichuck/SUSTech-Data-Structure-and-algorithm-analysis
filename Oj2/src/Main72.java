import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main72 {
//    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
//    public static int nextInt() throws IOException {
//        in.nextToken();
//        return (int) in.nval;
//    }
//    public static String next() throws IOException {
//        in.nextToken();
//        return (String) in.sval;
//    }
//    
    static final double eps=0.0001;
    public static void main(String[] args) throws IOException {
    	StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
    	while(in.nextToken() != StreamTokenizer.TT_EOF) {
            int n,k;
            n=(int) in.nval;
            in.nextToken();
            k=(int) in.nval;
          
            
            int b[]=new int [n];
            int a[]=new int [n];
            if(n==0&&k==0) {
                break;
            }
            double Lift=0.0;
            double Right=1000.0;
            double Mid,fl=0.0;
            Double c[]=new Double [n];
            for(int i=0;i<n;i++) {
            	in.nextToken();
            	a[i]=(int) in.nval;
            }
            for(int i=0;i<n;i++) {
            	in.nextToken();
            	b[i]=(int) in.nval; 
            }
            for(int i=0;i<n;i++) {
                b[i]=b[i]*a[i];
            }

            while(Right-Lift>eps) {
                Mid=(Lift+Right)/2;
                for(int i=0;i<n;i++) {
                    c[i]=b[i]-Mid*a[i];
                }
                CMP cmp=new CMP();
                Arrays.sort(c,cmp);
                fl=0.0;
                for(int i=0;i<n-k;i++) {
                    fl+=c[i];
                }
                if(fl>0) {
                    Lift=Mid;
                }else {
                    Right=Mid;
                }
            }
            out.printf("%.3f\n",Lift);
            out.flush();
        }
    }
}
class CMP implements Comparator<Double>{
    public int compare(Double o1, Double o2) {
       if(o1<o2) {
            return 1;
        }else if(o1>o2){
            return -1;
        }
        return 0;
    }
}