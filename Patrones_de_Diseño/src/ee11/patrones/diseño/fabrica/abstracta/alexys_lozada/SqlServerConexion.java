package ee11.patrones.diseño.fabrica.abstracta.alexys_lozada;

public class SqlServerConexion extends Conexion{

	/**Metodo Constructor*/
	public SqlServerConexion() {
		
	}
	
	@Override
	public String descripcion() {
		
		return "Conexion SqlServer";
	}
	
}
