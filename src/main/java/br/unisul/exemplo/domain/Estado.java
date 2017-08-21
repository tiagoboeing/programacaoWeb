package br.unisul.exemplo.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Estado implements Serializable {

	private String nomeEstado;
	private String ufEstado;
	
	
	public String getNomeEstado() {
		return nomeEstado;
	}
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	public String getUfEstado() {
		return ufEstado;
	}
	public void setUfEstado(String ufEstado) {
		this.ufEstado = ufEstado;
	}
	
	
	
}
