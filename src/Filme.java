public class Filme {
    String titulo;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalDeAvaliacoes;


    void fichaTecnica(){

        System.out.println(String.format("""
                    *************************************
                    Ficha Filme
                    *************************************
                    Titulo:%s
                    Ano de lançamento:%d
                    Incluido:
                    Total de avaliações: %d
                    Soma das avaliaçõ9es: %d
                    Duração em minutos: %d
                                                       
                    """,this.titulo,this.anoDeLancamento,this.totalDeAvaliacoes,this.somaAvaliacoes,this.duracaoEmMinutos));
    }

    void avaliar(double nota){
        this.somaAvaliacoes+=nota;
        this.totalDeAvaliacoes+=1;
    }

    double obterMedia(){
        return  somaAvaliacoes/totalDeAvaliacoes;
    }

}
