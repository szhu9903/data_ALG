package tree;

public class TreeNode {
    int value;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
