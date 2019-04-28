package com.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
private int documento;
private String nombre;
private String apellido;
private List<Producto> productos;
public Cliente(int documento, String nombre, String apellido) {
	super();
	this.documento = documento;
	this.nombre = nombre;
	this.apellido = apellido;
	this.productos = new ArrayList<Producto>();
}
public int getDocumento() {
	return documento;
}
public void setDocumento(int documento) {
	this.documento = documento;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public List<Producto> getProductos() {
	return productos;
}
@Override
public String toString() {
	return "Cliente [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", productos="
			+ productos + "]";
}



}
