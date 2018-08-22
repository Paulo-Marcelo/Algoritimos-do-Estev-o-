import java.util.Scanner;

public class bublesort{
	
	public static void main (String args[]) {
		Scanner tcl = new Scanner(System.in);
		System.out.println("Escolha a quantidade de vetores:");
		int valor = tcl.nextInt;
		int vetor[] = new valor;
		
		System.out.println("Escolha os valores dos vetores:");
		for (int i; i < vetor.length; i ++){
			vetor[i] = valor.nextInt();
		}
		int aux;
		for (int i = 0; i < vetor.length; i++){
			for (int j = 0; j < vetor.lenght; j++){
				if (vetor[i] < vetor[j]){
					aux = vetor[i];
					vetor [i] = vetor[j];
					vetor [j] = aux;
					}
				)
			}
		}	
		for (int i = 0; i < vetor.length; i++){
			System.out.println(vetor[i]);
			}
}

