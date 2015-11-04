package figuras;

public class Circulo {
	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea(){
		return Math.PI *(Math.pow(raio, 2));
	}
	
	public double calculaDiametro(){
		return raio * 2;
	}
}
