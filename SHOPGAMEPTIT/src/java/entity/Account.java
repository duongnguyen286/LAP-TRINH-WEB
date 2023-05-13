/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Duong Nguyen
 */
public class Account {
    private int uID;
    private String username;
    private String pass;
    private int isAdmin;
    private String email;

    public Account() {
    }

    public Account(int uID, String username, String pass, int isAdmin, String email) {
        this.uID = uID;
        this.username = username;
        this.pass = pass;
        this.isAdmin = isAdmin;
        this.email = email;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" + "uID=" + uID + ", username=" + username + ", pass=" + pass + ", isAdmin=" + isAdmin + ", email=" + email + '}';
    }
    
}

