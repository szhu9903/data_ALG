package data.testnode;

import task.node.LoopNode;
//import task.node.Node;


public class TestNode {

    public static void main(String[] args) {
//        Node no1 = new Node(1);
//        Node no2 = new Node(2);
//        Node no3 = new Node(3);
//        Node no4 = new Node(4);
//
//        no1.append(no2).append(no3).append(no4);
//
//        no1.show();
//        no2.delete();
//        no1.show();
//        no2.insert(new Node(5));
//        no1.show();
//
//        System.out.println(no1.getEnd());
//        System.out.println(no1.getEnd());
//        System.out.println(no2.next());


        LoopNode n1 = new LoopNode(1);
        LoopNode n2 = new LoopNode(2);
        LoopNode n3 = new LoopNode(3);

        System.out.println("#################");

        n1.after(n2);
        n2.after(n3);

        System.out.println(n1.next());
        System.out.println(n2.next());
        System.out.println(n3.next());




    }
}
//节点的next存放下一个节点的data