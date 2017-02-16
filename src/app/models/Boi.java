package app.models;

public class Boi {
	
	public enum Categorias{
		ASPIRANTE, AMADOR, INTERMEDIARIO, PROFISSIONAL
	};
	
	private Categorias categoria;
	private String dono;
	private String raca;
	
	public Boi( Categorias categoria, String dono, String raca ){
		this.dono = dono;
		this.raca = raca;
		this.categoria = categoria;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
