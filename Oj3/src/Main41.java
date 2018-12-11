import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main41{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
int T=in.nextInt();
	            	for(int i=0;i<T;i++) {
	            		
	            		TreeMap<Integer, Integer> map=new TreeMap<Integer,Integer>();
	            		int n=in.nextInt();
            		for(int j=0;j<n;j++) {
	            			int a=in.nextInt();
	            			int b=in.nextInt();
	            			if(map.containsKey(b-1)) {
	            			Integer sInteger=map.get(b-1);
	            			if (sInteger+a!=0)
	            				map.put(b-1, sInteger+a*b);
	            			else
	            			{map.remove(b-1);
	            			}
	            			}else {
	            				if (a!=0)
	            				map.put(b-1, a*b);
	            		}
	            			}
	            		
	            		if (map.containsKey(-1)) {
	            			map.remove(-1);
	            		}

	                    if (map.isEmpty()) {
	                    	System.out.println(0);continue;
	                    }
	                    for (Map.Entry<Integer , Integer > p : map.entrySet()) {
	                    if(p.getKey()==0)
	                    	System.out.print(p.getValue());
	                    else if(p.getKey()==1) {
	                    	if(p.getValue()==1)
	                    		System.out.print("x");
	                    	else if (p.getValue()==-1)
	                    		System.out.print("-x");
	                    	else 
	                    		System.out.print(p.getValue()+"x");}
	                    else {if (p.getValue()==1) {
	                    	System.out.print("x^"+p.getKey());
	                    	}
	                    else if (p.getValue()==-1) {
	                    	System.out.print("-x^"+p.getKey());
	                    }else
	                    	System.out.printf("%dx^%d",p.getValue(),p.getKey());
	                    }
	                    map.remove(p.getKey());
	                    break;
	                    }
	                    
          for (Map.Entry<Integer , Integer > q : map.entrySet()) {
              if(q.getKey()==0)
              	System.out.printf("%+d",q.getValue());
              else	if(q.getKey()==1) {
	                    		int s=q.getValue();
	                    	if(s==1)
                    		System.out.print("+x");
                    	else 
                    	if(s==-1)
                    		System.out.print("-x");
                    	else 
                    		System.out.printf("%+dx",s);
	                    	}
              else {
	                    	 if (q.getValue()==1) {
	                        	System.out.print("+x^"+q.getKey());}
	                    	 else
	                    	 if(q.getValue()==-1) {
	                    		System.out.print("-x^"+q.getKey());}
	                    	else
	                    		System.out.printf("%+dx^%d",q.getValue(),q.getKey());
	            		}
	                    	}
	                    System.out.println();
	                    }                      
	                            	} 
	                            	}
