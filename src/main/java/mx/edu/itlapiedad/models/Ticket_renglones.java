package mx.edu.itlapiedad.models;

public class Ticket_renglones {
	int id;
int ticket_id;
int producto_id;
int cantidad;
float precio;
float importe;
public Ticket_renglones() {
	super();
	// TODO Auto-generated constructor stub
}
public Ticket_renglones(int id, int ticket_id, int producto_id, int cantidad, float precio, float importe) {
	super();
	this.id = id;
	this.ticket_id = ticket_id;
	this.producto_id = producto_id;
	this.cantidad = cantidad;
	this.precio = precio;
	this.importe = importe;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTicket_id() {
	return ticket_id;
}
public void setTicket_id(int ticket_id) {
	this.ticket_id = ticket_id;
}
public int getProducto_id() {
	return producto_id;
}
public void setProducto_id(int producto_id) {
	this.producto_id = producto_id;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}
public float getImporte() {
	return importe;
}
public void setImporte(float importe) {
	this.importe = importe;
}


}
