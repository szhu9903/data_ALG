package task.node;

public class Node {
    //存放节点数据
    int data;
    //存放下一个节点
    Node next;

    //构造方法
    public Node(int data) {
        this.data = data;
    }

    //根据头节点找到最后的节点，向后继续添加节点
    public Node append(Node data) {
        Node currentNode = this;
        while (true){
            Node nextNode = currentNode.next;
            if (nextNode==null){
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = data;

        return currentNode;
    }

    public void show() {
        Node currentNode = this;
        while (true){

            System.out.print(currentNode.data);
            if (currentNode.next == null){
                break;
            }
            currentNode = currentNode.next;
        }
        System.out.println();

    }

    public void delete() {
        Node currentNode = this.next.next;
        this.next = currentNode;
    }

    public void insert(Node node){
        Node currentNode = this.next;
        node.next = currentNode;
        this.next = node;
    }

    //获取尾节点
    public int getEnd() {
        Node currentNode = this;
        while (true) {
           Node nextNode = currentNode.next;
           if (nextNode==null) {
               break;
           }
           currentNode = nextNode;
        }
        return currentNode.data;
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
