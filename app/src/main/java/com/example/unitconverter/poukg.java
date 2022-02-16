package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class poukg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poukg);
    }

    public void convertpoukg(View view) {
        EditText editText = findViewById(R.id.poukg_etext);
        TextView textView = findViewById(R.id.dis_poukg);

        String pou = editText.getText().toString();

        double dpou = Double.parseDouble(pou);

        double ans = (dpou/2.20462);

        textView.setText(String.valueOf(ans)+" kg");
    }
}