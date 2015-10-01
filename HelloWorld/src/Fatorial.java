import javax.swing.JOptionPane;


public class Fatorial {
	int fator, result;
	
	
	void recebeNumero(){
		fator = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº que deseja saber o valor Fatorial:"));
	}
	
	
	/* 
	*calculo fatorial
	*3! = 3x2x1 = 6
	*/
	void calcularFatorialFor(){
		result = fator;
		for (int i = fator; i > 1; i--) {
			result = result * (i - 1);
		}
		JOptionPane.showMessageDialog(null, fator+"! é igual a "+result+".");
	}
	
	void calcularFatorialWhile(){
		int i = fator;
		result = fator;
		while (i>1) {
			result = result * (i - 1);
			i--;
		}
		JOptionPane.showMessageDialog(null, fator+"! é igual a "+result+".");
	}
	
	void calcularFartorialDoWhile(){
		int i = fator;
		result = fator;
		do {
			result = result * (i - 1);
			i--;
		} while (i>1);
		JOptionPane.showMessageDialog(null, fator+"! é igual a "+result+".");
	}

//	public static void main(String[] args) {
//		int fator, result;
//		fator = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº que deseja saber o valor Fatorial:"));
//		
		//com for
//		result = fator;
//		for (int i = fator; i > 1; i--) {
//			result = result * (i - 1);
//		}
//		JOptionPane.showMessageDialog(null, fator+"! é igual a "+result+".");
		
		//com while
//		int i = fator;
//		result = fator;
//		while (i>1) {
//			result = result * (i - 1);
//			i--;
//		}
//		JOptionPane.showMessageDialog(null, fator+"! é igual a "+result+".");
		
		//com do/while
//		int i = fator;
//		result = fator;
//		do {
//			result = result * (i - 1);
//			i--;
//		} while (i>1);
//		JOptionPane.showMessageDialog(null, fator+"! é igual a "+result+".");
//	}

}
