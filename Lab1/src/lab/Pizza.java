package lab;

import java.util.Scanner;
import java.util.Spliterator;

public class Pizza {

	public static void Pizza(String s) {
	String[] splita=s.split(",");
System.out.printf("name=%.f,size=%.f,price=%.f",splita[0],splita[1],splita[2]);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Wether you need a pizza?1 or 0");
		int i=input.nextInt();
		String []ar= new String[10];
		int j=0;
		while (i>0) {
			ar[j]=input.nextLine();j++;
			System.out.println("Wether you need a pizza?1 or 0");
			i=input.nextInt();
		}
    for (int w=0;w<=j;w++) {
    	Pizza(ar[w]);
    }
	}
}