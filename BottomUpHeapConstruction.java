public class BottomUpHeapConstruction {

    public static void buildHeap(int[] arr) {
        int n = arr.length;

        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapify(int[] arr, int n, int index) {
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < n && arr[leftChild] < arr[smallest]) {
            smallest = leftChild;
        }

        if (rightChild < n && arr[rightChild] < arr[smallest]) {
            smallest = rightChild;
        }

        if (smallest != index) {
            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;

            heapify(arr, n, smallest);
        }
    }

    public static void printHeap(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 1, -2, 6, 5};

        System.out.println("Original array:");
        printHeap(arr);

        buildHeap(arr);

        System.out.println("Min-heap after bottom-up heap construction:");
        printHeap(arr);
    }
}
