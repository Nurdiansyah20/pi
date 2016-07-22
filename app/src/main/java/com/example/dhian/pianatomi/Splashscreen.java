package com.example.dhian.pianatomi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Splashscreen extends Activity implements Loading.LoadingTaskFinishedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressbar_Horizontal);
        new Loading(progressBar, this).execute("");

    }

    @Override
    public void onTaskFinished() {
        completeSplash();
    }
    private void completeSplash(){
        startApp();
        finish(); // Don't forget to finish this Splash Activity so the user can't return to it!
    }
    private void startApp() {
        Intent intent = new Intent(Splashscreen.this, Menu1.class);
        startActivity(intent);
    }
    }

