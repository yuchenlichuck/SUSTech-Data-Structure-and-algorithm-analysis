import java.util.Scanner;

public class Main5 {
	public class TreeNode{
		private int[] heap;

		private int count;
		public TreeNode(int data) {
			this.heap=new int [data];
			count=0;
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

		public int peer() {
			if (heap.length==0) {
				return 0;
			}
			return heap[0];
		}
		public boolean isEmtry() {
			
			
			return true;
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
	}

	public static void main(String[] args)
	{
	
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for (int i = 0; i < T; i++) {
			
		int n=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[n];
		int max=0;
		int min=99999999;
		TreeNode heap=new Main5().new TreeNode(220000);
		for (int j = 0; j < k; j++) {
			heap.add(in.nextInt());
		}
		int sum=0;
		for (int j=k;j<n;j++) {
			int f=in.nextInt();
			if (heap.peer()<f) {
				a[sum++]=heap.delate();
				heap.add(f);
			}
			else {
				a[sum++]=f;
			}
		}
		while(heap.peer()!=0) {
			a[sum++]=heap.delate();
		}
		for (int j = 0; j < n-1; j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println(a[n-1]);
	}
	}
}
