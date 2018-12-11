import java.util.Arrays;

public class SortExample {
	public static void main(String[] art) {
		int[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };
		quickSort(arr, 0, 9);
		System.out.print(Arrays.toString(arr));
	}

	// find the right position for pivot , and place the pivot there
	static int placePivot(int[] arr, int first, int last) {
		int pivot;
		int tmp;
		int up = first + 1;
		int down = last;
		pivot = arr[first];
		while (down > up) {
			while ((arr[up] <= pivot) && (up < down)) {
				up++;
			}
			while ((arr[down] > pivot) && (up < down)) {
				down--;
			}
			if (up < down) {
				// Exchange values
				tmp = arr[up];
				arr[up] = arr[down];
				arr[down] = tmp;
				System.out.println("3" + Arrays.toString(arr));
			}
		}
		// up has stopped at a value > pivot
		if (pivot < arr[up]) {
			up--;
		}
		arr[first] = arr[up];
		arr[up] = pivot;
		System.out.println("1" + Arrays.toString(arr));
		return up;
	}

	static void quickSort(int[] arr, int first, int last) {
		int pivotPos;
		int tmp;
		if (last > first) {
			switch (last - first) {
			case 1:
				if (arr[last] < arr[first]) {
					tmp = arr[last];
					arr[last] = arr[first];
					arr[first] = tmp;
					System.out.println("2" + Arrays.toString(arr));
				}
				break;
			default:
				pivotPos = placePivot(arr, first, last);
				quickSort(arr, first, pivotPos - 1);
				quickSort(arr, pivotPos + 1, last);
				break;
			}
		}
	}
}
