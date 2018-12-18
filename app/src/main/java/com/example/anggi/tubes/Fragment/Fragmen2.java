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

public class Fragmen2 extends Fragment {

    private RecyclerView recyclerView; //memanggil deklarasi recyclerview
    private adapter_airterjun mAdapter; //memanggil adapter
    private List<model_airterjun> riwayatList = new ArrayList<>(); //memanggil model / dataset
    private RecyclerView.LayoutManager mLayout ; // memanggil layout recylerview
    public model_airterjun mode;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.activity_fragmen2, container, false); //menghubungkan dengan view
        View view = inflater.inflate(R.layout.activity_fragmen2, container, false);
        final RecyclerView.LayoutManager layoutManager;
        layoutManager = new GridLayoutManager(getActivity(), 1, GridLayoutManager.VERTICAL, false);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bismillah);
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
        model_airterjun riwayat = new model_airterjun("Sate Lilit adalah menu sate khas Bali. Sate ini biasa digunakan untuk acara adat yang sakral, sate lilit berbeda dengan sate pada umumnya, sate ini tidak ditusuk melainkan dagingnya dililit dbatang sereh atau bambu lalu dibakar.\n" +
                "\n" +
                "merupakan makanan khas Bali yang diolah menggunakan bahan daging, daging yang sering digunakan adalah daging babi, ikan, ayam, sapi dan kura-kura. Daging tersebut akan dihaluskan dan dicampur dengan parutan kelapa, santan, jeruk nipis, bawang merah dan merica. Daging yang telah dicampur itu akan dililitkan di bambu, batang serai atau tebu dan terakhir akan dipanggang. Kebanyakan sate memang ditusuk dengan tusuk sate yang tajam, untuk sate lilit ini membutuhkan tusuk sate yang permukaannya luas sehingga daging akan mudah untuk melekat di tusuk satenya.\n" +
                "\n" +
                "Dalam bahasa Bali dan Indonesia “lilit” berarti membungkus dan sangat sesui dengan sate lilit ini.Filosofi Sate Lilit,\n" +
                "Sate Lilit ini merupakan simbol dari kehidupan dan syarat kejantanan seorang pria. Sate lilit dibuat oleh kaum pria dari memotong hewan sampai memanggangnya. Ada beberapa upacara besar yang mengharuskan membuat sate lilit di balai desa yang dilakukan oleh 50 sampai 100 kaum pria.\n" +
                "\n" +
                "Sate lilit tidak hanya dinikmati saja, umat Hindu juga mempersembahkannya dalam acara-acara keagamaan seperti upacara caru, upacara ini bertujuan untuk menghormati dewa dan jumlah sate yang harus disajikan harus ganjil. Sate lilit bisanya dihidangkan dengan sup ikan tuna, nasi dan sambal matah. Sate Lilit juga menjadi makanan favorit untuk wisatawan yang datang ke Bali.\n" +
                "\n" +
                "\n",

                "Sate lilit","Sate Lilit adalah menu sate khas Bali.",R.drawable.m1);
        riwayatList.add(riwayat);

        model_airterjun riwayat2 = new model_airterjun("Ayam betutu adalah makanan dari daging ayam yang di isi dengan bumbu rempah-rempah tradisional khas Bali kemudian di panggang dalam bara api. Ayam Betutu sangat terkenal di Pulau Bali selain sebagai makanan khas, ayam betutu juga merupakan makanan untuk sajian pada upacara-upacara keagamaan umat hindu di pulau Bali.\n" +
                "\n" +
                "Selain Sate Lilit ada lagi kuliner dari Bali yang sayang jika tidak dicoba. Bagi Anda yang gemar dengan makanan yang berasal dari ayam, bisa jadi makanan ini merupakan pilihan yang pas untuk menuntaskan rasa lapar Anda.\n" +
                "\n" +
                "Dari asal katanya, ayam betutu merupakan daging yang diisi dengan bumbu lalu dipanggang dalam api sekam. Lauk ini cukup populer di seluruh kabupaten di Bali. Hanya saja, jika Anda ingin mencicipi makam anan ini dari produsennya langsung, Anda bisa berkunjung ke desa Melinggih, kecamatan Payangan kabupaten Gianyar. Daerah ini dikenal banyak memproduksi ayam betutu yang juga menjadi makanan khas daerah Gilimanuk.\n" +
                "\n" +
                "stimewanya, makanan ini bukan saja menjadi lauk pauk yang menemani nasi dan bisa dikonsumsi sehari-hari, namun lauk ini juga menjadi sajian syarat pada sebuah upcara adat dan keagamaan.\n" +
                "\n" +
                "Ayam Betutu ini bukan saja digemari wisatawan lokal saja namun saat ini kelezatannya juga dipuja oleh wisatawan mancanegara. Di beberapa hotel dan restaurant, makanan ini bahkan menjadi salah satu pilihan yang terdapat pada daftar menu.\n" +
                "\n" +
                "\n",

                "Ayam betutu","Ayam betutu adalah makanan dari daging ayam yang di isi dengan bumbu rempah-rempah tradisional khas Bali",R.drawable.m2);
        riwayatList.add(riwayat2);

        model_airterjun riwayat3 = new model_airterjun("Babi guling (di Bali disebut be guling) adalah sejenis makanan yang terbuat dari anak babi betina atau jantan yang perutnya diisikan dengan bumbu dan sayuran seperti daun ketela pohon dan lalu dipanggang sambil diputar-putar (diguling-gulingkan) sampai matang dengan ditandai dengan perubahan warna kulit menjadi kecoklatan dan renyah. \n" +
                "\n" +
                "Awalnya babi guling pada mulanya digunakan untuk sajian pada upacara baik upacara adat maupun upacara keagamaan, namun saat ini babi guling telah dijual sebagai hidangan baik di warung-warung, rumah makan, bahkan hotel-hotel tertentu di daerah Bali dan lainnya.\n" +
                "\n" +
                "Babi guling – nama yang menggambarkan cara memanggangnya dengan pemanggang yang diputar-gulingkan dengan tangan yang diletakkan di atas api – bukan hal yang lazim ditemukan di Indonesia, sebuah negara dengan populasi Muslim terbesar di dunia.\n" +
                "\n" +
                "Tetapi Bali merupakan sebuah anomali: sebagian besar penduduknya menganut Hindu Dharma, Hindu yang dikombinasikan dengan kepercayaan tradisional lokal, yang berarti babi – yang biasanya dilarang di negara Islam – sangat mudah ditemukan di sini. Bahkan, makan bali guling di Bali bisa jadi merupakan pengalaman bersantap paling unik di negara ini.\n" +
                "\n" +
                "\n",

                "Babi guling","Babi guling (di Bali disebut be guling) adalah sejenis makanan yang terbuat dari anak babi.",R.drawable.m3);
        riwayatList.add(riwayat3);

        model_airterjun riwayat4 = new model_airterjun("Nasi jenggo (atau nasi jinggo) adalah makanan siap saji khas Bali yang dikemasan daun pisang dengan porsi kecil. Sebelum krismon tahun 1997, nasi jenggo dijual per porsi seharga Rp 1500,- (dalam bahasa Hokkien, jeng go memiliki arti \"seribu lima ratus\"). Kini, harga satu porsi nasi jenggo adalah sekitar Rp 2000,- sampai Rp 4000,-. Karena porsi nasi jenggo sangat sedikit, pembeli biasanya membeli nasi jinggo sebanyak beberapa bungkus agar dapat kenyang.\n" +
                "\n" +
                "Nasi Jinggo sudah diperdagangkan pada tahun 1980-an. Nasi Jinggo pertama dijual di Jalan Gajah Mada, Denpasar. Penjual pertama adalah sepasang suami istri yang menjual dari sore sampai malam.\n" +
                "\n" +
                "Kreasi makanannya banyak yang menyukai sehingga banyak pedagang yang menjual nasi jinggo di kawasan Bali. Ada sumber yang mengatakan bahwa Jinggo berarti “Seribu lima ratus”  atau “pengendara motor asli Bali” .\n" +
                "\n" +
                "Nasi Jinggo sudah menjadi ciri khas masyarakat Bali, nasi ini memiliki kesan sendiri yaitu nasi rakyat, nasi sederhana, nasi murah dan meriah.\n" +
                "\n" +
                "\n",

                "Nai jinggo","Nasi jenggo (atau nasi jinggo) adalah makanan siap saji khas Bali yang dikemasan daun pisang dengan porsi kecil. ",R.drawable.m4);
        riwayatList.add(riwayat4);

        model_airterjun riwayat5 = new model_airterjun("Nasi Tepeng merupakan salah satu khas Gianyar, Bali. Makanan ini berbahan dasar nasi yang dibumbui dengan rempah-rempah dan lada sehingga menghasilkan cita rasa yang gurih dan pedas. Biasanya nasi ini disajikan bersama sayur lainnya seperti kacang panjang, kacang merah, nangka muda, terong, daun kelor, dan kelapa parut.\n" +
                "\n" +
                "Nasi Tepeng merupakan makanan khas yang berasal dari Gianyar, makanan yang dimasak dengan campuran lengkap rempah-rempah dan lada membuat terasa pedas di lidah.\n" +
                "\n" +
                "Nasi Tepeng disajikan cukup lembek seperti bubur. Racikan bumbu rempah-rempah ala Bali yang disiram di atas Tepeng menjadi daya pikat utamanya.\n" +
                "\n" +
                "Secara khusus, nasi tepeng khas Gianyar ini menjadi pilihan masyarakat Gianyar ketika pagi hari. Apalagi, nasi ini memiliki tekstur seperti bubur. Nasi khas Gianyar ini punya tekstur yang cukup lembek. Namun, hal yang cukup unik dijumpai dari kuliner tradisional ini adalah, rasanya yang terbilang cukup pedas. Tidak hanya itu, nasi ini juga di dalamnya terdapat berbagai bumbu rempah-rempah khas Bali yang membuatnya punya cita rasa berbeda.\n" +
                "\n" +
                "\n",

                "Nasi tepeng","Nasi Tepeng merupakan makanan khas yang berasal dari Gianyar, ",R.drawable.m5);
        riwayatList.add(riwayat5);

        model_airterjun riwayat6 = new model_airterjun("Sate plecing adalah sate khas Bali yang memiliki rasa yang unik karena disajikan dengan bumbu plecing. Bumbu plecing adalah sambal terasi yang diracik dengan bumbu rempah-rempah disajikan dan diberi sedikit perasan jeruk nipis.\n" +
                "\n" +
                "Tentunya membuat rasa sate menjadi lebih lezat ditambah tekstur dagingnya empuk dan kenyal. Kamu juga bisa memilih bumbu kental manis jika kamu tidak suka rasa pedas. Sate plecing umumnya menggunakan daging babi tetapi ada juga yang menggunakan daging ayam, sapi atau lainnya. Warung ini selalu ramai sehingga kamu harus rela antri untuk menikmati seporsi sate plecing yang terletak di Jalan Arjuna No.47 Denpasar.\n" +
                "\n" +
                "Menu utama yang disajikan oleh warung ini tentu saja Sate Plecing babi. Selai itu ada pula soto babat. Jika Anda seorang muslim atau seorang yang tidak menyukai daging babi tak perlu khawatir. Karena setiap pengunjung yang datang akan ditawari menu yang disajikan terlebih dahulu sebelum memakannya. Untuk gantinya, Anda bisa memilih beragam Sate Plecing lainnya. Misalnya Sate Plecing ayam atau Sate Plecing sapi. Meskipun daging pembuatnya berbeda, namun rasanya tetap sama.\n" +
                "\n" +
                "Sate Plecing memang beda dari sate lainnya. Jika biasanya sate dipadu dengan saus kacang atau kecap, Sate Plecing menggunakan sambal khas Bali. Sambal ini terbuat dari cabai yang diracik bersama bawang putih, kemiri, terasi kemudian disiram minyak dan jeruk limau. Buat yang suka makanan pedas, sate ini tentu akan menjadi kuliner favorit. Setelah dibakar di atas arang panas, sate disajikan dengan sambal plecing pedas atau manis sesuai selera.\n" +
                "\n" +
                "\n",

                "Sate plecing","Sate plecing adalah sate khas Bali yang memiliki rasa yang unik karena disajikan dengan bumbu plecing.",R.drawable.m6);
        riwayatList.add(riwayat6);

        model_airterjun riwayat7 = new model_airterjun("Tum adalah pepes versi Bali yang dibuat dari daging ayam, itik, bebek, kuwir, penyu, atau ikan laut. Bumbunya terdiri dari santan dan bumbu gurih khas Bali seperti bawang merah, bawang putih, cabai merah, dan merica.\n" +
                "\n" +
                "Daging atau ikan yang digunakan, harus dicincang terlebih dahulu agar halus dan dibumbui dengan berbagai rempah serta santan, lalu dibungkus dengan daun pisang dan dikukus. Teksturnya yang lembut dan rasanya yang kaya rempah membuat tum enak disantap dengan nasi hangat.\n" +
                "\n" +
                "tum ayam banyak disukai oleh semua kalangan usia. Mulai dari anak-anak hingga orang dewasa. Tidak heran jika banyak restoran di Bali sudah menjadikannya sebagai menu makanan andalan, khususnya restoran yang berlokasi di sekitar area destinasi wisata Bali.\n" +
                "\n" +
                "Biasanya dihidangkan pada berbagai acara tradisional di Bali. Misalnya acara keagamaan, syukuran dan upacara adat lainnya. Tidak jarang juga disediakan pada acara istimewa seperti pernikahan. Walaupun tidak menutup kemungkinan juga dihidangkan sebagai makanan sehari-hari di rumah masyarakat Bali.\n" +
                "\n" +
                "\n",

                "Tum ayam","Tum adalah pepes versi Bali yang dibuat dari daging ayam, itik, bebek, kuwir, penyu, atau ikan laut.",R.drawable.m7);
        riwayatList.add(riwayat7);

        model_airterjun riwayat8 = new model_airterjun("Sensasi pedas akan kamu rasakan setelah mencicipi irisan manga dengan campuran kuah pindang dan cabai yang super pedas. Gak cuma mangga, kamu juga bisa menggantinya dengan buah lain atau rumput laut. Di Bali, rujak rumput laut yang menggunakan kuah pindang disebut rujak bulung.\n" +
                "\n" +
                "1Rujak Bulung dibuat dengan cara mencampur rumput laut dengan garam, cabai rawit, terasi, kencur, dan parutan kelapa muda. Istimewanya cara makannya adalah dengan dikuahi oleh kuah pindang.\n" +
                "\n" +
                "Rasa manis pedas yang tercipta dari hidangan ini membuat cocok untuk dinikmati saat siang hari. Apalagi, rumput lautnya membuat penikmatnya merasakan kesegaran dalam setiap suapannya.\n" +
                "\n" +
                "Biasanya, satu porsi Rujak Bulung ini dibandrol dengan harga 15 ribu rupiah. Sahabat Sporto bisa mencicipinya di warung-warung kecil sekitar Bali. Seperti di wilayah Jalan Blambangan, Kuta, Bali.\n" +
                "\n" +
                "\n",

                "Rujak bulung","Sensasi pedas akan kamu rasakan setelah mencicipi irisan manga dengan campuran kuah pindang dan cabai yang super pedas.",R.drawable.m8);
        riwayatList.add(riwayat8);

        model_airterjun riwayat9 = new model_airterjun("sate kakul adalah sebuah makanan yang lezat dilidah dan terbuat dari kerang darah yang dimasak dengan cara dibakar seperti sate dan dibumbui dengan bumbu yang sederhana sehingga makanan ini dinamakan sate kakul. Sate kakul memiliki ciri khas rasa yang begitu pedas memang dan dapat disantap atau dipadukan dengan nasi putih. \n" +
                "\n" +
                "Sate kakul adalah salah satu kuliner lezat yang khas dari pulau bali. terbuat dari kerang darah membuat sate kakul menjadi kategori masakan seafood yang unik. kerang darah yang biasanya diolah menjadi masakan kuah seperti Gulai Kerang, Kerang Saus Tiram, Kerang Asam Manis, Tumis Kerang Darah, Kerang Darah Cabai Hijau dan Kerang Saus Padang Enak yang resepnya sudah kami bagikan beberapa waktu lalu. kini kerang darah di olah menjadi sate.\n" +
                "\n" +
                "Untuk sate kakul masakan Bali asli sebenarnya menggunakan daging kakul. kakul adalah sejenis keong atau siput yang hidup disawah yang terkenal dengan nama keong sawah. biasanya keong sawah yang memiliki tekstur kenyal ini dimasak dengan bumbu rempah khas Bali lengkap dengan kerang darah yang membuat kakul semakin istimewa. untuk masakan kakul jenis masakannya bisa beragam dari sate kakul maupun gulai kakul yang enak dan gurih.\n" +
                "\n" +
                "Di Bali sate kakul pedas ini biasanya disantap bersama jukut ares. bagi anda yang belum tahu apa itu jukut ares, kami akan jelaskan sedikit untuk anda. Jukut ares adalah salah satu sayur khas yang sangat populer dan ngetop di Bali. jukut ares ini terbuat dari pohon pisang muda yang diiris-iris tipis, kemudian diperas berulangkali lalu direbus. namun bagi yang Muslim, jakut ares ini merupakan masakan yang non halal. karena selain menggunakan bumbu lengkap khas bali yang sering disebut Basa Genep, jukut ares ini di campur dengan daging babi.\n" +
                "\n" +
                "\n",

                "Sate kakul","sate kakul adalah sebuah makanan yang lezat dilidah dan terbuat dari kerang darah.",R.drawable.m9);
        riwayatList.add(riwayat9);

        model_airterjun riwayat10 = new model_airterjun("Lawar adalah masakan berupa campuran sayur-sayuran dan daging cincang yang dibumbui secara merata yang berasal dari Bali. Makanan ini lazim disajikan dalam rumah tangga di Bali atau dijual secara luas di rumah-rumah makan dengan sebutan lawar Bali. Lawar dibuat dari daging yang dicincang, sayuran, sejumlah bumbu-bumbu dan kelapa. Kadang-kadang di beberapa jenis lawar diberikan unsur yang dapat menambah rasa dari lawar itu yaitu darah dari daging itu sendiri. \n" +
                "\n" +
                "Darah tersebut dicampurkan dengan bumbu-bumbu tertentu sehingga menambah lezat lawar tersebut. Lawar sendiri tidak dapat bertahan lama makanan ini jika didiamkan di udara terbuka hanya bertahan setengah hari.\n" +
                "\n" +
                "2Lawar adalah masakan khas Bali yang umumnya terbuat dari parutan kelapa yang dicampur dengan daging cincang (babi atau ayam atau penyu), bumbu Bali, dan tentunya darah setengah matang. Lawar merupakan masakan yang wajib ada dalam setiap kegiatan pesta adat masyarakat Bali.\n" +
                "\n" +
                "Karena tanpa lawar, makanan yang disajikan menjadi kurang lengkap. Selain enak ( bagi yang suka ) tidak untuk saya , karena kebetulan sy Vegetarian ( tidak makan daging ) , lawar sebagai makanan tradisional Bali ternyata memiliki filosofi tersendiri.\n" +
                "\n" +
                "\n",

                "Lawar","Lawar adalah masakan berupa campuran sayur-sayuran dan daging cincang yang dibumbui secara merata yang berasal dari Bali. ",R.drawable.m10);
        riwayatList.add(riwayat10);

        model_airterjun riwayat11 = new model_airterjun("Blayag adalah ketupat alias lontong yang dibungkus dengan janur. Dipakainya janur sebagai pembungkusnya karena memang kondisi geografi Bali Utara yang agak kering dan berpantai menyebabkan pohon kelapa mendominasi. Blayag rasanya sangat khas serta tidak terlalu lembek. \n" +
                "\n" +
                "Blayag Kuah adalah salah satu olahan Blayag yang paling banyak digemari sehingga menyebar ke seluruh Bali. Blayag disajikan dengan telor, ayam suir, toge/ lawar, sambal, kemudian disiram dengan kuah bersantan mirip kuah kare dan ditaburi dengan kedele goreng. Rasanya benar-benar bervariasi mulai dari gurih, sedikit manis, dan pedas.\n" +
                "\n" +
                "Menjamurnya resep masakan modern belakangan ini, nampaknya tidak membuat resep masakan lokal krama Bali kalah saing. Sejumlah resep masakan tradisional yang unik dan mengandung cita rasa tinggi kini tetap eksis. Salah satunya adalah Tipat Blayag. Resep masakan yang satu ini diciptakan oleh pendahulu di Desa Pengelatan, Kecamatan Buleleng. Untuk menjangkau desa ini, bisa ditempuh dengan perjalanan darat sekitar delapan kilometer dari arah kota Singaraja.\n" +
                "\n" +
                "Di desa ini, resep Tipat Blayag yang kini terkenal di seluruh Buleleng dan bahkan ke luar daerah itu tetap dijaga kelestariannya. Ibu-ibu rumah tangga pun menjadikan resep Tipat Blayag yang tidak ada di daerah lainnya itu sebagai usaha untuk menopang ekonomi keluarga. Bahkan, Tipat Blayag kini mulai dilirik untuk hidangan di ajang pesta resepsi perkawinan maupun pada event yang digelar instansi pemerintah maupun swasta.\n" +
                "\n" +
                "\n",

                "Blayag","Blayag adalah ketupat alias lontong yang dibungkus dengan janur. ",R.drawable.m11);
        riwayatList.add(riwayat11);


        mAdapter.notifyDataSetChanged();
    }
}
