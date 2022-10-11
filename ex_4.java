//Faça um Programa que peça as 4 notas bimestrais e mostre a média.//

package ex_4;

import java.util.Scanner;

public class ex_4 {

    public static void main(String[] args) {
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float nota4 = 0;
        float media_bi = 0;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nota 1: ");
        nota1 = sc1.nextFloat();
        System.out.println("Nota 2: ");
        nota2 = sc1.nextFloat();
        System.out.println("Nota 3: ");
        nota3 = sc1.nextFloat();
        System.out.println("Nota 4: ");
        nota4 = sc1.nextFloat();
        media_bi = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Média do bimestre é: " + media_bi);

    }
}
