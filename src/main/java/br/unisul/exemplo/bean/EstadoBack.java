package br.unisul.exemplo.bean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.unisul.exemplo.domain.Estado;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class EstadoBack implements Serializable{

	private Estado estado = new Estado();
	private ArrayList<Estado> listaEstados = new ArrayList<Estado>();
	
	
	public void cadastraEstado(){
		
		//System.out.println(estado.getNomeEstado() + "-" + estado.getUfEstado());
		Messages.addGlobalInfo(estado.getNomeEstado() + "-" + estado.getUfEstado());
		listaEstados.add(estado);
		estado = new Estado();
		
	}
	
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public ArrayList<Estado> getListaEstados() {
		return listaEstados;
	}
	public void setListaEstados(ArrayList<Estado> listaEstados) {
		this.listaEstados = listaEstados;
	}

	

	
}
