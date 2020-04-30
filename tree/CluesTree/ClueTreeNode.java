package tree.CluesTree;

public class ClueTreeNode {
    int value;
    ClueTreeNode LeftTreeNode;
    ClueTreeNode RightTreeNode;
    //节点类型标记 子节点或驱节点
    int leftTreeType;
    int RightTreeType;

    public ClueTreeNode(int value){
        this.value = value;
    }

    public void setLeftTreeNode(ClueTreeNode leftTreeNode) {
        this.LeftTreeNode = leftTreeNode;
    }

    public void setRightTreeNode(ClueTreeNode rightTreeNode) {
        this.RightTreeNode = rightTreeNode;
    }

    //中序遍历
    public void midShow(){
        if (LeftTreeNode!=null){
            LeftTreeNode.midShow();
        }
        System.out.println(value);
        if (RightTreeNode!=null){
            RightTreeNode.midShow();
        }
    }
}
