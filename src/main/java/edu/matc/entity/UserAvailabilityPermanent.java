package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The type User availability permanent.
 */
@Entity
@Table(name = "userAvailabilityPermanent")
public class UserAvailabilityPermanent implements Serializable {

    private int userAvailabilityId;
    private String work_day;
    private int availableFrom;
    private int availableTo;
    private User user_id;

    /**
     * Instantiates a new User availability permanent.
     */
    public UserAvailabilityPermanent() {
    }

    /**
     * Instantiates a new User availability permanent.
     *
     * @param userAvailabilityId the user availability id
     * @param work_day           the work day
     * @param availableFrom      the available from
     * @param availableTo        the available to
     */
    public UserAvailabilityPermanent(int userAvailabilityId, String work_day, int availableFrom, int availableTo) {
        this.userAvailabilityId = userAvailabilityId;
        this.work_day = work_day;
        this.availableFrom = availableFrom;
        this.availableTo = availableTo;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    @ManyToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id", nullable = false)
    public User getUser_id() {
        return user_id;
    }

    /**
     * Sets user id.
     *
     * @param user_id the user id
     */
    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    /**
     * Gets user availability id.
     *
     * @return the user availability id
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    public int getUserAvailabilityId() {
        return userAvailabilityId;
    }

    /**
     * Sets user availability id.
     *
     * @param userAvailabilityId the user availability id
     */
    public void setUserAvailabilityId(int userAvailabilityId) {
        this.userAvailabilityId = userAvailabilityId;
    }

    /**
     * Gets work day.
     *
     * @return the work day
     */
    @Basic
    @Column(name="work_day", nullable = true, length = 12)
    public String getWork_day() {
        return work_day;
    }

    /**
     * Sets work day.
     *
     * @param work_day the work day
     */
    public void setWork_day(String work_day) {
        this.work_day = work_day;
    }

    /**
     * Gets available from.
     *
     * @return the available from
     */
    @Basic
    @Column(name = "available_from", nullable = true)
    public int getAvailableFrom() {
        return availableFrom;
    }

    /**
     * Sets available from.
     *
     * @param availableFrom the available from
     */
    public void setAvailableFrom(int availableFrom) {
        this.availableFrom = availableFrom;
    }

    /**
     * Gets available to.
     *
     * @return the available to
     */
    @Basic
    @Column(name = "available_to", nullable = true)
    public int getAvailableTo() {
        return availableTo;
    }

    /**
     * Sets available to.
     *
     * @param availableTo the available to
     */
    public void setAvailableTo(int availableTo) {
        this.availableTo = availableTo;
    }


    @Override
    public String toString() {
        return "UserAvailabilityPermanent{" +
                "userAvailabilityId=" + userAvailabilityId +
                ", work_day='" + work_day + '\'' +
                ", availableFrom=" + availableFrom +
                ", availableTo=" + availableTo +
                '}';
    }
}
