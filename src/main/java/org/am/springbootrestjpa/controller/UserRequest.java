package org.am.springbootrestjpa.controller;

/**
 * The UserRequest class.
 *
 * @author Alexander Maximenya
 * @version 2017-12-13
 */
public class UserRequest {
    private String userName;
    private String firstName;

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
}
