package app.models;

import java.util.Date;

public class Atendimento {
	public enum niveis_status{
		AGUARDANDO, ATENDIDO, VENCIDO, CANCELADO
	}

	private int empresa_id;
	private int cliente_id;
	private int atendente_id;
	private int servico_id;
	private String status;
	private double valor;
	private String obs;
	private Date data_atendimento;
	private Date created_at;
	private Date updated_at;
	private Date deleted_at;
	
	
//	Getters and Setters	
	public int getEmpresa_id() {
		return empresa_id;
	}
	public void setEmpresa_id(int empresa_id) {
		this.empresa_id = empresa_id;
	}
	public int getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	public int getAtendente_id() {
		return atendente_id;
	}
	public void setAtendente_id(int atendente_id) {
		this.atendente_id = atendente_id;
	}
	public int getServico_id() {
		return servico_id;
	}
	public void setServico_id(int servico_id) {
		this.servico_id = servico_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public Date getData_atendimento() {
		return data_atendimento;
	}
	public void setData_atendimento(Date data_atendimento) {
		this.data_atendimento = data_atendimento;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Date getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}



}
