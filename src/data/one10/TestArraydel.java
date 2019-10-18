package data.one10;

import java.util.Arrays;

public class TestArraydel {
	public static void main(String[] args) {
		int[] arr = new int[] {9,8,7,6,5,4,3,2};
		//删除第四个元素6
		int del = 4;
		int[] arrnew = new int[arr.length-1];
		for (int i=0; i<arr.length; i++) {
			if (i<del-1) {
				arrnew[i] = arr[i];
			}else if (i>del-1) {
				arrnew[i-1]=arr[i];
			}
		}
		arr = arrnew;
		System.out.println(Arrays.toString(arr));
	}
}
