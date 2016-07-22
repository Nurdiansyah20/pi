package com.example.dhian.pianatomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Burung extends AppCompatActivity {
Button bt_sistempernafasanburung, bt_sistempencernaanburung ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung);

        bt_sistempernafasanburung = (Button)  findViewById(R.id.btnpernafasanburung);
        bt_sistempencernaanburung = (Button) findViewById(R.id.btnpencernaanburung);

        bt_sistempernafasanburung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keSistempernafasanburung = new Intent(Burung.this, Pernafasan_Burung.class);
                startActivity(keSistempernafasanburung);
            }
        });

        bt_sistempencernaanburung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keSistempencernaanburung = new Intent(Burung.this, Pencernaan_burung.class);
                startActivity(keSistempencernaanburung);
            }
        });


    }
}
