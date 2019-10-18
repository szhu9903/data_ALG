package data.one10;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		//创建数组
		int[] arrold = new int[] {9,8,7};
		int ast = 6;
		//创建新数组
		int[] arrnew = new int[arrold.length+1];
		//复制老数组的数据到新数组
		for (int i=0;i<arrold.length;i++) {
			arrnew[i] = arrold[i];
		}
		//将元素添加到数组最后
		arrnew[arrold.length] = ast;
		//替换老数组数据
		arrold=arrnew;
		//快速查看新数组
		System.out.println(Arrays.toString(arrold));
	}
}
