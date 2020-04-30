package task.one_test;
import task.task.Mytask;

public class TestTask {

    public static void main(String[] args){
        Mytask mt = new Mytask();
        System.out.println(mt.isEmpty());
        for (int i=0; i<101; i++){
            mt.push(i);
        }
        System.out.println(mt.isEmpty());
        mt.show();
        for (int i=0; i<11; i++) {
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.exit(0);
            }
            System.out.println(mt.pop());
            System.out.println(mt.seek());
        }

    }

}
