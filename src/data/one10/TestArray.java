package data.one10;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		//��������
		int[] arrold = new int[] {9,8,7};
		int ast = 6;
		//����������
		int[] arrnew = new int[arrold.length+1];
		//��������������ݵ�������
		for (int i=0;i<arrold.length;i++) {
			arrnew[i] = arrold[i];
		}
		//��Ԫ����ӵ��������
		arrnew[arrold.length] = ast;
		//�滻����������
		arrold=arrnew;
		//���ٲ鿴������
		System.out.println(Arrays.toString(arrold));
	}
}
