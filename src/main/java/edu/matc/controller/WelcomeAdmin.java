package edu.matc.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/** Servlet for admin.
 * @author nfenev
 */

@WebServlet(
        urlPatterns = {"/welcomeAdmin"}
)

public class WelcomeAdmin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        RequestDispatcher dispatcher = req.getRequestDispatcher("/adminLoggedIn.jsp");
        dispatcher.forward(req, resp);
    }
}
