
package data.testnode;

public class TestRecursive {


    public static void main(String[] args) {
//        print(4);
//        int i = fibonacci(5);
//        System.out.println(i);
        hannoi(3,'A','B','C');


    }

    public static void print(int i) {
        if (i > 0){
            System.out.println(i);
            print(i - 1);
        }
    }

    //斐波那契
    public static int fibonacci(int n) {
        if (n == 1 || n==2) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    /**
     *
     * @param n    共有几个盘子
     * @param sta  开始柱子
     * @param in   中间柱子
     * @param end  目标柱子
     */
    //汉诺塔
    public  static void hannoi(int n,char sta, char in, char end) {
        if (n == 1) {
            System.out.println("第1个盘子从"+sta+"移动到"+end);
        }else {
            hannoi(n-1,sta,end,in);
            System.out.println("第"+ n +"个盘子从"+sta+"移动到"+end);
            hannoi(n-1,in,sta,end);
        }

    }

}
