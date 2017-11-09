package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.GenericServiceImpl;
import edu.matc.persistence.HibernateUtil;
import edu.matc.persistence.IGenericService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/** Servlet for myEmployees
 * @author nfenev
 */

@WebServlet(
        urlPatterns = {"/myEmployees"}
)

public class MyEmployees extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        IGenericService<User> userService;
        userService = new GenericServiceImpl<>(
                User.class, HibernateUtil.getSessionFactory());

        List<User> users = userService.getAll();

        req.setAttribute("allUsers", users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/myEmployees.jsp");
        dispatcher.forward(req, resp);
    }
}
