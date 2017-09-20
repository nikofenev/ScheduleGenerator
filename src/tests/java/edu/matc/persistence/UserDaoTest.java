package edu.matc.persistence;

import edu.matc.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class UserDaoTest {

    UserDao userDao;

    Logger logger;

    @Before
    public void setup() throws Exception {
        userDao = new UserDao();
    }

    @Test
    public void getAllUsersTest() throws Exception {
        List<User> usersList = userDao.getAllUsers();
        assertEquals("All users", 2, usersList.size());
    }

}