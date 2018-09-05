
import java.util.Scanner;
import java.util.Random;


public class matriz2 {
    public static void main(String[] args){
        
        Scanner tcl = new Scanner(System.in);
        Random num = new Random(System.in);
        int matriz[][] = new int[5][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
            	matriz[i][j] = num.nextInt;
                
            }
        }
        
        System.out.print( matriz [i][j]+"");
        System.out.print("Escolha um número:")

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
            	matriz[i][j] = tcl.nextInt;
            if (tcl = matriz[i][j]) {
            	System.out.print("O número esta localizado em" + matriz[i][j]);
            	break;
            }
            else{
                System.out.print("Esse número não existe.");
                break;
            }
            }
        }

        }
    }
}
