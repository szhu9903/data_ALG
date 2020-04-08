package data.testnode;

public class TestRecursive {


    public static void main(String[] args) {
//        print(4);
        int i = fibonacci(5);
        System.out.println(i);

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

}
