package com.example.drakorbyhn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SinopsisActivity extends AppCompatActivity {

    ImageView logo;
    TextView name, pemeran, sinopsis;
    String name2,pemeran2, sinopsis2;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopsis);

        logo = findViewById(R.id.logo);
        name = findViewById(R.id.name);
        pemeran = findViewById(R.id.pemeran);
        sinopsis = findViewById(R.id.sinopsis);

        name2 = getIntent().getStringExtra("name");
        pemeran2 = getIntent().getStringExtra("pemeran");
        sinopsis2 = getIntent().getStringExtra("sinopsis");
        image = getIntent().getIntExtra("logo", 0);

        name.setText("Judul : "+ name2);
        pemeran.setText("Pemeran : "+ pemeran2);
        sinopsis.setText("Sinopsis : "+ sinopsis2);
        logo.setImageResource(image);
    }
}
