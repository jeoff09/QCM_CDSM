package com.iia.jgodar.qcm.entity;

import java.io.Serializable;

/**
 * Created by jgodar on 09/10/2015.
 */
public class user implements Serializable{

    /**
     *
     */
    public static final String SERIAL = "USER";
    /**
     * User- ID
     */
    private int id;
    /**
     * User - Login
     */
    private String login;

    /**
     * User password
     */
    private String password;

    /**
     * User Email
     */
    private String email;

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
