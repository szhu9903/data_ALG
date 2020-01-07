package data.one10;

import data.myarray.Myarray;

public class TestBinary {

	public static void main(String[] args) {
		Myarray ma = new Myarray();
		//创建有序列表
		for (int i = 1; i < 101; i++) {
			ma.add(i);
		}
		//目标数据
		int traget = 13;
		//初始化位置信息
		int start = 0;
		int end = 100;
		while (true) {
			int center = (end - start)/2+start;
			if (traget == center) {
				System.out.println(ma.getindex(center));
				break;
			}else if (traget > center){
				start = center;
				continue;
			}else {
				end = center;
				continue;
			}
		}
	}
}
