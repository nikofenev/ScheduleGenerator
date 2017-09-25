package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.entity.dropDownWithAllHours;
import edu.matc.persistence.UserHibernateDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** Servlet for the index
 *  web page.
 * @author nfenev
 */

@WebServlet(
        urlPatterns = {"/welcomeUser"}
)

public class welcomeUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Map<String, String> messages = new HashMap<String, String>();

        if (username == null || username.isEmpty()) {
            messages.put("username", "Please enter username");
        }

        if (password == null || password.isEmpty()) {
            messages.put("password", "Please enter password");
        }

        if (messages.isEmpty()) {

            //authentication here

        }

        dropDownWithAllHours stringWithAllHours = new dropDownWithAllHours();
        StringBuilder allHoursString = stringWithAllHours.dropDownListWithHours();

        req.setAttribute("hoursList", allHoursString);
        req.setAttribute("messages", messages);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/userLoggedIn.jsp");
        dispatcher.forward(req, resp);
    }
}