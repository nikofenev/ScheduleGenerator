package edu.matc.controller;

import edu.matc.entity.DropDownWithAllHours;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/** Servlet for user.
 * @author nfenev
 */

@WebServlet(
        urlPatterns = {"/welcomeUser"}
)

public class WelcomeUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DropDownWithAllHours stringWithAllHours = new DropDownWithAllHours();
        StringBuilder allHoursString = stringWithAllHours.dropDownListWithHours();

        req.setAttribute("hoursList", allHoursString);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/userLoggedIn.jsp");
        dispatcher.forward(req, resp);
    }
}
