package data.sort;

import java.util.Arrays;

public class ChooseSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5,3,2,1,4,7,9,6,8,0};
        chooseSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void chooseSort(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            int in_num = i;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j]<arr[in_num]) {
                    in_num = j;
                }
            }
            if (in_num != i){
                int copy_data = arr[i];
                arr[i] = arr[in_num];
                arr[in_num] = copy_data;

            }



        }
    }

}
