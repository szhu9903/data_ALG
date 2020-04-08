//双向循环链表
package task.node;

public class DoubleNode {
    //上个节点
    DoubleNode per = this;
    //下个节点
    DoubleNode next = this;
    //节点data
    int data;

    public DoubleNode(int data) {
        this.data = data;
    }

    //插入数据
    public void after(DoubleNode node) {
        //获取下个节点
        DoubleNode nextNext = next;
        //更新当前节点的下个节点
        this.next = node;
        //更新下个节点的上个节点
        node.per = this;
        //更新下个节点的下下个节点
        node.next = nextNext;
        nextNext.per = node;
    }

    //删除当前节点
    public void delete() {
        //上一个节点
        DoubleNode perNode = this.per;
        perNode.next = this.next;
        //下一个节点
        DoubleNode nextNode = this.next;
        nextNode.per = perNode;
    }


    //获取上个节点
    public DoubleNode getPer(){
        return this.per;
    }

    //获取下个节点
    public DoubleNode getNext(){
        return this.next;
    }
    //获取下个节点
    public int getData(){
        return this.data;
    }

}
