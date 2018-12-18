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
        model_airterjun riwayat = new model_airterjun("Lokasi desa adat Penglipuran, berada di desa Kubu, kabupaten Bangli, provinsi Bali. Mungkin banyak dari anda tidak tahu, kabupaten Bangli di Bali bagian mana. Jika anda pernah wisata ke Kintamani atau Gunung Batur, inilah wilayah kabupaten Bangli.\n" +
                "\n" +
                "Lokasi desa penglipuran Bangli berada di ketinggian sekitar 600 – 700 meter dari permukaan laut. Akibat berada di posisi ketinggian ini, membuat udara sejuk akan terbayang oleh anda.\n" +
                "\n" +
                "Desa wisata ini memiliki area seluas 112 hektar dan merupakan salah satu Wisata Budaya di Bali yang wajib dikunjungi. Dari sekian hektar, hanya kurang lebih 9 hektar saja yang difungsikan sebagai rumah dan perkampungan.\n" +
                "\n" +
                "Sisa lahan di desa tersebut difungsikan sebagai perkebunan warga sekitar. Desa ini sudah menjadi salah satu desa wisata di Bali yang populer. Walau demikian, kekayaan budaya di sana tetap terjaga hingga sekarang.\n" +
                "\n" +
                "Desa ini memiliki bentuk permukiman yang sangat unik, yaitu rumah-rumahnya yang masih menggunakan bahan-bahan bangunan alami seperti bambu, kayu, dan juga dedaunan sebagai atapnya. Desa ini juga sangat bersih dan rapi.\n" +
                "\n" +
                "\n",

                "Desa wisata penglipuran","Lokasi desa adat Penglipuran, berada di desa Kubu, kabupaten Bangli, provinsi Bali.",R.drawable.ds1);
        riwayatList.add(riwayat);

        model_airterjun riwayat2 = new model_airterjun("Terunyan adalah sebuah desa yang berada di Kecamatan Kintamani, Kabupaten Bangli, Bali, Indonesia. Terunyan terletak di dekat Danau Batur.\n" +
                "\n" +
                "Desa Trunyan adalah salah satu desa tertua di Bali yang memiliki tradisi unik. Tradisi itu adalah tradisi meletakkan jenazah di sebuah anyaman bambu. Namanya adalah Seme Wayah.\n" +
                "\n" +
                "Tidak seperti jenazah pada umumnya yang dikubur atau dibakar, jenazah di desa Trunyan ini diperlakukan mirip dengan tradisi suku Toraja, yaitu hanya diletakkan begitu saja dan dibiarkan membusuk dengan sendirinya.\n" +
                "\n" +
                "Keunikan desa ini menjadi daya tarik tersendiri bagi orang-orang yang ingin tahu lebih jauh mengenai tradisi tersebut. Kini desa ini juga menjadi salah satu desa wisata yang bisa dikunjungi wisatawan.\n" +
                "\n" +
                "\n",

                "Desa wisata trunyan","Terunyan adalah sebuah desa yang berada di Kecamatan Kintamani, Kabupaten Bangli, Bali, Indonesia.",R.drawable.ds2);
        riwayatList.add(riwayat2);

        model_airterjun riwayat3 = new model_airterjun("Kecamatan Ubud adalah sebuah kecamatan di Kabupaten Gianyar, Bali, Indonesia. Luasnya adalah 42,38 km².\n" +
                "\n" +
                "Salah satu Tips Liburan Murah ke Bali adalah dengan mendatangi wisata alam. Kawasan Ubud merupakan salah satu kawasan wisata yang cukup digemari oleh wisatawan. Daya tariknya adalah pemandangan alam yang sangat indah dan masih alami di Ubud.\n" +
                "\n" +
                "Desa Ubud juga memiliki daya tarik lain selain pemandangan alamnya yang masih alami, yaitu pusat kesenian di Bali. Beberapa kesenian khas di Desa Ubud yang digemari wisatawan domestik dan mancanegara adalah seni ukir, tari, patung, lukis, dan lainnya.\n" +
                "\n" +
                "Desa Ubud juga saat ini memiliki predikat sebagai desa wisata bertaraf internasional, sehingga namanya akan semakin populer dan dikunjungi banyak wisatawan lokal dan internasional.\n" +
                "\n" +
                "\n",

                "Desa wisata ubud","Kecamatan Ubud adalah sebuah kecamatan di Kabupaten Gianyar, Bali, Indonesia. Luasnya adalah 42,38 km².",R.drawable.ds3);
        riwayatList.add(riwayat3);

        model_airterjun riwayat4 = new model_airterjun("Bali memang tidak hanya menyuguhkan keindahan alam atau hasil karya seninya saja, sejumlah budaya serta tradisi unik masih terjaga lestari di beberapa tempat di pulau Dewata ini. Salah satunya adalah objek wisata Tenganan merupakan desa tradisional Bali, yang terletak di Kabupaten Karangasem, wilayah paling Timur Pulau Dewata. Kira-kira 10 km Utara pariwisata Candidasa atau 70 km dari kota Denpasar.\n" +
                "\n" +
                "Desa wisata di Bali berikutnya adalah Desa Teganan. Desa ini adalah salah satu dar tiga desa di Bali yang masuk ke dalam susunan Bali Aga. Bali Aga adalah konsep desa tradisional yang masih dijaga dari dahulu hingga saat ini.\n" +
                "\n" +
                "Desa Teganan ini juga masih menerapkan sistem tradisional dalam transaksi jual beli mereka. Di antaranya sistem tukar menukar barang atau barter.\n" +
                "\n" +
                "Sedangkan profesi dari masyarakat Desa Teganan itu sendiri kebanyakan adalah petani dan seniman. Seniman di Dea Teganan kebanyakan adalah pengrajin bambu, seniman lukis, dan juga penenun kain.\n" +
                "\n" +
                "\n",

                "Desa wisata tenganan","Objek wisata Tenganan merupakan desa tradisional Bali, yang terletak di Kabupaten Karangasem.",R.drawable.ds4);
        riwayatList.add(riwayat4);

        model_airterjun riwayat5 = new model_airterjun("Objek wisata Desa Batubulan merupakan sebuah desa wisata yang terkenal keseniannya yang berada di wilayah kecamatan Sukawati kabupaten Gianyar Propinsi Bali. Desa Batubulan terletak pada jalur Denpasar menuju Gianyar dan berjarak 10 km dari Denpasar serta 21 km dari pusat ibu kota Gianyar. Lokasi ini sangat strategis karena objek wisata desa Batubulan merupakan pintu gerbang utama ujung barat dari kabupaten Gianyar juga disini ada terminal yang menghubungkan Denpasar dengan daerah daerah wilayah timur.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Nama desa ini juga tidak lagi asing di telinga masyarakat. Desa Batubulan yang merupakan salah satu Tempat Wisata di Bali ini memang sering dikunjungi wisatawan yang ingin melihat pertujukan tari tradisional khas Bali. Biasanya pertunjukan yang ditampilkan adalah tari barong, legong, dan kecak.\n" +
                "\n" +
                "Desa Batubulan juga memiliki aneka kerajinan seni lainnya yang menrik perhatian wisatawan untuk berbelanja oleh-oleh. Maka dari itu kawasan ini juga tidak pernah sepi dari pengunjung.\n" +
                "\n" +
                "Beberapa kesenian yang sering dijual di toko souvenir Batubulan antara lain kesenian patung dan juga kesenian ukiran. Jika Anda penyuka kerajinan seni, maka lokasi ini bisa menjadi alternatif yang direkomendasikan.\n" +
                "\n" +
                "\n",

                "Desa wisata batbulan","Objek wisata Desa Batubulan merupakan sebuah desa wisata yang berada di kecamatan Sukawati kabupaten Gianyar Propinsi Bali.",R.drawable.ds5);
        riwayatList.add(riwayat5);

        model_airterjun riwayat6 = new model_airterjun("Desa budaya Kertalanggu adalah salah satu desa wisata yang berada di Bali dengan taraf internasional. \n" +
                "\n" +
                "Desa ini memiliki budaya serta warisan adat istiadat yang masih terjaga dan saat ini sering dikunjungi sebagai objek wisata. Cocok untuk Tempat Wisata Anak di Bali sebagai edukasi budaya.\n" +
                "\n" +
                "Lokasinya berada di Ngurah Rai, Denpasar. Letaknya yang tidak jauh dari pusat kota membuat desa ini semakin populer dan dikunjungi banyak wisatawan. Desa ini memiliki luas kurang lebih 80 hektar. Daya tariknya adalah perkebunan dan persawahan yang masih sangat hijau.\n" +
                "\n" +
                "Daya tarik utama Desa Kertalangu ialah keindahan alam yang masih asri. Anda yang memasuki area desa akan langsung disambut rumah warga dengan arsitektur khas Bali. Kemudian menyusuri areal persawahan dimana di kanan dan kirinya ditanami padi yang hijau. Pemandangan yang disuguhkan layaknya lukisan.\n" +
                "\n" +
                "\n",

                "Desa wisata kertalanggu","Desa budaya Kertalanggu adalah salah satu desa wisata yang berada di Bali dengan taraf internasional.",R.drawable.ds6);
        riwayatList.add(riwayat6);

        model_airterjun riwayat7 = new model_airterjun("Wisata Desa Celuk di Sukawati Gianyar Bali adalah salah satu tempat wisata yang berada di Jl. Raya Celuk, Desa Celuk, Kecamatan Sukawati, Kabupaten Gianyar, Bali, Indonesia. \n" +
                "\n" +
                "Wisata Desa Celuk di Sukawati Gianyar Bali adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari. \n" +
                "\n" +
                "Wisata Desa Celuk di Sukawati Gianyar Bali memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Gianyar tidak mengunjungi Wisata Desa Celuk di Sukawati Gianyar Bali yang mempunyai keindahan yang tiada duanya tersebut.\n" +
                "\n" +
                "Wisata Desa Celuk di Sukawati Gianyar Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Wisata Desa Celuk di Sukawati Gianyar Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat Wisata Desa Celuk di Sukawati Gianyar Bali di kota Gianyar.\n" +
                "\n" +
                "\n",

                "Desa wisata celuk","Wisata Desa Celuk di Sukawati Gianyar Bali adalah salah satu tempat wisata yang berada di Jl. Raya Celuk, Desa Celuk.",R.drawable.ds7);
        riwayatList.add(riwayat7);

        model_airterjun riwayat8 = new model_airterjun("Objek Wisata Desa Plaga di Petang Badung Bali merupakan tempat wisata yang harus anda kunjungi karena pesona keindahannya tidak ada duanya. Penduduk lokal daerah Badung juga sangat ramah tamah terhadap wisatawan lokal maupun wisatawan asing. \n" +
                "\n" +
                "Kota Badung juga terkenal akan Objek Wisata Desa Plaga di Petang Badung Bali  yng sangat menarik untuk dikunjungi.\n" +
                "\n" +
                "Objek Wisata Desa Plaga di Petang Badung Bali terletak di daerah dataran tinggi bagian utara Badung, Desa Pelaga memiliki potensi dalam bidang pertanian dan juga peternakan. Bukian ialah salah satu dari sembilan banjar yang ada di Desa Pelaga yang dijadikan pusat pembudidayaan tanaman asparagus dan pare putih. Banyaknya jumlah petani asparagus dan pare putih di Bukian serta lokasi yang mudah dijangkau menjadi alasan tempat ini dijadikan pusat pembudidayaan yang juga akan mulai dikembangkan menjadi objek agro wisata.\n" +
                "\n" +
                "Disini, para pengunjung baik para peneliti maupun pelajar dapat secara langsung mengamati bagaimana tanaman asparagus dan pare putih dibudidayakan.  Dengan demikian diharapkan budidaya tanaman ini akan menambah pengetahuan mengenai fungsi dan nilai asparagus dan pare putih. Sehingga tanaman ini akan mampu meningkatkan sumber penghasilan warga setempat yang sebagian besar menekuni bidang pertanian atau perkebunan.\n" +
                "\n" +
                "\n",

                "Desa wisata plaga","Objek Wisata Desa Plaga di Petang Badung Bali terletak di daerah dataran tinggi bagian utara Badung.",R.drawable.ds8);
        riwayatList.add(riwayat8);

        model_airterjun riwayat9 = new model_airterjun("Desa Jatiluwih merupakan daya tarik wisata yang terletak di Kecamatan Penebel, Kabupaten Tabanan. Jaraknya dari kota Denpasar adalah 48 km dan desa Jatiluwih terletak di bagian utara Tabanan (28 km). \n" +
                "\n" +
                "Panorama alam yang dimiliki desa Jatiluwih menjadikan Jatiluwih terkenal dengan wisata alamnya. Kealamian dari subak yang didalamnya terdapat aktivitas para petani seperti memanen, mencangkul serta adanya upacara yang dilakukan oleh para anggota subak merupakan pemandangan pedesaan yang sangat natural. \n" +
                "\n" +
                "Disamping itu adanya perkebunan yang ditanami dengan kopi, cengkeh. Hal yang tidak kalah menarik adalah wisata alam di Desa Jatiluwih memberikan pengalaman tersendiri bagi wisatawan khususnya yang menyukai petualangan.\n" +
                "\n" +
                "Desa Jatiluwih memiliki persawahan yang luas dengan dominasi padi yang mulai menguning dan menghijau yang membuat wisatawan saat itu berkunjung mulai terpikat dengan keindahan sawah yang ada di desa Jatiluwih.\n" +
                "\n" +
                "\n",

                "Desa wisata jatiluwih","Desa Jatiluwih merupakan daya tarik wisata yang terletak di Kecamatan Penebel, Kabupaten Tabanan. ",R.drawable.ds9);
        riwayatList.add(riwayat9);

        model_airterjun riwayat10 = new model_airterjun("Wilayah Kintamani memang terkenal akan kesejukan udaranya. Tak heran jika Kintamani selalu dikunjungi wisatawan untuk mendapatkan keindahan pemandangan alam pegunungan di Bali. Pemandangan Gunung Batur beserta danaunya terlihat sangat memukau tatkala dilihat dari Kintamani.\n" +
                "\n" +
                "Terdapat sebuah desa di Kintamani yang memiliki spot terbaik untuk melihat keindahan Bali di pagi hari yakni Desa Pinggan. Desa yang berada di wilayah Kintamani ini menyajikan pemandangan desa berkabut berlatar pegunungan yang cantik.\n" +
                "\n" +
                "Jika Anda ingin menikmati indahnya matahari terbit di Desa Pinggan, Anda bisa datang sekira pukul 05.30 WITA. Ini karena fenomena cantiknya sunrise akan mulai terlihat di Desa Pinggan mulai pukul 06.00 WITA.\n" +
                "\n" +
                "Bila Anda berangkat dari Denpasar, maka waktu yang diperlukan untuk mencapai lokasi Desa Pinggan sekitar 2 jam 15 menit. Jadi ketika Anda ingin melihat indahnya sunrise di sini, Anda harus berangkat pagi-pagi buta. Namun jika Anda menginap di kawasan objek wisata Kintamani, Anda tentu tidak perlu bangun terlalu pagi. Jangan sampai ketinggalan momen khusus ini.\n" +
                "\n" +
                "\n",

                "Desa wisata pinggan","Wilayah Kintamani memang terkenal akan kesejukan udaranya. ",R.drawable.ds10);
        riwayatList.add(riwayat10);

        model_airterjun riwayat11 = new model_airterjun("Objek Wisata Pura Perancak di Jembrana Bali adalah salah satu tempat wisata yang berada di Desa Perancak, Kecamatan Jembrana, Kabupaten Jembrana, Bali, Indonesia. \n" +
                "\n" +
                "Objek Wisata Pura Perancak di Jembrana Bali adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari.\n" +
                "\n" +
                "Objek Wisata Pura Perancak di Jembrana Bali memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Jembrana tidak mengunjungi Objek Wisata Pura Perancak di Jembrana Bali yang mempunyai keindahan yang tiada duanya tersebut.\n" +
                "\n" +
                "Objek Wisata Pura Perancak di Jembrana Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Objek Wisata Pura Perancak di Jembrana Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat Objek Wisata Pura Perancak di kota Jembrana.\n" +
                "\n" +
                "\n",

                "Desa wisata perancak","Objek Wisata Pura Perancak di Jembrana tempat wisata yang berada di Desa Perancak, Kecamatan Jembrana, Bali, ",R.drawable.ds11);
        riwayatList.add(riwayat11);

        model_airterjun riwayat12 = new model_airterjun("Desa Wisata Yeh Embang kangin menawarkan pesona keindahan pantai Rambut Siwi dengan sebuah tempat suci umat Hindu yang berdiri di atas tebing yang bernama Pura Rambut Siwi. \n" +
                "\n" +
                "Pura Rambut Siwi erat kaitannya dengan kedatangan seorang Pendeta dari Majapahit yang melakukan perjalanan ke Bali dan singgah di tempat ini untuk memberikan ajaran Agama Hindu. \n" +
                "\n" +
                "Keunikan lain yang ditawarkan oleh desa wisata Yeh Embang Kangin yakni Green Cliff yang merupakan sebuah bangunan ditepi tebing yang terbuat dari bambu dengan panjang lintasan 60 meter serta tinggi 10 meter. Di atas bangunan tersebut dibangun gazebo serta tiga buah kursi panjang yang memudahkan pengunjung untuk berfoto. \n" +
                "\n" +
                "Selain wisata alam pegunungan, desa ini juga memiliki tempat wisata air terjun. Bagi yang melakukan perjalanan panjang dari arah barat (Gilimanuk) ke timur (Denpasar) coba mampir ke Anjungan cerdas rambut Siwi yang berada di Rest Area Rambut Siwi. Lokasi: Desa Yeh Embang Kangin, Kecamatan Mendoyo, Kabupaten Jembrana, Bali.\n" +
                "\n" +
                "\n",

                "Desa wisata yeh embang kangin","Desa Wisata Yeh Embang kangin menawarkan pesona keindahan pantai Rambut Siwi.",R.drawable.ds12);
        riwayatList.add(riwayat12);

        model_airterjun riwayat13 = new model_airterjun("Objek Wisata Air Tirta Lestari Gumbrih di Pekutatan Jembrana Bali adalah salah satu tempat wisata yang berada di Desa Gumbrih, Kecamatan Pekutatan, Kabupaten Jembrana, Bali, Indonesia.\n" +
                "\n" +
                " Objek Wisata Air Tirta Lestari Gumbrih di Pekutatan Jembrana Baliadalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari.\n" +
                "\n" +
                "Objek Wisata Air Tirta Lestari Gumbrih di Pekutatan Jembrana Bali memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Jembrana tidak mengunjungi Objek Wisata Air Tirta Lestari Gumbrih di Pekutatan Jembrana Bali yang mempunyai keindahan yang tiada duanya tersebut.\n" +
                "\n" +
                "Objek Wisata Air Tirta Lestari Gumbrih di Pekutatan Jembrana Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Objek Wisata Air Tirta Lestari Gumbrih di Pekutatan Jembrana Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat Objek Wisata Air Tirta Lestari Gumbrih di Pekutatan Jembrana Bali di kota Jembrana.\n" +
                "\n" +
                "\n",

                "Desa wisata gumbrih","Objek Wisata Air Tirta Lestari salah satu tempat wisata yang berada di Desa Gumbrih, Kecamatan Pekutatan. ",R.drawable.ds13);
        riwayatList.add(riwayat13);

        model_airterjun riwayat14 = new model_airterjun("Desa Belimbing merupakan salah satu desa wisata yang terletak di kawasan Pupuan Kabupaten Tabanan, tepatnya berada disalah satu kaki Gunung Batukaru, gunung berapi tertinggi kedua di Bali. \n" +
                "\n" +
                "Desa ini terkenal dengan keindahan sawah terasiring nya yang tak kalah indah dengan yang dapat kita jumpai di kawasan Jatiluwih lengkap dengan beberapa pohon kelapa yang tumbuh di area sawah. Sawah di desa Belimbing begitu sangat asri dan alami, masih belum begitu banyak wisatawan yang mengenal desa wisata ini, sehingga jika Anda memiliki hobi mengambil fotografi dijamin tempat ini adalah surga bagi para fotografer. Luas lahan sawah di Desa Belimbing kurang lebih sekitar 460 hektar yang dibagi menjadi enam subak antara lain: Subak Mas, Subak Gemuh, Subak Nyanglad, Subak Teben Telabah, Subak Duren Taluh, Subak Suranadi.\n" +
                "\n" +
                "\n" +
                "Selain keindahan sawahnya yang luar biasa, dikawasan desa ini juga dapat ditemui sebuah pura yang dikeramatkan oleh para warga setempat yaitu Pura Luhur Mekori, para wisatawan diperbolehkan untuk masuk ke dalam area pura dengan didampingi oleh pemandu wisata atau warga lokal yang bertugas untuk berkarya di pura tersebut. Hal lain yang perlu diperhatikan bagi para pengunjung Pura yaitu Anda atau rombongan tidak dalam keadaan cuntaka / berhalangan misalnya sedang haid/datang bulan bagi para pengunjung wanita, atau dalam kondisi yang berkabung.\n\n" +
                "\n" +
                "Dua buah air terjun (singsing) yang indah juga dapat Anda temui di dalam Desa Belimbing, akses menuju kedua air terjun pun sudah mengalami beberapa renovasi sehingga para pengunjung dapat menjangkau lokasi dengan lebih nyaman.\n" +
                "\n" +
                "Wisatawan pun tak perlu bingung untuk jika berencana untuk menikmati suasana pedesaan Desa Belimbing yang damai dengan lebih lama karena beberapa penginapan dan hotel juga sudah dibangun di dekat desa lengkap dengan beberapa restoran dan warung sederhan yang siap untuk menyajikan hidangan spesial untuk Anda ketika berkunjung ke desa wisata ini.\n" +
                "\n" +
                "\n",

                "Desa wisata belimbing","Desa Belimbing merupakan salah satu desa wisata yang terletak di kawasan Pupuan Kabupaten Tabanan.",R.drawable.ds14);
        riwayatList.add(riwayat14);

        model_airterjun riwayat15 = new model_airterjun("Kalibukbuk merupakan sebuah desa yang terletak di Kecamatan Buleleng, Buleleng, Bali, Indonesia. Kalibukbuk adalah sebuah desa wisata yang dikenal akan keindahan pantainya. Dahulu kala desa ini juga dikenal dengan nama Tanah Gesar.\n" +
                "\n" +
                "Dahulu kala di Desa Kalibukbuk terdapat sebuah kerajaan kecil yang bernama Kerajaan Tanah Besar (Tanah yang kering). Pada waktu itu kehidupan masyarakat wilayah ini sejahtera dan makmur, sebagian besar mata pencaharianya adalah menjadi Nelayan dan Petani. Penduduk Kawasan ini sebagian besar  adalah penganut agama Hindu dan Budha.\n" +
                "\n" +
                "Desa Kalibukbuk terkenal akan keindahan pantainya yang berpasir hitam dengan ombak yang relatif lebih tenang. Selain itu, pesona bawah laut yang ditawarkan di desa ini sangat memukau dengan terumbu karang yang masih bagus dan indah dan ikan hias yang menghuninya. \n" +
                "\n" +
                "Pantai Lovina merupakan destinasi wisata terkenal yang ada di Desa Kalibukbuk, di mana pantai ini populer dengan atraksi lumba-lumbanya di pagi hari yang membuat wisatawan betah untuk berkunjung ke desa ini. \n" +
                "\n" +
                "\n",

                "Desa wisata kalibukbuk","Kalibukbuk merupakan sebuah desa yang terletak di Kecamatan Buleleng.",R.drawable.ds15);
        riwayatList.add(riwayat15);

        model_airterjun riwayat17 = new model_airterjun("Wisata Desa Kamasan di Klungkung Bali adalah salah satu tempat wisata yang berada di Desa Kamasan, Kecamatan Klungkung, Kabupaten Klungkung, Bali, Indonesia. \n" +
                "\n" +
                "Wisata Desa Kamasan di Klungkung Baliadalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari.\n" +
                "\n" +
                "Wisata Desa Kamasan di Klungkung Balimemiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Klungkung tidak mengunjungi Wisata Desa Kamasan di Klungkung Bali yang mempunyai keindahan yang tiada duanya tersebut.\n" +
                "\n" +
                "Wisata Desa Kamasan di Klungkung Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Wisata Desa Kamasan di Klungkung Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat Wisata Desa Kamasan di Klungkung Bali di kota Klungkung.\n" +
                "\n" +
                "\n",

                "Desa wisata kamasan","Wisata Desa Kamasan di Klungkung Bali adalah salah satu tempat wisata yang berada di Desa Kamasan, Kecamatan Klungkung.",R.drawable.ds17);
        riwayatList.add(riwayat17);

        model_airterjun riwayat18 = new model_airterjun("Wisata Desa Tihingan Penghasil Gong Artistik di Klungkung Bali adalah salah satu tempat wisata yang berada di Desa Tihingan, Kecamatan Banjarangkan, Kabupaten Klungkung, Bali, Indonesia.\n" +
                "\n" +
                " Wisata Desa Tihingan Penghasil Gong Artistik di Klungkung Bali adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari.\n" +
                "\n" +
                "Wisata Desa Tihingan Penghasil Gong Artistik di Klungkung Bali memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Tihingan tidak mengunjungi Wisata Desa Tihingan Penghasil Gong Artistik di Klungkung Bali yang mempunyai keindahan yang tiada duanya tersebut.\n" +
                "\n" +
                "Wisata Desa Tihingan Penghasil Gong Artistik di Klungkung Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Wisata Desa Tihingan Penghasil Gong Artistik di Klungkung Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat Wisata Desa Tihingan Penghasil Gong Artistik di kota Klungkung.\n" +
                "\n" +
                "\n",

                "Desa wisata tihingan","Wisata Desa Tihingan Penghasil Gong Artistik di Klungkung Bali adalah salah satu tempat wisata yang berada di Desa Tihingan, Kecamatan Banjarangkan.",R.drawable.ds18);
        riwayatList.add(riwayat18);

        model_airterjun riwayat19 = new model_airterjun("Wisata Desa Bongkasa Pertiwi di Abiansemal Badung Bali adalah salah satu tempat wisata yang berada di Desa Bongkasa Pertiwi, Kecamatan Abiansemal, Kabupaten Badung, Bali, Indonesia. \n" +
                "\n" +
                "Wisata Desa Bongkasa Pertiwi di Abiansemal Badung Bali adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari. \n" +
                "\n" +
                "Wisata Desa Bongkasa Pertiwi di Abiansemal Badung Bali memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Badung tidak mengunjungi Wisata Desa Bongkasa Pertiwi di Abiansemal Badung Bali yang mempunyai keindahan yang tiada duanya tersebut. \n" +
                "\n" +
                "Wisata Desa Bongkasa Pertiwi di Abiansemal Badung Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Wisata Desa Bongkasa Pertiwi di Abiansemal Badung Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat Wisata Desa Bongkasa Pertiwi di Abiansemal Badung Bali di kota Badung.\n" +
                "\n" +
                "\n",

                "Desa wisata bongkasa pertiwi","Wisata Desa Bongkasa Pertiwi di Abiansemal Badung Bali adalah salah satu tempat wisata yang berada di Desa Bongkasa Pertiwi, Kecamatan Abiansemal.",R.drawable.ds19);
        riwayatList.add(riwayat19);

        model_airterjun riwayat20 = new model_airterjun("Objek Wisata Desa Sangkaragung di Negara Jembrana Bali adalah salah satu tempat wisata yang berada Kesenian Jegog berada di Desa Sangkaragung, Kecamatan Negara, Kabupaten Jembrana, Provinsi Bali, Indonesia. \n" +
                "\n" +
                "Objek Wisata Desa Sangkaragung di Objek Wisata Desa Sangkaragung di Negara Jembrana Bali Jembrana Bali adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari.\n" +
                "\n" +
                "Objek Wisata Desa Sangkaragung di Negara Jembrana Bali memiliki pesona keindahan yang sangat menarik untuk dikunjungi.Sangat di sayangkan jika anda berada di kota Jembrana tidak mengunjungi Objek Wisata Desa Sangkaragung di Negara  Jembrana Bali yang mempunyai keindahan yang tiada duanya tersebut.\n" +
                "\n" +
                "Objek Wisata Desa Sangkaragung di Negara  Jembrana Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Objek Wisata Desa Sangkaragung di Negara  Jembrana Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat Objek Wisata Desa Sangkaragung di Negara  Jembrana Bali di kota Jembrana.\n" +
                "\n" +
                "\n",

                "Desa wisata sangkaragung","Objek Wisata Desa Sangkaragung di Negara Jembrana Bali adalah salah satu tempat wisata berada di Desa Sangkaragung, Kecamatan Negara.",R.drawable.ds20);
        riwayatList.add(riwayat20);

        model_airterjun riwayat21 = new model_airterjun("Objek Wisata Bunut Bolong di Pekutatan Jembrana Bali adalah salah satu tempat wisata yang berada di Desa Manggisari, Kecamatan Pekutatan, Kabupaten Jembrana, Bali, Indonesia.\n" +
                "\n" +
                "Objek Wisata Bunut Bolong di Pekutatan Jembrana Bali adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari.\n" +
                "\n" +
                "Objek Wisata Bunut Bolong di Pekutatan Jembrana Bali memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Jembrana tidak mengunjungi Objek Wisata Bunut Bolong di Pekutatan Jembrana Bali yang mempunyai keindahan yang tiada duanya tersebut.\n" +
                "\n" +
                "Objek Wisata Bunut Bolong di Pekutatan Jembrana Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Objek Wisata Bunut Bolong di Pekutatan Jembrana Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi Objek Wisata Bunut Bolong di kota Jembrana.\n" +
                "\n" +
                "\n",

                "Desa wisata pekutatan","Objek Wisata Bunut Bolong di Pekutatan Jembrana Bali adalah salah satu tempat wisata yang berada di Desa Manggisari, Kecamatan Pekutatan.",R.drawable.ds21);
        riwayatList.add(riwayat21);

        model_airterjun riwayat22 = new model_airterjun("Desa Bayung Gede termasuk desa kuno di Bali yang hingga kinipun masih dijaga kelestariannya. Desa ini ialah warisan budaya nenek moyang. Desa ini berada di ketinggian sekitar 900 meter diatas permukaan laut (dpl) sehingga berhawa sejuk.\n" +
                "\n" +
                " Warga desa yang ada disini kebanyakan menggantungkan hidupnya kepada alam, dalam arti menjadi petani yang mengelola lahan pertanian kering disesuaikan dengan iklim yang ada.\n" +
                "\n" +
                "Desa Bayung Gede kemudian dikembangkan menjadi desa wisata baru sekitar tahun 2010 silam. Mengenai asal-usul nama Buyung Gede, belum ada sumber pasti yang bisa menjelaskan alasan penamaan itu secara valid. Namun demikian, menurut seorang ahli Thomas A Reuters menyebut Bayung Gede merupakan desa kuno yang menjadi induk dari sejumlah desa-desa kuno lainnya di Bangli seperti Penglipuran, Sekardadi, Bonyoh.\n" +
                "\n" +
                "Ada tradisi unik yang terjadi di desa ini. Warga yang baru saja menikah dilarang memasuki pekarangan dan tidak dianggap sebagai warga Desa Bayung Gede sebelum membayar tumbakan (sejenis mas kawin) yang diserahkan kepada pihak desa dengan dalam bentuk dua ekor sapi, serta menjalani TapaBrata (puasa). Pengantin juga dituntut untuk melakukan prosesi Penyekeban dengan tinggal di sebuah gubug kecil di ujung desa.\n" +
                "\n" +
                "\n",

                "Desa wisata bayung gede","Desa Bayung Gede termasuk desa kuno di Bali yang hingga kinipun masih dijaga kelestariannya.",R.drawable.ds22);
        riwayatList.add(riwayat22);

        model_airterjun riwayat23 = new model_airterjun("Desa Wisata Undisan yang berlokasi di Bali merupakan salah satu lokasi wisata yang cukup menarik dan sayang kalau dilewatkan jika berkunjung ke Pulau Dewata. Desa Wisata Undisan sendiri berlokasi di Kecamatan Tembuku, Kabupaten Bangli yang dapat ditempuh sekitar satu setengah jam perjalanan berangkat dari Kota Denpasar. Suasana Desa Wisata Undisan tidak kalah menarik dengan Desa Penglipuran yang lebih dahulu dikenal sebagai desa yang indah, menarik dan terbersih di dunia bersanding dengan Desa Giethoorn di Belanda dan Desa Mawlynnong di India.\n" +
                "\n" +
                "Begitu tiba di kawasan ini, para pengunjung akan dimanjakan langsung dengan suasana alam yang masih begitu asri dan udara sejuk yang dipadukan dengan budaya lokal khas masyarakat Bali yang masih begitu kental dan tak dapat dipisahkan dari wisata alamnya. Di desa wisata ini, para pengunjung dibebaskan untuk menikmati suasana alam di sekitar desa tersebut, pengunjung dapat melakukan aktivitas yang menarik seperti trakking, bersepeda, membajak sawah dengan sapi, mengikuti cooking class, membuat layangan, jamu dan masih banyak lagi. Desa Undisan juga dikenal sebagai lokasi yang kerajinan emas dan peraknya sudah mumpuni.\n" +
                "\n" +
                "Obyek wisata alam di desa ini pun sudah tidak perlu diragukan lagi keindahannya, seperti salah satunya adalah Air Terjun Tangkup. Lokasi air terjun ini masih di seputaran Tembuku Bangli yang masih menyimpan keasrian serta kealamiannya. \n" +
                "\n" +
                "Untuk mencapai lokasi Air Terjun Tangkup, pengunjung harus memiliki stamina yang cukup pasalnya jarak yang harus ditempuh lumayan panjang dan medan yang cukup terjal dengan hamparan sawah dan kebun yang berada di sepanjang perjalanan. Setelah melalui perjalanan yang cukup menantang tersebut, barulah pengunjung akan menemukan lokasi air terjun yang berketinggian kurang lebih 25 meter. Diapit tebing yang menjulang tinggi, membuat pemandangan Air Terjun Tangkup terlihat semakin eksotis dan unik. Semua rasa lelah yang semula dirasakan pengunjung selama perjalanan akan terbayarkan dengan indahnya pemandangan di sana. Meski masih begitu melekat dengan wisata alam dan budayanya, namun desa ini sudah menyediakan penginapan, hotel hingga bungalow yang dibangun untuk para wisatawan yang berkunjung.\n" +
                "\n" +
                "\n",

                "Desa wisata undisan","Desa Wisata Undisan yang berlokasi di Bali merupakan salah satu lokasi wisata yang cukup menarik dan sayang kalau dilewatkan.",R.drawable.ds23);
        riwayatList.add(riwayat23);

        model_airterjun riwayat24 = new model_airterjun("Objek Wisata Desa Guliang Kangin di Bangli Bali adalah salah satu tempat wisata yang berada di Banjar Guliang Kangin, Desa Taman Bali, Kecamatan Bangli, Kabupaten Bangli, Bali, Indonesia.\n" +
                "\n" +
                "Objek Wisata Desa Guliang Kangin di Bangli Bali adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari. \n" +
                "\n" +
                "Objek Wisata Desa Guliang Kangin di Bangli Bali memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Bangli tidak mengunjungi Objek Wisata Desa Guliang Kangin di Bangli Bali yang mempunyai keindahan yang tiada duanya tersebut. \n" +
                "\n" +
                "Objek Wisata Desa Guliang Kangin di Bangli Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Objek Wisata Desa Guliang Kangin di Bangli Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat Objek Wisata Desa Guliang Kangin di kota Bangli.\n" +
                "\n" +
                "\n",

                "Desa wisata guliang kangin","Objek Wisata Desa Guliang Kangin di Bangli Bali adalah salah satu tempat wisata yang berada di Banjar Guliang Kangin.",R.drawable.ds24);
        riwayatList.add(riwayat24);

        model_airterjun riwayat25 = new model_airterjun("Objek Wisata Desa Sidetapa di Banjar Buleleng Bali adalah salah satu tempat wisata yang berada di Desa Sidetapa, Kecamatan Banjar, Kabupaten Buleleng, Bali, Indonesia. \n" +
                "\n" +
                "Objek Wisata Desa Sidetapa di Banjar Buleleng Bali adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari.\n" +
                "\n" +
                "Objek Wisata Desa Sidetapa di Banjar Buleleng Bali memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Buleleng tidak mengunjungi Objek Wisata Desa Sidetapa di Banjar Buleleng Bali yang mempunyai keindahan yang tiada duanya tersebut.\n" +
                "\n" +
                "Objek Wisata Desa Sidetapa di Banjar Buleleng Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Objek Wisata Desa Sidetapa di Banjar Buleleng Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat Objek Wisata Desa Sidetapa di kota Buleleng.\n" +
                "\n" +
                "\n",

                "Desa wisata sidetapa","Objek Wisata Desa Sidetapa di Banjar Buleleng Bali adalah salah satu tempat wisata yang berada di Desa Sidetapa, Kecamatan Banjar.",R.drawable.ds25);
        riwayatList.add(riwayat25);

        model_airterjun riwayat26 = new model_airterjun("Wisata Tenganan Pegringsingan di Manggis Karangasem Bali adalah salah satu tempat wisata yang berada di Desa Tenganan, Kecamatan Manggis, Kabupaten Karangasem, Bali, Indonesia.\n" +
                "\n" +
                "Wisata Tenganan Pegringsingan di Manggis Karangasem Bali adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari. \n" +
                "\n" +
                "Wisata Tenganan Pegringsingan di Manggis Karangasem Bali memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Karag tidak mengunjungi Wisata Tenganan Pegringsingan di Manggis Karangasem Bali yang mempunyai keindahan yang tiada duanya tersebut. \n" +
                "\n" +
                "Wisata Tenganan Pegringsingan di Manggis Karangasem Bali sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari libur lainnya.  Keindahan Wisata Tenganan Pegringsingan di Manggis Karangasem Bali ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat Wisata Tenganan Pegringsingan di kota Karangasem.\n" +
                "\n" +
                "\n",

                "Desa wisata pengrinsingan","Wisata Tenganan Pegringsingan di Manggis Karangasem Bali adalah salah satu tempat wisata yang berada di Desa Tenganan.",R.drawable.ds26);
        riwayatList.add(riwayat26);




















        mAdapter.notifyDataSetChanged();
    }


}
