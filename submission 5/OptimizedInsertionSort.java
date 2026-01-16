package sub5;

public class OptimizedInsertionSort {
	
	// Optimized Insertion Sort
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements only when needed
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    // Print the array
    static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 9, 5, 1, 4, 3 };

        System.out.println("Before Sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After Optimized Insertion Sort:");
        printArray(arr);
    }
}
