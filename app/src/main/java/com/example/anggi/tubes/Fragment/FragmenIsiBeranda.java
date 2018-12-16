package com.example.anggi.tubes.Fragment;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.anggi.tubes.R;

public class FragmenIsiBeranda extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragmen_isi_beranda, container, false);

        Button btn1 = (Button) view.findViewById(R.id.desa);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Fragmen1 fs = new Fragmen1();
                gantiFragment(fs);
            }
        });

        Button btn2 = (Button) view.findViewById(R.id.makanan);
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Fragmen2 fs = new Fragmen2();
                gantiFragment(fs);
            }
        });

        Button btn3 = (Button) view.findViewById(R.id.kritik);
        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Fragmen3 fs = new Fragmen3();
                gantiFragment(fs);
            }
        });

        Button btn4 = (Button) view.findViewById(R.id.lokasi);
        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Intent i = new Intent(getContext(), MainActivityMaps.class);
                //startActivity(i);
            }
        });

        return view;
    }

    public void  gantiFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //setelah punya fragment transaction, baru bisa menambah, mengurangi atau hapus fragment
        ft.replace(R.id.frameFragment,fragment);
        ft.commit();
    }
}
