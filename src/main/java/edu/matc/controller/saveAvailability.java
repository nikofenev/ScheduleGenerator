package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.entity.dropDownWithAllHours;
import edu.matc.persistence.UserHibernateDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/** Servlet for the index
 *  web page.
 * @author nfenev
 */

@WebServlet(
        urlPatterns = {"/saveAvailability"}
)

public class saveAvailability extends HttpServlet {
    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String[]> map = req.getParameterMap();

        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            logger.info(entry.getKey());
            logger.info(entry.getValue());
        }

        /* String sundayFrom = req.getParameter("sundayFrom");
        String sundayTo = req.getParameter("sundayTo");
        String sundayType = req.getParameter("sundayType");

        String mondayFrom = req.getParameter("mondayFrom");
        String mondayTo = req.getParameter("mondayTo");
        String mondayType = req.getParameter("mondayType");
        */


        RequestDispatcher dispatcher = req.getRequestDispatcher("");
        dispatcher.forward(req, resp);
    }
}
