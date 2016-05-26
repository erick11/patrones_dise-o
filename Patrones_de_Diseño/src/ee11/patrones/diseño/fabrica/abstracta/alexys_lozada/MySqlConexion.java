package ee11.patrones.diseño.fabrica.abstracta.alexys_lozada;

public class MySqlConexion extends Conexion{
	
	/**Metosdo Constructor */
	public MySqlConexion() {
		
	}
	
	@Override
	public String descripcion() {
		
		return "Conexion MySql";
	}
}
