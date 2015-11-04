package calculos;

public class Exponenciacao {
	double base, expo;
	
	public Exponenciacao(Double base, Double expo) {
		this.base = base;
		this.expo = expo;
	}
	public double calularExponenciacao(){
		return Math.pow(base, expo);
	}

}
