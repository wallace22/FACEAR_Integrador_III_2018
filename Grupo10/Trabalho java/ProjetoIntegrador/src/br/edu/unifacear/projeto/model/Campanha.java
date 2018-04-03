package br.edu.unifacear.projeto.model;

import java.util.Date;
/*
 * data inicio data fim
 * codigo promo
 * email
 * pessoas afetadas
 */
public class Campanha {
	
	
	private int idCampanha;
	private Date datainicio;
	private Date datafim;
	private boolean status;
	private String nomeCampanha;
	
	public Campanha(int idCampanha, Date datainicio, Date datafim, boolean status, String nomeCampanha) {
		super();
		this.idCampanha = idCampanha;
		this.datainicio = datainicio;
		this.datafim = datafim;
		this.status = status;
		this.nomeCampanha = nomeCampanha;
	}
	
	public Campanha() {
		
	}
	
}
