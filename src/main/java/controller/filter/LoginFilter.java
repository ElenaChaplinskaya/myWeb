package controller.filter;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginFilter implements Filter {

    private FilterConfig config = null;
    private boolean active = false;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        PrintWriter writer = response.getWriter();
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();

        if (session.getAttribute("user") != null) {
            chain.doFilter(request, response);
        } else {
            writer.println("Please log in");
        }
    }

    @Override
    public void destroy() {

    }

}