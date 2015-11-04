package figuras;

public class Retangulo {
	double base, altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calculaArea(){
		return base * altura;
	}
	
	public double calculaPerimetro(){
		return (base * 2) + (altura*2);
		
	}
}
