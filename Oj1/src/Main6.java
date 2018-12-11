import java.util.Scanner;

public class Main6 {
	public static int minn(int a, int b) {
		return (a >= b) ? b : a;
	}

	public static int maxx(int a, int b) {
		return (a >= b) ? a : b;
	}

	public static boolean swap(int a, int b, int m, int n) {
		if (a <= m && b <= n) {
			return true;
		} else if (a <= n && b <= m) {
			return true;
		} else
			return false;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		for (int i = 0; i < h; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int n = in.nextInt();
			int m = in.nextInt();
			int x ;
			int y ;
			if (n>=m) {
				x=n;y=m
			}else {x=m;
			y=n;
			}

			if  ((2 * a + 2 * b <= m) && (c + 2 * minn(a, b) <= n)) {
				System.out.println("Yes");
			}
//			else if (swap(a+b+2*c, a+b+c, m, n)||swap(a+c+2*b, a+b+c, m, n)||swap(c+b+2*a, a+b+c, m, n)){
//					System.out.println("Yes"); 	
//				} 
			
			else if (((2 * c + 2 * b <= m) && (a + 2*c <= n))||
					((2 * c + 2 * b <= m) && (a + 2*b <= n))||
					((2 * c + 2 * b <= n) && (a + 2*c <= m))||
					((2 * c + 2 * b <= n) && (a + 2*b <= m))
					) {
				System.out.println("Yes");
			} else if (((2 * c + 2 * a <= m) && (b + 2*a <= n))||
					((2 * c + 2 * a <= m) && (b + 2*c <= n))||
					((2 * c + 2 * a <= n) && (b + 2*c <= m))||
					((2 * c + 2 * a <= n) && (b + 2*b <= m))) {
				System.out.println("Yes");
			} else if (((2 * a + 2 * b <= m) && (c + 2*b <= n))||
					((2 * a + 2 * b <= m) && (c + 2*a <= n))||
					((2 * a + 2 * b <= n) && (c + 2*b <= m))||
					((2 * a + 2 * b <= n) && (c + 2*a <= m))) {
				System.out.println("Yes");
			} else if (((2 * a + b+c <= x) && (a + 2*c <= n))||
					((2 * c + 2 * b <= m) && (a + 2*b <= n))
					) {
				System.out.println("Yes");
			} else if ((2 * a + 2 * b <= n) && (c + 2 * minn(a, b) <= m)) {
				System.out.println("Yes");
			} else if (3 * a <= x - y && b + c <= y) {
				System.out.println("Yes");
			} else if (3 * b <= x - y && a + c <= y) {	
				System.out.println("Yes");
			} else if (3 * c <= x - y && b + a <= y) {
			System.out.println("Yes");
			} else if (minn(minn(a, b), c) <= (x - y) && b + a + c <= y)
					 {
				System.out.println("Yes");
			} else if (swap(minn(2 * a + b, 2 * b + a), 2 * c + a + b, m, n)
					|| swap(minn(2 * c + b, 2 * b + c), 2 * a + b + c, m, n)
					|| swap(minn(2 * a + c, 2 * c + a), 2 * b + a + c, m, n))
			{System.out.println("Yes");
			}
				else System.out.println("No");
		}
	}
}
