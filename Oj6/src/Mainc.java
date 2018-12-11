import java.util.Scanner;
import java.util.TreeMap;

public class Mainc{
	
	public class TreeNode{
		private int[] heap;
		private int data;
		private TreeNode left ;
		private TreeNode right;
		private int count;
		
//		public void heapify(int[] a,int i,int heapLength) {
//			int l=left(i);
//			int r=right(i);
//			int smallest=-1;
//			if(l<heapLength&& a[i]-(a[l])>0) {
//				smallest=l;
//			}else {
//				smallest=i;
//			}
//		}
//		
//		
//		}
//		
		public TreeNode(int data) {
			this.heap=new int [data];
			count=0;
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
	
		public boolean add(int element) {
			heap[count]=element;
			count++;
			adjust();
			return false;
				
			}
		
		private void adjust() {
			int index=count-1;
			
			while(index!=0) {
				if(index%2==0) {
					int pindex=(index-2)/2;
					if (heap[index]<heap[pindex]) {
						int	temp=heap[index];
						heap[index]=heap[pindex];
						heap[pindex]=temp;
						index=pindex;
					}
					else break;
				}
			
			else {int pindex=(index-1)/2;
			if (heap[index]<heap[pindex]) {
				int	temp=heap[index];
				heap[index]=heap[pindex];
				heap[pindex]=temp;
				index=pindex;
			}
			else break;
			}
			}
		}
		
		
		public int delate() {
			if (heap.length==0) {
				return 0;
			}
			int result=heap[0];
			heap[0]=heap[count-1];
			heap[count-1]=0;
			count--;
			
			downAdjust(0);
			
			return result;
		}
		
		public void downAdjust(int index) {
			int lindex=2*index+1;
			int rindex=2*index+2;
			if(heap[lindex]!=0&&heap[rindex]!=0) {
				if (heap[lindex]<heap[rindex]) {
					if(heap[lindex]<heap[index]) {
					int	temp=heap[index];
					heap[index]=heap[lindex];
					heap[lindex]=temp;
					downAdjust(lindex);
					
					}
					else return;
				}
				else {
					if (heap[rindex]<heap[index]) {
						int	temp=heap[index];
						heap[index]=heap[rindex];
						heap[rindex]=temp;
						downAdjust(rindex);
					}
					else return;
				}
			}
			else if (heap[lindex]!=0&&heap[rindex]==0) {
				
					if(heap[lindex]<heap[index]) {
					int	temp=heap[index];
					heap[index]=heap[lindex];
					heap[lindex]=temp;
					downAdjust(lindex);
					
					}
					else return;
				
			}else 
				return;
			
		}
		public int query() {
			return heap[0];
		}
		
	}

	
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int n=in.nextInt();

			TreeNode heap=new Mainc().new TreeNode(100000);
			for (int j = 0; j < n; j++) {
				heap.add(in.nextInt());
			}
			
			int q=in.nextInt();
			for (int j = 0; j < q; j++) {
				int oper=in.nextInt();
				if (oper==1) {
					heap.add(in.nextInt());
				}else if (oper==2) {
					heap.delate();
				}else {
					System.out.println(heap.query());
					
				}
			}
			System.out.println();
		}
	}
}
