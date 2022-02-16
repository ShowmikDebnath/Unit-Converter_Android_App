package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kggm(View view) {
        Intent kggm = new Intent(MainActivity.this, kggm.class);
        startActivity(kggm);
    }

    public void gmkg(View view) {
        Intent gmkg = new Intent(MainActivity.this, gmkg.class);
        startActivity(gmkg);
    }

    public void kgpou(View view) {
        Intent kgpou = new Intent(MainActivity.this, kgpou.class);
        startActivity(kgpou);
    }

    public void poukg(View view) {
        Intent poukg = new Intent(MainActivity.this, poukg.class);
        startActivity(poukg);
    }

    public void incm(View view) {
        Intent incm = new Intent(MainActivity.this, incm.class);
        startActivity(incm);
    }

    public void cmin(View view) {
        Intent cmin = new Intent(MainActivity.this, cmin.class);
        startActivity(cmin);
    }

    public void memils(View view) {
        Intent memils = new Intent(MainActivity.this, memils.class);
        startActivity(memils);
    }

    public void milsme(View view) {
        Intent milsme = new Intent(MainActivity.this, milsme.class);
        startActivity(milsme);
    }
}