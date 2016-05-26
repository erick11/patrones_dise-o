package ee11.patrones.diseño.fabrica.alexys_lozada;

public class Fabrica {
	/** Nombre del tipo de conexion */
	protected String tipo;

	/** Metodo Constructor sobrecarga */
	public Fabrica() {

	}

	/** Constructor que recibe el nombre del tipo de conexion */
	public Fabrica(String tipo) {
		this.tipo = tipo;
	}
	
	/**Metodo que retorna el objeto conexion especificos*/
	public Conexion crearConexion() {

		if (tipo.equalsIgnoreCase("Oracle")) {
			return new OracleConexion();
		}
		else if (tipo.equalsIgnoreCase("SQLServer")) {
			return new SqlServerConexion();
		}
		else if (tipo.equalsIgnoreCase("MySql")) {
			return new MySqlConexion();
		} 
		else {
			return new PostgresqlConexion();
		}
		
	}
	
}
