package com.poblete.appexampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView2;
    EditText txtEmail, txtPassword;
    Button btnInicio, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relaciones
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        btnInicio = findViewById(R.id.btnInicio);
        btnRegistro = findViewById(R.id.btnRegistro);


    }
}