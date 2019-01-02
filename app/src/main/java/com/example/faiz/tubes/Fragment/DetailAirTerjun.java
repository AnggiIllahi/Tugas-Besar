package com.example.faiz.tubes.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.faiz.tubes.R;

public class DetailAirTerjun extends AppCompatActivity {
    private TextView judul,link,deskripsi;
    private ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_air_terjun);

        Intent i = getIntent();
        final String deskripsis = i.getExtras().getString("deskripsi");
        final String juduls = i.getExtras().getString("judul");
        final String links = i.getExtras().getString("link");
        final int gambarK = i.getExtras().getInt("gambar");

        deskripsi = (TextView) findViewById(R.id.deskripsi);
        judul = (TextView) findViewById(R.id.judul);
        link = (TextView) findViewById(R.id.link);
        gambar = (ImageView) findViewById(R.id.gambarku);

//        judul.setText("judul : " + juduls);
//        link.setText("link : " + links);
//        gambar.setImageResource(gambarK);
        deskripsi.setText(deskripsis);
        judul.setText(juduls);
        link.setText(links);
        gambar.setImageResource(gambarK);
    }
}
