package com.filmview.app.service.model;

import static java.util.UUID.randomUUID;

public class Comment {
    final String originalComment;
    String editedComment;
    String commentId;
    User user;

    public Comment(String comment, User user) {
        this.originalComment = comment;
        this.user = user;
        this.editedComment = "";
        this.commentId = randomUUID().toString();
    }

    public String getOriginalComment() {
        return originalComment;
    }

    public String getEditedComment() {
        return editedComment;
    }

    public void setEditedComment(String editedComment) {
        this.editedComment = editedComment;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public User getUsername() {
        return user;
    }

    public void setUsername(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "originalComment='" + originalComment + '\'' +
                ", editedComment='" + editedComment + '\'' +
                ", commentId='" + commentId + '\'' +
                ", user=" + user.username +
                '}';
    }
}
