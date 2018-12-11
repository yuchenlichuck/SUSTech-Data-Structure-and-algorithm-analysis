import java.util.Scanner;

public class Main7 {


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
				x=n;y=m;
			}else {x=m;
			y=n;
			}

			if (((2 * c + 2 * b <= m) && (a + 2*c <= n))||
					((2 * c + 2 * b <= m) && (a + 2*b <= n))||
					((2 * c + 2 * b <= n) && (a + 2*c <= m))||
					((2 * c + 2 * b <= n) && (a + 2*b <= m))
					) {
				System.out.println("Yes");
			} else if (((2 * c + 2 * a <= m) && (b + 2*a <= n))||
					((2 * c + 2 * a <= m) && (b + 2*c <= n))||
					((2 * c + 2 * a <= n) && (b + 2*c <= m))||
					((2 * c + 2 * a <= n) && (b + 2*a <= m))) {
				System.out.println("Yes");
			} else if (((2 * a + 2 * b <= m) && (c + 2*b <= n))||
					((2 * a + 2 * b <= m) && (c + 2*a <= n))||
					((2 * a + 2 * b <= n) && (c + 2*b <= m))||
					((2 * a + 2 * b <= n) && (c + 2*a <= m))) {
				System.out.println("Yes");
			} else if ((2 * a + b+c <= m) && (b + 2*c <= n||c + 2*b <= n||a+b+c <= n)) {
				System.out.println("Yes");
			} else if ((2 * a + b+c <= n) && (b + 2*c <= m||c + 2*b <= m||a+b+c <= m)) {
				System.out.println("Yes");
			}
			else if ((2 * c + a+b <= m) && (a + 2*b <= n||b + 2*a <= n||a+b+c <= n)) {
				System.out.println("Yes");
				
			} else if ((2 * c + a+b <= n) && (a + 2*b <= m||b + 2*a <= m||a+b+c <= m)) {
				System.out.println("Yes");
			}else if ((2 * b + a+c <= m) && (c + 2*a <= n||a + 2*c <= n||a+b+c <= n)) {
				System.out.println("Yes");}
			else if ((3 *a + b+c <= x) && (b+c<y)) {
				System.out.println("Yes");}
			else if ((3 *b + a+c <= x) && (a+c<y)) {
				System.out.println("Yes");}
			else if ((3 *c + a+b <= x) && (a+b<y)) {
				System.out.println("Yes");}
				else System.out.println("No");
		}
	}
}
