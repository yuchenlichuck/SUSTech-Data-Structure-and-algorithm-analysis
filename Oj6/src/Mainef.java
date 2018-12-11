import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;


public class Mainef{
	
	

	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int m=in.nextInt();
			int n=in.nextInt();
	        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();  
	        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();  
			int sum=0;	
			int max=0;
			int order=0;
			for (int j = 0; j < n; j++) {
				int q=in.nextInt();
				if (map1.containsKey(q) ){
					int data=map1.get(q);
					map.remove(data);
					map.put(data+100000	, 	q);//排序，数字
					map1.put(q, data+100000);
				}			
			
			else {
				if(sum<m) {
					sum++;
					map.put(--order, q);
					map1.put(q, order);
				}
				else {
					
					int value=map.lastKey();
					int key=map.get(value);
					max++;
					map.remove(value);
					map1.remove(key);
					map.put(--order, q);
					map1.put(q, order);
				}
			}
				}

			System.out.println(max);
			
			}
		
	
	
	}

}

