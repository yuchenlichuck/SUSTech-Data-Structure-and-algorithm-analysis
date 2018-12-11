import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Maine3{

	

	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int m=in.nextInt();
			int n=in.nextInt();
	       	int sum=0;
			TreeSet<Person> set =new TreeSet<Person>();
			HashMap<Integer, Integer> map=new HashMap<>();
			boolean boo=true;
			int max=0;
			for (int j = 0; j < n; j++) {
				int q=in.nextInt();
				
			if (map.containsKey(q) ){
				Person person=new Person(, , data)
				map.put(q, map.get(q)+1);
				
			}			
			
			else {
				if(sum<m) {
					sum++;
					map.put(q, 1);
				}
				else {
					if (boo)
					{
						smap.putAll(map);
						boo=false;
					}
					smap.putAll(map);
					int key=smap.firstKey();
					map.remove(key);
					max++;
					
					smap.put(key, -1);
					map.put(q, 1);
					smap.put(q, 1);
				}
			}
				}

			System.out.println(max);
			
			}
		
	
	
	}

}

