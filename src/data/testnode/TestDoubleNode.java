package data.testnode;

import task.node.DoubleNode;

public class TestDoubleNode {

    public static void main(String[] args) {
        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);
        DoubleNode n4 = new DoubleNode(4);

        n1.after(n2);
        n2.after(n3);
        n3.after(n4);

        n2.delete();

        System.out.println(n1.getPer().getData());
        System.out.println(n1.getData());
        System.out.println(n1.getNext().getData());


        System.out.println(n3.getPer().getData());
        System.out.println(n3.getData());
        System.out.println(n3.getNext().getData());

        System.out.println(n4.getPer().getData());
        System.out.println(n4.getData());
        System.out.println(n4.getNext().getData());

    }
}
