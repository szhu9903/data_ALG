package data.sort;

import java.util.Arrays;
import task.task.MyQueue;

public class RedixQueueSort {

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
        MyQueue[] temp = new MyQueue[10];
        for(int i=0;i<temp.length;i++){
            temp[i] = new MyQueue();
        }

        for (int i=0,n=1;i<maxLenght;i++,n*=10) {
            for (int j=0;j<arr.length;j++) {
                int num = arr[j]/n%10;
                temp[num].add(arr[j]);
            }

            //取出排序后数字
            int index=0;
            for (int k=0;k<temp.length;k++){
                while (!temp[k].isEmpty()){
                    arr[index] = temp[k].poll();
                    index++;
                }
            }

        }


    }

}
