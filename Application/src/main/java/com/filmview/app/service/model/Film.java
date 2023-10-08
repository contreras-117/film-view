package com.filmview.app.service.model;

import java.util.List;

public class Film {
    String filmTitle;
    String filmType;
    String genre;
    List<Comment> commentList;
    int ranking;
    int upVotes;
    int downVotes;
    String resourcesLink;

    public Film (String filmTitle, String filmType, String genre, List<Comment> commentList, int ranking,
                 int upVotes, int downVotes, String resourcesLink) {
        this.filmTitle = filmTitle;
        this.filmType = filmType;
        this.genre = genre;
        this.commentList = commentList;
        this.ranking = ranking;
        this.upVotes = upVotes;
        this.downVotes = downVotes;
        this.resourcesLink = resourcesLink;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmType() {
        return filmType;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }

    public String getResourcesLink() {
        return resourcesLink;
    }

    public void setResourcesLink(String resourcesLink) {
        this.resourcesLink = resourcesLink;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmTitle='" + filmTitle + '\'' +
                ", filmType='" + filmType + '\'' +
                ", genre='" + genre + '\'' +
                ", commentList=" + commentList +
                ", ranking=" + ranking +
                ", upVotes=" + upVotes +
                ", downVotes=" + downVotes +
                ", resourcesLink='" + resourcesLink + '\'' +
                '}';
    }
}
