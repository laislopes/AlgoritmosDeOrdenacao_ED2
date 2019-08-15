
package Sort;

import java.util.Scanner;

public class BubbleSort1 {
    
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 5;
        int vet[] = new int[n];
        int aux, i, j;

        //leitura dos números para guardar no vet
        try (Scanner scanner = new Scanner(System.in)) {
            for (i = 0; i < n; i++) {
                System.out.println("Digite o " + (i + 1) + " º número: ");
                vet[i] = scanner.nextInt();
            }
        }

        //ordenando
        for(i = 0;i < 6;i++){
            
        }
        
        //mostrando vetor ordenado
        System.out.println("\n-----------------\nVetor odernado");

        for (i = 0; i < n; i++) {
            System.out.println((i + 1) + " º número: " + vet[i]);
        }
        
        

    }

}
