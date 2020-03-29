package data.testnode;

import task.node.Node;


public class TestNode {

    public static void main(String[] args) {
        Node no1 = new Node(1);
        Node no2 = new Node(2);
        Node no3 = new Node(3);
        Node no4 = new Node(4);

        no1.append(no2).append(no3).append(no4);

        System.out.println(no1.getEnd());
        System.out.println(no1.getEnd());
        System.out.println(no2.next());
    }
}
//节点的next存放下一个节点的data