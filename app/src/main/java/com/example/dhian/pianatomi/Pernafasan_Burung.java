package com.example.dhian.pianatomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pernafasan_Burung extends AppCompatActivity {
    Button bt_strukturalatpernafasanburung, bt_prosespernafasanburung ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pernafasan__burung);

        bt_strukturalatpernafasanburung = (Button) findViewById(R.id.btnstrukturalatpernafasanburung);
        bt_prosespernafasanburung = (Button)findViewById(R.id.btnprosespernafasanburung);


        bt_strukturalatpernafasanburung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keStrukturalatpernafasanburung = new Intent(Pernafasan_Burung.this, Struktur_Alat_Pernafasan_burung.class);
                startActivity(keStrukturalatpernafasanburung);

            }
        });

        bt_prosespernafasanburung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keProsespernafasanburung = new Intent(Pernafasan_Burung.this, Proses_pernafasan_burung.class);
                startActivity(keProsespernafasanburung);
            }
        });


    }
}