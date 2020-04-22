package tree;

import data.one10.TestBinary;

public class BinaryTree {
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    //获取根节点
    public TreeNode getRoot(){
        return root;
    }

    public void frontShow() {
        root.frontShow();
    }

    public void midShow(){
        root.midShow();
    }
    public void afterShow(){
        root.afterShow();
    }

}
