package com.example.dhian.pianatomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ikan extends AppCompatActivity {
    Button bt_sistempernafasanikan, bt_sistempencernaanikan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan);

        bt_sistempernafasanikan = (Button)  findViewById(R.id.btnpernafasanikan);
        bt_sistempencernaanikan = (Button) findViewById(R.id.btnpencernaanikan);

        bt_sistempernafasanikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keSistempernafasanikan = new Intent(Ikan.this, Pernafasan_ikan.class);
                startActivity(keSistempernafasanikan);
            }
        });

        bt_sistempencernaanikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keSistempencernaanikan = new Intent(Ikan.this, Pencernaan_ikan.class);
                startActivity(keSistempencernaanikan);
            }
        });
    }
}