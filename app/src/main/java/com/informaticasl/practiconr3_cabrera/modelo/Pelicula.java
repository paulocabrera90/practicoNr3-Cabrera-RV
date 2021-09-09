package com.informaticasl.practiconr3_cabrera.modelo;

public class Pelicula {
    private String nombre;
    private String detalle;
    private int anio;
    private int foto;


    public Pelicula() {
    }

    public Pelicula(String nombre, String detalle, int anio, int foto) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.anio = anio;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
