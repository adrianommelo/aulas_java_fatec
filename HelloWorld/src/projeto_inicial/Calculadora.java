package projeto_inicial;
import javax.swing.JOptionPane;


public class Calculadora {
	double opUm, opDois, resultado;
	String operador;
	
	
	
	void operandos(){
		opUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1� Operando: "));
		opDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2� Operando: "));
		
		operador = JOptionPane.showInputDialog("Escolha uma das op��es:\n+ para Soma\n\n- para Subtra��o\n\n* para Multiplica��o\n\n/ para divis�o"
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
//		opUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1� Operando: "));
//		opDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2� Operando: "));
//		operador = JOptionPane.showInputDialog("Escolha uma das op��es:\n+ para Soma\n\n- para Subtra��o\n\n* para Multiplica��o\n\n/ para divis�o"
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
