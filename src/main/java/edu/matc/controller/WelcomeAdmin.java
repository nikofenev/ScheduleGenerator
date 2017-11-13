package edu.matc.controller;

import edu.matc.entity.Holiday;
import edu.matc.entity.HolidaysAPI;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


/** Servlet for admin.
 * @author nfenev
 */

@WebServlet(
        urlPatterns = {"/welcomeAdmin"}
)

public class WelcomeAdmin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HolidaysAPI holidays = new HolidaysAPI();
        ArrayList<Holiday> listHolidays;
        listHolidays = holidays.holidaysUSMonthly();

        req.setAttribute("listHolidays", listHolidays);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/adminLoggedIn.jsp");
        dispatcher.forward(req, resp);
    }
}
