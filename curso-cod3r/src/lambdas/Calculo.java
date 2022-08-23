package lambdas;

@FunctionalInterface // É uma boa praticar inserir annotation para deixar explicito que é uma interface funcional
public interface Calculo {

// Só é possível utilizar uma função funcional na interface	
	
	double executar(double a, double b); // Por padrão, as funções são publicas e abstratas
		
	
	default String legal() { // é possivel utilizar métodos default
		return "legal";
	}
	
	static String muitoLegal() { // é possivel utilizar métodos estaticos
		return "muito legal";
	}
}
