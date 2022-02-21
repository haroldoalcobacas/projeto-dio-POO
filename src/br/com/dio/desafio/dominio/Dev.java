package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


public class Dev {

	private String nome;
	private Set<Conteudo>conteudosInscritos = new LinkedHashSet();
	private Set<Conteudo>conteudoConcluidos= new LinkedHashSet();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		// adicionar tudo do bootcamp no conteudoIncritos
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo>conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudoConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}else {
			System.out.println("Ainda não inscritos em nenhum conteudo");
		}
		
	}
	
	public double calcularXp() {
		return this.conteudoConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
	}
		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudoConcluidos() {
		return conteudoConcluidos;
	}

	public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
		this.conteudoConcluidos = conteudoConcluidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudoConcluidos == null) ? 0 : conteudoConcluidos.hashCode());
		result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		if (conteudoConcluidos == null) {
			if (other.conteudoConcluidos != null)
				return false;
		} else if (!conteudoConcluidos.equals(other.conteudoConcluidos))
			return false;
		if (conteudosInscritos == null) {
			if (other.conteudosInscritos != null)
				return false;
		} else if (!conteudosInscritos.equals(other.conteudosInscritos))
			return false;
		return true;
	}
	
	
	
}
