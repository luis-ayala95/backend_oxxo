package mx.edu.itlapiedad.dao;

import mx.edu.itlapiedad.models.Cajeros;

public interface CajerosDAO {
	void insertarCajeros(Cajeros ca);
	void actualizarCajeros(Cajeros ca, int id);

}
