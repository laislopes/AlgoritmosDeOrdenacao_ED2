package Busca;

import java.util.Scanner;

public class BuscaSequencialVetorDesordenado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int vet[] = new int[n];
        int i;

        //leitura dos números para guardar no vet
        while (true) {
            System.out.println("Digite o " + (i + 1) + " º número: ");
            vet[i] = scanner.nextInt();
        }

    }
}
