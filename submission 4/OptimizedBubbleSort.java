package sub4;

public class OptimizedBubbleSort {
	 static void optimizedBubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;

	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;

	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // If no swaps occurred, array is already sorted
	            if (!swapped)
	                break;
	        }
	    }
	 	
	 	static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] arr = {11, 42, 83, 24, 65};

	        optimizedBubbleSort(arr);
	        printArray(arr);
	    }
}
