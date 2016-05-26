package ee11.patrones.diseño.fabrica.alexys_lozada;

public class MySqlConexion extends Conexion{
	
	/**Metosdo Constructor */
	public MySqlConexion() {
		
	}
	
	@Override
	public String descripcion() {
		
		return "Conexion MySql";
	}
}
