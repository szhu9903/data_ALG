package task.task;

public class MyQueue {
    int[] elements;

    public MyQueue(){
        elements = new int[0];
    }
    //入队
    public void add(int element){
        //创建新数组
        int[] newArray = new int[elements.length+1];
        //原有元组复制到新数组
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }

    //出队
    public int poll(){
        int element = elements[0];
        int[] newArray = new int[elements.length-1];
        for (int i=1;i<elements.length;i++){
            newArray[i-1] = elements[i];
        }
        elements = newArray;
        return element;
    }

    //判断是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }


}
