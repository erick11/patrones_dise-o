package ee11.patrones.dise�o.fabrica.alexys_lozada;

public class SqlServerConexion extends Conexion{

	/**Metodo Constructor*/
	public SqlServerConexion() {
		
	}
	
	@Override
	public String descripcion() {
		
		return "Conexion SqlServer";
	}
	
}
