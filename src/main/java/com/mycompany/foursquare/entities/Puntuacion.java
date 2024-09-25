package com.mycompany.foursquare.entities;

public class Puntuacion {
    String comentario, user, lugar;
    boolean valido;
    int estrellas;

    public Puntuacion(String user, String lugar, String comentario, boolean valido, int estrellas) {
        this.comentario = comentario;
        this.user = user;
        this.lugar = lugar;
        this.valido = valido;
        this.estrellas = estrellas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    
}
