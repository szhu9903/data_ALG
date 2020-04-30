package data.myarray;

import java.util.Arrays;

public class Myarray {
	//����һ������
	private int[] elements;
	
	public Myarray() {
		elements = new int[0];
	}
	
	//��ȡ���ȵķ���
	public int size() {
		return elements.length;
	}
	
	//��ĩβ���һ��Ԫ��
	public void add(int element) {
		int[] newArray = new int[size()+1];
		for (int i=0; i<size(); i++) {
			newArray[i] = elements[i];
		}
		newArray[size()] = element;
		elements = newArray;
	}
	
	//�鿴��������Ԫ��
	public void show() {
		System.out.println(Arrays.toString(elements));
	}

	//��ȡĳ��λ������
	public int getindex(int index) {
		return elements[index - 1];
	}

	//ɾ������Ԫ��
	public void delete(int index) {
		//�ж�Ҫɾ����Ԫ���±��Ƿ������鷶Χ��
		if (index < 1 || index >size()) {
			throw new RuntimeException("Խ��");
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
	
	//��������ָ��λ��Ԫ��
	public void updata(int index,int number) {
		if (index < 1 || index > size()) {
			throw new RuntimeException("Խ��");
		}
		elements[index-1] = number;
	}
	
	//����Ԫ�ص�ָ��λ��
	//����Ԫ�ص�ָ��λ��
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







