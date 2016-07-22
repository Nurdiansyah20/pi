package com.example.dhian.pianatomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DefinisiAnatomi extends AppCompatActivity {

    Button bt_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definisi_anatomi);

    bt_menu = (Button) findViewById(R.id.btnmenu);

        bt_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keMenu = new Intent(DefinisiAnatomi.this, Menu1.class);
                startActivity(keMenu);
            }
        });

    }
}
