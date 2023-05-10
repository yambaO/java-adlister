package controllers;

import models.Post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createPost")
public class PostServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/blog/createPost.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String post = req.getParameter("post");
        String title = req.getParameter("title");
        String[] topics = req.getParameterValues("topic");
        Post submittedPost = new Post(title, post, topics);
        String fontSizeRequested = req.getParameter("font-size");
        System.out.println(fontSizeRequested);
        req.setAttribute("post", submittedPost);
        req.setAttribute("font", fontSizeRequested);
        req.getRequestDispatcher("/blog/createPost.jsp").forward(req, resp);
    }
}
