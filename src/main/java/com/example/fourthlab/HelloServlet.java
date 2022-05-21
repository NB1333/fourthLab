package com.example.fourthlab;

import java.io.*;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        Comments firstComment = new Comments("Stupid video. go fuck urself",
                1337, 59);
        Comments secondComment = new Comments("Great content!", 0,
                1659);
        Comments thirdComment = new Comments("nice))))", 10000003,
                59);
        Comments fourthComment = new Comments("COLD SIEMENS", 5959,
                13);
        Comments fifthComment = new Comments("GRAY TIL THE GRAVE", 1359,
                0);

        Video ColdSiemens = new Video("Black Siemens",
                "https://www.youtube.com/watch?v=jWDwdYSdM64",
                17_958_476, 1_250_788, 0,
                List.of(fourthComment, thirdComment, firstComment));

        Video GRAY_59 = new Video("THE_EVIL_THAT_MEN_DO",
                "https://www.youtube.com/watch?v=s1-0lt7b-78",37_811_672,
                250_039, 0,
                List.of(secondComment, fifthComment));

        VideoBlog myPlaylist = new VideoBlog("Young drip dilla", List.of(ColdSiemens, GRAY_59));

        System.out.println("\nName of video blog: " + myPlaylist.getNameOfVideoBlog() +
                "\nAll videos have: " + myPlaylist.sumOfViews() +
                " views." + "\nComment that got more likes than video is: " +
                myPlaylist.hasMoreLikes(List.of(ColdSiemens, GRAY_59)) + "\nThe video(s) that got most dislikes: " +
                myPlaylist.mostDislikes(List.of(ColdSiemens, GRAY_59)));
    }

    public void destroy() {
    }
}