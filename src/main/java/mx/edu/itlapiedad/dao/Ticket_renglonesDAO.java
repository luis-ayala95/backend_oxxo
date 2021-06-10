package mx.edu.itlapiedad.dao;
import java.util.List;

import mx.edu.itlapiedad.models.Ticket_renglones;
import mx.edu.itlapiedad.models.Ticket_renglones_importe;
<<<<<<< HEAD

=======
>>>>>>> a97f84bea6392bd57ed40e2d0594ef8bf4bc3dc7


public interface Ticket_renglonesDAO {

	void insertarTicket_renglones(Ticket_renglones ti_ren);

	void actualizarTicket_renglones(Ticket_renglones ti_ren, int id);
	

	void eliminar(int id);

	List<Ticket_renglones> consultar();

	List<Ticket_renglones> consultarId(int id);

	List<Ticket_renglones_importe> totalImporte(int id, String fecha_inicial, String fecha_final);


<<<<<<< HEAD
	List<Ticket_renglones_importe> totalImporte(int id, String fecha_inicial, String fecha_final);

	
	

	
=======
>>>>>>> a97f84bea6392bd57ed40e2d0594ef8bf4bc3dc7

	

	

	

}
