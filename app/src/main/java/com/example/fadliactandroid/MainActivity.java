package com.example.fadliactandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //membuat binding yaitu untuk menghubungkan layout dengan file java
    Button btn;
      EditText etnama,etalamat,etttl,etemail,etnohp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn_pindah);
        etnama = findViewById(R.id.et_nama);
        etalamat = findViewById(R.id.et_alamat);
        etttl = findViewById(R.id.et_ttl);
        etemail = findViewById(R.id.et_email);
        etnohp = findViewById(R.id.et_nohp);

//        memberikan even handler untuk btn submit
        btn.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {

           String s_nama = etnama.getText().toString();
           String s_alamat = etalamat.getText().toString();
           String s_ttl = etttl.getText().toString();
           String s_email = etemail.getText().toString();
           String s_nohp = etnohp.getText().toString();

           Intent inten = new Intent(MainActivity.this, Activity2.class);
           inten.putExtra("nama", s_nama);
           inten.putExtra("alamat", s_alamat);
           inten.putExtra("ttl", s_ttl);
           inten.putExtra("email",s_email);
           inten.putExtra("nohp",s_nohp);
           startActivity(inten);
       }
;

   });

    }
}