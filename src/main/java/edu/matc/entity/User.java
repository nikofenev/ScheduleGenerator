package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


/**
 * A class to represent a user.
 *
 * @author nfenev
 */
@Entity(name = "users")
public class User implements Serializable{
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int userid;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "performance")
    private int performance;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName   the first name
     * @param lastName    the last name
     * @param userid      the userid
     * @param userName    the user name
     * @param userPass    the user pass
     * @param jobTitle    the jobTitle
     * @param performance performance
     */
    public User(String firstName, String lastName, int userid, String userName, String userPass, String jobTitle, int performance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userid = userid;
        this.userName = userName;
        this.userPass = userPass;
        this.jobTitle = jobTitle;
        this.performance = performance;
    }


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public int getUserid() {
        return userid;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }

    /**
     * Gets userName.
     *
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets userName.
     *
     * @param userName the userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the userPass.
     *
     * @return userPass user pass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * Sets the userPass.
     *
     * @param userPass the userPass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * Gets the setJobTitle.
     *
     * @return jobTitle job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the userPass.
     *
     * @param jobTitle the userPass
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Gets the performance.
     *
     * @return performance performance
     */
    public int getPerformance() {
        return performance;
    }

    /**
     * Sets the perofrmance.
     *
     * @param performance the performance
     */
    public void setPerformance(int performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "User{" +
                "  firstName='"   + firstName + '\'' +
                ", lastName='"    + lastName + '\'' +
                ", userid='"      + userid + '\'' +
                ", userName='"    + userName + '\'' +
                ", jobTitle='"    + jobTitle + '\'' +
                ", performance='" + performance + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        User thisUser = (User) obj;

        return thisUser.userid == userid //if userId are same
                && thisUser.firstName.equalsIgnoreCase(firstName) //if firstNames are same
                && thisUser.lastName.equalsIgnoreCase(lastName) // if lastNames are same
                && thisUser.userName.equalsIgnoreCase(userName); // if userNames are same
    }
}
