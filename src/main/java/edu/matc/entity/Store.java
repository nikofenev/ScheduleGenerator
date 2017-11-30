package edu.matc.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * The stores Class
 *
 * @author nfenev
 */
@Entity
@Table(name = "stores")
public class Store {

    private int storeId;
    private String storeName;

    /**
     * Instantiates a new Store.
     */
    public Store() {
    }

    /**
     * Instantiates a new Store.
     *
     * @param storeId   the store id
     * @param storeName the store name
     */
    public Store(int storeId, String storeName) {
        this.storeId = storeId;
        this.storeName = storeName;
    }

    /**
     * Gets store id.
     *
     * @return the store id
     */
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    public int getStoreId() {
        return storeId;
    }

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    /**
     * Gets store name.
     *
     * @return the store name
     */
    @Column(name="store_name")
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets store name.
     *
     * @param storeName the store name
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

}
