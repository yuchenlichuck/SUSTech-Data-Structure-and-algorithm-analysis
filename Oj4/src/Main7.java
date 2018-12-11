import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;


public class Main7{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();

		for(int i=0;i<T;i++) {
			int n=in.nextInt();			
			Stack<Integer> stack=new Stack<>();
			Stack<Integer> stackmax=new Stack<>();
			Stack<Integer> stackmin=new Stack<>();
			
			
			
			PriorityQueue<Integer> p=new PriorityQueue<>();
			TreeMap<Integer, Integer>map=new TreeMap<>();
			
			
			for (int j=0;j<n;j++){
				String string=in.next();
				if (string.equals("pop")) {
					if (stack.isEmpty()) {
						System.out.println(0);
						continue;
					}
					stack.pop();
					stackmax.pop();
					stackmin.pop();
					if(stack.isEmpty())
					{
						System.out.println(0);
						continue;
					}
					System.out.println(stackmax.peek()-stackmin.peek());
				}else {
					
				int cur=in.nextInt();
					if (stack.isEmpty()) {
						stackmin.push(cur);
						stackmax.push(cur);
					}else {
					if (cur>stackmax.peek())
					stackmax.push(cur);
					else
						stackmax.push(stackmax.peek());
					if (cur<stackmin.peek())
					stackmin.push(cur);
					else 
						stackmin.push(stackmin.peek());
					}
					stack.push(cur);
					
				
				}
				
			}
				

		
	}
	
	}
}
