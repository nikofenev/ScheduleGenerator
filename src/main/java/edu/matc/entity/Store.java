package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/** The stores Class
 * @author nfenev
 */
@Entity
@Table(name = "stores")
public class Store {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int storeId;

    @Column(name = "store_name")
    private String storeName;

    @Column(name = "day_of_week")
    private Date dayOfWeek;

    @Column(name = "open_time")
    private int openTime;

    @Column(name = "close_time")
    private int closeTime;

    /**
     * Instantiates a new Store.
     */
    public Store() {
    }

    /**
     * Instantiates a new Store.
     *
     * @param storeId the store id
     * @param storeName the store name
     * @param dayOfWeek the day of the week
     * @param openTime  the open time
     * @param closeTime the close time
     */
    public Store(int storeId, String storeName, Date dayOfWeek, int openTime, int closeTime) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.dayOfWeek = dayOfWeek;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    /**
     * Get the store id
     * @return storeId
     */
    public int getStoreId() {
        return storeId;
    }

    /**
     * Sets the storeId
     * @param storeId for the storeId
     */
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    /**
     * Get the storeName
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the storeName
     * @param storeName for the storeName
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * Get the dayOfTheWeek
     * @return dayOfWeek
     */
    public Date getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Set the dayOfWeek
     * @param dayOfWeek for the dayOfWeek
     */
    public void setDayOfWeek(Date dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * Get the openTime
     * @return openTime
     */
    public int getOpenTime() {
        return openTime;
    }

    /**
     * Set the openTime
     * @param openTime for the openTime
     */
    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    /**
     * Get the closeTime
     * @return closeTime
     */
    public int getCloseTime() {
        return closeTime;
    }

    /**
     * Set the closeTime
     * @param closeTime for the closeTime
     */
    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "  storeId='"     + storeId   + '\'' +
                ", storeName='"   + storeName + '\'' +
                ", dayOfWeek='"   + dayOfWeek + '\'' +
                ", openTime='"    + openTime  + '\'' +
                ", closeTime='"   + closeTime + '\'' +
                '}';
    }

}
