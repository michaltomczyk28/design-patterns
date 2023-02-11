package com.michaltomczyk.iterator.treeiterator;

public class BinaryTree {
    TreeNode root = null;

    public void add(int value) {
        TreeNode newNode = new TreeNode(value);

        if(this.root == null) {
            this.root = newNode;
            return;
        }

        TreeNode nodeUnderCheck = this.root;
        TreeNode parentNode;

        while(true) {
            parentNode = nodeUnderCheck;

            if(value < nodeUnderCheck.value){
                nodeUnderCheck = nodeUnderCheck.left;
                if(nodeUnderCheck == null){
                    parentNode.left = newNode;
                    return;
                }

                continue;
            }

            nodeUnderCheck = nodeUnderCheck.right;
            if(nodeUnderCheck == null) {
                parentNode.right = newNode;
                return;
            }
        }
    }
}
