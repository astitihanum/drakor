package com.example.drakorbyhn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.drakorbyhn.adapters.GenreDramaAdapter;
import com.example.drakorbyhn.models.GenreDrama;

import java.util.ArrayList;
import java.util.List;

public class GenreDramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_drama);
        RecyclerView genreView = findViewById(R.id.genre_drama);

        List<GenreDrama> genre = new ArrayList<>();
        genre.add(new GenreDrama(R.drawable.whats_wrong_with_secreatry_kim, "Komedi Romantis", "1"));
        genre.add(new GenreDrama(R.drawable.crash_landing_on_you, "Drama", "2"));
        genre.add(new GenreDrama(R.drawable.the_king_eternal_monarch, "Fantasi", "3"));

        GenreDramaAdapter adapter = new GenreDramaAdapter(this, genre);
        genreView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        genreView.setLayoutManager(layoutManager);
    }
}
