package org.am.springbootrestjpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The User class.
 *
 * @author Alexander Maximenya
 * @version 2017-12-13
 */
@Entity
public class User {
    @Id
    private Integer id;
    private String userName;
    private String firstName;
    private String lastName;
    private String notes;

    public User() {
    }

    public User(Integer id, String userName, String firstName, String lastName, String notes) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
