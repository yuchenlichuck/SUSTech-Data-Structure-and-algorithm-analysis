import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class Arraysort{  
	class Point{
	    int x;
	    int y;
	}
	Point[] arr;
	Arraysort(int n){
		 arr=new Point[n];    //定义对象数组arr，并分配存储的空间
	        for(int i=0;i<n;i++)
	            arr[i]=new Point();
	  
	}

    static class Task {
		//比较器，x坐标从小到大排序；x相同时，按照y从小到大排序
    	class MyComprator implements Comparator {
    	    public int compare(Object arg0, Object arg1) {
    	        Point t1=(Point)arg0;
    	        Point t2=(Point)arg1;
    	        if(t1.x != t2.x)
    	            return t1.x>t2.x? 1:-1;
    	        else
    	            return t1.y>t2.y? 1:-1;
    	    }
    	}
    	

        @SuppressWarnings("unchecked")
		public void solve(InputReader in, PrintWriter out) {
            while (in.hasNext()) {
                
                int n=in.nextInt();	
                int k=in.nextInt();
                int[][] ar=new int[n][2];
                boolean boo=true;
                int zi=0;int mu=0;
                Arraysort sort =new Arraysort(n);
            	for (int i=0;i<n;i++) {
        			sort.arr[i].y=in.nextInt();//y学分
        		}
            	for (int i=0;i<n;i++) {
        			sort.arr[i].x=in.nextInt();//课程分数
        		}
                
            	Arrays.sort(sort.arr, new MyComprator());
                		for (int i=0;i<n;i++) {
                			zi+=sort.arr[i].x*sort.arr[i].y;
                			mu+=sort.arr[i].y;
                		}
                		for (int i=0;i<n;i++) {
                		
                		}
                		double gpa0=(double)zi/mu;
                	  	
                		for(int i=0;i<n;i++)
                			
                		System.out.println(sort.arr[i].y+" "+sort.arr[i].x);
                		
                		while (true) {
                			
                			
                				
                		
                			
                		}
                		
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
    	//
        public static int binarySearch(int[] a,int value) {
            int start = 0;
            int end = a.length - 1;
            int mid =0 ;
            while (start <= end) {
                mid = (start + end) / 2;
                if (a[mid] == value) {
                    return a[mid];
                } else if (a[mid] < value) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if(value >a[a.length-1]){
              return a[mid];
            }else if(a[0]<value && value<a[a.length-1]){
                return a[mid-1];
            }else {
                return value;
            }
        }
      }


