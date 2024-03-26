package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String titulo;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaAvaliacoes() {
        return this.somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }


    public void fichaTecnica() {

        System.out.println(String.format("""
                *************************************
                Ficha Filme
                *************************************
                Titulo:%s
                Ano de lançamento:%d
                Incluido:
                Total de avaliações: %d
                Soma das avaliações: %f
                Duração em minutos: %d
                                                   
                """, this.titulo, this.anoDeLancamento, this.totalDeAvaliacoes, this.somaAvaliacoes, this.duracaoEmMinutos));
    }

    public void avaliar(double nota) {
        this.somaAvaliacoes += nota;
        this.totalDeAvaliacoes += 1;
    }

    public double obterMedia() {
        return somaAvaliacoes / totalDeAvaliacoes;
    }}
