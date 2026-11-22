package com.example;


public class Productos {

private long id;
private String nombre;
private double precio;
private String descripcion;

// constructores
public Productos(){

}

public Productos(long id, String nombre, double precio, String descripcion) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.descripcion = descripcion;

}public Productos(String nombre, double precio, String descripcion) {
    this.nombre = nombre;
    this.precio = precio;
    this.descripcion = descripcion;
}
// metodos getters and setters 
public long getId() {
    return id;

}
public void setId(long id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public double getPrecio() {
    return precio;
}
public void setPrecio(double precio) {
  this.precio = precio;

}
public String getDescripcion() {
    return descripcion;
}
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

@Override
public String toString() {
    return "Productos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + "]";
}

}
