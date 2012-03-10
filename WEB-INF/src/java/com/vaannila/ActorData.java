/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaannila;

import java.util.ArrayList;

/**
 *
 * @author eswar@vaannila.com
 */
public class ActorData {

    private String tvShow;
    private String userName;
    private String emailId;

    public ActorData()
    {
        
    }
    
    public ActorData(String tvShow, String userName, String emailId)
    {
        this.tvShow = tvShow;
        this.userName = userName;
        this.emailId = emailId;
    }

    public ArrayList loadData()
    {
        ArrayList userList = new ArrayList();
        userList.add(new ActorData("The Office","Michael Scott","michael.scott@dundermifflin.com"));
        userList.add(new ActorData("The Office","Dwight Schrute","dwight.schrute@dundermifflin.com"));
        userList.add(new ActorData("The Office","Jim Halpert","jim.halpert@dundermifflin.com"));
        userList.add(new ActorData("The Office","Pam Beesly","pam.beesly@dundermifflin.com"));
        userList.add(new ActorData("The Office","Andy Bernad","andy.bernad@dundermifflin.com"));
        userList.add(new ActorData("The Office","Angela Martin","angela.martin@dundermifflin.com"));
        userList.add(new ActorData("Friends","Rachel Green","rachel.green@friends.com"));
        userList.add(new ActorData("Friends","Monica Geller","monica.geller@friends.com"));
        userList.add(new ActorData("Friends","Phoebe Buffay","phoebe.buffay@friends.com"));
        userList.add(new ActorData("Friends","Joey Tribbiani","joey.tribbiani@friends.com"));
        userList.add(new ActorData("Friends","Chandler Bing","chandler.bing@friends.com"));
        userList.add(new ActorData("Friends","Ross Geller","ross.geller@friends.com"));
        return userList;
    }

    /**
     * @return the tvShow
     */
    public String getTvShow() {
        return tvShow;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }
 
}
