/*Extends - palavra reservada que indica a criação da Herança entre duas classes*/

package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    /*Dados reservados (Private)*/
    private int cargaHoraria;


    /*Construtor*/
    public Curso() {
    }


    /*Conteudo contendo o calculo das horas */
    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }


    /*Métodos - Getter and Setter*/
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    /*Método ToString*/
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
