package data.one10;

import data.myarray.Myarray;

public class TestBinary {

	public static void main(String[] args) {
		Myarray ma = new Myarray();
		//创建有序列表
		for (int i = 1; i < 101; i++) {
			ma.add(i);
		}
		ma.show();
		//目标数据
		int traget = 35;
		//初始化位置信息
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
