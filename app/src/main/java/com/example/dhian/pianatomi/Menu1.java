package com.example.dhian.pianatomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu1 extends AppCompatActivity {
    Button bt_definisi, bt_burung, bt_ikan, bt_permainan, bt_keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        bt_definisi = (Button)  findViewById(R.id.btndefinisi);
        bt_burung = (Button) findViewById(R.id.btnburung);
        bt_ikan = (Button) findViewById(R.id.btnikan);
        bt_permainan = (Button) findViewById(R.id.btnpermainan);
        bt_keluar = (Button) findViewById(R.id.btnkeluar);


         bt_definisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keMenudefinisi = new Intent(Menu1.this, DefinisiAnatomi.class);
                startActivity(keMenudefinisi);
            }
        });

        bt_burung.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Intent keMenuburung = new Intent(Menu1.this, Burung.class);
               startActivity(keMenuburung);
            }
        });

        bt_ikan.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View v){
            Intent keMenuikan = new Intent(Menu1.this, Ikan.class);
            startActivity(keMenuikan);
            }
             });

   /*     bt_permainan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keMenupermainan = new Intent(Menu1.this, Permainan.class);
                startActivity(keMenupermainan);

            }
        });*/
       bt_keluar.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View v) {
               System.exit(1);

           }
       });
    }
}
