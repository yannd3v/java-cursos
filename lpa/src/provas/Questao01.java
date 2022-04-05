package provas;

import java.util.Arrays;

public class Questao01 {
    static int cont;
    static final int VALOR_INICIAL = 6, TAMANHO = 30, PESO1 = 4, PESO2 = 6;

    static int[] primeiraSequencia = new int[TAMANHO];
    static int[] segundaSequencia = new int[TAMANHO];
    static int[] sequenciaFibonacci = new int[30];
    static int n1 = 0 ,n2 = 1,n3 = 0, total1, total2;

    public static int[] sequencia1(int tam, int valorInicial){
        for(int i = 0; i < tam; i++){
            primeiraSequencia[0] = VALOR_INICIAL;
            if(primeiraSequencia[i] % 2 == 0 && primeiraSequencia[i] % 3 == 0){
                primeiraSequencia[i] = valorInicial;
            }
            valorInicial += 6;
        }
        return primeiraSequencia;
    }

    public static int[] sequencia2(int[] vetor){
        for(int i = vetor.length - 1, j = 0; j < vetor.length; i--,j++){
            segundaSequencia[j] = vetor[i];
        }
        return segundaSequencia;
    }

    public static int[] sequencia3(int tam) {
        for (int i = 0; i < tam; i++) {
            sequenciaFibonacci[i] = n1;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return sequenciaFibonacci;
    }
    //12 * 4 -------- 18 * 6
    public static double mediaPonderada(int[] vetor) {
       return (vetor[12] * PESO1 + vetor[18] * PESO2) / (PESO1 + PESO2);
    }
    
    public static double mediaAritmetica(int[] vetor1, int[] vetor2) {
    	for (int i = 0; i < vetor2.length; i++) {
			total1 += vetor2[i];
			
		}
    	for (int i = 0; i < vetor1.length; i++) {
			total2 += vetor1[i];
		}
    	return (total2 + total1) / 2;
    }
    
    public static void imprimir(String str) {
    	System.out.println(str);
    }




    public static void main(String[] args) {
        imprimir("Primeira Sequência");
    	int[] minhaSequencia = sequencia1(TAMANHO, VALOR_INICIAL);
        System.out.println(Arrays.toString(minhaSequencia));

        imprimir("Segunda Sequência");
        int[] minhaSequencia2 = sequencia2(sequencia1(TAMANHO, VALOR_INICIAL));
        System.out.println(Arrays.toString(minhaSequencia2));

        imprimir("Fibonacci");
        int[] fibonacci = sequencia3(TAMANHO);
        System.out.println(Arrays.toString(fibonacci));

        imprimir("Média Ponderada");
        System.out.println(mediaPonderada(fibonacci));
        
        imprimir("Média Aritmética");
        System.out.println(mediaAritmetica(minhaSequencia,fibonacci));
        
        




    }

}