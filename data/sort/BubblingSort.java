package data.sort;

import java.util.Arrays;

public class BubblingSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5,1,12,15,8,4,13,6,19,14,18,0,65,16,3,5,5,6};
//        bubblingSort(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblingSort(int[] arr){
        int maxnum;
        for (int i=0;i<arr.length-1;i++) {
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>=arr[j+1]) {
                    maxnum = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = maxnum;
                }
            }
        }
    }

    //快速排序
    public static void quickSort(int[] arr,int sta,int end) {
        if (sta < end){
            int stard = arr[sta];
            int low = sta;
            int high = end;
            while (low<high){
                while (low<high&&arr[high] >= stard){
                    high--;
                }
                arr[low] = arr[high];
                while (low<high&&arr[low] <= stard){
                    low++;
                }

                arr[high] = arr[low];
            }
            arr[low] = stard;
            quickSort(arr,sta,low);
            quickSort(arr,low+1,end);
        }
    }


}
