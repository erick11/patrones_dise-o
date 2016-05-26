package ee11.patrones.diseño.fabrica.alexys_lozada;

import java.util.Scanner;

public class Contabilidad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fabrica miFabrica;
		Conexion miConexion;

		System.out.println("Digite la Base de Datos");
		String tipo = sc.nextLine();

		miFabrica = new Fabrica(tipo);
		miConexion = miFabrica.crearConexion();
		
		String salida = "Esta conectada con: " + miConexion.descripcion();
		System.out.println(salida );
	}
}
