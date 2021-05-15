package mx.edu.itlapiedad.dao;

import mx.edu.itlapiedad.models.Tickets;

public interface TicketsDAO {

	void insertarTickets(Tickets ti);

	void actualizarTickets(Tickets ti, int id);

}
