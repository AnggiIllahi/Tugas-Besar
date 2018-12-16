package com.example.anggi.tubes.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.anggi.tubes.R;

import java.util.ArrayList;
import java.util.List;

public class Fragmen1 extends Fragment {
    private RecyclerView recyclerView; //memanggil deklarasi recyclerview
    private adapter_airterjun mAdapter; //memanggil adapter
    private List<model_airterjun> riwayatList = new ArrayList<>(); //memanggil model / dataset
    private RecyclerView.LayoutManager mLayout ; // memanggil layout recylerview
    public model_airterjun mode;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.activity_fragmen1, container, false); //menghubungkan dengan view

        View view = inflater.inflate(R.layout.activity_fragmen1, container, false);

        //final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        //layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
       // recyclerView.setLayoutManager(layoutManager);

        final RecyclerView.LayoutManager layoutManager;
        layoutManager = new GridLayoutManager(getActivity(), 1, GridLayoutManager.VERTICAL, false);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bismillah);


//        mAdapter = new adapter_airterjun(riwayatList); //deklari variable adapter berdasarkan model yg ddlm kurung
//        recyclerView.setLayoutManager(layoutManager); //panggilLayoutXML
//        recyclerView.setItemAnimator(new DefaultItemAnimator()); //panggilLayoutXML
//        recyclerView.setAdapter(mAdapter); //panggilAdapter

        mAdapter = new adapter_airterjun(riwayatList); //deklari variable adapter berdasarkan model yg ddlm kurung
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext()); //panggilLayoutXML
        recyclerView.setLayoutManager(mLayoutManager); //panggilLayoutXML
        recyclerView.setItemAnimator(new DefaultItemAnimator()); //panggilLayoutXML
        recyclerView.setAdapter(mAdapter); //panggilAdapter
        prepareRiwayatData();
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addOnItemTouchListener(new RecycleTouchListener(getContext(), recyclerView, new ClickListerner() {

            public void onClick(View v, int position) {
                model_airterjun mode = riwayatList.get(position);
                Intent i =  new Intent(getContext(), DetailAirTerjun.class);
                i.putExtra("deskripsi", mode.deskripsi);
                i.putExtra("judul", mode.judul);
                i.putExtra("link", mode.link);
                i.putExtra("gambar", mode.foto);

                startActivity(i);

            }

            public void onLongClick(View v, int position) {

            }
        }));

        return view;

    }

    private void prepareRiwayatData() {
        model_airterjun riwayat = new model_airterjun("Air Terjun Niagara di perbatasan Amerika Serikat dan Kanada memang disebut-sebut sebagai obyek wisata kelas dunia. Namun, siapa sangka Indonesia pun punya air terjun yang sekilas \"mirip\" Niagara.\n" +
                "\n" +
                "Adalah Air Terjun Tumpak Sewu di Desa Sidomulyo, Kecamatan Pronojiwo, Kabupaten Lumajang, Jawa Timur yang memiliki banyak aliran air terjun.\n" +
                "\n" +
                "Dinamakan Tumpak Sewu, lantaran disebut-sebut punya seribu aliran air dan bila diartikan dalam bahasa Jawa adalah sewu.Hal itu diungkapkan oleh pengelola Wisata Alam Air Terjun Tumpak Sewu, Abdul Karim saat ditemui di sela-sela program Familiarization Trip Tourism of Lumajang, Minggu (9/4/2017) malam.\n" +
                "\n" +
                "\"Nama itu karena saking banyaknya aliran mata air, istilahnya seribu mata air. Kalau aliran sungainya cuma satu. Itu Sungai Gledek yang warna coklat,\" ujar Karim.Ada dua titik menarik yang sempat KompasTravel kunjungi di Air Terjun Tumpak Sewu yaitu Pos Panorama dan lembah Air Terjun Tumpak Sewu.\n" +
                "\n" +
                "Di Pos Panorama, wisatawan bisa menikmati keindahan Air Terjun Tumpak Sewu dari ketinggian. Sementara, untuk lembah Air Terjun Tumpak Sewu perlu usaha ekstra yaitu trekking di jalur yang terjal.\n" +
                "\n" +
                "Perjalanan menuju Pos Panorama Air Terjun Tumpak Sewu dari pelataran parkir berjarak 400 meter. Untuk menuju lembah air terjun, wisatawan perlu berjalan 400 meter dari Pos Panorama.Air terjun Tumpak Sewu bisa diakses dari arah Kabupaten Lumajang maupun Malang. Perjalanan menuju Air Terjun Tumpak Sewu ditempuh dalam waktu sekitar 1,5-2 jam.\n" +
                "Untuk bisa masuk ke area Air Terjun Tumpak Sewu wisatawan dikenakan biaya masuk Rp 10.000. Pengunjung yang ingin turun ke lembah air terjun dibatasi hanya sampai pukul 15.00 WIB.",

                "Air Terjun Tumpak Sewu","Salah satu destinasi wisata favorit di Lumajang.",R.drawable.at1);
        riwayatList.add(riwayat);

        model_airterjun riwayat2 = new model_airterjun("Air Terjun Niagara di perbatasan Amerika Serikat dan Kanada memang disebut-sebut sebagai obyek wisata kelas dunia. Namun, siapa sangka Indonesia pun punya air terjun yang sekilas \"mirip\" Niagara.\n" +
                "\n" +
                "Adalah Air Terjun Tumpak Sewu di Desa Sidomulyo, Kecamatan Pronojiwo, Kabupaten Lumajang, Jawa Timur yang memiliki banyak aliran air terjun.\n" +
                "\n" +
                "Dinamakan Tumpak Sewu, lantaran disebut-sebut punya seribu aliran air dan bila diartikan dalam bahasa Jawa adalah sewu.Hal itu diungkapkan oleh pengelola Wisata Alam Air Terjun Tumpak Sewu, Abdul Karim saat ditemui di sela-sela program Familiarization Trip Tourism of Lumajang, Minggu (9/4/2017) malam.\n" +
                "\n" +
                "\"Nama itu karena saking banyaknya aliran mata air, istilahnya seribu mata air. Kalau aliran sungainya cuma satu. Itu Sungai Gledek yang warna coklat,\" ujar Karim.Ada dua titik menarik yang sempat KompasTravel kunjungi di Air Terjun Tumpak Sewu yaitu Pos Panorama dan lembah Air Terjun Tumpak Sewu.\n" +
                "\n" +
                "Di Pos Panorama, wisatawan bisa menikmati keindahan Air Terjun Tumpak Sewu dari ketinggian. Sementara, untuk lembah Air Terjun Tumpak Sewu perlu usaha ekstra yaitu trekking di jalur yang terjal.\n" +
                "\n" +
                "Perjalanan menuju Pos Panorama Air Terjun Tumpak Sewu dari pelataran parkir berjarak 400 meter. Untuk menuju lembah air terjun, wisatawan perlu berjalan 400 meter dari Pos Panorama.Air terjun Tumpak Sewu bisa diakses dari arah Kabupaten Lumajang maupun Malang. Perjalanan menuju Air Terjun Tumpak Sewu ditempuh dalam waktu sekitar 1,5-2 jam.\n" +
                "Untuk bisa masuk ke area Air Terjun Tumpak Sewu wisatawan dikenakan biaya masuk Rp 10.000. Pengunjung yang ingin turun ke lembah air terjun dibatasi hanya sampai pukul 15.00 WIB.",

                "Air Terjun Tumpak Sewu","Salah satu destinasi wisata favorit di Lumajang.",R.drawable.at1);
        riwayatList.add(riwayat2);

        model_airterjun riwayat3 = new model_airterjun("Air Terjun Niagara di perbatasan Amerika Serikat dan Kanada memang disebut-sebut sebagai obyek wisata kelas dunia. Namun, siapa sangka Indonesia pun punya air terjun yang sekilas \"mirip\" Niagara.\n" +
                "\n" +
                "Adalah Air Terjun Tumpak Sewu di Desa Sidomulyo, Kecamatan Pronojiwo, Kabupaten Lumajang, Jawa Timur yang memiliki banyak aliran air terjun.\n" +
                "\n" +
                "Dinamakan Tumpak Sewu, lantaran disebut-sebut punya seribu aliran air dan bila diartikan dalam bahasa Jawa adalah sewu.Hal itu diungkapkan oleh pengelola Wisata Alam Air Terjun Tumpak Sewu, Abdul Karim saat ditemui di sela-sela program Familiarization Trip Tourism of Lumajang, Minggu (9/4/2017) malam.\n" +
                "\n" +
                "\"Nama itu karena saking banyaknya aliran mata air, istilahnya seribu mata air. Kalau aliran sungainya cuma satu. Itu Sungai Gledek yang warna coklat,\" ujar Karim.Ada dua titik menarik yang sempat KompasTravel kunjungi di Air Terjun Tumpak Sewu yaitu Pos Panorama dan lembah Air Terjun Tumpak Sewu.\n" +
                "\n" +
                "Di Pos Panorama, wisatawan bisa menikmati keindahan Air Terjun Tumpak Sewu dari ketinggian. Sementara, untuk lembah Air Terjun Tumpak Sewu perlu usaha ekstra yaitu trekking di jalur yang terjal.\n" +
                "\n" +
                "Perjalanan menuju Pos Panorama Air Terjun Tumpak Sewu dari pelataran parkir berjarak 400 meter. Untuk menuju lembah air terjun, wisatawan perlu berjalan 400 meter dari Pos Panorama.Air terjun Tumpak Sewu bisa diakses dari arah Kabupaten Lumajang maupun Malang. Perjalanan menuju Air Terjun Tumpak Sewu ditempuh dalam waktu sekitar 1,5-2 jam.\n" +
                "Untuk bisa masuk ke area Air Terjun Tumpak Sewu wisatawan dikenakan biaya masuk Rp 10.000. Pengunjung yang ingin turun ke lembah air terjun dibatasi hanya sampai pukul 15.00 WIB.",

                "Air Terjun Tumpak Sewu","Salah satu destinasi wisata favorit di Lumajang.",R.drawable.at1);
        riwayatList.add(riwayat3);

        model_airterjun riwayat4 = new model_airterjun("Air Terjun Niagara di perbatasan Amerika Serikat dan Kanada memang disebut-sebut sebagai obyek wisata kelas dunia. Namun, siapa sangka Indonesia pun punya air terjun yang sekilas \"mirip\" Niagara.\n" +
                "\n" +
                "Adalah Air Terjun Tumpak Sewu di Desa Sidomulyo, Kecamatan Pronojiwo, Kabupaten Lumajang, Jawa Timur yang memiliki banyak aliran air terjun.\n" +
                "\n" +
                "Dinamakan Tumpak Sewu, lantaran disebut-sebut punya seribu aliran air dan bila diartikan dalam bahasa Jawa adalah sewu.Hal itu diungkapkan oleh pengelola Wisata Alam Air Terjun Tumpak Sewu, Abdul Karim saat ditemui di sela-sela program Familiarization Trip Tourism of Lumajang, Minggu (9/4/2017) malam.\n" +
                "\n" +
                "\"Nama itu karena saking banyaknya aliran mata air, istilahnya seribu mata air. Kalau aliran sungainya cuma satu. Itu Sungai Gledek yang warna coklat,\" ujar Karim.Ada dua titik menarik yang sempat KompasTravel kunjungi di Air Terjun Tumpak Sewu yaitu Pos Panorama dan lembah Air Terjun Tumpak Sewu.\n" +
                "\n" +
                "Di Pos Panorama, wisatawan bisa menikmati keindahan Air Terjun Tumpak Sewu dari ketinggian. Sementara, untuk lembah Air Terjun Tumpak Sewu perlu usaha ekstra yaitu trekking di jalur yang terjal.\n" +
                "\n" +
                "Perjalanan menuju Pos Panorama Air Terjun Tumpak Sewu dari pelataran parkir berjarak 400 meter. Untuk menuju lembah air terjun, wisatawan perlu berjalan 400 meter dari Pos Panorama.Air terjun Tumpak Sewu bisa diakses dari arah Kabupaten Lumajang maupun Malang. Perjalanan menuju Air Terjun Tumpak Sewu ditempuh dalam waktu sekitar 1,5-2 jam.\n" +
                "Untuk bisa masuk ke area Air Terjun Tumpak Sewu wisatawan dikenakan biaya masuk Rp 10.000. Pengunjung yang ingin turun ke lembah air terjun dibatasi hanya sampai pukul 15.00 WIB.",

                "Air Terjun Tumpak Sewu","Salah satu destinasi wisata favorit di Lumajang.",R.drawable.at1);
        riwayatList.add(riwayat4);
        model_airterjun riwayat5 = new model_airterjun("Air Terjun Niagara di perbatasan Amerika Serikat dan Kanada memang disebut-sebut sebagai obyek wisata kelas dunia. Namun, siapa sangka Indonesia pun punya air terjun yang sekilas \"mirip\" Niagara.\n" +
                "\n" +
                "Adalah Air Terjun Tumpak Sewu di Desa Sidomulyo, Kecamatan Pronojiwo, Kabupaten Lumajang, Jawa Timur yang memiliki banyak aliran air terjun.\n" +
                "\n" +
                "Dinamakan Tumpak Sewu, lantaran disebut-sebut punya seribu aliran air dan bila diartikan dalam bahasa Jawa adalah sewu.Hal itu diungkapkan oleh pengelola Wisata Alam Air Terjun Tumpak Sewu, Abdul Karim saat ditemui di sela-sela program Familiarization Trip Tourism of Lumajang, Minggu (9/4/2017) malam.\n" +
                "\n" +
                "\"Nama itu karena saking banyaknya aliran mata air, istilahnya seribu mata air. Kalau aliran sungainya cuma satu. Itu Sungai Gledek yang warna coklat,\" ujar Karim.Ada dua titik menarik yang sempat KompasTravel kunjungi di Air Terjun Tumpak Sewu yaitu Pos Panorama dan lembah Air Terjun Tumpak Sewu.\n" +
                "\n" +
                "Di Pos Panorama, wisatawan bisa menikmati keindahan Air Terjun Tumpak Sewu dari ketinggian. Sementara, untuk lembah Air Terjun Tumpak Sewu perlu usaha ekstra yaitu trekking di jalur yang terjal.\n" +
                "\n" +
                "Perjalanan menuju Pos Panorama Air Terjun Tumpak Sewu dari pelataran parkir berjarak 400 meter. Untuk menuju lembah air terjun, wisatawan perlu berjalan 400 meter dari Pos Panorama.Air terjun Tumpak Sewu bisa diakses dari arah Kabupaten Lumajang maupun Malang. Perjalanan menuju Air Terjun Tumpak Sewu ditempuh dalam waktu sekitar 1,5-2 jam.\n" +
                "Untuk bisa masuk ke area Air Terjun Tumpak Sewu wisatawan dikenakan biaya masuk Rp 10.000. Pengunjung yang ingin turun ke lembah air terjun dibatasi hanya sampai pukul 15.00 WIB.",

                "Air Terjun Tumpak Sewu","Salah satu destinasi wisata favorit di Lumajang.",R.drawable.at1);
        riwayatList.add(riwayat5);

        mAdapter.notifyDataSetChanged();
    }


}
