package projeto_inicial;

public class Exponenciacao {
	double base, expo;
	
	public Exponenciacao(Double base, Double expo) {
		this.base = base;
		this.expo = expo;
	}
	Double calularExponenciacao(){
		return Math.pow(base, expo);
	}

}
