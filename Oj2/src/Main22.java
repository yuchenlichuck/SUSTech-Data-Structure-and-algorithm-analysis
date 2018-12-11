import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main22{		

	    public static void main(String[] args)
	    {
	    	Scanner in=new Scanner(System.in);
			int a=in.nextInt();

			for (int i=0;i<a;i++) {

				int b=in.nextInt();
				int c=in.nextInt();

				int[] ar=new int[b];
				Map<Integer, Integer>map = new TreeMap<Integer, Integer>();
				for (int j=0;j<b;j++)  {
					int d=in.nextInt();
					if (map.containsKey(d)) {   
						Integer s = map.get(d);
						map.put(d, s+1);
					}else{			   
						map.put(d, 1);
					}
				}
				int sum=0;
				for (Integer e:map.keySet()) {
					if  (e>=c/2)break;
					if (map.containsKey(c-e))
						sum+=map.get(c-e);
				}
				if (c %2 ==1 && map.containsKey(c/2) && map.containsKey(c/2+1))sum+=map.get(c/2+1);
				if (c %2 ==0 && map.containsKey(c/2))sum+=map.get(c/2)*(map.get(c/2)-1)/2;

				System.out.println(sum);
			}
		}
	}
