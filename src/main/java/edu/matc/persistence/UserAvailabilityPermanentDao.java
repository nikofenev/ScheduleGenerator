package edu.matc.persistence;

import edu.matc.entity.UserAvailabilityPermanent;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class UserAvailabilityPermanentDao {

    private final Logger logger = Logger.getLogger(this.getClass());


    /** Return a list of all availability
     *
     * @return All Availability
     */
    public List<UserAvailabilityPermanent> getAllAvailability() {
        List<UserAvailabilityPermanent> allAvailability = new ArrayList<UserAvailabilityPermanent>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            allAvailability = session.createCriteria(UserAvailabilityPermanent.class).list();
        } catch (HibernateException he) {
            logger.error("Error getting all availability", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return allAvailability;
    }

    /** save new availability
     * @param availabilityPermanent availability to insert
     * @return id of the inserted availability
     */
    public int insertAvailability(UserAvailabilityPermanent availabilityPermanent) {
        int id = 0;
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            id = (int) session.save(availabilityPermanent);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    logger.error("Error rolling back save of availability: " + availabilityPermanent, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return id;
    }

    /** update  availability
     * @param availability user to update
     */
    public void update(UserAvailabilityPermanent availability) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(availability);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    logger.error("Error rolling back save of availability: " + availability, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
