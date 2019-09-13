package com.cstore.submission;

import java.util.ArrayList;

public class WisataData {

    private static String[] wisataNama = {
        "Umbul Ponggok",
        "Umbul Cokro",
        "Museum Gula Gondang Winangoen",
        "Waduk Rowo Jombor",
        "Candi Prambanan",
        "Candi Plaosan",
        "Arung Jeram Sungai Tubing Pusur",
        "Desa Wisata Deles Indah",
        "Taman Lampion Klaten",
        "Waterpark Galuh Tirtonimolo"
    };

    private static String[] wisataAlamat = {
        "Ponggok, Polanharjo, Klaten",
        "Cokro, Tulung, Klaten",
        "Jl. Jogja-Solo Km. 25, Plawikan, Jogonalan",
        "Jalan Rawa Jimbung, Krakitan, Bayat",
        "Bokoharjo, Prambanan",
        "Jl. Candi Plaosan, Bugisan, Prambanan",
        "Jalan Keprabon, Polanharjo",
        "Balerante, Kemalang",
        "Jl. Lek Panggih, Bareng Lor, Klaten Utara",
        "Jl. Manisrenggo Km. 1, Tlogo, Prambanan"
    };

    private static String[] wisataOperasional = {
        "Setiap hari pukul 07.00 - 17.00",
        "Setiap hari pukul 07.00 - 17.00",
        "Setiap hari pukul 08.00 - 15.00",
        "Setiap hari 24 Jam",
        "Setiap hari pukul 06.00 - 17.00",
        "Setiap hari pukul 09.00 - 17.00",
        "Setiap hari pukul 09.00 - 15.00",
        "Setiap hari 24 Jam",
        "Setiap hari pukul 08.00 - 18.00",
        "Setiap hari pukul 07.00 - 18.00"
    };

    private static String[] wisataHarga = {
        "Rp. 5.000 per orang",
        "Rp. 10.500 per orang, Rp. 3.000 (parkir motor)",
        "Rp. 3.000 per orang",
        "GRATIS",
        "Rp. 30.000 per orang, Rp. 10.000 - Rp. 15.000 (parkir)",
        "Rp. 3.000 per orang",
        "Rp. 40.000 - Rp. 60.000",
        "GRATIS",
        "GRATIS",
        "Rp. 15.000 per orang"
    };

