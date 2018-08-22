import java.util.Scanner;

public class Busca_Binaria {
	
	public static void main (String[] args);{
		
		Scanner tcl = new Scanner(System.in);
		System.out.println("Quantos números terá o vetor?");
		int valor = tcl.nexInt();
		int vetor[] = new valor;
		
		int valor2 = 1;
		for(int i = 0; i < vetor.length. i++){
			vetor[i] = b++;
			}
		int inicio = vetor[0];
		int end = vetor.length;
		int meio = (end + inicio) /2;
		
		System.out.println("Escolha um número desse vetor.")
		int aux = tcl.nextInt();
		
		if(aux < meio) {
			for (int i = 0; i < meio; i++){
				if( c == vetor[i]) {
					System.out.println("O valor está em " +i);
					}
				}
			} else if ( aux > meio) {
				for (int = i; i < max; i++){
					if (aux == vetor){
				System.out.println ("O valor está na posição:" + i);
				}
			}
		}else if ( aux > meio) {
				for (int = i; i < max; i++){
					if (aux == vetor){
				System.out.println ("O valor está na posição:" + i);
				}
			}
		}else if ( aux == meio){
			System.out.println ("O valor está na posição:" + i);
		}
	}
