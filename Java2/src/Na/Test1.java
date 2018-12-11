package Na;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
public class Test1 {

	
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);

String string=in.nextLine();
String s=in.nextLine();
char[] ss=s.toCharArray();
char[] a=string.toCharArray();
int i=0;
HashMap<Character, Integer> map=new HashMap<>();
for(char q:a ) {
	if (map.containsKey(q))
	{map.put(q, map.get(q)+1);
	}else
		map.put(q, 1);
}


System.out.println(map.get(ss[0]));


	}
}
	
