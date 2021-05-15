package mx.edu.itlapiedad.models;

public class Tickets {
int id;
String fecha_hora;
float total;
int cajero_id;

public Tickets() {
	super();
	// TODO Auto-generated constructor stub
}

public Tickets(int id, String fecha_hora, float total, int cajero_id) {
	super();
	this.id = id;
	this.fecha_hora = fecha_hora;
	this.total = total;
	this.cajero_id = cajero_id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFecha_hora() {
	return fecha_hora;
}

public void setFecha_hora(String fecha_hora) {
	this.fecha_hora = fecha_hora;
}

public float getTotal() {
	return total;
}

public void setTotal(float total) {
	this.total = total;
}

public int getCajero_id() {
	return cajero_id;
}

public void setCajero_id(int cajero_id) {
	this.cajero_id = cajero_id;
}



}


