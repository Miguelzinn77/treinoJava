package sintaxe_basica;

public class exemplo_sintaxe {

    public static void main(String[] args) {
        System.out.println("Olá, Miguelzinn fala cmg minha joia!");

        int idade = 25;
        int anoAtual = 2026;
        System.out.println("Sua Idade é: " + idade);
        System.out.println("Estamos em Ano Atual: " + anoAtual);

        boolean EstaLogado = true;
        boolean temAcesso = false;
        System.out.println("Está Logado? " + EstaLogado);
        System.out.println("Tem Acesso? " + temAcesso);

        int x = 10;
        int y = 20;

        System.out.println("valor da soma é:" + (x + y));

        int contador = 0;
        contador++;
        contador += 5;
        contador -= 3;
        System.out.println("Valor do contador: " + contador);
    }

}