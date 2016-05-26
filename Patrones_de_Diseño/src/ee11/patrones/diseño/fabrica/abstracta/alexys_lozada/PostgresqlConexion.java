package ee11.patrones.diseño.fabrica.abstracta.alexys_lozada;

public class PostgresqlConexion extends Conexion{
	
	/** Metodo Constructor*/
	public PostgresqlConexion() {
		
	}
	
	@Override
	public String descripcion() {
		return "Conexion PostgreSqlS";
	}
}
