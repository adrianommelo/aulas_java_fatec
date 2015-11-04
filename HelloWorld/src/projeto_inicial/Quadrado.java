package projeto_inicial;

public class Quadrado {
	double lado;
	
	Quadrado(double lado){
		this.lado = lado;
	}
	
	double calculaArea(){
		return Math.pow(lado, 2);

	}
	
	double calculaPerimetro(){
		return 4 * lado;
	}
	
	
}
