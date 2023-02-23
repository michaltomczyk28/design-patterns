package com.michaltomczyk.composite.todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoList implements Todo {
    private List<Todo> items = new ArrayList<>();

    public void addChild(Todo item) {
        this.items.add(item);
    }

    @Override
    public void setDone(boolean done) {
        this.items.forEach(item -> item.setDone(done));
    }

    @Override
    public boolean isDone(){
        for(Todo item: this.items) {
            if(!item.isDone()){
                return false;
            }
        }

        return true;
    }
}
