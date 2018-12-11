import java.util.Scanner;

class JosephLoop
{    //n为环中人数，m为每次报数的人数，k为报数的起始位置0~n-1
    int n,m,k,e;
    int[] persons;
    int[] seq;
    
    JosephLoop(int n, int k, int m,int e){
        this.n = n;
        this.m = m;
        this.k = k;
        this.e=e;
        persons = new int[n];
        seq = new int[n];

    }
    
    public void showSeq(){
if (e==seq[seq.length-1]) {
	System.out.println("Yes");
}else
	System.out.println("No");
    }
    
    public void calcLoop(){        
        for(int j=0;j<n;j++)
        {    
            int index=k;
            for (int i=0; i<m ; index++)
            {
                if (persons[index%n]==0)
                {
                    i++;
                }
            }
            persons[(index-1)%n] = 1;
            seq[j] = (index-1)%n;
            k = (index)%n;
        }
    }

}
class main44 
{
    public static void main(String[] args) 
    {
    	
    Scanner in=new Scanner(System.in);
    
    	int T=in.nextInt();
    	for(int i=0;i<T;i++) {
    	int n=in.nextInt();
    	int m=in.nextInt();
    	int e=in.nextInt();
    	
        JosephLoop jose = new JosephLoop(n,0,m+1,e); //n,k,m
        jose.calcLoop();
        jose.showSeq();
    	}
    }
}