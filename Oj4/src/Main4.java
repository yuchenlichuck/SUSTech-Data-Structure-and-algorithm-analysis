import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int sx = 0;
			int sy = 0;
			int tx = 0;
			int ty = 0;
			char[][] map = new char[n + 2][m + 2];
			for (int j = 0; j < m + 2; j++) {
				map[0][j] = '#';
			}
			for (int j = 0; j < m + 2; j++) {
				map[n+1][j] = '#';
			}
			for (int j = 1; j < n + 1; j++) {
				String string = in.next();
				map[j][0] = '#';
				map[j][m + 1] = '#';
				char[] c = string.toCharArray();
				for (int k = 1; k < m + 1; k++) {
					map[j][k] = c[k-1];
					if (c[k-1] == 'S') {
						sx = j;
						sy = k;
					} else if (c[k-1] == 'E') {
						tx = j;
						ty = k;
					}
				}
			} 
			String string1 = in.next();
			int[] ak = new int[string1.length()];

			char[] b = string1.toCharArray();
			for (int k = 0; k < string1.length(); k++) {
				ak[k] = (int) b[k]-48;
			}
			int sum = 0;
			for (int q1 = 0; q1 < 4; q1++)
				for (int q2 = 0; q2 < 4; q2++) {
					if (q1 == q2)
						continue;
					for (int q3 = 0; q3 < 4; q3++) {
						if (q3 == q1 || q3 == q2)
							continue;
						for (int q4 = 0; q4 < 4; q4++) {
							if (q4 == q1 || q4 == q2 || q4 == q3)
								continue;
							for (int k = 0; k < string1.length(); k++) {
								if (ak[k] == q1) {
									b[k] = 'w';
								}
								if (ak[k] == q2) {
									b[k] = 's';
								}
								if (ak[k] == q3) {
									b[k] = 'a';
								}
								if (ak[k] == q4) {
									b[k] = 'd';
								}
							}


					int x = sx;
					int y = sy;
					// change the digit to the directions

				la:	for (int k = 0; k < string1.length(); k++) {
						switch (b[k]) {
						case 'w':
							if (map[x - 1][y] != '#') {
								x = x - 1;
							} else {
								break la;
							}
							break;
						case 's':
							if (map[x + 1][y] != '#') {
								x = x + 1;
							} else {
								break la;
							}
							break;

						case 'd':
							if (map[x][y + 1] != '#') {
								y = y + 1;
							} else {
								break la;
							}
							break;
						case 'a':
							if (map[x][y - 1] != '#') {
								y = y - 1;
							} else {
								break la;
							}
						default:
							break;
						}

						if (x == tx && y == ty) {
							sum++;break;
						}
					}
				}
					}
					}
			System.out.println(sum);
		}
	}

}
