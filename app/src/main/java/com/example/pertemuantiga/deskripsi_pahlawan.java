package com.example.pertemuantiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class deskripsi_pahlawan extends AppCompatActivity {
    ImageView deskripsi_iv_hero;
    TextView deskripsi_tv_name, deskripsi_tv_detail;
    String nama, desc;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_pahlawan);

        deskripsi_iv_hero = findViewById(R.id.deskripsi_iv_hero);
        deskripsi_tv_name = findViewById(R.id.deskripsi_tv_name);
        deskripsi_tv_detail = findViewById(R.id.deskripsi_tv_detail);

        nama = getIntent().getStringExtra("nama");
        desc = getIntent().getStringExtra("desc");
        image = getIntent().getIntExtra("image",0);

        deskripsi_iv_hero.setImageResource(image);
        deskripsi_tv_name.setText(nama);
        deskripsi_tv_detail.setText(desc);
    }
}
