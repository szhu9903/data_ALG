package data.one10;

import data.myarray.Myarray;

public class TestMyarray {

	public static void main(String[] args) {
		Myarray ma = new Myarray();
		ma.add(11);ma.add(10);ma.add(9);ma.add(8);
		ma.show();
		ma.delete(1);
		ma.show();
		ma.updata(1, 100);
		ma.show();
		ma.insert(4, 100);
		ma.show();
		
	}
}
