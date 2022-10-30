import java.util.*;

public class reverseArray {

    public static Scanner scn = new Scanner(System.in);

    public static void display(int[] arr) {
        for (int ele = 0; ele < arr.length; ele++) {
            System.out.println(arr[ele]);
        }
    }

    public static int[] input2(int n) {
        int[] arr = new int[n];
        for (int ele = 0; ele < arr.length; ele++) {
            arr[ele] = scn.nextInt();
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rev(int[] arr) {
        // take 2 pointers (i and j) & place i at 0th idx and j at (arr.length - 1)th
        // idx...
        int i = 0;
        int j = arr.length - 1;
        // int temp = 0;
        // we have to work on condition so we must take while loop and the condition
        // defined below...
        while (i < j) { // i < j : as we initialize i & j above as starting and ending idxs. so we swap
                        // their values till i < j...
            swap(arr, i, j);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input2(n);
        rev(arr);
        display(arr);
    }
}
