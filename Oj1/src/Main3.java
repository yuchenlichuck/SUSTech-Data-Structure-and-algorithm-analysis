import java.util.HashMap;
import java.util.Scanner;
public class Main3{
	public static int maxi(String string) {
		char []str=string.toCharArray();
		int boo=1;
		int sum=0;
		//judge the str if the upper thing and change the thing to the int 0 1 2
		for (int i=0;i<str.length-1;i++) {
			if(str[i]=="a"||str[i]=="e"||str[i]=="i"||str[i]=="o"||str[i]=="u"
					str[i]=="w"||str[i]=="y") {continue;
				
			}else if ((char)str[i]!=upper(str[i+1])) {
			sum++;
			boo *=-1;
					
			}
		}
		
	return sum;	
	}
	public static void main(String args[]) {
		
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for (int i=0;i<a;i++) {
			String  string =in.next();
			char []str;
			str=string.toCharArray();
			int len=str.length;
			
			
			HashMap<Integer, String> map =new HashMap<>();
			
		
		}
	}
}
