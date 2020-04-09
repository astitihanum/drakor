package com.example.drakorbyhn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.drakorbyhn.adapters.DramaLogoAdapter;
import com.example.drakorbyhn.models.DramaLogo;

import java.util.ArrayList;
import java.util.List;

public class MedisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medis);

        RecyclerView logoView = findViewById(R.id.rv_medis);

        List<DramaLogo> logo = new ArrayList<>();
        logo.add(new DramaLogo(R.drawable.romantic_doctor_teacher_kim, "Dr. Romantic", "Han Suk-kyu, Yoo Yeon-seok, dan Seo Hyun-jin",
                "Bercerita tentang Boo Yong-joo (Han Suk-kyu), seorang dokter bedah jenius dan bersertifikat triple-board yang pernah berada di puncak kariernya dan dulu bekerja di rumah sakit terbaik Seoul bernama Geodae. Setelah insiden traumatis, ia menghilang dan mengubah namanya menjadi Kim Sa-bu. Dia mulai bekerja di rumah sakit kecil bernama Doldam yang terletak di Provinsi Gangwon. Dia membimbing Kang Dong-joo (Yoo Yeon-seok) dan Yoon Seo-jeong (Seo Hyun-jin) untuk menjadi dokter hebat dengan mengajari mereka bertarung melawan kekuasaan dan uang demi pasien."));
        logo.add(new DramaLogo(R.drawable.romantic_doctor_teacher_kim_2, "Dr. Romantic 2", "Han Suk-kyu, Ahn Hyo-seop, Lee Sung-kyung, dan Kim Joo-hun",
                "Kim Sa-bu (Han Suk-kyu) merupakan seorang dokter ahli bedah yang jenius. Awalnya, ia merupakan dokter ahli bedah terkemuka di rumah sakit besar. Sekarang, ia menjalankan profesinya di Rumah Sakit Doldam yang berlokasi di pedesaan.Cha Eun-jae (Lee Sung-kyung) merupakan seorang mahasiswi fellow tahun kedua yang suka belajar dan penuh percaya diri. Seo Woo-jin (Ahn Hyo-seop) juga merupakan mahasiswa fellow tahun kedua dan seorang ahli bedah."));
        logo.add(new DramaLogo(R.drawable.doctors,"Doctor Crush","Park Shin-hye, Kim Rae-won, Lee Sung-kyung, dan Yoon Kyun-sang",
                "Yoo Hye-jung (Park Shin-hye) adalah seorang gadis SMA yang keras kepala dengan kepribadian seperti seorang preman. Luka yang diperolehnya ketika masih kecil membuat Hye-jung menutup diri dari orang lain di sekitarnya. Namun, ia mulai berubah setelah bertemu dengan gurunya, Hong Ji-hong (Kim Rae-won), yang berperan penting dalam perubahan hidupnya dari yang -tidak memiliki harapan- menjadi dokter yang penuh kasih. Mereka berpisah kemudian bertemu lagi setelah 13 tahun, ketika Yoo Hye-jung telah menjadi seorang dokter."));
        logo.add(new DramaLogo(R.drawable.doctor_stranger,"Doctor Stranger","Lee Jong-suk, Jin Se-yeon, Park Hae-jin, dan Kang Sora",
                "Saat masih kecil, Park Hoon (Lee Jong-suk) dan ayahnya Park Cheol (Kim Sang-joong) diperdaya dan dikirim ke Korea Utara. Di Korea Utara, Park Hoon dilatih untuk menjadi dokter oleh ayahnya yang sudah menjadi dokter terkenal. Park Hoon menjadi seorang ahli bedah torakalis jenius setelah bersekolah di sekolah kedokteran di Korea Utara. Di sinilah ia jatuh cinta dengan Song Jae-hee (Jin Se-yeon)."));
        logo.add(new DramaLogo(R.drawable.hospital_playlist, "Hospital Playlist", " Jo Jung-suk, Yoo Yeon-seok, Jung Kyung-ho, Kim Dae-myung dan Jeon Mi-do", "Hospital Playlist bercerita tentang lima dokter yang telah berteman sejak mereka memasuki sekolah kedokteran pada tahun 1999."));
        logo.add(new DramaLogo(R.drawable.hospital_ship,"Hospital Ship"," Ha Ji-won dan Kang Min-hyuk",
                "Cerita tentang dokter muda yang memberikan perawatan medis kepada penduduk setempat yang tinggal di desa pedesaan melalui kapal rumah sakit yang berlayar mengelilingi pulau-pulau kecil."));

        DramaLogoAdapter adapter = new DramaLogoAdapter(this, logo);
        logoView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        logoView.setLayoutManager(layoutManager);
    }
}
