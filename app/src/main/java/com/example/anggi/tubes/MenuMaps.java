package com.example.anggi.tubes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuMaps extends AppCompatActivity {
    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_maps);

        myButton = (Button) findViewById(R.id.restauran);
        myButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(), MapsResto.class);
                startActivity(i);
            }
        });

        myButton = (Button) findViewById(R.id.hotel);
        myButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(), MapsHotel.class);
                startActivity(i);
            }
        });

//        myButton = (Button) findViewById(R.id.hotel);
//        myButton.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//                Intent i = new Intent(getApplicationContext(), MapsHotel.class);
//                startActivity(i);
//            }
//        });
//
//        myButton = (Button) findViewById(R.id.rumah_sakit);
//        myButton.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//                Intent i = new Intent(getApplicationContext(), MapsRS.class);
//                startActivity(i);
//            }
//        });
//
//        myButton = (Button) findViewById(R.id.sekolah);
//        myButton.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//                Intent i = new Intent(getApplicationContext(), MapsSekolah.class);
//                startActivity(i);
//            }
//        });
    }
}
