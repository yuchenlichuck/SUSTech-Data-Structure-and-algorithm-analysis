import java.util.HashMap;
import java.util.Scanner;

public class Maind{
	
	public class TreeNode{
		
		private	HashMap<Integer,Integer> map=new HashMap<>();
		public TreeNode() {


		}		
		public HashMap<Integer, Integer> getMap() {
			return map;
		}

		public void setMap(HashMap<Integer, Integer> map) {
			this.map = map;
		}
		public void pushMap(int a,int b) {
			map.put(a, b);
		}
	}
	static int max=0;
	static int root=0;
	
	static void find(int cur,int sum,boolean[] vis,TreeNode[] node) {
		vis [cur]=true;
		if (node[cur].map.size()==1&&sum>max) {
			max=sum;
			root=cur;
		}
		for (Integer key: node[cur].map.keySet()) {
			if (!vis[key])
				find(key, sum+1, vis, node);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int n=in.nextInt();
			TreeNode[] arrayTree=new TreeNode[100000];
			HashMap<Integer, Integer> smap=new HashMap<>();
			

			for (int j = 0; j < n-1; j++) {
				int a=in.nextInt();
				int b=in.nextInt();
				if (!smap.containsKey(a))
					arrayTree[a]=new Maind().new TreeNode();
				if (!smap.containsKey(b))
					arrayTree[b]=new Maind().new TreeNode();
				arrayTree[a].pushMap(b, a);
				arrayTree[b].pushMap(a, b);
				smap.put(a, 1);
				smap.put(b, 1);
			}
			int cur=1;
			int sum=0;


					
			boolean[] vis=new boolean[100000];
			find(cur, sum, vis, arrayTree);

			vis=new boolean[100000];
			cur=root;
			find(cur, sum, vis, arrayTree);

			System.out.println(max);
			max=0;
			root=1;
			

		}
	}
}
