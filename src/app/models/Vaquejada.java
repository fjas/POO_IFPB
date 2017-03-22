package app.models;

import java.util.ArrayList;

public class Vaquejada {

	private int id; 
	private String nome;
	private int nSenhas;
	private static double valorSenha;
	private Pessoa locutor;
	
	private ArrayList<Senha> senhas;
	private ArrayList<Vaqueiro> vaqueiros;
	private ArrayList<Boi> bois;
	
	
	public Vaquejada(String nome, int nSenhas){
		this.nome = nome;
		if(nSenhas > 0){
			this.nSenhas = nSenhas;
		}else{
			this.nSenhas = 1;
		}
	}
	
	public void venderSenha(Boi boi, Vaqueiro vaqueiro) throws Exception{
		if( senhas.size() < nSenhas ){
			Senha s = new Senha(boi, vaqueiro);
			senhas.add(s);
		}else{
			throw new Exception("Senhas esgotadas");
		}
	}
	
	/**
	 * retorna o número de senhas que ainda restam para venda
	 * @return
	 */
	public int senhasRestantes(){
		return nSenhas - senhas.size();
	}
	
	public void cadastrarVaqueiro(Vaqueiro vaqueiro){
		vaqueiros.add(vaqueiro);
	}
	
	public static double getValorSenha(){
		return valorSenha;
	}
	
}
