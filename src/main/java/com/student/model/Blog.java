package com.student.model;

public class Blog {
    private String id ;

    public Blog(){

    }

    public Blog(String id, String title, String comment){
        this.id = id;
        this.title = title;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public Blog setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Blog setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Blog setComment(String comment) {
        this.comment = comment;
        return this;
    }

    private String title;
    private String comment;
}
