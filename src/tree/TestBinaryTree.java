package tree;

public class TestBinaryTree {

    public static void main(String[] args) {
        BinaryTree bintree = new BinaryTree();

        TreeNode root = new TreeNode(1);
        bintree.setRoot(root);

        TreeNode rootl = new TreeNode(2);
        root.setLeftNode(rootl);

        TreeNode rootr = new TreeNode(2);
        root.setRightNode(rootr);

    }
}
