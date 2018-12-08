package com.example.anggi.tubes;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.anggi.tubes.Fragment.Fragmen1;
import com.example.anggi.tubes.Fragment.Fragmen1;
import com.example.anggi.tubes.Fragment.Fragmen1;

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

        btnSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //membuat sebuah object baru dari framment 1
                Fragmen1 fs = new Fragmen1();
                gantiFragment(fs);
            }
        });
    }

    //membuatb fungsi supaya bisa dipanggil2
    public void  gantiFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //setelah punya fragment transaction, baru bisa menambah, mengurangi atau hapus fragment
        ft.add(R.id.frameFragment,fragment);
        ft.commit();
    }
}
