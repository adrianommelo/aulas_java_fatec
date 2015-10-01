import javax.swing.JOptionPane;


public class FatorDesconto {
	
	double valor, valorAjustado;
	String fator;
	
	void calcularAjuste(){
		
		do{
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto ou 0 (número zero) para sair: "));
			if(valor == 0)
				return;
			
			fator = JOptionPane.showInputDialog("1 - 5% de desconto\n2 - 7% de desconto\n3 - 10% de desconto\n"
					+ "4 - 11% de desconto\n5 - 20% de desconto\n\nDigite o ID referencia para gerar Desconto:\n\nou 0 (número zero) para sair: ");
			
			switch (fator) {
			case "1":
				valorAjustado = valor - (valor * 0.05);
				JOptionPane.showMessageDialog(null, "Valor com 5% de desconto: "+ valorAjustado);
				break;
			case "2":
				valorAjustado = valor - (valor * 0.07);
				JOptionPane.showMessageDialog(null, "Valor com 7% de desconto: "+ valorAjustado);
				break;
			case "3":
				valorAjustado = valor - (valor * 0.1);
				JOptionPane.showMessageDialog(null, "Valor com 10% de desconto: "+ valorAjustado);
				break;
			case "4":
				valorAjustado = valor - (valor * 0.11);
				JOptionPane.showMessageDialog(null, "Valor com 11% de desconto: "+ valorAjustado);
				break;
			case "5":
				valorAjustado = valor - (valor * 0.2);
				JOptionPane.showMessageDialog(null, "Valor com 20% de desconto: "+ valorAjustado);
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "Saindo!");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}
		}while(!fator.equals("0"));
	}
	
	
//	public static void main(String[] args) {
//		double valor;
//		String fator;
//		double resultado;
//		
//		
//		do {
//			
//			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
//			
//			fator = JOptionPane.showInputDialog("1 - 5% de desconto\n2 - 7% de desconto\n3 - 10% de desconto\n"
//					+ "4 - 11% de desconto\n5 - 20% de desconto\n\nDigite o ID referencia para gerar Desconto: ");
//			
//			switch (fator) {
//			case "1":
//				resultado = valor - (valor * 0.05);
//				JOptionPane.showMessageDialog(null, "Valor com 5% de desconto: "+ resultado);
//				break;
//			case "2":
//				resultado = valor - (valor * 0.07);
//				JOptionPane.showMessageDialog(null, "Valor com 7% de desconto: "+ resultado);
//				break;
//			case "3":
//				resultado = valor - (valor * 0.1);
//				JOptionPane.showMessageDialog(null, "Valor com 10% de desconto: "+ resultado);
//				break;
//			case "4":
//				resultado = valor - (valor * 0.11);
//				JOptionPane.showMessageDialog(null, "Valor com 11% de desconto: "+ resultado);
//				break;
//			case "5":
//				resultado = valor - (valor * 0.2);
//				JOptionPane.showMessageDialog(null, "Valor com 20% de desconto: "+ resultado);
//			case "0":
//				JOptionPane.showMessageDialog(null, "Saindo!");
//				break;
//			default:
//				JOptionPane.showMessageDialog(null, "Opção inválida!");
//				break;
//			}
//			
//		} while (!fator.equals("0"));
//	}
}
