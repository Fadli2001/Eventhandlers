package com.example.fadliactandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView et_nama,et_alamat,et_ttl,et_email,et_nohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        et_nama=findViewById(R.id. txt_nama);
        et_alamat=findViewById(R.id.txt_alamat);
        et_ttl=findViewById(R.id.txt_ttl);
        et_email=findViewById(R.id.txt_email);
        et_nohp=findViewById(R.id.txt_nohp);

        String nama = "Nama : "+getIntent().getStringExtra("nama");
        String alamat = "Alamat : "+getIntent().getStringExtra("alamat");
        String ttl = "Tempat,Tanggal Lahir : "+getIntent().getStringExtra("ttl");
        String email = "Email : "+getIntent().getStringExtra("email");
        String nohp = "No.HP : "+getIntent().getStringExtra("nohp");

        et_nama.setText(nama);
        et_alamat.setText(alamat);
        et_ttl.setText(ttl);
        et_email.setText(email);
        et_nohp.setText(nohp);




    }
}