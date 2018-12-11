import java.util.PriorityQueue;

public class Main11  {
	public static int[] topKLargest(int[] input, int k) {
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		for (int i : input) {
			minheap.add(i);
		}
		int[] out = new int[k];
		for (int i = 0; i < out.length; i++) {
			out[i] = minheap.poll();
		}
		return out;
	}

	public static int[] topKSmallest(int[] input, int k) {
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) {
					return -1;
				} else if (o1 > o2) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		for (int i : input) {
			minheap.add(i);
		}
		int[] out = new int[k];
		for (int i = 0; i < out.length; i++) {
			out[i] = minheap.poll();
		}
		return out;
	}

	public static void main(String[] args) {
		int[] out = topKLargest(new int[] { 10, 23, 5, 1, 7, 8, 4, 5, 7, 12, 523 }, 3);
		System.out.print("Largest: ");
		for (int o : out) {
			System.out.print(o + " ");
		}
		out = topKSmallest(new int[] { 10, 23, 5, 1, 7, 8, 4, 5, 7, 12, 523 }, 3);
		System.out.println();
		System.out.print("Largest: ");
		for (int o : out) {
			System.out.print(o + " ");
		}

	}
}