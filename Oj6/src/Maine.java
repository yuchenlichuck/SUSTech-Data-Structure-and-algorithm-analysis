import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Maine{
	
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

	class ValueComparator implements Comparator<Integer>{
		Map <Integer,Integer>base;
		public ValueComparator (Map<Integer,Integer>base) {
			this.base=base;
		}
		
		public int compare(Integer a,Integer b) {
			
			if(base.get(a)>=base.get(b)) {
				return -1;
			}
//			else if(base.get(a)==base.get(b)) {
//				return 0;
//			}	
			else {
				return 1;
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int m=in.nextInt();
			int n=in.nextInt();
			Stack stack=new Stack<Integer>();
			Stack MaxStack=new Stack<Integer>();
			LinkedHashMap<Integer, Integer> map=new LinkedHashMap<>();
			
			int sum=0;
			
			int[] a=new int[n+1];
			
			max=0;
			ArrayList<Entry<Integer,Integer>> list=new ArrayList<Entry<Integer, Integer>>(map.entrySet());
			for (int j = 0; j < n; j++) {
				int q=in.nextInt();
				a[j+1]=q;
			if (map.containsKey(q) ){
				map.put(q, map.get(q)+1);
				if(max<map.get(q)+1) {
					stack.push(max);
					
					}
				
			else {
				if(sum<=m) {
					m++;
					map.put(q, 1);
				if (max==0) {
					stack.push(max);
				}
				}
				else {
					
					
					
				}
			}
				}

			
			}
			System.out.println(max);
			max=0;
			root=1;
			

		}
	}
}
