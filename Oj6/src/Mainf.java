import java.awt.List;
import java.beans.Visibility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

import javax.swing.text.AsyncBoxView.ChildLocator;

//static int max=0;
//static int root=0;
//
//static void find(int cur,int sum,boolean[] vis,TreeNode[] node) {
//	vis [cur]=true;
//	if (node[cur].map.size()==1&&sum>max) {
//		max=sum;
//		root=cur;
//	}
//	for (Integer key: node[cur].map.keySet()) {
//		if (!vis[key])
//			find(key, sum+1, vis, node);
//	}
//	
//}
//class Node{
//	private int data;
//	private boolean color;
//	private ArrayList<Node> coNodes=new ArrayList<Node>();
//		public Node() {
//	}		
//	
////	public Node(int data,boolean color,ArrayList<Node> coNodes) {
////		this(data,color,coNodes);
////	}
//	public boolean isColor() {
//		return color;
//	}
//	public int getColor() {
//		return color?1:0;
//	}
//	public void setColor(boolean color) {
//		this.color = color;
//	}
//	
//	public ArrayList<Node> getCoNodes() {
//		return coNodes;
//	}
//
//	public int getData() {
//		return data;
//	}
//
//	public void setData(int data) {
//		this.data = data;
//	}
//
//public void addChild(Node node) {
//	if (node == null)
//		return;
//	this.coNodes.add(node);
//}
//}	
public class Mainf {
	

	private static boolean find(Node root,int n) {
		boolean [] vis=new boolean[n+1];
		if(root==null) {
			return false;
		}
		Queue<Node> queue=new LinkedBlockingQueue<>();
		ArrayList<Node> result=new ArrayList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node first =queue.poll();
			vis[first.getData()]=true;
			result.add(first);
			int sum=0;
			ArrayList<Node> child=first.getCoNodes();
			if (child != null && child.size()>0) {
				for (int i=0;i<child.size();i++) {
					if (!vis[child.get(i).getData()]){
					queue.add(child.get(i));
					sum+=child.get(i).getColor();
					}

				}
				if (sum %2==1) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {

	Scanner in =new Scanner(System.in);
	int T=in.nextInt();
	for(int i=0;i<T;i++) {
		int n=in.nextInt();
		Node[] arrayTree=new Node[10001];
		boolean[] boo=new boolean[n+1];//1 true black;0 false white;  
		for (int j = 0; j < n; j++) {
			if (in.nextInt()==1)
				boo[j+1]=true;
			arrayTree[j+1]=new Node();
			arrayTree[j+1].setColor(boo[j+1]);
			arrayTree[j+1].setData(j+1);
		}
		if (arrayTree[1].isColor()) {
			System.out.println("YES");
			continue;
		}
		HashMap<Integer, Integer> smap=new HashMap<>();		
		for (int j = 0; j < n-1; j++) {
			int a=in.nextInt();
			int b=in.nextInt();
			arrayTree[a].addChild(arrayTree[b]);
			arrayTree[b].addChild(arrayTree[a]);			
		}
	
			
		 {
			if( find(arrayTree[1], n)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
}
}
}