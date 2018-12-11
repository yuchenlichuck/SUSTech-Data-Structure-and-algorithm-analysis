import java.util.HashMap;
import java.util.Scanner;

public class Main33 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
    		int a=in.nextInt();
    		if (a==0)break;
    		String string=in.next();
    		char[] ss=string.toCharArray();
    		HashMap<Character, Integer> map=new HashMap<>();
    		ConcurrentHashMap<Character, Integer> map1=new ConcurrentHashMap<>();
    		int e=0;
    		for (char s:ss) {
    			if (map.containsKey(s)) {
    				map.remove(s);a++;
    			}
    			else {
    					
    			
    			
    				if (a==0)
    				{
    				if (map1.containsKey(s))	
    					{e++;
    					map1.remove(s);
    					}
    				else {
    					map1.put(s, 1);
    				}
    				}
    				else {
    						if(map1.isEmpty())
    						{map.put(s, 1);
    						
    						a--;
    						}
    						else {
    							if (map1.containsKey(s)) {
    		        				map1.remove(s);
    		        				}
    							for(char key:map1.keySet())
    		        {
    			        map.put(key, 1);
    			        map1.remove(key);
    			        a--;
    					if (a==0)break;
    		        }
    						
    						}
    						}
    						}
    			}
    			System.out.println(e);
    		}
    		
	}
}
