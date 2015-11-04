import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.xml.bind.ParseConversionEvent;


public class HelloWorld {

	public static void main(String[] args) {
		
		byte inteiroAindaMenor = 1;		//8 bits
		short inteiroPequeno = 2;		//16 bits
		int inteiro = 10;				//32 bits
		long inteiroLongo = 100000;			//64 bits
		
		//numeros reais
		float real = (float)10.1;	//32 bits
		double realMaior = 10.1;	//64 bits
		
		//caracteres
		char caracacter = 'a';		//16 bits
		String string = "string";	//tamanho do caracter * 16
		
		boolean booleana = true;	//ou false
		//void naoSei;				
		
		/*
		System.out.println(inteiroAindaMenor);
		System.out.println(inteiroPequeno);
		System.out.println(inteiro);
		System.out.println(real);
		System.out.println(realMaior);
		System.out.println(caracacter);
		System.out.println(string);
		System.out.println(booleana);

		System.out.printf("\ninteiro: %d \nreal: %f \ncaracter: %c \nstring: %s", inteiro, real, caracacter, string);
		
		//+ - * / %
		System.out.printf("\n\nResto da divisão de 10 por 2: %d", 10%2);
		*/
		
		//System.out.print(real);
		//System.out.print(realMaior);
//		string = real + "\n"+ realMaior;
//		System.out.println(string);
		
		//System.out.println(real  + string + realMaior);
		
		//JOptionPane.showMessageDialog(null, real + realMaior + string);
		
//		string = JOptionPane.showInputDialog("Digite um valor real: ");
//		JOptionPane.showMessageDialog(null, string);
//		
//		real = Float.parseFloat(string) + 1;
//		JOptionPane.showMessageDialog(null, real);
//		
//		
//		string = JOptionPane.showInputDialog("Digite um valor real: ");
//		JOptionPane.showMessageDialog(null, string);
//		
//		inteiro = Integer.parseInt(string);
//		inteiro++;
//		JOptionPane.showMessageDialog(null, inteiro);
		
		/*
		string = JOptionPane.showInputDialog("Digite um valor real: ");
		real = Float.parseFloat(string);
		JOptionPane.showMessageDialog(null, real);
		real++;
		JOptionPane.showMessageDialog(null, real);
		real--;
		JOptionPane.showMessageDialog(null, real);
		real = real * 2;
		JOptionPane.showMessageDialog(null, real);
		real = real / 2;
		JOptionPane.showMessageDialog(null, real);
		real = real%2;
		JOptionPane.showMessageDialog(null, real);
		*/
		
		//ESTRUTURAS BÁSICAS
		
		//operadores relacionais
		// == != >= <= > <
		
		//operadores lógicos
		//|| && !
		inteiro = 100;
		inteiroLongo = 20;
		booleana = inteiro < inteiroLongo;
		if(!booleana){
			JOptionPane.showMessageDialog(null, "Verdade!");
		}else if(inteiro  == 100){
			JOptionPane.showMessageDialog(null, "Não importa!");
		}
		else
			JOptionPane.showMessageDialog(null, "Falso!");
		
		
		//PRATICAR!
		//1.
		//FATOR DESCONTO	PREÇO
		//1		5%
		//2		7%
		//3		10%
		//4		11%
		//5		20%
		
		
		
		//2.
		//MÉDIA FATEC
		//BIMESTRE 1
		//P1 (70%)
		//T1 (70%)
		//BIMESTRE 2
		//P2 (70%)
		//T2 (70%)
		
		//MEDIA = (P1 + T1 + P2 + T2)/2
		
		//SE MEDIA >= 6,0 APROVADO SE MEDIA < 6.0 PROVA FINAL
		
		//PROVA FINAL
		//MF = (MEDIA + PF)/2 
		//SE MF >= 6.0 APROVADO SE MEDIA < 6.0 REPROVADO
	}

}
