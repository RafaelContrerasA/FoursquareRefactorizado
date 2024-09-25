package com.mycompany.foursquare.entities;

public class Lugar {
    private String name, ciudad, estado, descripcion;
    private int cp, numeroext, numeroint;
    private String colonia, calle, etiquetas;
    private boolean valido;
    private String user;
    private float calif;

    public Lugar(String name, String ciudad, String estado, int cp, int numeroext, int numeroint, String colonia, String calle, String etiquetas , String descripcion, boolean valido, String user, float calif) {
        this.name = name;
        this.ciudad = ciudad;
        this.estado = estado;
        this.cp = cp;
        this.numeroext = numeroext;
        this.numeroint = numeroint;
        this.colonia = colonia;
        this.calle = calle;
        this.etiquetas = etiquetas;
        this.valido = valido;
        this.user = user;
        this.descripcion = descripcion;
        this.calif = calif;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getNumeroext() {
        return numeroext;
    }

    public void setNumeroext(int numeroext) {
        this.numeroext = numeroext;
    }

    public int getNumeroint() {
        return numeroint;
    }

    public void setNumeroint(int numeroint) {
        this.numeroint = numeroint;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public float getCalif() {
        return calif;
    }

    public void setCalif(float calif) {
        this.calif = calif;
    }
    
}
