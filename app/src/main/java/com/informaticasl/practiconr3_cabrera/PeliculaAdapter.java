package com.informaticasl.practiconr3_cabrera;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.informaticasl.practiconr3_cabrera.modelo.Pelicula;

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
      //  holder.tvDetalle.setText(peliculaArrayList.get(position).getDetallePeli());
        holder.ivFoto.setImageResource(peliculaArrayList.get(position).getFoto());


    }

    @Override
    public int getItemCount() {
        return peliculaArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNombre, tvDetalle;
        private ImageView ivFoto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.textViewNombre);
           // tvDetalle = itemView.findViewById(R.id.textViewDetalle);
            ivFoto = itemView.findViewById(R.id.ivFoto);
        }
    }
}
