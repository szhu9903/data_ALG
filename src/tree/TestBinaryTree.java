package tree;

public class TestBinaryTree {

    public static void main(String[] args) {
        BinaryTree bintree = new BinaryTree();

        TreeNode root = new TreeNode(1);
        bintree.setRoot(root);

        TreeNode rootL = new TreeNode(2);
        root.setLeftNode(rootL);
        TreeNode rootR = new TreeNode(3);
        root.setRightNode(rootR);

        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));

        //前序遍历
        bintree.frontShow();
        //中序遍历
        bintree.midShow();
        //后序遍历
        bintree.afterShow();


    }
}
