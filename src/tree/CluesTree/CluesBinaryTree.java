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

    public void midShow(){
        root.midShow();
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

    //遍历线索二叉树
    public void thredIterate(){
        ClueTreeNode node = root;
        while (node!=null){
            while (node.leftTreeType==0){
                node = node.LeftTreeNode;
            }
            System.out.println(node.value);
            while (node.RightTreeType==1){
                node = node.RightTreeNode;
                System.out.println(node.value);
            }
            node = node.RightTreeNode;
        }

    }

}
