import java.util.Arrays;
import java.util.Scanner;
public class Main51{      
        public static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);

            while (in.hasNextInt()) {
            int l=in.nextInt();	
            int n=in.nextInt();
            int m=in.nextInt();
            int[] arr=new int[n+1];
            arr[n]=l;
            for (int i=0;i<n;i++) {
            	arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
            int mid1=l/m;
            while(true) {
            	 int qq=0;
                 int nn=0;
                 int j=0;
                 for (j=1;j<n+1;j++) {
            	if (qq>=m-1) {
            		break;
            	}else if
            	(arr[j]-arr[j-1]>mid1) {
            		mid1=arr[j]-arr[j-1];
             		qq+=2;
            		nn=arr[j];
            	}else 
            	if (arr[j]-nn>mid1)
            	{
            		nn=arr[j-1];
            		qq++;
            	}	
            }
            if ((arr[n]-nn<=mid1 && qq<=m-1) ||(qq==m&&j==n+1))break;
            else mid1++;
            }
            System.out.println(mid1);
            }
    }
 }