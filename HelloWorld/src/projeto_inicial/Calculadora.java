package projeto_inicial;
import javax.swing.JOptionPane;


public class Calculadora {
	double opUm, opDois, resultado;
	String operador;
	
	
	
	void operandos(){
		opUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º Operando: "));
		opDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º Operando: "));
		
		operador = JOptionPane.showInputDialog("Escolha uma das opções:\n+ para Soma\n\n- para Subtração\n\n* para Multiplicação\n\n/ para divisão"
				+ "\n\nDigite o mesmo simbolo do menu para escolher um Operador : ");
	}
	
	void calculos(){
		switch (operador.charAt(0)) {
		case '+':
			resultado = opUm + opDois;
			JOptionPane.showMessageDialog(null, opUm+" + "+opDois+" = "+resultado);
			break;
		case '-':
			resultado = opUm - opDois;
			JOptionPane.showMessageDialog(null, opUm+" - "+opDois+" = "+resultado);
			break;
		case '*':
			resultado = opUm * opDois;
			JOptionPane.showMessageDialog(null, opUm+" * "+opDois+" = "+resultado);
			break;
		case '/':
			resultado = opUm / opDois;
			JOptionPane.showMessageDialog(null, opUm+" / "+opDois+" = "+resultado);
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Operador inexistente!");
			break;
		}//switch
	}
	
//	public static void main(String[] args) {
//		double opUm, opDois, resultado;
//		String operador;
//		
//		opUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º Operando: "));
//		opDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º Operando: "));
//		operador = JOptionPane.showInputDialog("Escolha uma das opções:\n+ para Soma\n\n- para Subtração\n\n* para Multiplicação\n\n/ para divisão"
//				+ "\n\nDigite o mesmo simbolo do menu para escolher um Operador : ");
//		
//		switch (operador.charAt(0)) {
//		case '+':
//			resultado = opUm + opDois;
//			JOptionPane.showMessageDialog(null, opUm+" + "+opDois+" = "+resultado);
//			break;
//		case '-':
//			resultado = opUm - opDois;
//			JOptionPane.showMessageDialog(null, opUm+" - "+opDois+" = "+resultado);
//			break;
//		case '*':
//			resultado = opUm * opDois;
//			JOptionPane.showMessageDialog(null, opUm+" * "+opDois+" = "+resultado);
//			break;
//		case '/':
//			resultado = opUm / opDois;
//			JOptionPane.showMessageDialog(null, opUm+" / "+opDois+" = "+resultado);
//		default:
//			JOptionPane.showMessageDialog(null, "Operador inexistente!");
//			break;
//		}//switch
//	}
}
