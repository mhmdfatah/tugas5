package com.example.lenovo.tugasfatah5;

import java.util.ArrayList;

public class JamData {
    public static String[][] data = new String[][]{
            {"Yacht Master 42", "Pada Yacht-Master 42, bingkai cincin yang dapat diputar dua arahnya dipasangi sisipan bingkai cincin Cerachrom dengan graduasi 60 menit dari bahan keramik hitam matt. Graduasi dan angka-angka yang timbul dicetak pada keramiknya, lalu dipoles. Lima belas menit pertama digraduasi menit demi menit agar selang waktunya dapat dibaca setepat mungkin. Bingkai cincinnya juga dapat diputar dengan mudah berkat pinggirannya yang menonjol, membuatnya mudah dicengkeram.", "https://www.rolex.com/content/dam/rolex-58/homepage/roller-collection/baselworld/roller-static/homepage_new_yacht-master_42_0001_1050x825.jpg"},
            {"Sea Dweller", "Sea-Dweller dirancang berdasarkan kerja sama dengan para pelopor selam laut dalam profesional, yang banyak menghabiskan waktu lama di bawah air. Jam tangan perkakas yang sangat tahan lama ini menyertai program-program eksperimen awal habitat bawah air.", "https://www.rolex.com/content/dam/rolex-58/homepage/roller-collection/baselworld/roller-static/homepage_new_sea-dweller_0001_1050x825.jpg"},
            {"GMT Master II", "Dirancang sebagai alat bantu navigasi bagi para profesional yang menjelajahi dunia, seiring jalannya waktu GMT-Master menjadi jam tangan pilihan para pelancong. Bingkai cincin dengan warna tunggal atau ganda yang simbolis itu telah disediakan dalam beragam warna dan campuran. Hal itulah yang membuat rancangan ini unik dan mudah dikenali.", "https://www.rolex.com/content/dam/rolex-58/homepage/roller-collection/baselworld/roller-static/homepage_new_gmt-master_ii_0001_1050x825.jpg"},
            {"Day Date 36", "Saat diluncurkan pada tahun 1956, Day-Date merupakan inovasi besar: jam tangan berkalender pertama yang menunjukkan, selain tanggal, hari yang bersangkutan dieja penuh di dalam jendela melengkung di posisi pukul 12 – suatu prestasi teknis pada waktu itu. Penampilan nama hari tersedia dalam pilihan 26 bahasa. Jam-jam tangan dalam jajaran Day-Date hanya dibuat dari logam mulia – emas kuning, putih, atau Everose 18 karat atau platinum 950.", "https://www.rolex.com/content/dam/rolex-58/homepage/roller-collection/baselworld/roller-static/homepage_new_day-date_36_0001_1050x825.jpg"},
            {"Datejust 36", "Rolex Datejust merupakan arketipe dari jam tangan klasik berkat fungsi-fungsi dan estetikanya yang tidak pernah ketinggalan zaman. Diluncurkan pada tahun 1945, jam ini merupakan jam tangan kronometer kedap air pemuntir otomatis pertama yang menampilkan tanggal di jendela di posisi pukul 3 tepat di pelat jam, dan meleburkan semua inovasi besar yang telah disumbangkan Rolex ke dalam jam tangan modern hingga saat itu. Datejust telah bertahan sepanjang era sambil mempertahankan kode-kode estetikanya yang abadi, yang membuatnya sangat mudah dikenali.", "https://www.rolex.com/content/dam/rolex-58/homepage/roller-collection/baselworld/roller-static/homepage_new_datejust_36_0001_1050x825.jpg"},
            {"Datejust 31", "Rolex Datejust merupakan arketipe dari jam tangan klasik berkat fungsi-fungsi dan estetikanya yang tidak pernah ketinggalan zaman. Diluncurkan pada tahun 1945, jam ini merupakan jam tangan kronometer kedap air pemuntir otomatis pertama yang menampilkan tanggal di jendela di posisi pukul 3 tepat di pelat jam, dan meleburkan semua inovasi besar yang telah disumbangkan Rolex ke dalam jam tangan modern hingga saat itu. Datejust telah bertahan sepanjang era sambil mempertahankan kode-kode estetikanya yang abadi, yang membuatnya sangat mudah dikenali.77", "https://www.rolex.com/content/dam/rolex-58/homepage/roller-collection/baselworld/roller-static/homepage_new_datejust_31_0001_1050x825.jpg"},
    };
    public static ArrayList<Jam> getListData(){
        ArrayList<Jam> list = new ArrayList<>();
        for (String[] aData : data) {
            Jam jam = new Jam();
            jam.setName(aData[0]);
            jam.setDesc(aData[1]);
            jam.setPhoto(aData[2]);
            list.add(jam);
        }
        return list;
    }
}
