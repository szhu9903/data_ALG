package data.sort;

public class BubblingSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5,1,2,4,8,4,2,6,8,2,8,0,65,4,3,2,5,6};
        bubblingSort(arr);
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
        //打印
        for (int elment:arr){
            System.out.print(elment+",");
        }

    }

}
