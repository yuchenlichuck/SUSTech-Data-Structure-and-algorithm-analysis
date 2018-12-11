import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main7 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int n=in.nextInt();
			ArrayList list=new ArrayList<Integer>();
			
			//Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
			int[] a=new int[n];
			for(int j=0;j<n;j++) {
				int q=in.nextInt();
				list.add(q);
				if(j % 2==0) {
				Collections.sort(list);
				System.out.print(list.get(j /2)+" ");
				}
				
			}
			
			
		}
		
		
	}
}
