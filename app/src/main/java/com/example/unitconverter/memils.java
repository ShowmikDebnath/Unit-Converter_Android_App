package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class memils extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memils);
    }

    public void convertmemils(View view) {
        EditText editText = findViewById(R.id.memils_etext);
        TextView textView = findViewById(R.id.dis_memils);

        String me = editText.getText().toString();

        double dme = Double.parseDouble(me);

        double ans = (dme*39370.1);

        textView.setText(String.valueOf(ans)+" mils");
    }
}