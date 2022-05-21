package com.example.fourthlab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VideoBlog {
    private String nameOfVideoBlog;
    private List<Video> videosInVideoBlog = new ArrayList<>();

    public VideoBlog(String nameOfVideoBlog, List<Video> videosInVideoBlog) {
        this.nameOfVideoBlog = nameOfVideoBlog;
        this.videosInVideoBlog = videosInVideoBlog;
    }

    public int getValueOfDislikes(List<Video> videos) {
        int sumOfDislikes = 0;

        for (Video video : videos) {
            sumOfDislikes += video.getCountOfDislikes();
        }

        return sumOfDislikes;
    }

    public int sumOfViews() {
        int sum = 0;

        Iterator<Video> videoIterator = this.videosInVideoBlog.iterator();
        while (videoIterator.hasNext()) {
            Video video = videoIterator.next();
            sum += video.getCountOfViews();
        }

        return sum;
    }

    public String hasMoreLikes(List<Video> videos) {
        String result = null;

        for (Video video : videos) {
            for (Comments comment : video.getComments()) {
                if (comment.getCountOfLikes() > video.getCountOfDislikes()) {
                    result = "No";
                } else {
                    result = "Yes";
                }
            }
        }

        return result;
    }

    public List<String> mostDislikes(List<Video> videos) {
        List<String> mostDisliked = new LinkedList<>();

        int maxDislikes = 0;

        for (int i = 0; i < videos.size(); i++) {
            if (videos.get(i).getCountOfDislikes() > maxDislikes) {
                mostDisliked.clear();
                maxDislikes = videos.get(i).getCountOfDislikes();
                mostDisliked.add(videos.get(i).getNameOfVideo());
            } else if (videos.get(i).getCountOfDislikes() == maxDislikes) {
                mostDisliked.add(videos.get(i).getNameOfVideo());
            }
        }

        if (getValueOfDislikes(videos) == 0) {
            mostDisliked.clear();
        }
        return mostDisliked;
    }

    public String getNameOfVideoBlog() {
        return nameOfVideoBlog;
    }

    public void setNameOfVideoBlog(String nameOfVideoBlog) {
        this.nameOfVideoBlog = nameOfVideoBlog;
    }

    public List<Video> getVideosInVideoBlog() {
        return videosInVideoBlog;
    }

    public void setVideosInVideoBlog(List<Video> videosInVideoBlog) {
        this.videosInVideoBlog = videosInVideoBlog;
    }
}
