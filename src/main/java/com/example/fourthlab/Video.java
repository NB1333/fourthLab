package com.example.fourthlab;

import java.util.LinkedList;
import java.util.List;

public class Video {
    private String nameOfVideo;
    private String URL;
    private int countOfViews;
    private int countOfLikes;
    private int countOfDislikes;

    private List<Comments> comments = new LinkedList<>();

    public Video(String nameOfVideo,
                 String URL,
                 int countOfViews,
                 int countOfLikes,
                 int countOfDislikes,
                 List<Comments> comments) {
        this.nameOfVideo = nameOfVideo;
        this.URL = URL;
        this.countOfViews = countOfViews;
        this.countOfLikes = countOfLikes;
        this.countOfDislikes = countOfDislikes;
        this.comments = comments;
    }

    public String getNameOfVideo() {
        return nameOfVideo;
    }

    public void setNameOfVideo(String nameOfVideo) {
        this.nameOfVideo = nameOfVideo;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getCountOfViews() {
        return countOfViews;
    }

    public void setCountOfViews(int countOfViews) {
        this.countOfViews = countOfViews;
    }

    public int getCountOfLikes() {
        return countOfLikes;
    }

    public void setCountOfLikes(int countOfLikes) {
        this.countOfLikes = countOfLikes;
    }

    public int getCountOfDislikes() {
        return countOfDislikes;
    }

    public void setCountOfDislikes(int countOfDislikes) {
        this.countOfDislikes = countOfDislikes;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}
