package br.com.dio.exercicios.arrays;
/*
* 00:42
* 25/04/2022
* Manipulando Arrays
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //System.out.println(vetor.length);

        System.out.print("Vetor: ");
        int count =0;
        // esse começa contando de 0 a TAMANHO_ARRAY e printa <
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        // Esse conta o total e começa do fim do array para o inicio >=
        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }

    }
}
