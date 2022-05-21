package com.example.fourthlab;

public class Comments {
    private String commentText;
    private int countOfLikes;
    private int countOfDislikes;

    public Comments(String commentText, int countOfLikes, int countOfDislikes) {
        this.commentText = commentText;
        this.countOfLikes = countOfLikes;
        this.countOfDislikes = countOfDislikes;
    }

    public String getCommentText() {
        return commentText;
    }

    public int getCountOfLikes() {
        return countOfLikes;
    }

    public int getCountOfDislikes() {
        return countOfDislikes;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public void setCountOfLikes(int countOfLikes) {
        this.countOfLikes = countOfLikes;
    }

    public void setCountOfDislikes(int countOfDislikes) {
        this.countOfDislikes = countOfDislikes;
    }
}
