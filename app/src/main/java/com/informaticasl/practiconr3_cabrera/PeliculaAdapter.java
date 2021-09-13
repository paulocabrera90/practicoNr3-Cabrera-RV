package com.informaticasl.practiconr3_cabrera;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.informaticasl.practiconr3_cabrera.modelo.Pelicula;

import java.io.Serializable;
import java.util.ArrayList;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder>{
    private ArrayList<Pelicula> peliculaArrayList;
    private Context context;
    private LayoutInflater layoutInflater;

    public PeliculaAdapter(ArrayList<Pelicula> peliculaArrayList) {
        this.peliculaArrayList = peliculaArrayList;
    }



    public PeliculaAdapter(ArrayList<Pelicula> peliculaArrayList, Context context, LayoutInflater layoutInflater) {
        this.peliculaArrayList = peliculaArrayList;
        this.context = context;
        this.layoutInflater = layoutInflater;

    }

    @NonNull
    @Override
    public PeliculaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_pelicula, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvNombre.setText(peliculaArrayList.get(position).getNombrePeli());
        holder.tvDetalleShort.setText(peliculaArrayList.get(position).getDetallePeli().substring(0,150)+"...");
        holder.ivFoto.setImageResource(peliculaArrayList.get(position).getFoto());
        Pelicula peli = new Pelicula();
        peli = peliculaArrayList.get(position);
        Pelicula finalPeli = peli;
        holder.btnDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detallePelicula = new Intent(context, PeliculaDetalle.class);
                detallePelicula.putExtra("nombre", finalPeli.getNombrePeli());
                detallePelicula.putExtra("imagen", finalPeli.getFoto());
                detallePelicula.putExtra("detalle", finalPeli.getDetallePeli());
                detallePelicula.putExtra("actores", finalPeli.getActores());
                detallePelicula.putExtra("anio", finalPeli.getAnio());
                detallePelicula.putExtra("genero", finalPeli.getGenero());

               // Bundle bundle = new Bundle();
                //bundle.putSerializable("peli", (Serializable) finalPeli);
               // detallePelicula.putExtras(bundle);

                context.startActivity(detallePelicula);
            }
        });
    }

    @Override
    public int getItemCount() {
        return peliculaArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNombre, tvDetalleShort, tvDetalle;
        private ImageView ivFoto;
        private Button btnDetalle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.textViewNombre);
            tvDetalleShort = itemView.findViewById(R.id.textViewDetalleShort);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            btnDetalle = itemView.findViewById(R.id.btnDetalle);

        }
    }
}
