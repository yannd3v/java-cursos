package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas: ");
        int qtNotas = entrada.nextInt();

        double[] notas = new double[qtNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota: ");
            notas[i] = entrada.nextDouble();
        }

        System.out.println(Arrays.toString(notas));

        double totalNota = 0;
        for (double nota :
                notas) {
            totalNota += nota;
        }

        System.out.println("A m?dia ?: " + (totalNota / notas.length));
        entrada.close();
    }
}
