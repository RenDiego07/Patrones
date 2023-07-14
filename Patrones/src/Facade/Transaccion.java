package Facade;

public class Transaccion {
	private Transaccionable Web;
	private Transaccionable Movil;
	private Transaccionable Telefono;
	
	public Transaccion() {
		Web = new Web();
		Movil = new Movil();
		Telefono = new Telefono();
	}
	
	public void transferirWeb() {
		Web.transferir();
	}
	
	public void transferirMovil() {
		Movil.transferir();
	}
	
	public void transferirTelefono() {
		Telefono.transferir();
	}
	//Aqui cada metodo podria tener mas subsistemas como lo asumido anteriormente de Notificar
}
