package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class milsme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milsme);
    }

    public void convertmilsme(View view) {
        EditText editText = findViewById(R.id.milsme_etext);
        TextView textView = findViewById(R.id.dis_milsme);

        String mils = editText.getText().toString();

        double dmils = Double.parseDouble(mils);

        double ans = (dmils/39370.1);

        textView.setText(String.valueOf(ans)+" meters");
    }
}