package data.sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,2,9,5,4,6,0,10,16,7,17};
        HeapSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void HeapSort(int[] arr){
        int start = (arr.length-1)/2;
        for (int i=start;i>=0;i--) {
            MaxHeap(arr,arr.length,i);
        }
        //把大顶堆根节点与最后一个交换，再把前边的大顶堆排序，再次排序从根节点向下即可
        for (int i=arr.length-1;i>0;i--) {
            int num = arr[i];
            arr[i] = arr[0];
            arr[0] = num;
            MaxHeap(arr,i,0);
        }

    }


    //转换为大顶堆
    public static void MaxHeap(int[] arr,int size,int index) {
        //左子节点
        int leftIndex = 2*index+1;
        //右子节点
        int reghtIndex = 2*index+2;
        int max = index;
        if (leftIndex<size&&arr[leftIndex]>arr[max]) {
            max = leftIndex;
        }
        if (reghtIndex<size&&arr[reghtIndex]>arr[max]) {
            max = reghtIndex;
        }
        //交换位置
        if (max!=index) {
            int num = arr[index];
            arr[index] = arr[max];
            arr[max] = num;
            MaxHeap(arr,size,max);
        }
    }

}
