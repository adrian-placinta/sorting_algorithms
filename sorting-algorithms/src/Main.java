//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {

    public static void bubbleSort(int[] arr) {
        int n = arr.length, temp;
        for (int i = 0; i<n;i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5,4,3,2,1};
        bubbleSort(arr);
        for (int x: arr) {
            System.out.println(x);
        }
    }
}