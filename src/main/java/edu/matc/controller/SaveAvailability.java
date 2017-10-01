package edu.matc.controller;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/** Servlet for the index
 *  web page.
 * @author nfenev
 */

@WebServlet(
        urlPatterns = {"/saveAvailability"}
)

public class SaveAvailability extends HttpServlet {
    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map map = req.getParameterMap();
        for (Object o : map.keySet()) {
            String key = (String) o;
            String[] value = (String[]) map.get(key);
            logger.info(key);
            for (String item : value) {
                logger.info(item);
            }
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
