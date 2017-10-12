package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "userAvailabilityPermanent")
public class UserAvailabilityPermanent {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int userAvailabilityId;

    @Column(name="work_day")
    private String work_day;

    @Column(name="available_from")
    private int availableFrom;

    @Column(name="available_to")
    private int availableTo;

    public UserAvailabilityPermanent() {
    }

    public UserAvailabilityPermanent(int userAvailabilityId, String work_day, int availableFrom, int availableTo) {
        this.userAvailabilityId = userAvailabilityId;
        this.work_day = work_day;
        this.availableFrom = availableFrom;
        this.availableTo = availableTo;
    }

    public int getUserAvailabilityId() {
        return userAvailabilityId;
    }

    public void setUserAvailabilityId(int userAvailabilityId) {
        this.userAvailabilityId = userAvailabilityId;
    }

    public String getWork_day() {
        return work_day;
    }

    public void setWork_day(String work_day) {
        this.work_day = work_day;
    }

    public int getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(int availableFrom) {
        this.availableFrom = availableFrom;
    }

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
