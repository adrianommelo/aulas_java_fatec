package projeto_inicial;

public class Retangulo {
	double base, altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	double calculaArea(){
		return base * altura;
	}
	
	double calculaPerimetro(){
		return (base * 2) + (altura*2);
		
	}
}
