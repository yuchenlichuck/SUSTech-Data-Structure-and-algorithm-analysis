import java.util.Arrays;
import java.util.Scanner;
public class Main5{      
	int search(int A[], int n, int target)
	{
		int low = 0, high = n-1;
		while(low <= high)                 
		{
			// 注意：若使用(low+high)/2求中间位置容易溢出
			int mid = low+((high-low)>>1); 
			if(A[mid] == target)
			{
				if(mid > 0 && A[mid-1] == target)
					high = mid-1;           
				else 
					return (mid==0)?-1:mid-1;
			}
			else if(A[mid] < target)
				low = mid+1;             
			else // A[mid] > target
				high = mid-1;           
		}
	    return -(low+1);  
	}
        public static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);
            while (in.hasNextInt()) {
            int l=in.nextInt();	
            int n=in.nextInt();//dian.
            int m=in.nextInt();//ren.
           // int min;
            int[] arr=new int[n+1];
            arr[n]=l;
          //  int[] brr=new int[n];
         //   int[] guxinran=new int[n+1];
            for (int i=0;i<n;i++) {
            	arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
        //    guxinran[0]=arr[1];
          //  guxinran[n]=l-arr[n-1];
            //for(int i =0;i<n-1;i++) {
            	//guxinran[i+1]=arr[i+1]-arr[i];
            //}
            int mid1=l/m+1;
          //  int mid2=l/(n+1);
          //  int[] crr=new int[m];
           //记录上一个最大数
            while(true) {
            	 int qq=0;//累加器
                 int nn=0;

                 int j=0;

                 for (j=0;j<n+1;j++) {
            	if (qq>=m-1) {
            		break;
            	}else
            	if (arr[j]-nn>mid1 && j>=1)
            	{
            		nn=arr[j-1];
            		qq++;
            		//crr[qq-1]=j-1;
            	}
            	
            }
            
            if ((qq==m-1) &&arr[n]-nn<=mid1)break;
            else mid1++;
            }
            System.out.println(mid1);
            }
          
    }
 }