package com.example.faiz.tubes;


import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.faiz.tubes.Fragment.Fragmen1;
import com.example.faiz.tubes.Fragment.Fragmen2;
import com.example.faiz.tubes.Fragment.Fragmen3;
import com.example.faiz.tubes.Fragment.FragmenIsiBeranda;

public class beranda extends AppCompatActivity {
    Button btnSatu,btnDua,btnTiga;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        //codingan setelah set content view
        //panggil button
        btnSatu = findViewById(R.id.button1);
        btnDua = findViewById(R.id.button2);
        btnTiga = findViewById(R.id.button3);

        FragmenIsiBeranda fs = new FragmenIsiBeranda();
        gantiFragment(fs);

        btnSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //membuat sebuah object baru dari framment 1
                Fragmen1 fs = new Fragmen1();
                gantiFragment(fs);
            }
        });

        btnDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragmen2 fd = new Fragmen2();
                gantiFragment(fd);
            }
        });

        btnTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Fragmen3 ft = new Fragmen3();
                //gantiFragment(ft);
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.setComponent(new ComponentName("com.ti3h.maingambar","com.ti3h.maingambar.MainGambar"));
                startActivity(intent);
            }
        });




    }

    //membuatb fungsi supaya bisa dipanggil2
    public void  gantiFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //setelah punya fragment transaction, baru bisa menambah, mengurangi atau hapus fragment
        ft.replace(R.id.frameFragment,fragment);
        ft.commit();
    }
}
