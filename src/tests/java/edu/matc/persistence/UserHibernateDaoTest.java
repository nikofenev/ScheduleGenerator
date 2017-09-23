package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class UserHibernateDaoTest {

    private final Logger logger = Logger.getLogger(this.getClass());

    private UserHibernateDao userHibernateDao;
    private User userDummy; //Single dummy user for test
    private ArrayList userDummyArray; // Array of dummies for test

    @Before
    public void setUp() {
        userHibernateDao = new UserHibernateDao();
        userDummy = new User();
        userDummyArray = new ArrayList();

        userDummy.setFirstName("Nikolay");
        userDummy.setLastName("FeNEv");
        userDummy.setUserName("niko");
        userDummy.setUserPass("niko");
        userDummy.setUserid(2);

        userDummyArray.add(userDummy);

    }

    @Test
    public void getAllUsersTest() throws Exception {
        List<User> users = userHibernateDao.getAllUsers();
        assertEquals("Expected 2", 2, users.size());
    }

    @Test
    public void getUserTest() {
        User oneUser = userHibernateDao.getUser(1);
        assertNotNull(oneUser);
        logger.info(oneUser);
    }

    @Test
    public void getUserByLastNameTest() {
        List<User> userByLastName = userHibernateDao.getUsersByLastName("Fenev");
        logger.info(userByLastName);

        assertEquals("Same objects?",userDummyArray,userByLastName);
    }

    @Test
    public void insertTest() {
        int theReturnedIdOfInsertedUser = userHibernateDao.insert(userDummy);
        assertEquals("Does user id's match", userDummy.getUserid(),theReturnedIdOfInsertedUser);
        logger.info(userDummy.getUserid());
        logger.info(theReturnedIdOfInsertedUser);
    }

    @Test
    public void updateTest() {
        userDummy.setFirstName("Nikolay");

        userHibernateDao.update(userDummy);

        //assertEquals("Original name Nikolay, did it update?", "Messi", userDummy.getFirstName());
        //logger.info(userDummy);
    }

    @Test
    public void deleteTest() {
        List<User> usersBeforeDelete = userHibernateDao.getAllUsers();
        userHibernateDao.delete(3);
        List<User> usersAfterDelete = userHibernateDao.getAllUsers();

        assertEquals("Expected 1 less than user in DB",usersBeforeDelete.size() - 1, usersAfterDelete.size());
    }
}