package com.example.drakorbyhn;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drakorbyhn.adapters.DramaLogoAdapter;
import com.example.drakorbyhn.models.DramaLogo;

import java.util.ArrayList;
import java.util.List;

public class LogoDramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_drama);

        RecyclerView teamsView = findViewById(R.id.rv_drama);

        List<DramaLogo> teams = new ArrayList<>();
        teams.add(new DramaLogo("https://en.wikipedia.org/wiki/What%27s_Wrong_with_Secretary_Kim#/media/File:What's_Wrong_with_Secretary_Kim.jpg", "What's Wrong With Secretary Kim"));
        teams.add(new DramaLogo("https://en.wikipedia.org/wiki/When_the_Weather_Is_Fine_(TV_series)#/media/File:I'll_Find_You_on_a_Beautiful_Day_main_poster.jpg", "When The Weather Is Good"));
        teams.add(new DramaLogo("https://upload.wikimedia.org/wikipedia/id/thumb/8/83/Logo_PSSI.png/150px-Logo_PSSI.png", "PSSI"));

        DramaLogoAdapter adapter = new DramaLogoAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
