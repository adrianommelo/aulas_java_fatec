package projeto_inicial;
import javax.swing.JOptionPane;


public class Fibonacci {
	int termo,aux1 = 0, aux2, contador;
	
	void recebeTermo(){
		termo = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Digite a posicao da sequencia de Fibonacci desejada:"));
	}
	
	/*
	*sequencia fibonacci
	* 1 + 1 + 2 + 3 + 5 + 8
	*/
	
	
	void calcularFibonacciFor(){
		contador = 1;
		aux2 = 1;
		for (int i = 1; i < termo; i++) {
			aux2 = aux1 + contador;
			aux1 = contador;
			contador = aux2;
		}
		JOptionPane.showMessageDialog(null, aux2);

	}
	
	void calcularFibonacciDoWhile(){
		int i = 1;
		contador = 1;
		aux2 = 1;
		do {
			aux2 = aux1 + contador;
			aux1 = contador;
			contador = aux2;
			
			i++;
			
		} while (i < termo);
		JOptionPane.showMessageDialog(null, aux2);
	}
	
	void calcularFibonacciWhile(){
		int i=1;
		contador= 1;
		aux2 = 1;
		
		while (i< termo) {
			aux2 = aux1 + contador;
			aux1 = contador;
			contador = aux2;
			i++;
		}
		JOptionPane.showMessageDialog(null, aux2);
	}
	
//	public static void main(String[] args) {
//		int termo,aux1 = 0, aux2, contador;
//		
//		termo = Integer.parseInt(JOptionPane.showInputDialog(""
//				+ "Digite a posicao da sequencia de Fibonacci desejada:"));
		
//		contador = 1;
//		aux2 = 1;
//		for (int i = 1; i < termo; i++) {
//			aux2 = aux1 + contador;
//			aux1 = contador;
//			contador = aux2;
//		}
//		JOptionPane.showMessageDialog(null, aux2);
		
//		int i = 1;
//		contador = 1;
//		aux2 = 1;
//		do {
//			aux2 = aux1 + contador;
//			aux1 = contador;
//			contador = aux2;
//			
//			i++;
//			
//		} while (i < termo);
//		JOptionPane.showMessageDialog(null, aux2);
		
//		int i=1;
//		contador= 1;
//		aux2 = 1;
//		
//		while (i< termo) {
//			aux2 = aux1 + contador;
//			aux1 = contador;
//			contador = aux2;
//			i++;
//		}
		
//	}

}