    private static String[] wisataDetail = {
        "Siapa bilang Jawa Tengah tidak memiliki wahana wisata bawah air yang sangat menarik? Umbul Ponggok adalah kolam renang air tawar tempat menyelam, snorkeling, atau bahkan diving dengan pemandangan bawah air yang sangat unik. Wahana ini terletak di Desa Ponggok, Kecamatan Polanharjo, Kabupaten Klaten. Dengan luas sekitar 6.000 meter persegi dan kedalaman 1-3 meter, sehingga membuat kolam ini sangat seru untuk bermain air.",
        "Satu lagi obyek wisata air di Klaten yang tidak boleh kalian lewatkan, Obyek Mata Air Cokro atau Umbul Cokro. Di tempat ini kalian bisa bermain air sepuasnya dan ada banyak wahana permainan seperti di waterboom disini. Lokasi Umbul Cokro sendiri terletak di Desa Cokro, Kecamtan Tulung, Kabupaten Klaten.",
        "Kalau kalian ingin berwisata sambil menambah ilmu pengetahuan, kalian bisa mampir ke Museum Gula Gondang Winangoen. Disini kalian bisa melihat beraneka macam peralatan pabrik gulan tempo dulu. Tidak hanya museum gula saja yang ada disini, tetapi ada juga tempat bermain untuk anak-anak dan keluarga. Museum Gula Gondang Winangoen ini terletak di Gondang, Kabupaten klaten dan dengan luas mencapai 100 hektar. Katanya museum ini adalah museum gula terbesar se-Asia Tenggara.",
        "Pada dasarnya Waduk Rowo Jombor ini adalah waduk buatan atau danau pada umumnya, tetapi banyak dipenuhi dengan warung makan terapung dipinggiran waduk tersebut. Ditengah waduk terdapat ratusan keramba ikan segar yang nantinya akan dimasak dan dihidangkan kepada wisatawan dengan harga yang beragam. Selain terdapatrumah makan terapung, tempat wisata populer ini bisa dijadikan tempat memancing bagi pengunjung yang hobi memancing.",
        "Siapa yang tidak kenal dengan candi Prambanan. Candi Prambanan memiliki arsitektur tingkat tinggi, yang hingga kini tidak diketahui secara pasti teknik pembangunannya. Candi ini sudah terkenal di seluruh dunia. Wisatawan dari berbagai daerah dan negara datang kesini. Kompleks candi ini terletak di kecamatan Prambanan, Sleman dan Kecamatan Prambanan, Klaten, kurang lebih 17 kilometer timur laut Yogyakarta, 50 kilometer barat daya Surakarta dan 120 kilometer selatan Semarang. Candi ini merupakan salah satu candi termegah se-Asia Tenggara, dan sudah masuk dalam situs Warisan Dunia UNESCO.",
        "Candi Plaosan ini merupakan gabungan antara kebudayaan Budha dan Hindu, sehingga membentuk arsitektur yang unik dari pada candi-candi pada umumnya. Didalam kompleks candi Plaosan ini terdapat dua candi yang bentuknya mirip tapi sebenarnya berbeda, namanya adalah Cani Plaosan Lor dan Candi Kidul.",
        "Wisata arung jeram yang satu ini memudahkan pengunjung untuk menelusuri aliran Sungai Tubing Pusur dengan gelombang yang tidak terlalu deras. Berbeda dengan rafting di arung jeram, wisata yang satu ini menggunakan ban bagian dalam mobil atau truck secara terpisah bukan kelompok. Sensasi andrenalin yang ditawarkan juga sama menariknya dengan rafting arung jeram, hanya saja di Arung Jeram Sungai Tubing Pusur ini memiliki harga yang lebih murah dengan fasilitas yang setara dengan rafting arung jeram.",
        "Deles Indah adalah desa wisata yang menawarkan keasrian dan kearifan lokal budaya jawa di Klaten. Banyak peniggalan bersejarah jaman manusia purba hingga gua tua yang unik berada di dalam desa wisata ini. Seperti pesanggrahan Pakubuwono X yang dipercayasebagai tempat keramat untuk bertapa Raja Pakubuwono X. Ada juga Bukit Pring Cendani dimana terdapat pandangan hutan bambu yang sangat asri dan sejuk. Di bawah bukit sendiri terdapat Gua Sapuangin tempat dulu para tentara Jepang sembunyi saat perang.",
        "Di sebelah utara Klaten terdapat tata ruang hijau berupa Taman Lampion Klaten yang menjadi salah satu destinasi wisata yang murah meriah. Dinamakan Taman Lampion bukan berarti wisatawan akan menemukan berbagai jenis lampion disini, itu hanya sebutan saja. Taman Lampion Klaten bernuansa China sehingga penamaan Taman Lampion ini sesuai dengan kondisi keadaan taman. Terdapat fasilitas tempat duduk, taman bermain anak-anak, dan beberapa pedagang makanan atau angkringan di area luar taman.",
        "Salah satu obyek wisata air dengan berbagai wahana seru dan menyenangkan bisa ditemui di Waterpark Galuh Tirtonimolo, Klaten. Tempatnya lebih tepat berada di Hotel Galuh, tetapi fasilitas waterpark ini bisa dinikmati oleh semua masyarakat tanpa harus menginapk di hotel tersebut. Selain menyajikan kolam renang, seluncuran, dan wahana waterpark pada umumnya, tempat ini juga menyediakan taman bermain untuk anak-anak. Terdapat outbound, flying fox, bom-bom car, dan lain sebagainya."
    };

    private static int[] wisataPoto = {
        R.drawable.umbul_ponggok,
        R.drawable.umbul_cokro,
        R.drawable.museum_gula_gondang_winangoen,
        R.drawable.waduk_rowo_jombor,
        R.drawable.candi_prambanan,
        R.drawable.candi_plaosan,
        R.drawable.arung_jeram_sungai_ubing_pusur,
        R.drawable.desa_wisata_deles_indah,
        R.drawable.taman_lampion_klaten,
        R.drawable.waterpark_galuh_tirtonirmolo
    };

    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < wisataNama.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setNama(wisataNama[position]);
            wisata.setDetail(wisataDetail[position]);
            wisata.setPoto(wisataPoto[position]);
            wisata.setAlamat(wisataAlamat[position]);
            wisata.setOperasional(wisataOperasional[position]);
            wisata.setHarga(wisataHarga[position]);
            list.add(wisata);
        }
        return list;
    }

}
