package tree.CluesTree;

public class ClueTreeNode {
    int value;
    ClueTreeNode LeftTreeNode;
    ClueTreeNode RightTreeNode;
    //节点类型标记 子节点或驱节点
    int leftTreeType=0;
    int RightTreeType=0;

    public ClueTreeNode(int value){
        this.value = value;
    }

    public void setLeftTreeNode(ClueTreeNode leftTreeNode) {
        this.LeftTreeNode = leftTreeNode;
    }

    public void setRightTreeNode(ClueTreeNode rightTreeNode) {
        this.RightTreeNode = rightTreeNode;
    }

}
