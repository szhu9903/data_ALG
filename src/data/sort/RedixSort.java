package data.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RedixSort {

    public static void main(String[] args) {
        int[] arr = new int[] {2,43,56,24,1234,462,523,5,2,453,55,222,66,32,98,66,88,657,575};
        redixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //排序方法
    public static void redixSort(int[] arr){
        //定义整数的最小值
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        //获取最大值长度
        int maxLenght = (max+"").length();
        //创建二维数组
        int[][] temp = new int[10][arr.length];
        //创建记录每个桶中数字下标的数组
        int[] count = new int[10];

        for (int i=0,n=1;i<maxLenght;i++,n*=10) {
            for (int j=0;j<arr.length;j++) {
                int num = arr[j]/n%10;
                temp[num][count[num]] = arr[j];
                count[num]++;
            }

            //取出排序后数字
            int index=0;
            for (int k=0;k<count.length;k++){
                for (int l=0;l<count[k]&&count[k]!=0;l++) {
                    arr[index] = temp[k][l];
                    index++;
                }
                count[k] = 0;
            }

        }


    }

}
