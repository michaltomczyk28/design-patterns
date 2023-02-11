package com.michaltomczyk.iterator.treeiterator;

import java.util.NoSuchElementException;
import java.util.Stack;

public class InOrderTreeIterator implements TreeIterator {
    private Stack<TreeNode> traversal;

    public InOrderTreeIterator(BinaryTree tree) {
        this.traversal = new Stack<>();
        this.moveLeftToTraversal(tree.root);
    }

    private void moveLeftToTraversal(TreeNode node) {
        while(node != null) {
            this.traversal.push(node);
            node = node.left;
        }
    }

    @Override
    public boolean hasNext() {
        return !this.traversal.empty();
    }

    @Override
    public int next() {
        if(!this.hasNext()){
            throw new NoSuchElementException();
        }

        TreeNode current = this.traversal.pop();

        if(current.right != null) {
            this.moveLeftToTraversal(current.right);
        }

        return current.value;
    }
}
