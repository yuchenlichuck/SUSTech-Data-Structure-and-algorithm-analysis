
import java.util.Scanner;

public class Main72{
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
	public void insert(int ob) {
		Node node = new Node(ob);
		Node head=null;
		Node cur=first;
		while(cur!=null &&  node.data>cur.data) {
			head =cur;
			cur=cur.next;
		}
				
				if(head==null)
					first = node;
				else
					head.next=node;
				node.next=cur;				
	}
	
	
    public static void main(String[] args) {
    	
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();

		for(int i=0;i<T;i++) {
			Main72 main72=new Main72();
			int n=in.nextInt();
			for(int j=0;j<n;j++) {
				int q=in.nextInt();
				main72.insert(q);
				if(j % 2==0) {
					System.out.print(main72.get(j/2)+" ");
				}
				
			}
			
			
		}
    
    	
    	
}
    }