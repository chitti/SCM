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
public class UserForm extends org.apache.struts.action.ActionForm {
    
   private ArrayList actorList;
   

    public UserForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the actorList
     */
    public ArrayList getActorList() {
        return actorList;
    }

    /**
     * @param actorList the actorList to set
     */
    public void setActorList(ArrayList actorList) {
        this.actorList = actorList;
    }

   
}
