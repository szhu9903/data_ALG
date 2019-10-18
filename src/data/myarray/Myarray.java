package data.myarray;

import java.util.Arrays;

public class Myarray {
	//声明一个数组
	private int[] elements;
	
	public Myarray() {
		elements = new int[0];
	}
	
	//获取长度的方法
	public int size() {
		return elements.length;
	}
	
	//在末尾添加一个元素
	public void add(int element) {
		int[] newArray = new int[size()+1];
		for (int i=0; i<size(); i++) {
			newArray[i] = elements[i];
		}
		newArray[size()] = element;
		elements = newArray;
	}
	
	//查看数组所有元素
	public void show() {
		System.out.println(Arrays.toString(elements));
	}

	//获取某个位置数字
	public int getindex(int index) {
		return elements[index - 1];
	}

	//删除数组元素
	public void delete(int index) {
		//判断要删除的元素下标是否在数组范围内
		if (index < 1 || index >size()) {
			throw new RuntimeException("越界");
		}
		int[] newArr = new int[size()-1];
		for (int i = 0; i < newArr.length; i++) {
			if (i<index-1) {
				newArr[i] = elements[i];
			}else {
				newArr[i] = elements[i+1];
			}
		}
		elements = newArr;
	}
	
	//更新数组指定位置元素
	public void updata(int index,int number) {
		if (index < 1 || index > size()) {
			throw new RuntimeException("越界");
		}
		elements[index-1] = number;
	}
	
	//插入元素到指定位置
	//插入元素到指定位置
	public void insert(int index,int number) {
		int [] newArray = new int[size()+1];
		for (int i = 0; i < elements.length; i++) {
			if (i < index-1) {
				newArray[i] = elements[i];
			}else {
				newArray[i+1] = elements[i];
			}
		}
		newArray[index-1] = number;
		elements = newArray;
	}
}







