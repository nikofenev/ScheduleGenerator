package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "userAvailabilityPermanent")
public class UserAvailabilityPermanent implements Serializable {

    private int userAvailabilityId;
    private String work_day;
    private int availableFrom;
    private int availableTo;
    private User user_id;

    public UserAvailabilityPermanent() {
    }

    public UserAvailabilityPermanent(int userAvailabilityId, String work_day, int availableFrom, int availableTo) {
        this.userAvailabilityId = userAvailabilityId;
        this.work_day = work_day;
        this.availableFrom = availableFrom;
        this.availableTo = availableTo;
    }

    @ManyToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id", nullable = false)
    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    public int getUserAvailabilityId() {
        return userAvailabilityId;
    }

    public void setUserAvailabilityId(int userAvailabilityId) {
        this.userAvailabilityId = userAvailabilityId;
    }

    @Basic
    @Column(name="work_day", nullable = true, length = 12)
    public String getWork_day() {
        return work_day;
    }

    public void setWork_day(String work_day) {
        this.work_day = work_day;
    }

    @Basic
    @Column(name = "available_from", nullable = true)
    public int getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(int availableFrom) {
        this.availableFrom = availableFrom;
    }

    @Basic
    @Column(name = "available_to", nullable = true)
    public int getAvailableTo() {
        return availableTo;
    }

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
