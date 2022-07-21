/*Classe Abstrata*/

package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    /*Dados protegidos (Protected) e reservados (Private)*/
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;


    /*Conteudo abstrato, contendo o calculo das horas */
    public abstract double calcularXp();


    /*Métodos - Getter and Setter*/
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

