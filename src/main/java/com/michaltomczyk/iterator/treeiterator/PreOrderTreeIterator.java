package com.michaltomczyk.iterator.treeiterator;

import java.util.NoSuchElementException;
import java.util.Stack;

public class PreOrderTreeIterator implements TreeIterator {
    private Stack<TreeNode> traversal;

    public PreOrderTreeIterator(BinaryTree tree) {
        this.traversal = new Stack<>();

        if(tree.root != null) {
            this.traversal.add(tree.root);
        }
    }

    @Override
    public boolean hasNext() {
        return !this.traversal.isEmpty();
    }

    @Override
    public int next() {
        if(!this.hasNext()){
            throw new NoSuchElementException();
        }

        TreeNode current = this.traversal.pop();

        if(current.right != null) {
            this.traversal.push(current.right);
        }

        if(current.left != null) {
            this.traversal.push(current.left);
        }

        return current.value;
    }
}
