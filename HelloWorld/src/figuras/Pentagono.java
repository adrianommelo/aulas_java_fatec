package figuras;

public class Pentagono {
	double lado, apontema;
	public Pentagono(Double lado, Double apontema){
		this.lado = lado;
		this.apontema = apontema;
	}
	
	public double calculaArea(){
		//a �rea de um pentagono regular � = � �rea de um tringulo *5 (5 porque h� 5 lados em
		//um pentagono, ent�o cada lado se torna a base de um triangulo).
		double areaUmLado;
		
		areaUmLado = (lado * apontema)/2;
		return areaUmLado * 5;
	}
	
	public double calculaPerimetro(){
		return lado * 5;
	}
}
