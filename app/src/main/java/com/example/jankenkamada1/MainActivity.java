package com.example.jankenkamada1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton img_g = findViewById(R.id.Gu);
        ImageButton img_t = findViewById(R.id.Tyo);
        ImageButton img_p = findViewById(R.id.Pa);

        int gu = 0,tyo = 1,pa = 2;

        Intent intent = new Intent(getApplication(), ResultActivity.class);
        img_g.setOnClickListener(v -> {
            intent.putExtra("hand", gu);
            startActivity(intent);
        });
        img_t.setOnClickListener(v -> {
            intent.putExtra("hand", tyo);
            startActivity(intent);
        });
        img_p.setOnClickListener(v -> {
            intent.putExtra("hand", pa);
            startActivity(intent);
        });

    }
}