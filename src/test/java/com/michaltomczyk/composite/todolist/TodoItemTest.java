package com.michaltomczyk.composite.todolist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoItemTest {
    private TodoItem item;

    @BeforeEach
    public void setUp() {
        item = new TodoItem("test1");
    }

    @Test
    public void shouldMarkTodoItemAsDone() {
        item.setDone(true);

        Assertions.assertTrue(item.isDone());
    }

    @Test
    public void shouldMarkTodoItemAsNotDone() {
        item.setDone(false);

        Assertions.assertFalse(item.isDone());
    }
}
