package com.filmview.app.service.model;

import static java.util.UUID.randomUUID;

public class Comment {
    String originalComment;
    String editedComment;
    String commentId;
    User username;

    public Comment(String comment, User username) {
        this.originalComment = comment;
        this.username = username;
        this.editedComment = "";
        this.commentId = randomUUID().toString();
    }


}
