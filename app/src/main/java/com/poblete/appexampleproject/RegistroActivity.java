package com.poblete.appexampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.regex.Pattern;

public class RegistroActivity extends AppCompatActivity {

    private TextView textView3, textView4;
    private EditText txtNombre, txtApellido, txtEmail, txtPassword, txtConfirmPassword, txtTelefono;
    private RadioButton rbtnFemenino, rbtnMasculino;
    private Button btnRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        //relaciones
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        txtConfirmPassword = findViewById(R.id.txtConfirmPassword);
        txtTelefono = findViewById(R.id.txtTelefono);
        rbtnFemenino = findViewById(R.id.rbtnF);
        rbtnMasculino = findViewById(R.id.rbtnM);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ValidarUser();
                String nombre = txtNombre.getText().toString().trim();
                String apellido = txtApellido.getText().toString().trim();
                String email = txtEmail.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();
                String confirmPassword = txtConfirmPassword.getText().toString().trim();
                String telefono = txtTelefono.getText().toString().trim();
                //si el nombre esta vacio o si tiene menos de 3 caracteres
                if (nombre.isEmpty() || nombre.length() < 3){
                    txtNombre.setError("Nombre invalido debe tener al menos 3 letras");
                    return;
                }else {
                    //sin errores se continua la logica
                    txtNombre.setError(null);
                }
                //si el apellido esta vacio o si tiene menos de 3 caracteres
                if (apellido.isEmpty() || apellido.length() < 3){
                    txtApellido.setError("Apellido invalido debe tener al menos 3 letras");
                    return;
                }else{
                    txtApellido.setError(null);
                }
                //si el email esta vacio o si no es una direccion de email (si lo ingresado no coincide con el patron de correo)
                if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    txtEmail.setError("E-mail ingresado invalido. Ejemplo asdasd@asdasd.com");
                    return;
                }else{
                    //sin errores se continua la logica
                    txtEmail.setError(null);
                }
                //si la contraseña esta vacia o si tiene menos de 6 caracteres
                if (password.isEmpty() || password.length() < 6){
                    txtPassword.setError("Debe tener más de 6 caracteres");
                    return;
                }else if (!Pattern.compile("[0-9]").matcher(password).find()){
                    //si la contraseña no coincide con el patron de números compilados, debe ingresar un número.
                    txtPassword.setError("Para mayor seguridad ingrese un número");
                    return;
                }else{
                    //sin errores se continua la logica
                    txtPassword.setError(null);
                }
                //si las contraseñas no son iguales o no coinciden
                if (!confirmPassword.equals(password)){
                    txtConfirmPassword.setError("Las contraseñas no coinciden. Deben ser iguales");
                    return;
                }else {
                    //sin errores se continua la logica
                    txtConfirmPassword.setError(null);
                }
                //si el telefono ingresado esta vacio o si tiene más de 12 caracteres EJ: +569 11223366
                if (telefono.isEmpty() || telefono.length() > 12){
                    txtTelefono.setError("El número de teléfono debe ser: +569 11223366");
                    return;
                }else{
                    //si no hay error continuar con la logica
                    txtTelefono.setError(null);
                }
                String genero = null;
                if (rbtnFemenino.isChecked()){
                    genero = "Femenino";
                }else if (rbtnMasculino.isChecked()){
                    genero = "Masculino";
                }else{
                    Snackbar.make(v, "Seleccione un género", Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }

    /*public void ValidarUser(){
        String nombre = txtNombre.getText().toString().trim();
        String apellido = txtApellido.getText().toString().trim();
        String email = txtEmail.getText().toString().trim();
        String password = txtPassword.getText().toString().trim();
        String confirmPassword = txtConfirmPassword.getText().toString().trim();
        String telefono = txtTelefono.getText().toString().trim();
        String genero = null;
        if (rbtnFemenino.isChecked()){
            genero = "Femenino";
        }else if (rbtnMasculino.isChecked()){
            genero = "Masculino";
        }else{
            Snackbar.make(v, "Seleccione un género", Snackbar.LENGTH_LONG).show();
        }
    }*/
}