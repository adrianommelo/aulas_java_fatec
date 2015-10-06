package projeto_inicial;

public class Triangulo {
	double lado, altura;
	
	public Triangulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	double calculaArea(){
		return (lado * altura) /2;
	}

	double calculaPerimetro() {

		return lado*3;
	}
	
	
	
}
