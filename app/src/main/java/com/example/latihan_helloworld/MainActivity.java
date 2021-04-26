package com.example.latihan_helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText kolom1;
    EditText kolom2;
    TextView hasil;

    private int text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kolom1 = (EditText)findViewById(R.id.kolom1);
        kolom2 = (EditText)findViewById(R.id.kolom2);
        hasil = (TextView)findViewById(R.id.hasil);
    }
    public void submit (View View){
        String klm1 = kolom1.getText().toString();
        String klm2 = kolom2.getText().toString();
        hasil.setText("Nama Anda : "+klm1+ " " + klm2);
        //Muncul Pop up
        Toast.makeText(getApplicationContext(), klm1 + " " + klm2, Toast.LENGTH_SHORT).show();

    }
}