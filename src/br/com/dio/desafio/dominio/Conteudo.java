package br.com.dio.desafio.dominio;

//Classe Abstract serve apenas para passar variáveis 
public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp();

	// get e set apenas na clase mae
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
