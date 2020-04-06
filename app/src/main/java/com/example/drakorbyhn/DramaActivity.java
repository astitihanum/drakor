package com.example.drakorbyhn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.drakorbyhn.adapters.DramaLogoAdapter;
import com.example.drakorbyhn.models.DramaLogo;

import java.util.ArrayList;
import java.util.List;

public class DramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drama);

        RecyclerView logoView = findViewById(R.id.rv_drama);

        List<DramaLogo> logo = new ArrayList<>();
        logo.add(new DramaLogo(R.drawable.hospital_playlist, "Hospital Playlist", " Jo Jung-suk, Yoo Yeon-seok, Jung Kyung-ho, Kim Dae-myung dan Jeon Mi-do", "Hospital Playlist bercerita tentang lima dokter yang telah berteman sejak mereka memasuki sekolah kedokteran pada tahun 1999."));
        logo.add(new DramaLogo(R.drawable.itaewon_class, "Itaewon Class", "Park Seo-joon, Kim Da-mi, Yoo Jae-myung dan Kwon Nara",
            "Itaewon Class menceritakan tetang mantan terpidana Park Sae-roy (Park Seo-joon) yang hidupnya telah terbalik setelah ia dikeluarkan dari sekolah karena meninju perundung, dan ayahnya terbunuh dalam suatu kecelakaan. Mengikuti langkah-langkah ayahnya, ia membuka restoran bar DanBam di Itaewon dan bersama dengan manajer dan stafnya, berusaha keras menuju kesuksesan dan mencapai tingkat yang lebih tinggi."));
        logo.add(new DramaLogo(R.drawable.when_the_weather_is_fine,"When the Weather Is Fine"," Park Min-young dan Seo Kang-joon",
                "Setelah mengalami beberapa kejadian buruk, Mok Hae-won (Park Min-young) meninggalkan Seoul untuk pergi ke Desa Bookhyun di Provinsi Gangwon yang merupakan tempat tinggalnya sewaktu kecil. Di sana, ia bertemu dengan Im Eun-seob (Seo Kang-joon), seorang pemilik toko buku yang hidup sederhana."));


        DramaLogoAdapter adapter = new DramaLogoAdapter(this, logo);
        logoView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        logoView.setLayoutManager(layoutManager);
        }
}
