package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class kgpou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kgpou);
    }

    public void convertkgpou(View view) {
        EditText editText = findViewById(R.id.kgpou_etext);
        TextView textView = findViewById(R.id.dis_kgpou);

        String kg = editText.getText().toString();

        double dkg = Double.parseDouble(kg);

        double ans = (dkg*2.20462);

        textView.setText(String.valueOf(ans)+" pounds");
    }
}