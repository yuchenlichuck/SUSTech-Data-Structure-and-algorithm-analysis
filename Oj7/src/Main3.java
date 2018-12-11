import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.Highlighter.Highlight;

import javafx.scene.Node;
//class TreeNode{
//	private int data;
//	private int fa=-1;
//	private TreeNode left ;
//	private TreeNode right;
//	public TreeNode(int data) {
//		this.data=data;
//	}
//
//	public int getFa() {
//		return fa;
//	}
//
//	public void setFa(int fa) {
//		this.fa = fa;
//	}
//
//	public TreeNode(int data,TreeNode left,TreeNode right)
//	{
//		this.data=data;
//		this.left=left;
//		this.right=right;
//	}
//	public int getData() {
//		return data;		
//}
//	public void setData(int data) {
//		this.data=data;
//	}
//
//	public TreeNode getLeft() {
//		return left;
//	}
//
//	public void setLeft(TreeNode left) {
//		this.left = left;
//	}
//
//	public TreeNode getRight() {
//		return right;
//	}
//
//	public void setRight(TreeNode right) {
//		this.right = right;
//	}
//
//
//}

public class Main3 {
	
	public static boolean ChinaNumberOne(TreeNode root) {
	
		
		
		
		
		
		return true;
	}
	
	static int last=-100;
//	public static boolean IT(TreeNode root) {
//		if (root==null)return true;
//		if (!IT(root.getLeft())) {
//			return false;
//		}
//		if (root.getData()<=last)
//		{
//			return false;
//		}
//		last=root.getData();
//		if(!IT(root.getRight())) {
//			return false;
//		}
//		return true;
//	}
	public static boolean avl(TreeNode root,int hight) {
		if (root==null) {
			hight=0;
			return true;
		}
	
		int left=hight+1;
		if (avl(root.getLeft(), left)==false)
			return false;
		int right=hight+1;
		if (avl(root.getRight(), right)==false)
			return false;
		hight =right > left?right:left;
		return Math.abs(right-left)<2;
		
		
	}
	public static boolean isBalance(TreeNode node) {
		if(node==null)
			return true;
		return Math.abs(high(node.getLeft())-high(node.getRight()))<2 && isBalance(node.getLeft())&&isBalance(node.getRight());
	}
	public static int high(TreeNode node) {
		if (node==null)
			return 0;
		int right = high(node.getRight())+1;
		int left= high(node.getLeft())+1;
		return right > left?right:left;
	}
	
	public static boolean noDIGui(TreeNode root) {
		if (root==null) {
			return true;
		}
		Stack<TreeNode> stack=new Stack<>();
		Stack<Integer> dat=new Stack<>();
		TreeNode pNode=root;
		TreeNode pre=null;
		int data=0;
		dat.push(0);
		while(pNode!=null || !stack.isEmpty())
		{
			while(pNode!=null)
			{
				stack.push(pNode);
				dat.push(dat.peek()+1);
				pNode=pNode.getLeft();
			}
			TreeNode treeNode=stack.pop();
			int da=dat.pop();
			if(pre!=null&&(treeNode.getData()<=pre.getData()/*||Math.abs(da-data)>1*/)) {
				return false;
			}
			pre=treeNode;
			data=da;
			pNode=treeNode.getRight();
			
		}
		return true;
	}
	
	
	public static void main (String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) 
		{
			int n=in.nextInt();
			int a[]=new int[n+1];
			for (int j = 0; j <n; j++) {
				a[j+1]=in.nextInt();
			}
			boolean ar=true;
			TreeNode[] arrayTree=new TreeNode[n+1];
			HashMap<Integer, Integer> smap=new HashMap<>();
			
			for (int j = 0; j < n; j++) {
				int x=in.nextInt();
				int y=in.nextInt();
				if(arrayTree[j+1]==null) {
					arrayTree[j+1]=new TreeNode(a[j+1]);
				}
				if(arrayTree[x]==null &&x!=0) {
					arrayTree[x]=new TreeNode(a[x]);
				}
				if(arrayTree[y]==null &&y!=0){
					arrayTree[y]=new TreeNode(a[y]);
				}
				if(arrayTree[x]!=null) {
					arrayTree[j+1].setLeft(arrayTree[x]);
					arrayTree[x].setFa(j+1);
				}
				if(arrayTree[y]!=null) {
					arrayTree[j+1].setRight(arrayTree[y]);
					arrayTree[y].setFa(j+1);
				}				
			}
			
			int sq=0;
			for (int j = 0; j < n; j++) {
				if (arrayTree[j+1].getFa()==-1)
					{sq=j+1;
					break;
				}
			}
			ar=noDIGui(arrayTree[sq]);
			boolean av=isBalance(arrayTree[sq]);
			if (ar && av) {
				System.out.println("Yes");}
			else {
				System.out.println("No");
			}
			last=-100;
	}
	}
}