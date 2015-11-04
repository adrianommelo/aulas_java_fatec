package figuras;

public class Quadrado {
	double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	public double calculaArea(){
		return Math.pow(lado, 2);

	}
	
	public double calculaPerimetro(){
		return 4 * lado;
	}
	
	
}
