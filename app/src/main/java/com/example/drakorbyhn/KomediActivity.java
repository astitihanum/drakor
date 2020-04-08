package com.example.drakorbyhn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.drakorbyhn.adapters.DramaLogoAdapter;
import com.example.drakorbyhn.models.DramaLogo;
import com.example.drakorbyhn.models.GenreDrama;

import java.util.ArrayList;
import java.util.List;

public class KomediActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komedi);

        RecyclerView logoView = findViewById(R.id.rv_komedi);

        List<DramaLogo> logo = new ArrayList<>();
        logo.add(new DramaLogo(R.drawable.when_the_camellia_blooms, "When the Camellia Blooms", "Gong Hyo-jin, Kang Ha-neul, dan Kim Ji-seok",
                "Drama ini mengisahkan seorang pemilik sebuah bar bermana Camellia yang memiliki kehidupan yang sangat realistis ketika dirinya bertemu dengan tiga orang pria yang sangat berbeda karakternya. Drama ini menggambarkan sebuah cinta yang sangat realistis dan penuh gairah di antara tiga pasangan. Dong Baek, seorang gadis pemilik bar yang menunjukkan bagaimana hidupnya sangat berselisih dengan pria yang baik, pria yang jahat, dan pria miskin."));
        logo.add(new DramaLogo(R.drawable.whats_wrong_with_secreatry_kim, "What's Wrong with Secretary Kim", "Park Seo-joon, Park Min-young dan Lee Tae-hwan",
                "Berputar di sekitar wakil ketua narsis dari perusahaan besar, Lee Young-joon, dan sekretarisnya yang sangat cakap, Kim Mi-So. Kesalahpahaman muncul ketika dia mengumumkan bahwa dia akan mengundurkan diri dari posisinya, setelah bekerja untuk Lee Young-joon selama sembilan tahun."));
        logo.add(new DramaLogo(R.drawable.her_private_life,"Her Private Life","Park Min-young, Kim Jae-wook dan Ahn Bo-hyun",
                "Sung Deok-mi (Park Min-young) adalah seorang kepala kurator berbakat di Cheum Museum of Art yang diam-diam menjadi penggemar fanatik Cha Shi-an (Jung Jae-won) dari grup White Ocean. Ryan Gold (Kim Jae-wook) adalah seorang seniman individualis dan karena ia mengalami sindrom Stendhal, ia akhirnya pensiun sebagai seorang seniman. Ryan Gold menjadi direktur baru Cheum Museum of Art tempat Deok-mi bekerja dan perlahan-lahan jatuh cinta padanya."));
        logo.add(new DramaLogo(R.drawable.crash_landing_on_you,"Crash Landing on You"," Hyun Bin, Son Ye-jin, Kim Jung-hyun, dan Seo Ji-hye",
                 "Yoon Se-ri (Son Ye-jin) adalah seorang pewaris konglomerat di Korea Selatan. Suatu hari, saat paralayang, kecelakaan yang disebabkan oleh angin kencang membuat Se-ri melakukan pendaratan darurat di Korea Utara. Di sana, ia bertemu dengan Ri Jeong-hyuk (Hyun Bin), seorang perwira tinggi Korea Utara. Jung-hyeok mencoba untuk melindungi dan menyembunyikannya. Segera setelah itu, ia jatuh cinta dengan Se-ri"));

        DramaLogoAdapter adapter = new DramaLogoAdapter(this, logo);
        logoView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        logoView.setLayoutManager(layoutManager);
    }
}
