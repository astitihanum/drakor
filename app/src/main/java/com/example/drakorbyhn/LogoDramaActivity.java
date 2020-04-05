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
        teams.add(new DramaLogo("https://upload.wikimedia.org/wikipedia/commons/6/65/Mother_South_Korea_Drama_logo.png", "Mother"));
        teams.add(new DramaLogo("https://upload.wikimedia.org/wikipedia/commons/2/22/Pinocchio_South_Korea_Drama_logo.png", "Pinocchio"));
        teams.add(new DramaLogo("https://upload.wikimedia.org/wikipedia/en/a/a2/Her_Private_Life.jpeg", "Her Private Life"));
        teams.add(new DramaLogo("https://upload.wikimedia.org/wikipedia/id/thumb/8/83/Logo_PSSI.png/150px-Logo_PSSI.png", "PSSI"));

        DramaLogoAdapter adapter = new DramaLogoAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
