import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
class ValueComparator implements Comparator<Integer>{
	Map <Integer,Integer>base;
	public ValueComparator (Map<Integer,Integer>base) {
		this.base=base;
	}
	
	public int compare(Integer a,Integer b) {
		
		if(base.get(a)>base.get(b)) {
			return -1;
		}
		else if(base.get(a)==base.get(b)) {
			return 0;
		}	
		else {
			return 1;
		}
		
		
	}
	
	
}

public class Maine1{
	
	

	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int m=in.nextInt();
			int n=in.nextInt();
	        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();  
	        ValueComparator bvc =  new ValueComparator(map);  
	        TreeMap<Integer,Integer> smap = new TreeMap<Integer,Integer>(bvc);  
			int sum=0;
			
			
			int[] a=new int[n+1];
			boolean boo=true;
			int max=0;
			for (int j = 0; j < n; j++) {
				int q=in.nextInt();
				a[j+1]=q;
			if (map.containsKey(q) ){
				map.put(q, 	map.get(q)+1);
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
			//		smap.put(key, -1);
					//smap.remove(key);
					map.put(q, 1);
					smap.clear();
				}
			}
				}

			System.out.println(max);
			
			}
		
	
	
	}

}

