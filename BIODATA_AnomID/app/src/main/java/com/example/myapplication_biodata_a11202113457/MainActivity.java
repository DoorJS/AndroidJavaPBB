package com.example.myapplication_biodata_a11202113457;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cellphone(View view){
        Uri uri = Uri.parse("tel:081390116818");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void showMap(View view){
        Uri uri = Uri.parse("geo:-6.770380, 110.862408");
        Intent it = new Intent(android.content.Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"mrahima@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {
        }
    }
}