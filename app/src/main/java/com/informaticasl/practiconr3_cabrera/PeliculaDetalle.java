package com.informaticasl.practiconr3_cabrera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PeliculaDetalle extends AppCompatActivity {
    private MovieViewModel mViewModel;
    private ImageView ivCover;
    private TextView tvTitle, tvSummary, tvCast, tvDirector;
    private int idMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula_detalle);
    }

    private void initializeViews() {
        ivCover = findViewById(R.id.ivCoverDetails);
        tvTitle = findViewById(R.id.tvTitleDetails);
        tvSummary = findViewById(R.id.tvSummaryDetails);
        tvCast = findViewById(R.id.tvCast);
        tvDirector = findViewById(R.id.tvDirector);
    }

    private void loadMovieDetails() {
        Movie m = mViewModel.getById(idMovie);
        // TODO: VER SI SE PUEDE LLEVAR EL IF AL VIEWMODEL
        if (m != null) {
            ivCover.setImageResource(m.getIdCover());
            tvTitle.setText(m.getTitle());
            tvSummary.setText(m.getBody());
            tvCast.setText(m.getCast());
            tvDirector.setText(m.getDirector());
        } else {
            /* TODO: HACER OTRA ACTIVITY O LLENAR LOS VIEWS CON DATOS GENÉRICOS
             *   O HACER UN MUTABLE DATA CON ALGÚN BOOLEANO */
            Log.d("movie", "loadMovieDetails: No se encontró película");
        }
    }
}