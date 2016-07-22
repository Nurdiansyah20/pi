package com.example.dhian.pianatomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pernafasan_ikan extends AppCompatActivity {
    Button bt_pengertiansistempernafasanikan , bt_mekanismepernafasanikan , bt_pernafasanikantulangsejati , bt_pernafasanikantulangrawan , bt_pernafasanikanparuparu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pernafasan_ikan);

        bt_pengertiansistempernafasanikan = (Button) findViewById(R.id.btnpengertiansistempernafasanikan);
        bt_mekanismepernafasanikan = (Button) findViewById(R.id.btnmekanismepernafasanikan);
        bt_pernafasanikantulangsejati = (Button) findViewById(R.id.btnikansejati);
        bt_pernafasanikantulangrawan = (Button)findViewById(R.id.btnikanrawan);
        bt_pernafasanikanparuparu = (Button) findViewById(R.id.btnikanparuparu);

        bt_pengertiansistempernafasanikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kePengertiansistempernafasanikan = new Intent(Pernafasan_ikan.this , Pengertian_sistem_pernafasan_ikan.class);
                startActivity(kePengertiansistempernafasanikan);
            }
        });


        bt_mekanismepernafasanikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keMekanismepernafasanikan = new Intent(Pernafasan_ikan.this , Mekanisme_pernafasan_ikan.class);
                startActivity(keMekanismepernafasanikan);
            }
        });

        bt_pernafasanikantulangsejati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kePernafasanpadaikantulangsejati = new Intent(Pernafasan_ikan.this , Pernafasan_pada_ikan_bertulang_sejati.class);
                startActivity(kePernafasanpadaikantulangsejati);
            }
        });

        bt_pernafasanikantulangrawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kePernafasanpadaikantulangrawan = new Intent(Pernafasan_ikan.this , Pernafasan_pada_ikan_bertulang_rawan.class);
                startActivity(kePernafasanpadaikantulangrawan);
            }
        });

        bt_pernafasanikanparuparu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kePernafasanikanparuparu = new Intent(Pernafasan_ikan.this , Pernafasan_pada_ikan_paru_paru.class);
                startActivity(kePernafasanikanparuparu);
            }
        });

    }
}