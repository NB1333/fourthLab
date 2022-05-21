package com.example.fourthlab;

import java.util.List;

public class Parser implements IParser {

    @Override
    public String listToString(List<Video> videos) {
        StringBuilder sb = new StringBuilder();

        for (Video video : videos) {
            sb.append(video.toString()).append("\n");
        }

        return sb.toString();
    }
}
