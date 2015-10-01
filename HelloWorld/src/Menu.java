import javax.swing.JOptionPane;


public class Menu {

	//funções
	
	//fator de Desconto
	static void ajustePreço(){
		double valor;
		String fator;
		double resultado;
		
		
		do {
			
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto ou 0 (número zero) para sair: "));
			if(valor == 0)
				return;
			
			fator = JOptionPane.showInputDialog("1 - 5% de desconto\n2 - 7% de desconto\n3 - 10% de desconto\n"
					+ "4 - 11% de desconto\n5 - 20% de desconto\n\nDigite o ID referencia para gerar Desconto:\n\nou 0 (número zero) para sair: ");
			
			switch (fator) {
			case "1":
				resultado = valor - (valor * 0.05);
				JOptionPane.showMessageDialog(null, "Valor com 5% de desconto: "+ resultado);
				break;
			case "2":
				resultado = valor - (valor * 0.07);
				JOptionPane.showMessageDialog(null, "Valor com 7% de desconto: "+ resultado);
				break;
			case "3":
				resultado = valor - (valor * 0.1);
				JOptionPane.showMessageDialog(null, "Valor com 10% de desconto: "+ resultado);
				break;
			case "4":
				resultado = valor - (valor * 0.11);
				JOptionPane.showMessageDialog(null, "Valor com 11% de desconto: "+ resultado);
				break;
			case "5":
				resultado = valor - (valor * 0.2);
				JOptionPane.showMessageDialog(null, "Valor com 20% de desconto: "+ resultado);
			case "0":
				JOptionPane.showMessageDialog(null, "Saindo!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}
			
		} while (!fator.equals("0"));
		
	}
	
	//mediaFatec
	static void mediaFatec(){
		double provaUm, provaDois, trabUm, trabDois, provaF;
		double media, mediaF;
		
		provaUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da P1: "));
		trabUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da T1: "));
		provaDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da P2: "));
		trabDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da T2: "));
		
		provaUm = provaUm * 0.7;
		provaDois = provaDois * 0.7;
		trabUm = trabUm * 0.3;
		trabDois = trabDois * 0.3;
		
		media = (provaUm + trabUm + provaDois + trabDois)/2;
		//System.out.println(media);
		
		if(media >= 6.0){
			JOptionPane.showMessageDialog(null, "Média = "+media+".\n\nAprovado!");
		}else if(media <6.0 && media >2.0){
			provaF = Double.parseDouble(JOptionPane.showInputDialog("Media foi " + media+". Precisa de prova final!"
					+ "\nDigite o valor da Prova Final: "));
			mediaF = (media + provaF)/2;
			System.out.println(mediaF);
			if(mediaF >= 6.0){
				JOptionPane.showMessageDialog(null, "Média Final = "+mediaF+".\n\nAprovado!");
			}else
				JOptionPane.showMessageDialog(null, "Reprovado!");
		}else
			JOptionPane.showMessageDialog(null, "Média = "+media+".\n\nReprovado!");
	}
	
	//calculadpra
	static void calculadora(){
		double opUm, opDois, resultado;
		String operador;
		
		opUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º Operando: "));
		opDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º Operando: "));
		operador = JOptionPane.showInputDialog("Escolha uma das opções:\n+ para Soma\n\n- para Subtração\n\n* para Multiplicação\n\n/ para divisão"
				+ "\n\nDigite o mesmo simbolo do menu para escolher um Operador : ");
		
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
	
	//Fatorial (do/while)
	static void fatorialFor(){
		int fator, result;
		fator = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Digite o nº que deseja saber o valor Fatorial:"));
		
		result = fator;
		for (int i = fator; i > 1; i--) {
			result = result * (i - 1);
		}
		JOptionPane.showMessageDialog(null, fator+"! é igual a "+result+".");
	}
	
	//Fatorial (while)
	static void fatorialWhile(){
		int fator, result;
		fator = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Digite o nº que deseja saber o valor Fatorial:"));
		
		int i = fator;
		result = fator;
		while (i>1) {
			result = result * (i - 1);
			i--;
		}
		JOptionPane.showMessageDialog(null, fator+"! é igual a "+result+".");
		
	}
	
	///Fatorial (for)
	static void fatorialDoWhile(){
		int fator, result;
		fator = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Digite o nº que deseja saber o valor Fatorial:"));
		
		int i = fator;
		result = fator;
		do {
			result = result * (i - 1);
			i--;
		} while (i>1);
		JOptionPane.showMessageDialog(null, fator+"! é igual a "+result+".");
		
	}
	
	
	//fibonacci (for)
	static void fibonacciFor(){
		int termo,aux1 = 0, aux2, contador;
		
		termo = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Digite a posicao da sequencia de Fibonacci desejada:"));
		contador = 1;
		aux2 = 1;
		for (int i = 1; i < termo; i++) {
			aux2 = aux1 + contador;
			aux1 = contador;
			contador = aux2;
		}
		JOptionPane.showMessageDialog(null, "O " +termo+"º termo fibonacci é "+aux2);
	}
	
	//fibonacci (do/while)
	static void fibonacciDoWhile(){
		int termo,aux1 = 0, aux2, contador;
		
		termo = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Digite a posicao da sequencia de Fibonacci desejada:"));
		int i = 1;
		contador = 1;
		aux2 = 1;
		do {
			aux2 = aux1 + contador;
			aux1 = contador;
			contador = aux2;
			
			i++;
			
		} while (i < termo);
		JOptionPane.showMessageDialog(null, "O " +termo+"º termo fibonacci é "+aux2);
	}
	
	//fibonacci (while)
	static void fibonacciWhile(){
		int termo,aux1 = 0, aux2, contador;
		
		termo = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Digite a posicao da sequencia de Fibonacci desejada:"));
		
		int i=1;
		contador= 1;
		aux2 = 1;
		
		while (i< termo) {
			aux2 = aux1 + contador;
			aux1 = contador;
			contador = aux2;
			i++;
		}
		JOptionPane.showMessageDialog(null, "O " +termo+"º termo fibonacci é "+aux2);
	}
	
	
	public static void main(String[] args) {
		String opcao;
		
		int i = 0, j = 10;
		for (; ; ) {
			System.out.println(i + " " + j);
			i++;
			j--;
			if(!(i < 10 && j > 0))
				break;
		}
		
		/*
		 * fazer no menu
		 * d. Fatorial (do/while)
		 * e. Fatorial (while)
		 * f. Fatorial (for)
		 * g. Fibonacci (do/while)
		 * h. Fibonacci (while)
		 * i. Fibonacci (for)
		 * 
		 * fatorial
		 * 3! = 3x2x1 = 6
		 * 
		 * fibonacci
		 * 1 + 1 + 2 + 3 + 5 + 8
		 */
		

		do{
			opcao = JOptionPane.showInputDialog(
					"a. Ajuste de Preço\n"
					+ "b. Média Fatec!\n"
					+ "c. Calculadora!\n"
					+ "d. Fatorial (do/while)\n"
					+ "e. Fatorial (while)\n"
					+ "f. Fatorial (for)\n"
					+ "g. Fibonacci (do/while)\n"
					+ "h. Fibonacci (while)\n"
					+ "i. Fibonacci (for)\n"
					+ "s. Sair\n"
					+ "\nEscolha uma opção:");
						
			switch (opcao) {
			case "a":
				JOptionPane.showMessageDialog(null, "Ajuste de Preço!");
				ajustePreço();
				break;
			case "b":
				JOptionPane.showMessageDialog(null, "Média Fatec!");
				mediaFatec();
				break;
			case "c":
				JOptionPane.showMessageDialog(null, "Calculadora!");
				calculadora();
				break;
			case "d":
				JOptionPane.showMessageDialog(null, "Fatorial utilizando Do/While");
				fatorialDoWhile();
				break;
			case "e":
				JOptionPane.showMessageDialog(null, "Fatorial utilizando While");
				fatorialWhile();
				break;
			case "f":
				JOptionPane.showMessageDialog(null, "Fatorial utilizando For");
				fatorialFor();
				break;
			case "g":
				JOptionPane.showMessageDialog(null, "Fibonacci utilizando Do/While");
				fibonacciDoWhile();
				break;
			case "h":
				JOptionPane.showMessageDialog(null, "Fibonacci utilizando While");
				fibonacciWhile();
				break;
			case "i":
				JOptionPane.showMessageDialog(null, "Fibonacci utilizando For");
				fibonacciFor();
				break;
			case "s":
				JOptionPane.showMessageDialog(null, "saindo..");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção incorreta!");
				break;
			}
			
		}while(!opcao.equals("s"));//while
		
	}

}
