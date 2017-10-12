package edu.matc.controller;

import edu.matc.entity.UserAvailabilityPermanent;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
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

        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            String name = (String) entry.getKey();
            String[] values = (String[]) entry.getValue();
            logger.info("paramName: " + name);

            for (String value : values) {
                logger.info("Value: " + value);

                if (name.contains("Type") && value.equals("Permanent")) {
                    //TODO insert the availability to Permanent Table
                } else if (name.equals("sundayType") && value.equals("Temporary")) {
                    //TODO insert the availability to Temporary Table
                }


            }
        }




        //String sundayDate = req.getParameter("sundayDate");
        //String sundayFrom = req.getParameter("sundayFrom");
        //String sundayTo = req.getParameter("sundayTo");
        //String sundayType = req.getParameter("sundayType");
//
        //if (sundayType == "permanent") {
        //    permanentAvailability.setWork_day("Sunday");
        //    permanentAvailability.setAvailableFrom(intsundayFrom);
        //}
//
        //String mondayDate = req.getParameter("mondayDate");
        //String mondayFrom = req.getParameter("mondayFrom");
        //String mondayTo = req.getParameter("mondayTo");
        //String mondayType = req.getParameter("mondayType");


        RequestDispatcher dispatcher = req.getRequestDispatcher("");
        dispatcher.forward(req, resp);
    }
}
