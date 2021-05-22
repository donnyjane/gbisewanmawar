package com.example.gbisewanmawar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.ArrayList;


public class RenunganHarian extends AppCompatActivity {

    String text;
    TextView title;
    DataFactory df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renungan_harian);

        df = new DataFactory();
        title = findViewById(R.id.judul);

        Bundle extras = getIntent().getExtras();
        if(!(extras == null)){
            text = extras.getString("Hari");


        }

        //memanggil random renungan
        switch (text) {
            case "Senin": {
                String[] senin = getResources().getStringArray(R.array.renunganSenin);
                String textNew = df.getItem(senin, 100);
                title.setText(textNew);
                break;
            }
            case "Selasa": {
                String[] selasa = getResources().getStringArray(R.array.renunganSelasa);
                String textNew = df.getItem(selasa, 100);
                title.setText(textNew);
                break;
            }
            case "Rabu": {
                String[] rabu = getResources().getStringArray(R.array.renunganRabu);
                String textNew = df.getItem(rabu, 100);
                title.setText(textNew);
                break;
            }
            case "Kamis": {
                String[] kamis = getResources().getStringArray(R.array.renunganKamis);
                String textNew = df.getItem(kamis, 100);
                title.setText(textNew);
                break;
            }
            case "Jumat": {
                String[] jumat = getResources().getStringArray(R.array.renunganJumat);
                String textNew = df.getItem(jumat, 100);
                title.setText(textNew);
                break;
            }
            case "Sabtu": {
                String[] sabtu = getResources().getStringArray(R.array.renunganSabtu);
                String textNew = df.getItem(sabtu, 100);
                title.setText(textNew);
                break;
            }
            default: {
                String[] minggu = getResources().getStringArray(R.array.renunganMinggu);
                String textNew = df.getItem(minggu, 100);
                title.setText(textNew);
                break;
            }
        }


    }
}