package projeto_inicial;
import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
//		exemplo de uso de objetos		
//		Aula03 objeto, obj, obj2;
//		
//		objeto = new Aula03();
//		objeto.exibir();
//		
//		obj = new Aula03();
//		obj.exibir();
//		
//		obj2 = new Aula03();
//		obj2.mensagem = "Olá mundo";
//		obj2.exibir();
//		
//		obj.exibir();
		
		String opcao;
	

		do{
			opcao = JOptionPane.showInputDialog(
					"a - Ajuste de Preço\n"
					+ "b - Média Fatec!\n"
					+ "c - Calculadora!\n"
					+ "d - Fatorial (do/while)\n"
					+ "e - Fatorial (while)\n"
					+ "f - Fatorial (for)\n"
					+ "g - Fibonacci (do/while)\n"
					+ "h - Fibonacci (while)\n"
					+ "i - Fibonacci (for)\n"
					+ "j - MaiorMenor\n"
					+ "k - Palíndro\n"
					+ "l - Números\n"
					+ "m - Quadrado\n"
					+ "n - Retangulo\n"
					+ "o - Circulo\n"
					+ "p - Triangulo\n"
					+ "q - Pentagono\n"
					+ "r - Exponenciação\n"
					+ "s - Jogo da Moeda"
					+ "\nDigite SAIR para fechar o programa\n\n"
					+ "\nEscolha uma opção:");
			
			opcao = opcao.toLowerCase();
			
			switch (opcao) {
			case "a":
				FatorDesconto objFatorDesconto = new FatorDesconto();
				
				JOptionPane.showMessageDialog(null, "Ajuste de Preço!");
				objFatorDesconto.calcularAjuste();
				break;
				
			case "b":
				MediaFatec objMediaFatec = new MediaFatec();
				
				JOptionPane.showMessageDialog(null, "Média Fatec!");
				objMediaFatec.calcularMedia();
				break;
				
			case "c":
				Calculadora objCalculadora = new Calculadora();
				
				JOptionPane.showMessageDialog(null, "Calculadora!");
				objCalculadora.operandos();
				objCalculadora.calculos();
				break;
				
			case "d":
				Fatorial objFatorialDoWhile = new Fatorial();
				
				JOptionPane.showMessageDialog(null, "Fatorial utilizando Do/While");
				objFatorialDoWhile.recebeNumero();
				objFatorialDoWhile.calcularFartorialDoWhile();
				break;

			case "e":
				Fatorial objFatorialWhile = new Fatorial();
				JOptionPane.showMessageDialog(null, "Fatorial utilizando While");
				objFatorialWhile.recebeNumero();
				objFatorialWhile.calcularFatorialWhile();
				break;
			case "f":
				Fatorial objFatorialFor = new Fatorial();
				
				JOptionPane.showMessageDialog(null, "Fatorial utilizando For");
				objFatorialFor.recebeNumero();
				objFatorialFor.calcularFatorialFor();
				break;
				
			case "g":
				Fibonacci objFibonacciDoWhile = new Fibonacci();
				
				JOptionPane.showMessageDialog(null, "Fibonacci utilizando Do/While");
				objFibonacciDoWhile.recebeTermo();
				objFibonacciDoWhile.calcularFibonacciDoWhile();
				break;
				
			case "h":
				Fibonacci objFibonacciWhile = new Fibonacci();
				
				JOptionPane.showMessageDialog(null, "Fibonacci utilizando While");
				objFibonacciWhile.recebeTermo();
				objFibonacciWhile.calcularFibonacciWhile();
				break;
				
			case "i":
				Fibonacci objFibonacciFor = new Fibonacci();
				JOptionPane.showMessageDialog(null, "Fibonacci utilizando For");
				objFibonacciFor.recebeTermo();
				objFibonacciFor.calcularFibonacciFor();
				break;
				
			case "j":
				MaiorMenor objMaiorMenor = new MaiorMenor();
				JOptionPane.showMessageDialog(null, "Ler números digitados pelo Usuário (Exibe Maior Menor)");
				objMaiorMenor.VerificarValor();
				break;
				
			case "k":
				Palindromo objPalindromo = new Palindromo();
				String texto;
				JOptionPane.showMessageDialog(null, "Eh Palíndromo?");
				texto = JOptionPane.showInputDialog("Palíndro - Insira uma palavra ou frase para verificar:");
				objPalindromo.ehPalindromo(texto);
				break;
				
			case "l":
				String opcaoUsuario;
								
				Numeros objNumeros = new Numeros();
				JOptionPane.showMessageDialog(null, "Números?");
				objNumeros.leValores();
				
				do {
					opcaoUsuario = JOptionPane.showInputDialog("Dentro os números inseridos.\n"
							+ "Deseja:\n"
							+ "a. Achar o Maior valor\n"
							+ "b. Achar o Menor valor\n"
							+ "c. Multiplicar os valores\n"
							+ "d. Ordenar os valores\n"
							+ "e. Mostrar os valores lidos\n"
							+ "\ns. para voltar");
					
					opcaoUsuario = opcaoUsuario.toLowerCase();
					
					switch (opcaoUsuario) {
					case "a":
						objNumeros.achaMaior();
						break;
					case "b":
						objNumeros.achaMenor();
						break;
					case "c":
						int valorMultiplicador;
						valorMultiplicador = Integer.parseInt(
								JOptionPane.showInputDialog("Digite o nº multiplicador:"));
						
						objNumeros.multiplicaValores(valorMultiplicador);
						break;
					case "d":
						objNumeros.ordenaValores();
						break;
					case "e":
						objNumeros.mostraValores();
						break;
					case "s":
						JOptionPane.showMessageDialog(null, "voltando...");
						break;
					
					default:
						JOptionPane.showMessageDialog(null, "Opção incorreta!");
						break;
					}
				} while (!opcaoUsuario.equals("s"));
				
				break;
				
			case "m":
				String opcaoQuadrado;
				double lado;
				JOptionPane.showMessageDialog(null, "Quadrado!\n Um quadrado é conhecido por ter 4 lados\n"
						+ "e todos seus lados possuirem o mesmo valor..");
				lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Lado:"));
				
				Quadrado objQuadrado = new Quadrado(lado);
				
				do {
					opcaoQuadrado = JOptionPane.showInputDialog("Deseja calcular:\n"
							+ "a. Area\n"
							+ "b. Perímetro\n\n"
							+ "Digite a opção desejada ou s para voltar:");
					opcaoQuadrado = opcaoQuadrado.toLowerCase();
					
					switch (opcaoQuadrado) {
					
					case "a":
						JOptionPane.showMessageDialog(null, "A área do quadrado é "+objQuadrado.calculaArea());
						break;
						
					case "b":
						JOptionPane.showMessageDialog(null, "O perímetro do quadrado é "+objQuadrado.calculaPerimetro());
						break;
					case "s":
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida!");
						break;
					}//switch
					
				} while (!opcaoQuadrado.equals("s"));
				
				break;
				
			case "n":
				String opcaoRetangulo;
				double base, altura;
				JOptionPane.showMessageDialog(null, "Retangulo!\n Um retangulo é conhecido por ter um valor de base\n"
						+ "e  um valor de altura...");
				base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Base:"));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Altura:"));
				
				Retangulo objRetangulo = new Retangulo(base, altura);
				
				do {
					opcaoRetangulo = JOptionPane.showInputDialog("Deseja calcular:\n"
							+ "a. Area\n"
							+ "b. Perímetro\n\n"
							+ "Digite a opção desejada ou s para voltar:");
					opcaoRetangulo = opcaoRetangulo.toLowerCase();
					
					switch (opcaoRetangulo) {
					
					case "a":
						JOptionPane.showMessageDialog(null, "A área do retangulo é "+objRetangulo.calculaArea());
						break;
						
					case "b":
						JOptionPane.showMessageDialog(null, "O perímetro do retangulo é "+objRetangulo.calculaPerimetro());
						break;
					case "s":
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida!");
						break;
					}//switch
					
				} while (!opcaoRetangulo.equals("s"));
				break;
				
			case "o":
				String opcaoCirculo;
				double raio;
				JOptionPane.showMessageDialog(null, "Um dos atributos de um Circulo é o valor de seu Raio...");
				raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Raio:"));
				
				
				Circulo objCirculo = new Circulo(raio);
				
				do {
					opcaoCirculo = JOptionPane.showInputDialog("Deseja calcular:\n"
							+ "a. Area\n"
							+ "b. Diametro\n\n"
							+ "Digite a opção desejada ou s para voltar:");
					opcaoCirculo = opcaoCirculo.toLowerCase();
					
					switch (opcaoCirculo) {
					
					case "a":
						JOptionPane.showMessageDialog(null, "A área do Circulo é "+objCirculo.calculaArea());
						break;
						
					case "b":
						JOptionPane.showMessageDialog(null, "O diamtreo do Circulo é "+objCirculo.calculaDiametro());
						break;
					case "s":
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida!");
						break;
					}//switch
					
				} while (!opcaoCirculo.equals("s"));
				
				break;
				
			case "p":
				String opcaoTriangulo;
				double alturaTriangulo, ladoTriangulo;
				JOptionPane.showMessageDialog(null, "Triangulo!\n Usaremos um triangulo simples para o calculo, de três lados iguais....");

				ladoTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de um dos Lados:"));
				alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Altura:"));
				
				Triangulo objTriangulo = new Triangulo(ladoTriangulo, alturaTriangulo);
				
				do {
					opcaoTriangulo = JOptionPane.showInputDialog("Deseja calcular:\n"
							+ "a. Area\n"
							+ "b. Perímetro\n\n"
							+ "Digite a opção desejada ou s para voltar:");
					opcaoTriangulo = opcaoTriangulo.toLowerCase();
					
					switch (opcaoTriangulo) {
					
					case "a":
						JOptionPane.showMessageDialog(null, "A área do Triangulo é "+objTriangulo.calculaArea());
						break;
						
					case "b":
						JOptionPane.showMessageDialog(null, "O perímetro do Triangulo é "+objTriangulo.calculaPerimetro());
						break;
					case "s":
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida!");
						break;
					}//switch
					
				} while (!opcaoTriangulo.equals("s"));
				break;
				
			case "q":
				String opcaoPentagono;
				JOptionPane.showMessageDialog(null, "Petagonos!");
				double ladoPentagono, apontema;
				
				ladoPentagono = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado: "));
				apontema = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da apontema:\n\n*se pensarmos em Tringulos, a"
						+ " a apontema seria o valor da altura do trinagulo! :)"));
				
				Pentagono objPentagono = new Pentagono(ladoPentagono, apontema);
				
				do{
					opcaoPentagono = JOptionPane.showInputDialog("Deseja saber:\n"
						+"a. Area.\n"
						+"b. Perímetro\n\n"
						+"Digite a opção desejado ou s para voltar:");
					opcaoPentagono = opcaoPentagono.toLowerCase();

					switch(opcaoPentagono){
						case "a":
							JOptionPane.showMessageDialog(null, "A Área do Pentagono é "+objPentagono.calculaArea());
							break;
						case "b":
							JOptionPane.showMessageDialog(null, "O Perímetro Pentagono é "+objPentagono.calculaPerimetro());
							break;
						case "s":
							JOptionPane.showMessageDialog(null, "voltando ao menu anterior.. ");
							break;
						default:
							JOptionPane.showMessageDialog(null, "Opção inválida!");
							break;
					}

				}while(!opcaoPentagono.equals("s"))
				//CONTINUAR
				break;
			case "r":
				
				JOptionPane.showMessageDialog(null, "Calculo de Exponenciação!");
				
				double baseExponenciacao, exponenciador;
				
				baseExponenciacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja elevar:"));
				exponenciador = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do exponenciador:"));
				
				Exponenciacao objExpo = new Exponenciacao(baseExponenciacao, exponenciador);
				
				JOptionPane.showMessageDialog(null, ""+baseExponenciacao+" elevado à "+exponenciador+" é igual a "+objExpo.calularExponenciacao()+""
						+ "\n\nPrecione OK para voltar ao MENU");
				
				break;
				
			case "s":
				JOptionPane.showMessageDialog(null, "Joda da Moeda!");
				//CONTINUAR
				break;
				
			case "sair":
				JOptionPane.showMessageDialog(null, "saindo..");
				break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opção incorreta!");
				break;
			}
			
		}while(!opcao.equals("sair"));//while
		
		
		
	}

}
