
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

    //쳲�����
    public static int fibonacci(int n) {
        if (n == 1 || n==2) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    /**
     *
     * @param n    ���м�������
     * @param sta  ��ʼ����
     * @param in   �м�����
     * @param end  Ŀ������
     */
    //��ŵ��
    public  static void hannoi(int n,char sta, char in, char end) {
        if (n == 1) {
            System.out.println("��1�����Ӵ�"+sta+"�ƶ���"+end);
        }else {
            hannoi(n-1,sta,end,in);
            System.out.println("��"+ n +"�����Ӵ�"+sta+"�ƶ���"+end);
            hannoi(n-1,in,sta,end);
        }

    }

}
