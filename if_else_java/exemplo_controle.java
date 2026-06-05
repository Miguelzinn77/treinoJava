package if_else_java;

public class exemplo_controle {

    public static void main(String[] args) {

        int idade = 18;

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        double nota = 6.3; // double por causa do ponto flutuante
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        boolean estaChovendo = true;
        boolean temGuardaChuva = false;

        if (estaChovendo && !temGuardaChuva) {
            System.out.println("Fique em casa, não tem guarda-chuva");
        } else {
            System.out.println("Pode sair");
        }

        boolean temDinheiro = true;
        boolean temTempo = false;

        if (temDinheiro && temTempo) {
            System.out.println("pode viajar");
        } else {
            System.out.println("fique em casa, não tem diheiro");
        }

        // LOOP WHILE
        int contador = 1;
        while (contador <= 5) {
            System.out.println(contador);
            contador++; // contar até 5
        }

        // LOOP FOR
        for (int i = 0; i <= 5; i++) {
            System.out.println("o valor de i é " + i);
        }

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int somaPar = 0;
        int somaImpar = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                somaPar += num;
            } else {
                somaImpar += num;
            }
        }
        System.out.println(somaImpar);
        System.out.println(somaPar);


    }

}
