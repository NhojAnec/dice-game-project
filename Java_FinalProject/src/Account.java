/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NhojAnec
 */
public class Account {

    private String username;
    private String displayname;

    public Account() {
        this.username = "";
        this.displayname = "";
    }

    public Account(String username, String displayname) {
        this.username = username;
        this.displayname = displayname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
}
