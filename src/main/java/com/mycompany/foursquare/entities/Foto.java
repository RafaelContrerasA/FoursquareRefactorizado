package com.mycompany.foursquare.entities;

public class Foto {
    private int id;
    private String foto;
    private int fotocol;
    private String lugar_name, usuario_user;

    public Foto(int id, String foto, int fotocol, String lugar_name, String usuario_user) {
        this.id = id;
        this.foto = foto;
        this.fotocol = fotocol;
        this.lugar_name = lugar_name;
        this.usuario_user = usuario_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getFotocol() {
        return fotocol;
    }

    public void setFotocol(int fotocol) {
        this.fotocol = fotocol;
    }

    public String getLugar_name() {
        return lugar_name;
    }

    public void setLugar_name(String lugar_name) {
        this.lugar_name = lugar_name;
    }

    public String getUsuario_user() {
        return usuario_user;
    }

    public void setUsuario_user(String usuario_user) {
        this.usuario_user = usuario_user;
    }
    
}
