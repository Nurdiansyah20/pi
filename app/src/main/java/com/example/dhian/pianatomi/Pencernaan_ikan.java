package com.example.dhian.pianatomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pencernaan_ikan extends AppCompatActivity {
    Button bt_saluranpencernaanikan , bt_kelenjarpencernaan , bt_mekanismepencernaan ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencernaan_ikan);

        bt_saluranpencernaanikan = (Button) findViewById (R.id.btnsaluranpencernaanikan);
        bt_kelenjarpencernaan = (Button) findViewById (R.id.btnkelenjarpencernaan);
        bt_mekanismepencernaan = (Button) findViewById (R.id.btnmekanismepencernaanikan);

        bt_saluranpencernaanikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keSaluranpencernaanikan = new Intent(Pencernaan_ikan.this, Saluran_pencernaan_ikan.class);
                startActivity(keSaluranpencernaanikan);
            }
        });

        bt_kelenjarpencernaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keKelenjarpencernaan = new Intent(Pencernaan_ikan.this, Kelenjar_pencernaan_ikan.class);
                startActivity(keKelenjarpencernaan);
            }
        });

        bt_mekanismepencernaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keMekanismepencernaanikan = new Intent(Pencernaan_ikan.this , Mekanisme_pencernaan_ikan.class);
                startActivity(keMekanismepencernaanikan);
            }
        });




    }
}