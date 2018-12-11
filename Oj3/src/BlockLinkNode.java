
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main73{
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
	if (c>=a&&c>=b)
		return 1;
	else if (c<a&&c<b)
		return -1;
	else return 0;
	}
	
    public static void main(String[] args) {
    	
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();

		for(int i=0;i<T;i++) {
			Main73 main72=new Main73();
			TreeMap<Integer, Integer> map=new TreeMap<Integer,Integer>();
			int n=in.nextInt();
			if (n % 2==0) 	
				n--;
			
			int [] a=new int[n];
			int [] a1=new int[n];
			for(int j=0;j<n;j++) {
				int q=in.nextInt();
				a[j]=q;
				a1[j]=q;}
			if (n % 2==0) {
			int s=in.nextInt();}
			Arrays.sort(a);
			int w=n/2;
			int mid=a[w];
			System.out.print(a[w]+" ");
			for (int j=n;j>=2;j-=2) {
				map.put(a1[j] ,1);
				map.put(a1[j-1],1);
				int d=swap(a1[j], a1[j-1], mid);
				w+=d;
				while(true) {
				if (b[w]) {
				System.out.print(a[w]+" ");
				break;
				};
				w+=d;
				}
				
			}
			
			
			
			
			
			
			}
			
			
		}
    
    	
    	
}
    }