package mx.edu.itlapiedad.dao;

import java.util.List;

import mx.edu.itlapiedad.models.Tickets;

public interface TicketsDAO {

	void insertarTickets(Tickets ti);

	void actualizarTickets(Tickets ti, int id);

	List<Tickets> consultar();

	void eliminar(int id);

	List<Tickets> consultarId(int id);

}
