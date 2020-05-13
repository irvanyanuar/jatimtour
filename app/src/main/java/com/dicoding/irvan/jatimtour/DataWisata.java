package com.dicoding.irvan.jatimtour;

import java.util.ArrayList;

public class DataWisata {
    private static String[] namaTempat = {
            "Gunung Ijen",
            "Air Terjun Madakaripura",
            "Gunung Bromo",
            "Taman Nasional Baluran",
            "Coban Talun",
            "Gunung Semeru",
            "Pantai Balekambang",
            "Kenjeran Park",
            "Bukit Jaddih",
            "Pantai Karang Bolong"
    };

    private static String[] detailTempat = {
            "Gunung Ijen dikenal dengan kawahnya yang memiliki api biru atau blue fire. Kamu bisa menikmati keindahan api biru sebelum pukul 4 pagi. Di dunia, hanya ada dua negara yang memiliki blue fire, yakni Indonesia di Banyuwangi dan Islandia.",
            "Air terjun dengan ketinggian 200 meter ini dinyatakan sebagai yang tertinggi di Pulau Jawa. Lokasinya berada di lembah sempit yang dikelilingi tebing curam, sehingga membuat pesona air terjun ini tak terkalahkan.\n" + "\n" + "Untuk mencapainya, kamu akan menempuh perjalanan selama satu jam. Sepanjang perjalanan, pemandangan epik akan memanjakan penglihatanmu.",
            "Gunung Bromo memiliki banyak spot foto yang menarik. Mulai dari Bukit Teletubbies, pasir berbisik, Pura Luhur Poten, hamparan padang rumput, hingga Gunung Batok. Keindahan sunrise di sini benar-benar mengagumkan.",
            "Sebutan Little Africa in Java melekat pada Taman Nasional Baluran. Saat mengunjunginya, kamu akan langsung merasakan vibes layaknya di Afrika.\n" +"\n" + "Banyak hewan yang bisa kamu temui di sini, seperti kerbau, banteng, hingga rusa. Tak hanya itu, Savana Bekol membuat kawasan ini menjadi makin terasa di Afrika dengan hamparan padang rumput keringnya. ",
            "Untuk mencapai air terjun ini, kamu tak perlu bersusah-payah. Sebab, sudah ada jalanan setapak yang mudah dilalui.\n" + "\n" + "Sepanjang perjalanan, kamu akan disambut pepohonan pinus yang gak kalah indah. Sesampainya di lokasi, segala perjuanganmu akan langsung terbayarkan, terutama saat melihat keindahan aliran air yang menyegarkan. ",
            "Gunung Semeru sempat jadi lokasi syuting 5 CM yang membuat tempat ini makin populer. Saat mengunjungi Gunung Semeru, biasanya para pendaki akan singgah di tepi Danau Ranu Kumbolo. Keindahan sunrise atau sunset  di Ranu Kumbolo begitu indah. ",
            "Tak perlu jauh-jauh ke Tanah Lot, Bali, kamu bisa mengunjungi Pantai Balekambang di Malang. Seperti di Tanah Lot, ada Pura Kecil yang berdiri di atas Pulau Batu.\n" + "\n" + "Kamu bisa mengunjungi pura tersebut dengan melalui jembatan sepanjang 100 meter. Sangat disarankan datang saat matahari terbenam, karena pemandangannya sangat memukau. ",
            "Terletak di Surabaya bagian timur, kamu bisa menemukan Kenjeran Park yang memiliki Klenteng Sanggar Agung, Atlantis Land, Patung Buddha, hingga Pagoda Tian Ti. Kamu juga bisa sekaligus mampir ke Jembatan Suroboyo dan Jembatan Suramadu yang tak jauh dari sana. ",
            "Bukit kapur bekas pertambangan ini memberikan keunikan tersendiri. Di bagian tengah bukit, terdapat tempat terbuka yang menyerupai pemandian umum.\n" + "\n" + "Namun, kamu tidak diperbolehkan berenang di dalamnya. Sebaiknya menyewa perahu untuk menjelajahinya. Waktu terbaik datang ke sini, yakni menjelang sore, supaya panasnya tak menyengat. ",
            "Cocok banget buat kamu yang ingin menikmati keindahan matahari terbit dan terbenam dengan pemandangan unik. Matahari terbenam atau terbit berada pas di bagian atas tebing yang berlubang. Asyik banget buat melipir sejenak dari hiruk pikuk perkotaan."
    };

    private static String[] lokasi = {
            "Kabupaten Banyuwangi dan Bondowoso, Jawa Timur ",
            "Dusun Branggah, Desa Negororejo, Kecamatan Lumbang, Kabupaten Probolinggo, Jawa Timur ",
            "Kabupaten Probolinggo, Pasuruan, Lumajang, dan Malang, Jawa Timur ",
            "Desa Sumberwaru, Kecamatan Banyuputih, Kabupaten Situbondo, Jawa Timur ",
            "Dusun Wonorejo, Desa Tulungrejo, Kecamataan Bumiaji, Kota Batu, Jawa Timur",
            "Desa Ngampo, Kecamatan Pasrujambe, Kabupaten Lumajang, Jawa Timur",
            "Jalan Balekambang, Dusun Balaikambang, Desa Srigonco, Kecamatan Bantur, Kabupaten Malang, Jawa Timur",
            "Jalan Sukolilo, Desa Sukolilo Baru, Kecamatan Bulak, Kota Surabaya, Jawa Timur ",
            "Dusun Jakan, Desa Parseh, Kecamatan Socah, Kabupaten Bangkalan, Jawa Timur",
            "Dusun Kendal, Desa Sendang, Kecamatan Pacitan, Kabupaten Pacitan, Jawa Timur"
    };

    private static String[] jam = {
            "24 jam",
            "08.00-16.00",
            "24 jam",
            "07.30 - 16.00",
            "07.00 - 17.00",
            "24 jam",
            "24 jam",
            "09.00 - 17.00",
            "08.00 - 17.00",
            "24 jam"
    };

    private static String[] harga = {
            "Rp5.000 - Rp7.500",
            "Rp16.000 - Rp18.000",
            "Rp29.000 - Rp34.000",
            "Rp17.500",
            "Rp10.000",
            "Rp19.000 - Rp24.000",
            "Rp10.000 - Rp15.000",
            "Rp15.000",
            "Rp5.000",
            "Rp5.000"

    };

    private static int[] gambar = {
            R.drawable.gunung_ijen,
            R.drawable.air_terjun_madakaripura,
            R.drawable.gunung_bromo,
            R.drawable.taman_nasional_baluran,
            R.drawable.coban_talun,
            R.drawable.gunung_semeru,
            R.drawable.pantai_balekambang,
            R.drawable.kenjeran_park,
            R.drawable.bukit_jaddih,
            R.drawable.pantai_karang_bolong
    };

    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < namaTempat.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setNama(namaTempat[position]);
            wisata.setDetail(detailTempat[position]);
            wisata.setLokasi(lokasi[position]);
            wisata.setJam(jam[position]);
            wisata.setHarga(harga[position]);
            wisata.setPhoto(gambar[position]);
            list.add(wisata);
        }
        return list;
    }
}
