
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main75{
	class Node{
		public int data;
		public Node next=null;
		public Node (int data) {
			this.data=data;
		}
		
	}
	private Node first=null;
	public int get(int i) {
		Node temp=first;
		int counter =0;
		while (temp!=null) {
			if (counter ==i) {
				return temp.data;
			}
			temp=temp.next;
			counter++;
		}
		return 0;
	}
	public void add(int ob) {
		Node temp=first;
		Node node = new Node(ob);
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}
	
	public void insert(int ob) {
		Node node = new Node(ob);
		Node head=null;
		Node cur=first;
		while(cur!=null   /*node.data>cur.data*/) {
			head =cur;
			cur=cur.next;
		}
				
				if(head==null)
					first = node;
				else
					head.next=node;
				node.next=cur;				
	}
	public void delete(int ob) {
		
	}
	
	public static int swap(int a,int b,int c) {
	if ((c>a&&c>b) || (c==b&&a<b)||(c==a&&c<b))
		return 1;
	else if ((c<=a&&c<=b) || (c==b&&a>b)||(c==a&&c>b))
		return -1;
	else return 0;
	}
	
    public static void main(String[] args) {
    	
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();


		for(int i=0;i<T;i++) {
			TreeMap<Integer, Integer> map=new TreeMap<Integer,Integer>();
			TreeMap<Integer, Integer> map1=new TreeMap<Integer,Integer>();
			int n=in.nextInt();
			int [] a=new int[n];
			int [] a1=new int[n];
			for(int j=0;j<n;j++) {
				int q=in.nextInt();
				a[j]=q;
				a1[j]=q;
				if(map.containsKey(q)) {
        			Integer sInteger=map.get(q);
        				map.put(q, sInteger+1);		
        			}else {
        				map.put(q, 1);
        		}
				}
			Arrays.sort(a);
			int w=n/2;
			int mid=a[w];
			String string=mid+" ";
			for (int j=n-1;j>=4;j-=2) {
				mid=a[w];
				int e=a1[j];
				int f=a1[j-1];
				if(map1.containsKey(e)) {
        			Integer sInteger=map1.get(e);
        				map1.put(e, sInteger+1);		
        			}else {
        				map1.put(e, 1);
        		}
			if(map1.containsKey(f)) {
        			Integer sInteger=map1.get(f);
    				map1.put(f, sInteger+1);		
    			}else {
        				map1.put(f, 1);

    		}
				int d=swap(e, f, mid);
				w+=d;
				if (d==0) {
					string=mid+" "+string;
				continue;}
				while(true) {
				mid=a[w];
				if (map1.containsKey(mid) && (map1.get(mid) >= map.get(mid))) {
				w+=d;
				}else {
					string = mid +" "+string;break;
				}
				
			}
			
			}
			string=a1[0]+" "+string;
			System.out.println(string);
		}
    
    	
    	
}
    }