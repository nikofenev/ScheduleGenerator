package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class UserHibernateDao {

    private final Logger logger = Logger.getLogger(this.getClass());

    /** Return a list of all users
     *
     * @return All users
     */
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            users = session.createCriteria(User.class).list();
        } catch (HibernateException he) {
            logger.error("Error getting all users", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return users;
    }

    /** Get a single user for the given id
     *
     * @param id user's id
     * @return User
     */
    public User getUser(int id) {
        User user = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            user = (User) session.get(User.class, id);
        } catch (HibernateException he) {
            logger.error("Error getting user with id: " + id, he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return user;
    }

    /** Retrieve users by lastname
     *
     * @param lastName User's last name which is the search criteria
     * @return User
     */
    public List<User> getUsersByLastName(String lastName) {
        List users = new ArrayList<User>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(User.class);
            criteria.add(Restrictions.eq("lastName", lastName));
            users = criteria.list();
        } catch (HibernateException he) {
            logger.error("Error getting all users with last name: " + lastName, he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return users;
    }

    /** save new user
     * @param user user to insert
     * @return id of the inserted user
     */
    public int insert(User user) {
        int id = 0;
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            id = (int) session.save(user);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    logger.error("Error rolling back save of user: " + user, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return id;
    }

    /** update  user
     * @param user user to update
     */
    public void update(User user) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(user);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    logger.error("Error rolling back save of user: " + user, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    /** delete  user
     * @param id user with id to delete
     */
    public void delete(int id) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            User user =
                    (User)session.get(User.class, id);
            session.delete(user);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    logger.error("Error rolling back deleting of user: " + id, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
