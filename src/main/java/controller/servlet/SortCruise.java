package controller.servlet;

import model.BookATour.Booking;
import model.Tour.Tour;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;


public class SortCruise extends HttpServlet {

    Booking booking = new Booking();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        booking.sortTourByTransport(((List) req.getSession().getAttribute("cruise")));
        req.setAttribute("cruises", (List<Tour>) req.getSession().getAttribute("cruise"));
        req.getRequestDispatcher("/WEB-INF/jsp/sortCruise.jsp").forward(req, resp);
    }
}
