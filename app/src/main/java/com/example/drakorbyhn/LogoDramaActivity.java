package com.example.drakorbyhn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.drakorbyhn.adapters.DramaLogoAdapter;
import com.example.drakorbyhn.models.DramaLogo;

import java.util.ArrayList;
import java.util.List;

public class LogoDramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_drama);

        RecyclerView dramaView = findViewById(R.id.rv_drama);

        List<DramaLogo> teams = new ArrayList<>();
        teams.add(new DramaLogo("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
        teams.add(new DramaLogo("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));

        DramaLogoAdapter adapter = new DramaLogoAdapter(this, teams);
        dramaView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        dramaView.setLayoutManager(layoutManager);
    }
}
