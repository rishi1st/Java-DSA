public class AllIndicesinArray {
    public static void main(String[] args) {
         int arr[] = {5, 6, 8, 10, 8, 9, 12, 10, 8, 20};
         int x = 8;
         int[] allidx = findallIndx(arr, x, 0, 0);
         print(arr, 0);
         System.out.println();
         print(allidx, 0);
     }

     public static int[] findallIndx(int[] arr, int x, int idx, int size) {
        if (idx == arr.length) {
            return new int[size];
        }
        if (arr[idx] == x) {
            int[] iarr = findallIndx(arr, x, idx + 1, size + 1);
            iarr[size] = idx;
            return iarr;
        } else {
            int[] iarr = findallIndx(arr, x, idx + 1, size);
            return iarr;
        }
     }

     public static void print(int[] arr, int i) {
        if (i == arr.length) return;
        System.out.print(arr[i] + " ");
        print(arr, i + 1);
     }
}
