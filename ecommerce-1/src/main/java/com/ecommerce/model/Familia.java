package com.ecommerce.model;

public class Familia {
private String urlImagen;
private String nombre;
public Familia(String urlImagen, String nombre) {
	
	this.urlImagen = urlImagen;
	this.nombre = nombre;
}
public String getUrlImagen() {
	return urlImagen;
}
public void setUrlImagen(String urlImagen) {
	this.urlImagen = urlImagen;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Familia [descripcion=" + urlImagen + ", nombre=" + nombre + "]";
}


}
