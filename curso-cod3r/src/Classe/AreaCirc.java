package Classe;

public class AreaCirc {
	double raio;
	static double pi = 3.14; // Se não queremos que o PI seja alterado, podemos utilizar o "final static"
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
}
