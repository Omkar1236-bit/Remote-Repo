public class Isort {

    static void Print(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    static void Sort(int arr[], int size) {
        for (int i = 1; i < size; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 89, 56, 34, 32, 12, 3, 58 };
        int size = arr.length;

        Print(arr, size);
        System.out.print("\n");
        Sort(arr, size);
        Print(arr, size);
    }

}
