    import java.io.DataInputStream;
    import java.io.FileInputStream;
    import java.io.IOException;
    import java.io.OutputStream;
    import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
    import java.util.LinkedList;
     
    class vertice{
        public ArrayList<Integer> out;
        public boolean visited;
        public int node;
        public vertice(int node) {
            this.visited=false;
            this.node=node;
            this.out=new ArrayList<>();
        }
        public int step=-1;
    }
    class G{
        int n;
        int m;
        vertice[] vertices;
        public  G(int n,int m) {
            this.m=m;
            this.n=n;
            vertices =new vertice[n] ;
            for (int i = 0; i < n; i++) {
                vertices[i]=new vertice(i); 
            }
             
        }
    }
    public class Main6{
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
            for (int i = 0; i < T; i++) {
                int n=in.nextInt();
                int m=in.nextInt();
                int s=in.nextInt();
                G g = new G(n, m);
                for (int j = 0; j < m; j++) {
                    int x=in.nextInt();
                    int y=in.nextInt();
                    g.vertices[x-1].out.add(y-1);
                    g.vertices[y-1].out.add(x-1);  
                  }
                      LinkedList<vertice> list=new LinkedList<>();
                      list.add(g.vertices[s-1]);
                      g.vertices[s-1].step=0;
                      while(!list.isEmpty())
                      {   
                          vertice ope=list.pop();
                          g.vertices[ope.node].visited=true;
                          for (int k : ope.out) {
                              if (!g.vertices[k].visited) {
                                  g.vertices[k].step=ope.step+1;
                                  list.add(g.vertices[k]);
                              }
                          }
                          }
                      for (int j = 0; j < n; j++) {
                          out.print(g.vertices[j].step+" ");
                      }
                      out.println();
 
                             
            }
            out.close();    
        }
    }