package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class gmkg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmkg);
    }

    public void convertgmkg(View view) {
        EditText editText = findViewById(R.id.gmkg_etext);
        TextView textView = findViewById(R.id.dis_gmkg);

        String gm = editText.getText().toString();

        double dgm = Double.parseDouble(gm);

        double ans = (dgm/1000);

        textView.setText(String.valueOf(ans)+" kg");
    }
}