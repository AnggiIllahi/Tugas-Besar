package com.example.anggi.tubes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASUS on 12-Oct-17.
 */

public class adapter_airterjun extends RecyclerView.Adapter<adapter_airterjun.MyViewHolder> {
    List<model_airterjun> listRiwayat; //memanggil list dari model_airterjun


    public adapter_airterjun(List<model_airterjun> listRiwayat) {
        this.listRiwayat = listRiwayat;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.isi_rv,parent,false); //memangil layout yg berisi isi dr RV
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        model_airterjun riwayat = this.listRiwayat.get(position); //deklarasi model_airterjun utk getlistRiwayat
        //() memanggil getter dr model_airterjun
//        holder.namaS.setText(Integer.toString(riwayat.getHarga()));
        holder.deskripsi.setText(riwayat.getDeskripsi());
        holder.judul.setText(riwayat.getJudul());
        holder.link.setText(riwayat.getLink());
        holder.fotoku.setImageResource(riwayat.getFoto());

    }

    @Override
    public int getItemCount() {
        return listRiwayat.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView deskripsi,judul,link;
        public ImageView fotoku;

             public MyViewHolder(View itemView) {
                super(itemView);

                deskripsi = (TextView) itemView.
                         findViewById(R.id.deskripsi);
                judul = (TextView) itemView.
                        findViewById(R.id.judul);
                link = (TextView) itemView.
                        findViewById(R.id.link);
                fotoku = (ImageView) itemView.
                         findViewById(R.id.foto);
             }
        }
    }

