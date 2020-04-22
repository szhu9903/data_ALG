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

    //前序遍历
    public void frontShow(){
        System.out.println(value);
        if (leftNode!=null){
            leftNode.frontShow();
        }
        if (rightNode!=null){
            rightNode.frontShow();
        }
    }
    //中序遍历
    public void midShow(){
        if (leftNode!=null){
            leftNode.midShow();
        }
        System.out.println(value);
        if (rightNode!=null){
            rightNode.midShow();
        }
    }
    //后续遍历
    public void afterShow(){
        if (leftNode!=null){
            leftNode.afterShow();
        }
        if (rightNode!=null){
            rightNode.afterShow();
        }
        System.out.println(value);
    }

}
