package figuras;

public class Pentagono {
	double lado, apontema;
	public Pentagono(Double lado, Double apontema){
		this.lado = lado;
		this.apontema = apontema;
	}
	
	public double calculaArea(){
		//a área de um pentagono regular é = à área de um tringulo *5 (5 porque há 5 lados em
		//um pentagono, então cada lado se torna a base de um triangulo).
		double areaUmLado;
		
		areaUmLado = (lado * apontema)/2;
		return areaUmLado * 5;
	}
	
	public double calculaPerimetro(){
		return lado * 5;
	}
}
