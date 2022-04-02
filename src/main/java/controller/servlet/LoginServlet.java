package controller.servlet;

import model.User.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf8");
        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if ((login.equals("qwert")) && (password.equals("password"))) {
            HttpSession session = req.getSession();
            session.getAttribute("user");
            req.getRequestDispatcher("/WEB-INF/jsp/start.jsp").forward(req, resp);
        } else {
            writer.println("User is not authorized");
        }
    }
}

