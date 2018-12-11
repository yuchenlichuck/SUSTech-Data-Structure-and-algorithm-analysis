import java.util.LinkedList;
import java.util.Scanner;

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

public class Main1 {
	public static boolean IsComplete(TreeNode root) {
		if (root==null)return true;
		LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		boolean leaf=false;
		while (queue.size()>0) {
			TreeNode node=queue.poll();
			if(leaf&&(node.getLeft()!=null || node.getRight()!=null)) {
				return false;
			}
			if(node.getLeft()==null&&node.getRight()!=null)
				return false;
			if (node.getLeft()!=null) {
				queue.add(node.getLeft());
			}
			if (node.getRight()!=null) {
				queue.add(node.getRight());
			}
			else {
				leaf=true;			
			}
		}
		
		
		return true;
	}
	
	
	public static void main (String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) 
		{
			int n=in.nextInt();
			boolean ar=false;
			TreeNode[] arrayTree=new TreeNode[n+1];
			for (int j = 0; j < n; j++) {
				int x=in.nextInt();
				int y=in.nextInt();
				if (x==0&&y!=0) {
//					ar=true;
				continue;	
				}
				if(arrayTree[j+1]==null) {
					arrayTree[j+1]=new TreeNode(j+1);
				}
				if(arrayTree[x]==null &&x!=0) {
					arrayTree[x]=new TreeNode(x);
				}
				if(arrayTree[y]==null &&y!=0){
					arrayTree[y]=new TreeNode(y);
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
			if (ar)
			{
				System.out.print("No");
				continue;	
			}
			int root=0;
			for (int j = 0; j < n; j++) {
				if (arrayTree[j+1].getFa()==-1)
				{
					root=j+1;
					break;
			}
			}
			ar=IsComplete(arrayTree[root]);
			if (ar)
				System.out.println("Yes");
			else {
				System.out.println("No");
			}
	}
	}
}
