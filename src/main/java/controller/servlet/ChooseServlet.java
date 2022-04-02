package controller.servlet;

import model.BookATour.Booking;
import model.BookATour.TravelAgency;
import model.Tour.*;
import model.TypeOfFood.Food;
import model.TypeOfTransport.Transport;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ChooseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf8");

        TravelAgency travelAgency = new TravelAgency();
        travelAgency.addTour(new Vacation(Transport.TRAIN, Food.BB, 15));
        travelAgency.addTour(new Vacation(Transport.BUS, Food.HB, 7));
        travelAgency.addTour(new Shopping(Transport.BUS, Food.RO, 3));
        travelAgency.addTour(new Shopping(Transport.TRAIN, Food.BB, 4));
        travelAgency.addTour(new Therapy(Transport.BUS, Food.FB, 14));
        travelAgency.addTour(new Therapy(Transport.AIRPLANE, Food.HB, 12));
        travelAgency.addTour(new Cruise(Transport.SHIP, Food.FB, 14));
        travelAgency.addTour(new Cruise(Transport.SHIP, Food.HB, 20));

        Booking booking = new Booking();

        List<Tour> vacation = booking.chooseATour(travelAgency.getTours(), "Vacation");
        List<Tour> cruise = booking.chooseATour(travelAgency.getTours(), "Cruise");
        List<Tour> shopping = booking.chooseATour(travelAgency.getTours(), "Shopping");
        List<Tour> therapy = booking.chooseATour(travelAgency.getTours(), "Therapy");


        if (req.getParameter("button").equals("Vacation")) {
            req.getSession().setAttribute("vacation", vacation);
            req.getRequestDispatcher("/WEB-INF/jsp/tours.jsp").forward(req, resp);
        } else if (req.getParameter("button").equals("Cruise")) {
            req.getSession().setAttribute("cruise", cruise);
            req.getRequestDispatcher("/WEB-INF/jsp/cruises.jsp").forward(req, resp);
        } else if (req.getParameter("button").equals("Shopping")) {
            req.getSession().setAttribute("shopping", shopping);
            req.getRequestDispatcher("/WEB-INF/jsp/shopping.jsp").forward(req, resp);
        } else {
            req.getSession().setAttribute("therapy", therapy);
            req.getRequestDispatcher("/WEB-INF/jsp/therapy.jsp").forward(req, resp);
        }
    }
}

