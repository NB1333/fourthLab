package com.example.fourthlab;

import java.util.List;

public class ParseComment implements ICommentParser {

    @Override
    public String listToString(List<Comments> comments) {
        StringBuilder sb = new StringBuilder();

        for (Comments comment : comments) {
            sb.append(comment.toString()).append("\n");
        }

        return sb.toString();
    }
}
