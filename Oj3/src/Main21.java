import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main21{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
int T=in.nextInt();
	            	for(int i=0;i<T;i++) {
	            		
	            		TreeMap<Integer, Integer> map=new TreeMap<Integer,Integer>();
	            		int n=in.nextInt();
	            		for(int j=0;j<n;j++) {
	            			int a=in.nextInt();
	            			int b=in.nextInt();
	            			if(map.containsKey(b)) {
	            			Integer sInteger=map.get(b);
	            			if (sInteger+a!=0)
	            				map.put(b, sInteger+a);
	            			else
	            			{map.remove(b);
	            			}
	            			}else {
	            				if (a!=0)
	            				map.put(b, a);
	            		}
	            			}
	            		
	                    int m=in.nextInt();
	                    for(int j=0;j<m;j++) {
	                    	int a=in.nextInt();
	                    	int b=in.nextInt();
	    					if (map.containsKey(b)) {   
	    						Integer s = map.get(b);
	    						if(s+a!=0)
	    						map.put(b, s+a);
	    						else {
	    							map.remove(b);
	    						}
	    					}else
	    					{if (a!=0)			   
	    						map.put(b, a);
	    					}
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
	                    
	                 
	                    if (map.containsKey(1)) {
	                    	Integer s=map.get(1);
	                    	if(s==1)
	                    		System.out.print("+x");
	                    	else 
	                    	if(s==-1)
	                    		System.out.print("-x");
	                    	else 
	                    		System.out.printf("%+dx",s);
	                    	map.remove(1);
	                    }
	                    
	                    for (Map.Entry<Integer , Integer > q : map.entrySet()) {
	                    	 if (q.getValue()==1) {
	                        	System.out.print("+x^"+q.getKey());}
	                    	 else
	                    	 if(q.getValue()==-1) {
	                    		System.out.print("-x^"+q.getKey());}
	                    	else
	                    		System.out.printf("%+dx^%d",q.getValue(),q.getKey());
	            		}
	                    System.out.println();
	                    }                      
	                            	} 
	                            	}
