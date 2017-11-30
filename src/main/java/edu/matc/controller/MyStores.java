package edu.matc.controller;

import edu.matc.entity.Store;
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


/**
 * Servlet for myEmployees
 *
 * @author nfenev
 */
@WebServlet(
        urlPatterns = {"/myStores"}
)

public class MyStores extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        IGenericService<Store> storeIGenericService;
        storeIGenericService = new GenericServiceImpl<>(
                Store.class, HibernateUtil.getSessionFactory());

        List<Store> listStores = storeIGenericService.getAll();

        req.setAttribute("allStores", listStores);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/myStores.jsp");
        dispatcher.forward(req, resp);
    }
}
