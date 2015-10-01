package projeto_inicial;

public class Circulo {
	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	double calculaArea(){
		return Math.PI *(Math.pow(raio, 2));
	}
	
	double calculaDiametro(){
		return raio * 2;
	}
}
