package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class kggm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kggm);
    }

    public void convertKgGm(View view) {

        EditText editText = findViewById(R.id.kggm_etext);
        TextView textView = findViewById(R.id.dis_kggm);

        String kg = editText.getText().toString();

        double dkg = Double.parseDouble(kg);

        double ans = (dkg*1000);

        textView.setText(String.valueOf(ans)+" gm");

    }
}