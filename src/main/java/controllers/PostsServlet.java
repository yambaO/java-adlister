package controllers;

import models.Post;
import models.UserPosts;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createPost")
public class PostsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Post[] posts = UserPosts.generatePosts();
        req.setAttribute("posts", posts);
        req.getRequestDispatcher("/blog/createPost.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String body = req.getParameter("body");
        String title = req.getParameter("title");
        Post post = new Post(title, body);
        req.setAttribute("post", post);
        req.getRequestDispatcher("/blog/createPost.jsp").forward(req, resp);
    }
}
