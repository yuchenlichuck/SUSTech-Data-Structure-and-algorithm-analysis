import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class Main74{
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
	if (c>a&&c>b)
		return 1;
	else if (c<a&&c<b)
		return -1;
	else return 0;
	}
	
    public static void main(String[] args) {
    	
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();

		for(int i=0;i<T;i++) {
			Queue<Integer>min=new PriorityQueue<>();			
			Comparator<Integer>comparator;
			comparator=new Comparator<Integer>() {
				public int compare(Integer e1,Integer e2) {
					return e2-e1;
				}
			};
			Queue<Integer>max =new PriorityQueue<>(comparator);
			int n=in.nextInt();
			int b=0;
			int a=in.nextInt();
			int mid=a;
			System.out.print(mid+" ");
			max.add(mid);
			
		for(int j=1;j<=n/2;j++) {
    			a=in.nextInt();
    			b=in.nextInt();
    			int x=0;
    			if (mid>a) {max.add(a);
    			
    			}    			
    			else {min.add(a);
    		
    			}
    			if (mid>b) {
    				max.add(b);
    			}
    			else {
    				min.add(b);
    			
    			}
    			if(min.size()-max.size()>1) {
    				max.add(min.poll());
    			}else if (min.size()-max.size()<-1)
    			{

    				min.add(max.poll());
    			}
    			if (min.size()>max.size())
    			{
    				mid=min.peek();System.out.print(mid+" ");
    			}else {
    				mid=max.peek();
    				System.out.print(mid+" ");
    			}
    	
    			}		
		System.out.println();
			}
			
			
			
			
			
			
			}
			

    
    	
    	

    }