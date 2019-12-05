package com.elorrieta;

public class Libro {
	
	private String titulo;
	private String codigo;
	
	public Libro(String titulo, String codigo) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
	}

	public Libro() {
		super();
		this.titulo = "";
		this.codigo = "";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

}
