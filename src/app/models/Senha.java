package app.models;

public class Senha {

	public int id;
	public Boi boi;
	public Vaqueiro vaqueiro;
	public Pessoa puxador;
	public boolean nota;
	public double valor; 
	public Status status;
	
	public Boi.Categorias categoria;
	
	public enum Status{
		AGUARDANDO, CORRENDO, CORREU
	}
	
	public Senha(Boi boi, Vaqueiro vaqueiro){
		this.boi = boi;
		this.vaqueiro = vaqueiro;
		this.puxador = vaqueiro.getPuxador();
		valor = Vaquejada.getValorSenha();
		status = Status.AGUARDANDO;
	}

	
}
