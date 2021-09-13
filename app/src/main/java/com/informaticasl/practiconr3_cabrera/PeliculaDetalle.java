package com.informaticasl.practiconr3_cabrera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.informaticasl.practiconr3_cabrera.modelo.Pelicula;

public class PeliculaDetalle extends AppCompatActivity {
    Pelicula pelicula;

    private ImageView ivFoto;
    private TextView tvNombre, tvDetalle, tvActores, tvGenero, tvAnio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula_detalle);
        init();//recupero los valores del Adapter e inicio los componentes

        cargarComponentes();

    }

    private void init() {

        pelicula = new Pelicula();
        pelicula.setNombrePeli(getIntent().getStringExtra("nombre"));
        pelicula.setDetallePeli(getIntent().getStringExtra("detalle"));
        pelicula.setActores(getIntent().getStringExtra("actores"));
        pelicula.setFoto(getIntent().getIntExtra("imagen", 0));
        pelicula.setAnio(getIntent().getIntExtra("anio", 2021));
        pelicula.setGenero(getIntent().getStringExtra("anio"));

        tvNombre = findViewById(R.id.textViewTitulo);
        tvDetalle = findViewById(R.id.textViewDetalleCompleto);
        ivFoto = findViewById(R.id.ivFotoDetalle);
        tvActores = findViewById(R.id.textViewActores);
        tvAnio = findViewById(R.id.textViewAnio);
        tvGenero = findViewById(R.id.textViewGenero);
    }

    private void cargarComponentes(){
        tvNombre.setText(pelicula.getNombrePeli());
        tvDetalle.setText(pelicula.getDetallePeli());
        ivFoto.setImageResource(pelicula.getFoto());
        tvActores.setText("Actores: " + pelicula.getActores());
        tvAnio.setText("Año: " + new String(String.valueOf(pelicula.getAnio())));
        tvGenero.setText("Genero: " + pelicula.getGenero());
    }
}