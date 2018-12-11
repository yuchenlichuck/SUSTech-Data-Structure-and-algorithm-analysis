import java.util.Scanner;

public class Main4{		

//	public static int BS(int[] arr,int key){
//		int low = 0;
//		int high = arr.length - 1;
//		int middle = 0;		
//		
//		if(key < arr[low] || key > arr[high] || low > high){
//			return 0;				
//		}
//		
//		while(low <= high){
//			middle = (low+high)/2;
//			if(arr[middle] > key){
//				high = middle - 1;
//			}else if(arr[middle] < key){
//
//				low = middle + 1;
//			}else{
//				return 1;
//			}
//		}
//		if(arr[high]==key &&arr[low]==key)
//			return high-low+1;
//		return 0;		
//	}
	
    public static int makeSearchLoop(int target,int[] arr,int tag) {
        if(arr.length == 0) {
            return -1;
        }
        int left=0,right=arr.length-1;
        while(left+1<right) {
            int mid = (left+right)/2;
            if(target > arr[mid]) {
                left = mid+1;
            }
            if(target < arr[mid]) {
                right = mid-1;
            }
            if(target == arr[mid] && tag == 0) {
                right = mid;
            }
            if(target == arr[mid] && tag == 1) {
                left = mid;
            }
        }
        if(arr[left]==arr[right] && arr[right]==target) {
            return left+tag;
        }
        if(arr[left] == target) {
            return left;
        }
        if(arr[right] == target) {
            return right;
        }
        return -1;
   }
	    public static void main(String[] args)
	    {
	    	Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			for (int i=0;i<a;i++) {
				int b=in.nextInt();
				int c=in.nextInt();
				int[] ar=new int[b];
				for (int j=0;j<b;j++) 
				{ ar[j]=in.nextInt();
				}
				int sum=0;
				for (int j=0;j<b;j++) 
				{ 	if (2*ar[j]!=c || ar[j+1]!=ar[j]) {
					sum+=(makeSearchLoop(c-ar[j],ar,1)-makeSearchLoop(c-ar[j], ar, 0));
				}}
				System.out.println(sum/2);
			}
		}
	}
