package com.example;

public class Usuarios {
private Long id;
private String nombre;
private String numeroTelefono;
private String email;


// constructores 
public Usuarios() {
}


public Usuarios(String nombre, String numeroTelefono, String email) {
    this.nombre = nombre;
    this.numeroTelefono = numeroTelefono;
    this.email = email;
}


public Usuarios(Long id, String nombre, String numeroTelefono, String email) {
    this.id = id;
    this.nombre = nombre;
    this.numeroTelefono = numeroTelefono;
    this.email = email;
}

// metodos getters and setters
public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}


public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public String getNumeroTelefono() {
    return numeroTelefono;
}


public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
}


public String getEmail() {
    return email;
}


public void setEmail(String email) {
    this.email = email;
}


@Override
public String toString() {
    return "Usuarios [id=" + id + ", nombre=" + nombre + ", numeroTelefono=" + numeroTelefono + ", email=" + email
            + ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getNumeroTelefono()=" + getNumeroTelefono()
            + ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
            + ", toString()=" + super.toString() + "]";
}



}
