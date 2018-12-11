import java.util.*; 
  
class QuickSort 
{ 

    static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high]; 
        int i = (low-1); 
        for (int j=low; j<=high-1; j++) 
        { 
            if (arr[j] <= pivot) 
            { 
                i++;
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 
    static void qSort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
            qSort(arr, low, pi-1); 
            qSort(arr, pi+1, high); 
        } 
    } 
    public static void main(String args[]) 
    { 
    	Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
		
		int n=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[n];
		for (int j = 0; j < n; j++) {
		a[j]=in.nextInt();
		}
        qSort(a, 0, n-1); 
          
System.out.print(a[k-1]);
		} 
    } 
} 