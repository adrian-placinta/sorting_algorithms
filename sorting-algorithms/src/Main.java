//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {


    public static void insertionSort(int[] arr) {
        int j;
        for (int i = 1; i < arr.length;i++) {
            j = i - 1;
            int temp = arr[i];
            while (j>=0 && temp >= arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {9,1,3,7};
        insertionSort(arr);
        for (int x: arr) {
            System.out.println(x);
        }
    }
}