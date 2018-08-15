
package exercicio2_matriz;

import java.util.Scanner;

public class Exercicio2_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int consumo[][] = new int[2][4];
        int anoConsumo[] = new int[]{2006, 2007};
        int maiorConsumo = 0, mesMaiorConsumo = 0, anoMaiorConsumo = 0;

        for (int ano = 0; ano < 2; ano++) {
            System.out.println("Informe o consumo dos meses de " + anoConsumo[ano] + ":");
            int numMes = 1;
            for (int mes = 0; mes < 4; mes++) {
                System.out.printf("Mês " + numMes + ": \n");
                consumo[ano][mes] = entrada.nextInt();
                if (consumo[ano][mes] > maiorConsumo) {
                    maiorConsumo = consumo[ano][mes];
                    anoMaiorConsumo = anoConsumo[ano];
                    mesMaiorConsumo = numMes;
                }
                numMes++;
            }
        }
        System.out.println("\nA Matriz consumo ficou: \n");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.printf("\t %d", consumo[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println("O maior consumo foi de " + maiorConsumo + " no mes " + mesMaiorConsumo + " do ano " + anoMaiorConsumo);

    }

}
