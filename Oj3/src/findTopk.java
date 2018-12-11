import java.util.PriorityQueue;
import java.util.Scanner;

public class findTopk {

    //找出前k个最大数，采用小顶堆实现
    public static int findKMax(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);//队列默认自然顺序排列，小顶堆，不必重写compare

        for (int num : nums) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (pq.peek() < num) {//如果堆顶元素 < 新数，则删除堆顶，加入新数入堆
                pq.poll();
                pq.offer(num);
            }
        }

//        int[] result = new int[k];
//        for (int i = 0; i < k&&!pq.isEmpty(); i++) {
//            result[i] = pq.poll();
//        }
        return pq.poll();
    }

 public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int n=in.nextInt();
			int[] a=new int[n];
			for(int j=0;j<n;j++) {
				a[j]=in.nextInt();
				if(j % 2==0) {
		        System.out.print(findKMax(a,j/2+1)+" ");
				}
				
			}
System.out.println();
    }
}
}
