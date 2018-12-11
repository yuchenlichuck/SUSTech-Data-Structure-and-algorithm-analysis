package demo;

import java.util.Scanner;

public class GussingNumber {
	public static void main(String[] args) {
	java.util.Random random = new java.util.Random();
	int magicNum = random.nextInt(10);
	  Scanner in = new Scanner(System.in);
       	int a = in.nextInt();
       	while (a != magicNum){
       		System.out.println("Please try again," + 
       				"input another integer in {0,1,2,…,9}");
       		 a = in.nextInt();
       		}
       		System.out.println("Congratulations");
       	
       	
	}
}
