import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
//class TreeNode{
//	private int data;
////	private int fa=-1;
//	private TreeNode left ;
//	private TreeNode right;
//	public TreeNode(int data) {
//		this.data=data;
//	}
//
////	public int getFa() {
////		return fa;
////	}
////
////	public void setFa(int fa) {
////		this.fa = fa;
////	}
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

public class Main2 {
	static int last=-100;
	public static boolean IT(TreeNode root) {
		if (root==null)return true;
		if (!IT(root.getLeft())) {
			return false;
		}
		if (root.getData()<=last)
		{
			return false;
		}
		last=root.getData();
		if(!IT(root.getRight())) {
			return false;
		}
		return true;
	}
	public static boolean noDIGui(TreeNode root) {
		if (root==null) {
			return true;
		}
		Stack<TreeNode> stack=new Stack<>();
		TreeNode pNode=root;
		TreeNode pre=null;
		while(pNode!=null || !stack.isEmpty())
		{
			while(pNode!=null)
			{
				stack.push(pNode);
				pNode=pNode.getLeft();
			}
			TreeNode treeNode=stack.pop();
			if(pre!=null&&treeNode.getData()<=pre.getData()) {
				return false;
			}
			pre=treeNode;
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
			int[] b=new int[n+1];
			boolean ar=false;
			TreeNode[] arrayTree=new TreeNode[n+1];
			HashMap<Integer, Integer> smap=new HashMap<>();
			for (int j = 0; j < n-1; j++) {
				int x=in.nextInt();
				int y=in.nextInt();
				if (!smap.containsKey(x))
					arrayTree[x]=new TreeNode(a[x]);
				if (!smap.containsKey(y))
					arrayTree[y]=new TreeNode(a[y]);
				smap.put(x, 1);
			 	smap.put(y, 1);
			 	b[y]++;
				if(a[x]<a[y]) {
					if (arrayTree[x].getRight()==null) {
						arrayTree[x].setRight(arrayTree[y]);
				}
					else ar=true;
				}
				if(a[x]>a[y]) {
					if (arrayTree[x].getLeft()==null) {
						arrayTree[x].setLeft(arrayTree[y]);
				}
					else ar=true;
				}
			}
			if (ar)
			{
				System.out.printf("Case #%d: NO\n", i+1);
				continue;
			}
			int sq=0;
			for (int j = 0; j < n; j++) {
				if (b[j+1]==0)
					{sq=j+1;
				break;}
			}
			ar=noDIGui(arrayTree[sq]);
			if (ar) {
				System.out.printf("Case #%d: YES\n", i+1);}
			else {
				System.out.printf("Case #%d: NO\n", i+1);
			}
			last=-100;
	}
	}
}
