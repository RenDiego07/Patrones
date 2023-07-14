package Facade;

public class Cliente {

	public static void main(String[] args) {
		Transaccion Transaccion = new Transaccion();
		
		Transaccion.transferirMovil();
		Transaccion.transferirTelefono();
		Transaccion.transferirWeb();

	}

}
