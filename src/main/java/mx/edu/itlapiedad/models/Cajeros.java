package mx.edu.itlapiedad.models;

public class Cajeros {
int id;
String nombre;

public Cajeros() {
	super();
	
}
public Cajeros(int id, String nombre) {
	super();
	this.id = id;
	this.nombre = nombre;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String geNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}



}