package com.example.smartplant.old.konfig;

public class konfigurasi {
        //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
        //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
        //dimana File PHP tersebut berada
        //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
        public static final String URL_CONN="http://192.168.101.14/Android/koneksi.php";
        public static final String URL_ADD="http://192.168.43.213/Android/conto_create.php";
        public static final String URL_GET_ALL = "http://192.168.137.141/Android/smartplant/tentang_tampilsemua.php";
        public static final String URL_GET_EMP = "http://192.168.43.213/Android/smartplant/lihatdata.php";

        //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
        public static final String KEY_EMP_ID = "id_tentang";
        public static final String KEY_EMP_JUDUL = "judul";
        public static final String KEY_EMP_HEAD = "head"; //desg itu variabel untuk posisi
        public static final String KEY_EMP_HEAD2 = "head2";
        public static final String KEY_EMP_HEAD3 = "head3";
        public static final String KEY_EMP_DESKRIPSI ="deskripsi";
        public static final String KEY_EMP_NOMOR = "nomor";//salary itu variabel untuk gajih

        //JSON Tags
        public static final String TAG_JSON_ARRAY="result";
        public static final String TAG_ID = "id_tentang";
        public static final String TAG_JUDUL = "judul";
        public static final String TAG_HEAD = "head";
        public static final String TAG_HEAD2 = "head2";
        public static final String TAG_HEAD3 = "head3";
        public static final String TAG_DESKRIPSI = "deskripsi";
        public static final String TAG_NOMOR = "nomor";
        public static final String TAG_GAMBAR = "gambar";

        //ID karyawan
        //emp itu singkatan dari Employee
        public static final String EMP_ID = "emp_id";
    }



