package ee11.patrones.dise�o.fabrica.abstracta.alexys_lozada;

public class MySqlConexion extends Conexion{
	
	/**Metosdo Constructor */
	public MySqlConexion() {
		
	}
	
	@Override
	public String descripcion() {
		
		return "Conexion MySql";
	}
}
