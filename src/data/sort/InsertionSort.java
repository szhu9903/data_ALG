package data.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5,3,2,1,4,7,9,6,8,0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertSort(int[] arr) {
        for (int i=1;i<arr.length;i++) {
            if (arr[i]<arr[i-1]) {
                int copy_data = arr[i];
                //遍历前边所有
                int j;
                for (j=i-1;j>=0&&arr[j]>copy_data;j--){
                    arr[j+1] = arr[j];
                }
                arr[j+1] = copy_data;
            }
        }
    }

}
