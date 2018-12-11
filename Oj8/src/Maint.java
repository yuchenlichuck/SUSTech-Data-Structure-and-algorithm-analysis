	import java.io.DataInputStream;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.OutputStream;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.Queue;
	
	class vertice{
		public ArrayList<Integer> out;
		public boolean visited;
		public vertice() {
			this.visited=false;
			this.out=new ArrayList<>();
		}
	}
	class G{
		int n;
		vertice[] vertices;
		public  G(int n) {
			this.n=n; 
			vertices=new vertice[n];
		}
		public void setver(int nss) {
			for (int i = 0; i < nss; i++) {
				this.vertices[i]=new vertice();	
			}
		}
	}
	public class Maint{
		static class Reader
	    {
	        final private int BUFFER_SIZE = 1 << 16;
	        private DataInputStream din;
	        private byte[] buffer;
	        private int bufferPointer, bytesRead;
	 
	        public Reader()
	        {
	            din = new DataInputStream(System.in);
	            buffer = new byte[BUFFER_SIZE];
	            bufferPointer = bytesRead = 0;
	        }
	 
	        public Reader(String file_name) throws IOException
	        {
	            din = new DataInputStream(new FileInputStream(file_name));
	            buffer = new byte[BUFFER_SIZE];
	            bufferPointer = bytesRead = 0;
	        }
	 
	        public String readLine() throws IOException
	        {
	            byte[] buf = new byte[64]; // line length
	            int cnt = 0, c;
	            while ((c = read()) != -1)
	            {
	                if (c == '\n')
	                    break;
	                buf[cnt++] = (byte) c;
	            }
	            return new String(buf, 0, cnt);
	        }
	 
	        public int nextInt() throws IOException
	        {
	            int ret = 0;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();
	            do
	            {
	                ret = ret * 10 + c - '0';
	            }  while ((c = read()) >= '0' && c <= '9');
	 
	            if (neg)
	                return -ret;
	            return ret;
	        }
	        public int nextByte() throws IOException
	        {
	            int ret = 0;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();
	            do
	            {
	                ret = ret * 10 + c - '0';
	            }  while ((c = read()) >= '0' && c <= '9');
	 
	            if (neg)
	                return -ret;
	            return ret;
	        }
	        
	        public long nextLong() throws IOException
	        {
	            long ret = 0;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();
	            do {
	                ret = ret * 10 + c - '0';
	            }
	            while ((c = read()) >= '0' && c <= '9');
	            if (neg)
	                return -ret;
	            return ret;
	        }
	 
	        public double nextDouble() throws IOException
	        {
	            double ret = 0, div = 1;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();
	 
	            do {
	                ret = ret * 10 + c - '0';
	            }
	            while ((c = read()) >= '0' && c <= '9');
	 
	            if (c == '.')
	            {
	                while ((c = read()) >= '0' && c <= '9')
	                {
	                    ret += (c - '0') / (div *= 10);
	                }
	            }
	 
	            if (neg)
	                return -ret;
	            return ret;
	        }
	 
	        private void fillBuffer() throws IOException
	        {
	            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
	            if (bytesRead == -1)
	                buffer[0] = -1;
	        }
	 
	        private byte read() throws IOException
	        {
	            if (bufferPointer == bytesRead)
	                fillBuffer();
	            return buffer[bufferPointer++];
	        }
	 
	        public void close() throws IOException
	        {
	            if (din == null)
	                return;
	            din.close();
	        }
	    }

	    public static void main(String[] args) throws IOException {
	    	Reader in=new Reader();
	        int T=in.nextInt();
    		OutputStream outputStream = System.out;
    		PrintWriter out = new PrintWriter(outputStream);
            G g = new G(10000);
	        for (int i = 0; i < T; i++) {
	        	int n=in.nextInt();
	            int m=in.nextInt();
	            int s=in.nextInt();
	            g.setver(n);
	            for (int j = 0; j < m; j++) {
	                int x=in.nextInt();
	                int y=in.nextInt();
	                g.vertices[x-1].out.add(y-1);
	                g.vertices[y-1].out.add(x-1);  
	              }
//	                    Queue<Integer> list=new LinkedList<>();
//	                    list.add(s-1);
//	                    int[] a=new int[n];
//	                    int step1=0;
//	                    int step2=0;
//	                    int step=0;
//	                    for (int j = 0; j < n; j++) {
//							a[j]--;
//						}
//	                    a[s-1]=0;
//	                    int[] b=new int[n];
//	                    
//	                    while(!list.isEmpty())
//	                    {	
//
//
//	                    	
//	                    	int ope=list.poll();
//	                    	g.vertices[ope].visited=true;
//	                    	int nm=0;
//	                    	ArrayList<Integer> ve=g.vertices[ope].out;
//	                    	for (int k : ve) {
//	                			if (!g.vertices[k].visited) {
//	                				list.add(k);
//	                				a[k]=step+1;
//	                				nm++;
//	                			}
//	                    	}
//	                    	step2+=nm;
//	                    	if(step1--<=0) {
//	                    		step1=step2;
//	                    		step2=0;
//	                    		step++;
//	                    	}
//	                    	
//	                    	}
//	                    for (int j = 0; j < n; j++) {
//	                    	out.print(a[j]+" ");
//						}
//	                    out.println();

	                    	
	        }
            out.close();    
	    }
	}