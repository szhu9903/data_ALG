package data.sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int [] arr = new int[] {5,3,2,1,4,7,9,6,8,0};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr){
        //希尔排序，将数据根据步长分组然后进行插入排序
        //分组循环每次步长缩短
        for (int d = arr.length/2;d>0;d/=2) {
            //遍历所有元素
            for (int j = d;j<arr.length;j++) {
                //遍历补偿d的列表
                for (int i=j-d;i>=0;i-=d) {
                    if (arr[i]>arr[i+d]){
                        int copy_data = arr[i+d];
                        arr[i+d] = arr[i];
                        arr[i] = copy_data;
                    }
                }

            }
        }

    }


}
