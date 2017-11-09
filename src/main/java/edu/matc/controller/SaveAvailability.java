package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.entity.UserAvailabilityPermanent;
import edu.matc.persistence.GenericServiceImpl;
import edu.matc.persistence.HibernateUtil;
import edu.matc.persistence.IGenericService;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

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


        IGenericService<UserAvailabilityPermanent> availabilityService = new GenericServiceImpl<>(
                UserAvailabilityPermanent.class, HibernateUtil.getSessionFactory());

        IGenericService<User> userService = new GenericServiceImpl<>(
                User.class, HibernateUtil.getSessionFactory());

        UserAvailabilityPermanent currentAvailability = new UserAvailabilityPermanent();

        String currentUserNameLoggedIn = req.getRemoteUser();
        logger.info("Current UserName Logged In: " + currentUserNameLoggedIn);

        Map<String, Object> params = new HashMap<>();
        String hsqlQuery = "from users where userName='" + currentUserNameLoggedIn + "'";
        List<User> returnedUsers = userService.query(hsqlQuery, params);

        for (User user : returnedUsers) {
            logger.info("The User that is logged in: " + user.toString());
            currentAvailability.setUser_id(user);
        }

        Map map = req.getParameterMap();

        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            String paramName = (String) entry.getKey();
            String[] values = (String[]) entry.getValue();
            logger.info("paramName: " + paramName);

            for (String value : values) {
                logger.info("Value: " + value);

                if(paramName.contains("Date")) {
                    logger.info("Date: " + value);
                    String dayOfWeek = paramName.substring(0, paramName.length() - 4);
                    currentAvailability.setWork_day(dayOfWeek);
                    logger.info("Day: " + dayOfWeek);
                }

                if(paramName.contains("From")) {
                    logger.info("From: " + value);
                    String from = value.substring(0, value.length() - 6);
                    int fromInt = Integer.parseInt(from);
                    currentAvailability.setAvailableFrom(fromInt);
                }

                if(paramName.contains("To")) {
                    //logger.info("To: " + value);
                    String to = value.substring(0, value.length() - 6);
                    int toInt = Integer.parseInt(to);
                    currentAvailability.setAvailableTo(toInt);
                }

                if (value.contains("perm")) {
                    logger.info("type: " + value);
                    availabilityService.save(currentAvailability);
                }

            }
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}
