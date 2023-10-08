package com.filmview.app.service.model;

import java.util.List;

public class User {
    String name;
    String username;
    String email;
    final String creationDate;
    List<Comment> commentList;
    List<Film> upVotedFilms;

    public User(String name, String username, String email, String creationDate, List<Comment> commentList,
                List<Film> upVotedFilms) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.creationDate = creationDate;
        this.commentList = commentList;
        this.upVotedFilms = upVotedFilms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Film> getUpVotedFilms() {
        return upVotedFilms;
    }

    public void setUpVotedFilms(List<Film> upVotedFilms) {
        this.upVotedFilms = upVotedFilms;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", commentList=" + commentList +
                ", upVotedFilms=" + upVotedFilms +
                '}';
    }
}
