import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Find {
	
	
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for (int i=0;i<a;i++) {
			int b=in.nextInt();
			HashMap<Integer,String> map=new HashMap<>();
			for (int j=0;j<b;j++) {
				String qString=in.next();
				map.put(j, qString.toLowerCase());
			}
			int c=in.nextInt();int n=0;
			for (int m=0;m<c;m++) {
				String s=in.next();
				if (map.containsValue(s.toLowerCase())) {
					System.out.println("Appeared");
					n=1;
					break;
				}
			}
			in.nextLine();
			if (n==0)
				System.out.println("Not appeared");
		}
	}
}
