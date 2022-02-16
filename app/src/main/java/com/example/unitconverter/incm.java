package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class incm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incm);
    }

    public void convertincm(View view) {
        EditText editText = findViewById(R.id.incm_etext);
        TextView textView = findViewById(R.id.dis_incm);

        String in = editText.getText().toString();

        double din = Double.parseDouble(in);

        double ans = (din*2.54);

        textView.setText(String.valueOf(ans)+" cm");

    }
}