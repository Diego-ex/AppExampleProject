package com.poblete.appexampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView, textView2;
    private EditText txtEmail, txtPassword;
    private Button btnInicio, btnRegistro;

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

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formRegistro = new Intent(MainActivity.this, RegistroActivity.class);
                startActivity(formRegistro);
            }
        });

    }
}