package task.task;

import java.util.Arrays;

public class Mytask {
    private int[] elements;

    public Mytask() {
        elements = new int[0];
    }

    public int size(){
        return elements.length;
    }

    public void show(){
        System.out.println(Arrays.toString(elements));
    }

    //将元素压入栈中
    public void push(int element) {
        int[] newArr = new int[size() + 1];
        for (int i=0; i<size(); i++){
            newArr[i] = elements[i];
        }
        newArr[size()] = element;
        elements = newArr;
    }

    //将元素从栈中取出
    public int pop(){
        if (size()==0){
            throw new RuntimeException("无可弹出元素");
        }
        int element = elements[size()-1];
        int[] newArr = new int[size()-1];
        for (int i=0; i<newArr.length; i++){
            newArr[i] = elements[i];
        }
        elements=newArr;
        return element;
    }

    //查看栈顶元素
    public int seek(){
        if (size()==0){
            throw new RuntimeException("无可弹出元素");
        }
        return elements[size()-1];
    }

    //检查栈是否为空
    public boolean isEmpty(){
        return size()==0;
    }

}
