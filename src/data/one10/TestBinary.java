package data.one10;

import data.myarray.Myarray;

public class TestBinary {

	public static void main(String[] args) {
		Myarray ma = new Myarray();
		//���������б�
		for (int i = 1; i < 101; i++) {
			ma.add(i);
		}
		ma.show();
		//Ŀ������
		int traget = 35;
		//��ʼ��λ����Ϣ
		int index = -1;
		while (true) {
			int center = (ma.size()-1)/2;
			if (traget == center) {
				index = center-1;
				break;
			}else {
				
			}
		}
	}
}
