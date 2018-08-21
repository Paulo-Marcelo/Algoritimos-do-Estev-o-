import java.util.Scanner;

public class BuscaBinaria {
    public static void main (String[]args){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Qual o tamanho do vetor ?");
        int vetor[] = new int [tcl.nextInt()];
        System.out.println("Escreva os números:");
        for (int i = 0; i < vetor.length ; i++) {
            vetor[i] = tcl.nextInt();
        }
        System.out.println("Escreva um valor para ser procurado.");
        int valor = tcl.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == valor) {
                System.out.println("O valor está na posição" + i);
            }
        }
    }
}