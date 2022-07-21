package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        /*Detalhes dos cursos*/

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        /*Evolução dos Devs*/

        Dev devGabriella = new Dev();
        devGabriella.setNome("Gabriella");
        devGabriella.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Gabriella:" + devGabriella.getConteudosInscritos()); /*Imprime uma mensagem para o usuario + método Get*/
        devGabriella.progredir(); /*Status do progresso do Dev*/
        devGabriella.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Gabriella:" + devGabriella.getConteudosInscritos());
        System.out.println("Conteudos concluidos Gabriella:" + devGabriella.getConteudosConcluidos());
        System.out.println("XP:" + devGabriella.calcularTotalXp());

        System.out.println("------");

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Caio:" + devCaio.getConteudosInscritos()); /*Imprime uma mensagem para o usuario + método Get*/
        devCaio.progredir(); /*Status do progresso do Dev*/
        devCaio.progredir();
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Caio:" + devCaio.getConteudosInscritos());
        System.out.println("Conteudos concluidos Caio:" + devCaio.getConteudosConcluidos());
        System.out.println("XP:" + devCaio.calcularTotalXp());

    }
}
