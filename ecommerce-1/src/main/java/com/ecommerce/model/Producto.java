package com.ecommerce.model;

public class Producto {
private String nombre;
private String marca;
private String modelo;
private String descripcion;
private float precio;
private Familia familia;
public Producto(String nombre, String marca, String modelo, String descripcion, float precio, Familia familia) {
	
	this.nombre = nombre;
	this.marca = marca;
	this.modelo = modelo;
	this.descripcion = descripcion;
	this.precio = precio;
	this.familia = familia;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}
public Familia getFamilia() {
	return familia;
}
public void setFamilia(Familia familia) {
	this.familia = familia;
}
@Override
public String toString() {
	return "Producto [nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", descripcion=" + descripcion
			+ ", precio=" + precio + ", familia=" + familia + "]";
}


}
