package projeto_inicial;

public class Triangulo {
	double base, altura, lado;
	
	public Triangulo(double base, double altura, double lado) {
		this.base = base;
		this.altura = altura;
	}
	
	double calculaArea(){
		return (base * altura) /2;
	}

	double calculaPerimetro() {

		return lado*3;
	}
	
	
	
}
