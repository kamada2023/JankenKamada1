package com.example.jankenkamada1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;


public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        long seed = System.currentTimeMillis();
        Random rnd = new Random(seed);
        int r = rnd.nextInt(3);

        Intent intent = getIntent();
        int id = intent.getIntExtra("hand",0);

        ImageView myImage = findViewById(R.id.result_draw);

        if (id == r) {
            myImage.setImageResource(R.drawable.draw);
            TextView textView = findViewById(R.id.result);
            textView.setText("引き分け");
        } else if ((id==2 && r==0) || (id+1)==r) {
            myImage.setImageResource(R.drawable.win);
            TextView textView = findViewById(R.id.result);
            textView.setText("あんたの勝ち！！");
        } else {
            myImage.setImageResource(R.drawable.lose);
            TextView textView = findViewById(R.id.result);
            textView.setText("あなたの負け..");
        }

        if(r==0){
            ImageView cpu_hands = findViewById(R.id.cpu_hand);
            cpu_hands.setImageResource(R.drawable.j_gu02);
        } else if (r==1) {
            ImageView cpu_hands = findViewById(R.id.cpu_hand);
            cpu_hands.setImageResource(R.drawable.j_ch02);
        }else{
            ImageView cpu_hands = findViewById(R.id.cpu_hand);
            cpu_hands.setImageResource(R.drawable.j_pa02);
        }

        if(id==0){
            ImageView cpu_hands = findViewById(R.id.user_hand);
            cpu_hands.setImageResource(R.drawable.j_gu02);
        } else if (id==1) {
            ImageView cpu_hands = findViewById(R.id.user_hand);
            cpu_hands.setImageResource(R.drawable.j_ch02);
        }else{
            ImageView cpu_hands = findViewById(R.id.user_hand);
            cpu_hands.setImageResource(R.drawable.j_pa02);
        }
    }

}
