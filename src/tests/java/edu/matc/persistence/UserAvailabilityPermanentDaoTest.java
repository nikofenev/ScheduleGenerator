package edu.matc.persistence;

import edu.matc.entity.UserAvailabilityPermanent;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserAvailabilityPermanentDaoTest {

    private final Logger logger = Logger.getLogger(this.getClass());

    UserAvailabilityPermanentDao userAvailabilityPermanentDao;
    UserAvailabilityPermanent someAvailability;

    @Before
    public void setUp() {
        userAvailabilityPermanentDao = new UserAvailabilityPermanentDao();
        someAvailability = new UserAvailabilityPermanent();
        someAvailability.setWork_day("Monday");
        someAvailability.setAvailableFrom(8);
        someAvailability.setAvailableTo(17);

    }

    @Test
    public void insertAvailability() throws Exception {
        int theIdOfInsertedAvailability = userAvailabilityPermanentDao.insertAvailability(someAvailability);
        assertEquals(2, theIdOfInsertedAvailability);
    }

    @Test
    public void getAllAvailabilitySuccess() throws Exception {
        List<UserAvailabilityPermanent> allAvailability = userAvailabilityPermanentDao.getAllAvailability();
        assertEquals("Number of returned records",1, allAvailability.size());
    }

    @Test
    public void updateAvailabilitySuccess() {
        someAvailability.setWork_day("Sunday");
        someAvailability.setAvailableFrom(7);
        someAvailability.setAvailableTo(10);
        someAvailability.setUserAvailabilityId(1);

        userAvailabilityPermanentDao.update(someAvailability);
        assertEquals("The updated availableFrom hour",7, someAvailability.getAvailableFrom());
        assertEquals("The updated work day", "Sunday", someAvailability.getWork_day());

    }
}
