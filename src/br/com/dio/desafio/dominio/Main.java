package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargahoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("descrição curso jS");
		curso2.setCargahoraria(12);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição Metoria");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Dev");
		bootcamp.setDescricao("Descrição Bootacamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("conteudos inscritos Camila"+ devCamila.getConteudosInscritos());
		
		devCamila.progredir();
		System.out.println("...");
		System.out.println("conteudos inscritos Camila"+ devCamila.getConteudosInscritos());
		System.out.println("conteudos inscritos Camila"+ devCamila.getConteudoConcluidos());
		System.out.println("XP: "+devCamila.calcularXp());
		
		System.out.println("-------");
		
		Dev devHaroldo = new Dev();
		devHaroldo.setNome("Haroldo");
		devHaroldo.inscreverBootcamp(bootcamp);
		System.out.println("conteudos inscritos Haroldo"+ devHaroldo.getConteudosInscritos());
		
		devHaroldo.progredir();
		devHaroldo.progredir();
		System.out.println("...");
		System.out.println("conteudos inscritos Haroldo"+ devHaroldo.getConteudosInscritos());
		System.out.println("conteudos concluídos Haroldo"+ devHaroldo.getConteudoConcluidos());
		System.out.println("XP: "+devHaroldo.calcularXp());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria1);

		
	}

}
