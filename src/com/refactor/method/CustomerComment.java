package com.refactor.method;

public class CustomerComment {
    private final String name;
    private final String address;
    private final String description;
    private final int commentLevel;

    public CustomerComment(String name, String address, String description, int commentLevel) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.commentLevel = commentLevel;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public int getCommentLevel() {
        return commentLevel;
    }
}
