import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String mainString=in.next();
		String bag=in.next();
		String expected = "";
		char[] bagc;
		char[] str;
		str=mainString.toCharArray();
		bagc=bag.toCharArray();
		Arrays.sort(bagc);
		int j=bagc.length-1;
		for(int i=0;i<str.length;i++)
			if (str[i]<bagc[j]) {
				str[i]=bagc[j];
				j--;
			if (j<0)break;
			}
		for (char a:str)
		System.out.print(a);
	}
	
	
	
}