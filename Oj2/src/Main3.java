import java.util.Scanner;

public class Main3{		 
	static int y;    
	public static void main(String[] args)
	    {  
	    	Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			for (int i=0;i<t;i++) {
			int y=in.nextInt();
	        double a = 0, b = 100, delta = 1E-6;
	        double x1 = a;
	        double x2 = b;
	        while(x2 - x1 > delta)
	        {
	            double diff = x2 - x1;
	            if (isArea(x1, x2,y))
	                x1 = x1 + diff / 2;
	            else
	            {
	                x2 = x1;
	                x1 = x1 - diff;
	            }
	        } 
	        double g1=g(x1,y);
	        System.out.printf("Case %d: %.4f\n" , i,g1);
	    }
	    }
	    private static boolean isArea(double x1, double x2,double y)
	    {
	        boolean result = true;
	        double f1=f(x1,y);double f2=f(x2,y);
	        if(f(x1,y) * f(x2,y) > 0)
	            result = false;
	        else if(f(x1,y) * f(x2,y) < 0)
	            result = true;
	        return result;
	    }
	     
	    private static double f(double x,double y)
	    {
	        return Math.pow(x,6)*35 + (Math.pow(x, 5))*36 +9*(Math.pow(x, 2))+8*x -2*y;
	    }
	    
	    private static double g(double x,double y)
	    {
	        return Math.pow(x,7)*5 + (Math.pow(x, 6))*6 +3*(Math.pow(x, 3))+4*x*x -2*x*y;
	    }
	}
