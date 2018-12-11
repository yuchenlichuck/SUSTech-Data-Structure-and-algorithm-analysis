package speed1;

import java.util.Scanner;
public class Zecken1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int i = 0;
		int[] j = new int[8];
		String[] k = new String[12];
		int[] ar = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 0 };
		for (i = 0; i < a; i++) {
			int b = in.nextInt();
//			for (int h = 0;h<=10;h++) {
//				k[h] = "";
//			}
			if (b >= 1 && b <= 100) {
				for (int f = 0; f <= b; f++) {
					la: 
					for (j[1] = 10; j[1] >= 0; j[1]--)
						for (j[2] = 10; j[2] >= 0; j[2]--)
							for (j[3] = 10; j[3] >= 0; j[3]--)
								for (j[4] = 10; j[4] >= 0; j[4]--)
									for (j[5] = 10; j[5] >= 0; j[5]--)
										for (j[6] = 10; j[6] >= 0; j[6]--)
												if (f == (ar[j[1]] + ar[j[2]] + ar[j[3]] + ar[j[4]] + ar[j[5]]
														+ ar[j[6]])) {
													//int w = 0;
													for (int w = 6; w >= 1; w--) {
													System.out.print(ar[j[1]]);
													System.out.print(" ");
													}System.out.println();
													break la;}
											}
				}
	/*for (int e = 0; b >= ar[e]; e++) {
				System.out.println("Card #" + (e+1) + ":" + k[e]);
				if (e==9) break ;*/
			}		
		}	

}