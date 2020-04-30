package task.node;

public class LoopNode {
    //存放节点数据
    int data;
    //存放下一个节点,只有一个节点情况下 存放自己data
    LoopNode next = this;

    //构造方法
    public LoopNode(int data) {
        this.data = data;
    }




    public void delete() {
        LoopNode currentNode = this.next.next;
        this.next = currentNode;
    }

    public void after(LoopNode node){
        LoopNode currentNode = next;
        this.next = node;
        node.next = currentNode;
    }




    //获取下一个节点
    public int next() {
        return this.next.data;
    }

    //获取当前节点data
    public int getData() {
        return this.data;
    }





}
