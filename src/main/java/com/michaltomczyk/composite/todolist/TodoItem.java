package com.michaltomczyk.composite.todolist;

public class TodoItem implements Todo {
    private String name;
    private boolean done = false;

    TodoItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public void setDone(boolean done) {
        this.done = done;
    }
}
