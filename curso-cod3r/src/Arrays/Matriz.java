package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos: ");
        int qtAlunos = entrada.nextInt();
        System.out.println("Quantas notas por aluno: ");
        int qtNotas = entrada.nextInt();

        double[][] notasTurma = new double[qtAlunos][qtNotas];

        double total = 0;
        for (int a = 0; a < notasTurma.length; a++) {
            for (int n = 0; n < notasTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasTurma[a][n] = entrada.nextDouble();
                total += notasTurma[a][n];
            }
        }
        System.out.println(total);

        double media = total / (qtAlunos * qtNotas);
        System.out.println("Média: " + media);

        for (double[] notasAluno :
                notasTurma) {
            System.out.println(Arrays.toString(notasAluno));
        }
        
        entrada.close();
    }
}
