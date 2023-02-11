package com.michaltomczyk.iterator.treeiterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TreeIteratorTest {
    private BinaryTree tree;

    @BeforeEach
    public void setUp() {
        this.tree = new BinaryTree();

        this.tree.add(5);
        this.tree.add(2);
        this.tree.add(1);
        this.tree.add(3);
        this.tree.add(12);
        this.tree.add(15);
        this.tree.add(9);
    }

    @Test
    public void shouldIterateTreeInOrder(){
        TreeIterator iterator = new InOrderTreeIterator(this.tree);

        ArrayList<Integer> result = new ArrayList<>();
        while(iterator.hasNext()){
            result.add(iterator.next());
        }

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 9, 12, 15));
        Assertions.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void shouldIterateTreePreOrder() {
        TreeIterator iterator = new PreOrderTreeIterator(this.tree);

        ArrayList<Integer> result = new ArrayList<>();
        while(iterator.hasNext()){
            result.add(iterator.next());
        }

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 2, 1, 3, 12, 9, 15));
        Assertions.assertArrayEquals(expected.toArray(), result.toArray());
    }
}
