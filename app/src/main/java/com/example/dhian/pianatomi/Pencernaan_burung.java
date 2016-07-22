package com.example.dhian.pianatomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pencernaan_burung extends AppCompatActivity {
    Button bt_sistempencernaanmekanik , bt_sistempencernaanenzimatis , bt_sistempencernaanbiologis , bt_prosespencernaanburung ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencernaan_burung);

        bt_sistempencernaanmekanik = (Button) findViewById(R.id.btnsistempencernaanmekanikburung);
        bt_sistempencernaanenzimatis = (Button)findViewById(R.id.btnsistempencernaanenzimatisburung);
        bt_sistempencernaanbiologis = (Button) findViewById(R.id.btnsistempencernaanbiologisburung);
        bt_prosespencernaanburung = (Button) findViewById(R.id.btnprosespencernaanburung);



        bt_sistempencernaanmekanik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keSistempencernaanmekanikburung = new Intent(Pencernaan_burung.this, SistemPencernaanMekanik.class);
                startActivity(keSistempencernaanmekanikburung);
            }

        });

        bt_sistempencernaanenzimatis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keSistempencernaanenzimatisburung = new Intent(Pencernaan_burung.this, SistemPencernaanEnzim.class);
                startActivity(keSistempencernaanenzimatisburung);
            }
        });

        bt_sistempencernaanbiologis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keSistempencernaanbiologisburung = new Intent(Pencernaan_burung.this, SistemPencernaanBiologis.class);
                startActivity(keSistempencernaanbiologisburung);
            }
        });

        bt_prosespencernaanburung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keProsespencernaanburung = new Intent(Pencernaan_burung.this, ProsesPencernaanBurung.class);
                startActivity(keProsespencernaanburung);
            }
        });


    }
}