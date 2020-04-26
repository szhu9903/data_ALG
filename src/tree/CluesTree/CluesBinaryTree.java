package tree.CluesTree;

public class CluesBinaryTree {
    ClueTreeNode root;
    //临时存放前驱结点
    ClueTreeNode per=null;

    public void setRoot(ClueTreeNode root) {
        this.root = root;
    }

    public ClueTreeNode getRoot() {
        return root;
    }

    //中序线索二叉树
    public void thredNodes(){
        thredNodes(root);
    }

    public void thredNodes(ClueTreeNode node){
        if (node == null){
            return;
        }
        //左子树
        thredNodes(node.LeftTreeNode);
        //处理前驱结点
        if (node.LeftTreeNode == null){
            node.LeftTreeNode = per;
            node.leftTreeType = 1;
        }
        //前驱结点的右指针
        if(per!=null&&per.RightTreeNode==null){
            per.RightTreeNode = node;
            per.RightTreeType = 1;
        }

        per = node;

        //右子树
        thredNodes(node.RightTreeNode);

    }
}
