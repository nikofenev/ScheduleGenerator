package edu.matc.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/** The stores Class
 * @author nfenev
 */
@Entity
@Table(name = "stores")
public class Store {

    private int storeId;
    private String storeName;

    public Store() {
    }

    public Store(int storeId, String storeName) {
        this.storeId = storeId;
        this.storeName = storeName;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Column(name="store_name")
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

}
