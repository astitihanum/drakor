package com.example.drakorbyhn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.drakorbyhn.adapters.DramaLogoAdapter;
import com.example.drakorbyhn.models.DramaLogo;

import java.util.ArrayList;
import java.util.List;

public class FantasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fantasi);

        RecyclerView logoView = findViewById(R.id.rv_fantasi);

        List<DramaLogo> logo = new ArrayList<>();
        logo.add(new DramaLogo(R.drawable.hotel_del_luna_, "Hotel del Luna", " Lee Ji-eun (IU) dan Yeo Jin-goo",
                "Hotel Del Luna, yang berlokasi di Seoul, tidak seperti hotel lain: semua tamunya adalah hantu. Jang Man-wol (Lee Ji-eun), yang terjebak di hotel tersebut selama bertahun-tahun, bertemu dengan Goo Chan-seong (Yeo Jin-goo), seorang manajer hotel baru. Bersama-sama mereka akan membuka rahasia kelam yang telah lama terpendam, yang membuat Jang Man-wol terjebak di Hotel Del Luna selama 1.300 tahun."));
        logo.add(new DramaLogo(R.drawable.hi_bye_mama,"Hi Bye, Mama!","Kim Tae-hee, Lee Kyu-hyung, Go Bo-gyul, Shin Dong-mi, Lee Shi-woo, dan Seo Woo-jin",
                "Cha Yu-ri (Kim Tae-hee) telah menjadi hantu sejak dia meninggal dalam kecelakaan tragis lima tahun lalu. Melalui proyek reinkarnasi, dia diberikan kemungkinan untuk menjadi manusia selama 49 hari. Dia kembali kepada putri dan suaminya yang telah menikah lagi, dan mencoba meringankan rasa sakit mereka sebelum pergi untuk selamanya"));
        logo.add(new DramaLogo(R.drawable.memories_of_the_alhambra,"Memories of the Alhambra","Hyun Bin dan Park Shin-hye",
                "Cerita dimulai dari seorang CEO Perusahaan Investasi, Yoo Jin Woo (diperankan Hyun Bin) dari Korea yang sedang pergi ke Barcelona Spanyol, untuk urusan bisnis. Suatu hari, dia mendapatkan telepon dari seseorang yang tidak dikenal dengan maksud menjual hasil karyanya berupa game virtual reality dengan nama Memories of Alhambra"));
        logo.add(new DramaLogo(R.drawable.the_king_eternal_monarch, "The King: Eternal Monarch","Lee Min-ho, Kim Go-eun, dan Woo Do-hwan",
                "Bercerita tentang seorang kaisar Korea bernama Lee Gon (Lee Min-ho) yang mencoba untuk menutup pintu ke dunia paralel yang dibuka oleh iblis yang dilepaskan oleh dewa ke dunia manusia dan seorang detektif bernama Jung Tae-eul (Kim Go- eun) yang mencoba melindungi banyak orang dan seseorang yang ia cintai"));
        logo.add(new DramaLogo(R.drawable.while_you_were_sleeping,"While You Were Sleeping"," Lee Jong-suk, Bae Suzy, Lee Sang-yeob, Jung Hae-in dan Ko Sung-hee",
                "Kisah tentang seorang wanita (Bae Suzy) yang dapat melihat peristiwa malang yang akan menimpa orang lain di dalam mimpinya, dan seorang jaksa (Lee Jong-suk) yang melakukan semua yang ia bisa untuk mencegah mimpi wanita tersebut menjadi kenyataan."));

        DramaLogoAdapter adapter = new DramaLogoAdapter(this, logo);
        logoView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        logoView.setLayoutManager(layoutManager);
    }
}
