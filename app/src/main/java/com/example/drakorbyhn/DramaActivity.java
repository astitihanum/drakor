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
        logo.add(new DramaLogo(R.drawable.itaewon_class, "Itaewon Class", "Park Seo-joon, Kim Da-mi, Yoo Jae-myung dan Kwon Nara",
            "Itaewon Class menceritakan tetang mantan terpidana Park Sae-roy (Park Seo-joon) yang hidupnya telah terbalik setelah ia dikeluarkan dari sekolah karena meninju perundung, dan ayahnya terbunuh dalam suatu kecelakaan. Mengikuti langkah-langkah ayahnya, ia membuka restoran bar DanBam di Itaewon dan bersama dengan manajer dan stafnya, berusaha keras menuju kesuksesan dan mencapai tingkat yang lebih tinggi."));
        logo.add(new DramaLogo(R.drawable.when_the_weather_is_fine,"When the Weather Is Fine","Park Min-young dan Seo Kang-joon",
                "Setelah mengalami beberapa kejadian buruk, Mok Hae-won (Park Min-young) meninggalkan Seoul untuk pergi ke Desa Bookhyun di Provinsi Gangwon yang merupakan tempat tinggalnya sewaktu kecil. Di sana, ia bertemu dengan Im Eun-seob (Seo Kang-joon), seorang pemilik toko buku yang hidup sederhana."));
        logo.add(new DramaLogo(R.drawable.the_heirs, "The Heirs", "Lee Min-ho dan Park Shin-hye",
                "Kehidupan anak pewaris kerajaan bisnis besar di Korea, Kim Tan (Lee Min Ho), yang jatuh cinta pada gadis lugu anak pembantu di rumahnya, Cha Eun Sang (Park Shin Hye)."));
        logo.add(new DramaLogo(R.drawable.descendants_of_the_sun,"Descendants of the Sun","Song Joong-ki, Song Hye-kyo, Jin Goo dan Kim Ji-won",
                "Kapten Yoo Si-jin (Song Joong-ki) adalah tentara pasukan khusus Tentara Angkatan Darat Korea Selatan yang memimpin kelompok khusus bernama Tim Alpha yang terpesona oleh kecantikan Kang Mo-yeon(Song Hye-Kyo) yang merupakan dokter di Rumah Sakit Haesung."));
        logo.add(new DramaLogo(R.drawable.school_2015,"Who Are You: School 2015","Kim So-hyun, Yook Sung-jae dan Nam Joo-hyuk",
                "Kim So-hyun berperan sebagai Go Eun-byul dan Lee Eun-bi yang merupakan saudara kembar. Kehidupan Lee Eun-bi di panti asuhan sedangkan Go Eun-byul, saudara kembar Eun-bi yang tinggal bersama seorang wanita yang mengadopsi dia. Karena bullying, Eun-bi memutuskan untuk mengakhiri hidupnya tetapi dia diselamatkan oleh saudara kembarnya."));
        logo.add(new DramaLogo(R.drawable.vip, "VIP", "Jang Na-ra, Lee Sang-yoon, dan Lee Chung-ah",
                "Bercerita tentang tim Sungwoon Department Store yang bekerja untuk klien VIP dengan persentase 1% dari total konsumen mereka. Suatu hari setelah menerima pesan teks tentang perselingkuhan suaminya dari sumber anonim, Na Jeong-seon mulai mencurigai suami dan rekan-rekannya berselingkuh."));
        logo.add(new DramaLogo(R.drawable.the_world_of_the_married,"The World of the Married","Kim Hee-ae dan Park Hae-joon",
                "Ji Sun-woo (Kim Hee-ae) adalah seorang dokter yang tampaknya menjalani kehidupan yang sempurna, tetapi mulai membalas dendam pada suaminya yang dia duga berselingkuh."));

        DramaLogoAdapter adapter = new DramaLogoAdapter(this, logo);
        logoView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        logoView.setLayoutManager(layoutManager);
        }
}
