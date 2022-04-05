package Arrays;

public class ExercicioForeach {
	public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        double totalALunoA = 0;
        for (double notas :
                notasAlunoA) {
            totalALunoA += notas;
        }

        System.out.println(totalALunoA / notasAlunoA.length);

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
        double totalAlunoB = 0;

        for (double notas :
                notasAlunoB) {
            totalAlunoB += notas;
        }

        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
