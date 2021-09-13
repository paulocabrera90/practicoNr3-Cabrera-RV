package com.informaticasl.practiconr3_cabrera.modelo;

public class Pelicula {
    private String nombrePeli;
    private String detallePeli;
    private int anio;
    private int foto;
    private String actores;
    private String genero;


    public Pelicula() {
    }

    public Pelicula(String nombrePeli, String detallePeli, int anio, int foto, String actores, String genero) {
        this.nombrePeli = nombrePeli;
        this.detallePeli = detallePeli;
        this.anio = anio;
        this.foto = foto;
        this.actores = actores;
        this.genero = genero;
    }

    public Pelicula(String nombrePeli, String detallePeli, int anio, int foto) {
        this.nombrePeli = nombrePeli;
        this.detallePeli = detallePeli;
        this.anio = anio;
        this.foto = foto;
    }

    public String getNombrePeli() {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    public String getDetallePeli() {
        return detallePeli;
    }

    public void setDetallePeli(String detallePeli) {
        this.detallePeli = detallePeli;
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

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
