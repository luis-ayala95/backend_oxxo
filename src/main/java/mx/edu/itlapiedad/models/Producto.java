package mx.edu.itlapiedad.models;

public class Producto {
		int id;
		String descripcion;
		int precio;
		String codigo_barras;
		int existencia;
		public Producto() {
			super();
			
		}
		public Producto(int id, String descripcion, int precio, String codigo_barras, int existencia) {
			super();
			this.id = id;
			this.descripcion = descripcion;
			this.precio = precio;
			this.codigo_barras = codigo_barras;
			this.existencia = existencia;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public int getPrecio() {
			return precio;
		}
		public void setPrecio(int precio) {
			this.precio = precio;
		}
		public String getCodigo_barras() {
			return codigo_barras;
		}
		public void setCodigo_barras(String codigo_barras) {
			this.codigo_barras = codigo_barras;
		}
		public int getExistencia() {
			return existencia;
		}
		public void setExistencia(int existencia) {
			this.existencia = existencia;
		}
		
		
}
