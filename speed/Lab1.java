package src;
import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args) {
		System.out.println("Please inut two row and col");
		Scanner in = new Scanner(System.in);
	    int  row = in.nextInt();
	    int  col = in.nextInt();
	    System.out.println("P");
	int [][] num = new int[row][col];
	   for (int i=1;i<row+1;i++) {
		   for(int j=1;j<col+1;j++) {
			   num[i][j] = in.nextInt();
		   }
	   }
	   for (int i=1;i<row+1;i++) {
		   for(int j=1;j<col+1;j++) {
			   System.out.print(num[i][j]+"\t");
		   }
		System.out.println();
	   }
      for(int j=1;j<col+1;j++){
	   for (int i=1;i<row+1;i++){
			   System.out.print(num[i][j]+"\t");
		   }
		System.out.println(); 
	}

}
}