public class Bsort {
    static void Sort(int arr[], int size) {
        for (int step = 0; step < size; step++) {
            for (int i = 0; i < size - step - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    static void Print(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 89, 56, 34, 32, 12, 3, 58 };
        int size = arr.length;

        Print(arr, size);
        Sort(arr, size);
        Print(arr, size);
    }
}