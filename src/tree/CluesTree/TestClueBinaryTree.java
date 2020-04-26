package tree.CluesTree;

public class TestClueBinaryTree {

    public static void main(String[] args) {
        CluesBinaryTree bintree = new CluesBinaryTree();

        ClueTreeNode root = new ClueTreeNode(1);
        bintree.setRoot(root);

        ClueTreeNode lefttree = new ClueTreeNode(2);
        root.setLeftTreeNode(lefttree);
        ClueTreeNode righttree = new ClueTreeNode(3);
        root.setRightTreeNode(righttree);

        lefttree.setLeftTreeNode(new ClueTreeNode(4));
        ClueTreeNode fiveNode = new ClueTreeNode(5);
        lefttree.setRightTreeNode(fiveNode);
        righttree.setLeftTreeNode(new ClueTreeNode(6));
        righttree.setRightTreeNode(new ClueTreeNode(7));

        bintree.thredNodes();

        ClueTreeNode fiveL = fiveNode.LeftTreeNode;
        int five = fiveNode.value;
        ClueTreeNode fiveR = fiveNode.RightTreeNode;
        System.out.println(fiveL.value);
        System.out.println(five);
        System.out.println(fiveR.value);





    }


}
