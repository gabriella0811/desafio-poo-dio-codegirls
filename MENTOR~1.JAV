/*Extends - palavra reservada que indica a criação da Herança entre duas classes*/

package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    /*Dados reservados (Private) */
    private LocalDate data;


    /*Conteudo contendo o calculo das horas */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    /*Construtor*/
    public Mentoria() {
    }

    /*Métodos Getter and Setter*/
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    /*Método ToString*/
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}
