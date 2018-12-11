import java.util.Scanner;
import java.util.TreeMap;

public class Mainb{
	
	public class TreeNode{
		
		private int data;
		private TreeNode left ;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data=data;
		}
		
		public TreeNode(int data,TreeNode left,TreeNode right)
		{
			this.data=data;
			this.left=left;
			this.right=right;
		}
		
		public int getData() {
			return data;		
	}
		public void setData(int data) {
			this.data=data;
		}

		public TreeNode getLeft() {
			return left;
		}

		public void setLeft(TreeNode left) {
			this.left = left;
		}

		public TreeNode getRight() {
			return right;
		}

		public void setRight(TreeNode right) {
			this.right = right;
		}
	
	
	}
	public static void printNode(TreeNode node) {
		System.out.print(node.getData()+" ");
	}
	
	public static void FT(TreeNode root) {
		printNode(root);
		if (root.getLeft()!=null) {
			FT(root.getLeft());
		}
		if(root.getRight()!=null) {
			FT(root.getRight());
		}
	}
	
	public static void IT(TreeNode root) {

		if (root.getLeft()!=null) {
			IT(root.getLeft());
		}
		printNode(root);
		if(root.getRight()!=null) {
			IT(root.getRight());
		}
	}
	
	public static void PT(TreeNode root) {

		if (root.getLeft()!=null) {
			PT(root.getLeft());
		}
	
		if(root.getRight()!=null) {
			PT(root.getRight());
		}
		printNode(root);
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int n=in.nextInt();
			int[] a=new int[n+1];
			TreeNode[] arrayTree=new TreeNode[n+1];
			for (int j = 0; j <n-1; j++) {
				int x=in.nextInt();
				int y=in.nextInt();
				a[y]++;
				if(arrayTree[x]==null) {
				arrayTree[x]=new Mainb().new TreeNode(x);
				if (arrayTree[y]==null) arrayTree[y]=new Mainb().new TreeNode(y); 
				arrayTree[x].setData(x);
				arrayTree[x].setLeft(arrayTree[y]);
				}
				else 
				if(arrayTree[x].getLeft()==null){
					if (arrayTree[y]==null) arrayTree[y]=new Mainb().new TreeNode(y); 
					arrayTree[x].setLeft(arrayTree[y]);
				}else
				{
					if (arrayTree[y]==null) arrayTree[y]=new Mainb().new TreeNode(y); 
					arrayTree[x].setRight(arrayTree[y]);
				}
			}
			int sss=0;
			for(int j=1;j<=n;j++) {
				if(a[j]==0) {	
				sss=j;
				break;}
			}
			FT(arrayTree[sss]);
			System.out.println();
			IT(arrayTree[sss]);
			System.out.println();
			PT(arrayTree[sss]);
			System.out.println();
		}
	}
}
