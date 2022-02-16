package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmin);
    }

    public void convertincm(View view) {
        EditText editText = findViewById(R.id.cmin_etext);
        TextView textView = findViewById(R.id.dis_cmin);

        String cm = editText.getText().toString();

        double dcm = Double.parseDouble(cm);

        double ans = (dcm/2.54);

        textView.setText(String.valueOf(ans)+" in");
    }
}