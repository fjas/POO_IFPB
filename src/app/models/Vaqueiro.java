package app.models;

public class Vaqueiro extends Pessoa {

	public Pessoa puxador;
	
	public Vaqueiro(String nome) {
		super(nome);
	}
	
	public void addPuxador(Pessoa puxador){
		this.puxador = puxador;
	}
	
	public Pessoa getPuxador(){
		return puxador;
	}
	
}
