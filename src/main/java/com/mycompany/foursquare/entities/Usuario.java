package com.mycompany.foursquare.entities;

import org.json.simple.JSONObject;

public class Usuario {
    private String user, pass, pic;
    private boolean admin;

    public Usuario(JSONObject jobject) {
        this.user = jobject.get("user").toString();
        this.pass = jobject.get("pass").toString();
        this.pic = jobject.get("pic") != null ? jobject.get("pic").toString() : null;
        this.admin = Integer.parseInt(jobject.get("admin").toString()) == 1;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
}
