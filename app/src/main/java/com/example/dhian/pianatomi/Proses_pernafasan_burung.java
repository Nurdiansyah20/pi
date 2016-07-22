package com.example.dhian.pianatomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Proses_pernafasan_burung extends AppCompatActivity {
    Button bt_saatistirahat , bt_saatterbang ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses_pernafasan_burung);

        bt_saatistirahat = (Button) findViewById(R.id.btnpernafasanistirahat);
        bt_saatterbang = (Button)findViewById(R.id.btnpernafasansaatterbang);

        bt_saatistirahat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keSaatistirahat = new Intent(Proses_pernafasan_burung.this, PernafasanSaatIstirahat.class);
                startActivity(keSaatistirahat);
            }
        });

        bt_saatterbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keSaatterbang = new Intent(Proses_pernafasan_burung.this, PernafasanSaatTerbang.class);
                startActivity(keSaatterbang);
            }
        });

    }
}