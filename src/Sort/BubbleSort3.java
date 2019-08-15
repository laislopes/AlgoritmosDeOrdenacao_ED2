
package Sort;

import java.util.Scanner;

public class BubbleSort3 {
  public static void main(String[] args) {
      
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
        

        
        System.out.println("\n--------------\nsorting ASC(1)?");
        opc = scanner.nextInt();

        if (opc == 1) {
            i =0;
            //ordenando asc
            i =0;
            //ordenando desc
            while (i<n && troca==1) {
                troca = 0;    
                for (j = 0; j < n - 1; j++) {
                    if (vet[j] > vet[j + 1]) {
                        aux = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = aux;
                        troca =1;
                    }
                }
                i++;
            }
        }
        else {
            i =0;
            //ordenando desc
            while (i<n && troca==1) {
                troca = 0;
                for (j = 0; j < n - 1; j++) {
                    if (vet[j] < vet[j + 1]) {
                        aux = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = aux;
                        troca =1;
                    }
                }
                i++;
            }
        }

        //mostrando vetor ordenado
        System.out.println("\n-----------------\nVetor odernado");

        for (i = 0; i < n; i++) {
            System.out.println((i + 1) + " º número: " + vet[i]);
        }
        
        

    }
}
