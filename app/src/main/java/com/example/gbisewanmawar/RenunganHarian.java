package com.example.gbisewanmawar;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class RenunganHarian extends AppCompatActivity {

    String text;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renungan_harian);

        title = findViewById(R.id.judul);

        Bundle extras = getIntent().getExtras();
        if(!(extras == null)){
            text = extras.getString("Hari");


        }

        if (text.equals("Senin")){

            title.setText(R.string.Mazmur107_23);
        } else if (text.equals("Selasa")){
            title.setText(text);
        }


    }
}