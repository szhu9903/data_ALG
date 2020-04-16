package data.sort;

import java.util.Arrays;

public class MargeSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5,3,2,1,4,7,9,6,8,0};
        magerSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void magerSort(int[] arr,int low,int high) {
        int middle = (high+low)/2;
        if (low<high){
            //前部分
            magerSort(arr,low,middle);
            //后
            magerSort(arr,middle+1,high);
            marge(arr,low,middle,high);
        }

    }


    //比较前后大小 写入新数组
    public static void marge(int[] arr,int low,int middle,int high) {
        //定义临时存放数据的数组
        int[] temp = new int[high-low+1];
        //前部分开始位置
        int i = low;
        //后部分开始
        int j = middle+1;
        //临时元组下标
        int index = 0;
        while (i<=middle&&j<=high) {
            if (arr[i]<arr[j]) {
                temp[index] = arr[i];
                i++;
            }else{
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        //一侧剩余元素写入temp
        while (i<=middle){
            temp[index] = arr[i];
            i++;
            index++;
        }
        while (j<=high){
            temp[index] = arr[j];
            j++;
            index++;
        }
        for (int k=0;k<temp.length;k++) {
            arr[k+low] = temp[k];
        }

    }


}
