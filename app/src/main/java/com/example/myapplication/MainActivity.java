package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SlidingDrawer;

public class MainActivity extends AppCompatActivity {

    EditText Nama_Depan, Nama_Belakang, Alamat, Tempat_Lahir, Telepon, Email, Password, Confirm_Password;
    Button submit;
    Button back;

    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama_Depan = findViewById(R.id.editnd);
        Nama_Belakang = findViewById(R.id.editnb);
        Alamat = findViewById(R.id.editalm);
        Tempat_Lahir = findViewById(R.id.edittmp);
        Telepon = findViewById(R.id.edittelp);
        Email = findViewById(R.id.editemail);
        Password = findViewById(R.id.editpass);
        Confirm_Password = findViewById(R.id.editconpass);
        submit = findViewById(R.id.btnok1);
        back = findViewById(R.id.btnok);

        awesomeValidation = new AwesomeValidation()

    }
}
