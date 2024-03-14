import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Scanner in = new Scanner(System.in);


        System.out.println("Insira o titulo do filme:");
        meuFilme.titulo = in.nextLine();
        System.out.println("Insira ano de lançamento do filme:");
        meuFilme.anoDeLancamento = in.nextInt();
        System.out.println("O filme é incluido no plano?");
        meuFilme.incluidoNoPlano = in.nextBoolean();
        System.out.println("Insira a avaliação?");
        meuFilme.somaAvaliacoes = in.nextDouble();
        System.out.println("insira o total de avaliações:");
        meuFilme.totalDeAvaliacoes = in.nextInt();
        meuFilme.fichaTecnica();


        System.out.println("Insira a nova avaliação");
        meuFilme.avaliar(in.nextDouble());

        meuFilme.fichaTecnica();

        System.out.println(String.format("A media é:%s",meuFilme.obterMedia()));


    }
}