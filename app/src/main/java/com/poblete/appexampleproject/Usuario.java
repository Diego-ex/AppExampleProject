package com.poblete.appexampleproject;

public class Usuario {

    private String Nombre;
    private String Apellido;
    private String Email;
    private String Password;
    private String ConfirmPassword;
    private String Telefono;
    private String Genero;

    public Usuario(String nombre, String apellido, String email, String password, String confirmPassword, String telefono, String genero) {
        Nombre = nombre;
        Apellido = apellido;
        Email = email;
        Password = password;
        ConfirmPassword = confirmPassword;
        Telefono = telefono;
        Genero = genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
