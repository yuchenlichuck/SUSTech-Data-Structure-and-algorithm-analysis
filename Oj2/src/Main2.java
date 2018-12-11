import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Main2{
	public static int commonBinarySearch(int[] sortedArray,int number){
        int start = 0;
        int end = sortedArray.length - 1;
		
		if(number < sortedArray[start] ||  number > sortedArray[end] || start > end){
			return -1;				
		}

		
		while (end >= start)
        {
            int firstMiddle = (end - start) / 3 + start;
            int secondMiddle = end - (end - start) / 3;
            if (sortedArray[firstMiddle] > number)
                end = firstMiddle - 1;
            else if (sortedArray[secondMiddle] < number)
                start = secondMiddle + 1;
            else if (sortedArray[firstMiddle] != number && sortedArray[secondMiddle] != number)
            {
                end = secondMiddle - 1;
                start = firstMiddle + 1;
            }
            else
                return 0;
        }
        return -1;
	}

	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
		int a=in.nextInt();
		int b=in.nextInt();
		int [] arr=new int[a];
	       StreamTokenizer inn = new StreamTokenizer(new BufferedReader(
                   new InputStreamReader(System.in)));

       PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
       int j=0;
       while (inn.nextToken() != StreamTokenizer.TT_EOF)
  
       {
           arr[j] = (int) inn.nval;
           j++;
       }
       out.flush();
 
		if (commonBinarySearch(arr,b)==-1){
		System.out.println("NO");
		}else{
			System.out.println("YES");
		}
		}
	}

}
