package ee11.patrones.dise�o.fabrica.alexys_lozada;

public class PostgresqlConexion extends Conexion{
	
	/** Metodo Constructor*/
	public PostgresqlConexion() {
		
	}
	
	@Override
	public String descripcion() {
		return "Conexion PostgreSqlS";
	}
}
