
package Busca;

import java.util.Scanner;

public class BuscaSequencialVetorDesordenado {
    
    Scanner scanner = new Scanner(System.in);
        int n = 5;
        int vet[] = new int[n];
        int aux, i, j;
        int opc;
        int troca=1;

        System.out.println("trteste");
        //leitura dos números para guardar no vet
        
            for (i = 0; i < n; i++) {
                System.out.println("Digite o " + (i + 1) + " º número: ");
                vet[i] = scanner.nextInt();
            }
    
}
