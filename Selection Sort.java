public class SelectionSort {
    static int stepCount = 0;
    static void selectionSort(int[] arr) {
        stepCount = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                stepCount++;   
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                stepCount++;   
            }
        }
    }
     static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {35, 12, 48, 7, 22};
        selectionSort(arr);
        System.out.println("Sorted Array (Selection Sort):");
        printArray(arr);
        System.out.println("Step Count: " + stepCount);
    }
