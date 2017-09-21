package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UserHibernateDaoTest {


    private final Logger logger = Logger.getLogger(this.getClass());

    UserHibernateDao userHibernateDao;

    @Before
    public void setUp() {
        userHibernateDao = new UserHibernateDao();
    }

    @Test
    public void getAllUsersTest() throws Exception {
        List<User> users = userHibernateDao.getAllUsers();
        assertEquals("Expected 2", 2, users.size());
    }

    @Test
    public void getUserTest() {
        User oneUser = userHibernateDao.getUser(2);
        assertNotNull(oneUser);
        logger.info(oneUser);
    }

    @Test
    public void getUserByLastNameTest() {
        List<User> userByLastName = userHibernateDao.getUsersByLastName("Fenev");
        logger.info(userByLastName);
        User niko = new User();

        niko.setFirstName("Niklay");
        niko.setLastName("Fenev");
        niko.setUserid(2);
        niko.setUserName("niko");

        List<User> userNiko = new ArrayList();
        userNiko.add(niko);

        assertEquals(userNiko,userByLastName);
    }
}