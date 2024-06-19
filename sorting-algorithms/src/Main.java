//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {

    public static void quickSort(int[] arr, int start, int end) {
        if (start>=end) {
            return;
        }

        int indexPivot =  partition(arr, start, end);
        quickSort(arr, start, indexPivot -1);
        quickSort(arr, indexPivot + 1, end);
    }
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (; start < end; start++) {
            if (arr[start] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        for (int x: arr) {
            System.out.println(x);
        }
    }
}