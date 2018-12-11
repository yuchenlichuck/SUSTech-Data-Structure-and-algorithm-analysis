import javax.print.attribute.standard.PrinterMessageFromOperator;

public class FindMax {
	public static void main(String[] arg) {
		//int a[] = {5, 1, 4, 7, 8, 9, -1, 6};
		//int length = a.length;
	//	int maxNum =getMax(a, 1);
		//System.out.printf("The maximum element in array is %d", maxNum);
	//	System.out.printf("The maximum element in array is %d", mystery(12, 12));
		Integer[] a= {2,5,7,9};
		Double[] b= {3.87,99.99};
		prints(a);
		prints(b);
	}

//	static int max (int a, int b) {
//		return a > b ? a : b;
//	}
////	private static int getMax(int[] a, int startlength) {
////		if (startlength == a.length-1) {
////			return a[startlength-1];// base case
////		}
////		else
////		{
////			 return max(a[startlength-1], getMax(a, startlength+1 ));//link between n - 1 and n
////		}
//	}
//	

	
	public static <T extends Comparable<T>> void prints (T[] a){
		for (T list:a) {
			System.out.print(list+" ");
	}
		System.out.println();
}
}		


 

