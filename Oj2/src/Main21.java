import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Main21{

	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
		int a=in.nextInt();
		int b=in.nextInt();
		boolean boo=true;
	    for (int j=0;j<a;j++) {
	    	if (in.nextInt()==b) {
	    		boo=false;
	    	}
	    }
	    if (boo) {
	    	System.out.println("NO");
	    }else System.out.println("YES");
	}

}
}