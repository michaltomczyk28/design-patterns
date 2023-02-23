package com.michaltomczyk.composite.todolist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoListTest {
    private TodoList list;
    private TodoItem item1;
    private TodoItem item2;
    private TodoItem item3;

    @BeforeEach
    public void setUp() {
        list = new TodoList();

        item1 = new TodoItem("item1");
        item2 = new TodoItem("item2");
        item3 = new TodoItem("item3");

        list.addChild(item1);
        list.addChild(item2);
        list.addChild(item3);
    }

    @Test
    public void shouldMarkAllTodoItemsAsDone() {
        list.setDone(true);

        Assertions.assertTrue(list.isDone());
        Assertions.assertTrue(item1.isDone());
        Assertions.assertTrue(item2.isDone());
        Assertions.assertTrue(item3.isDone());
    }

    @Test
    public void shouldMarkAllTodoItemsAsNotDone() {
        list.setDone(false);

        Assertions.assertFalse(list.isDone());
        Assertions.assertFalse(item1.isDone());
        Assertions.assertFalse(item2.isDone());
        Assertions.assertFalse(item3.isDone());
    }
}
