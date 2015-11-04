package calculos;
import javax.swing.JOptionPane;


public class MaiorMenor {
	String valDiditado, valConcatenados="";
	int valor, maior = 0, menor=0;
	
	//Ler valores digitados pelo usuário e, ao final da leitura, apresentar o maior e o menor valor lido
        
        
	public void verificarValor(){
		int contador=0;
		do{

			valDiditado = JOptionPane.showInputDialog("Digite o valor: \n\nOu S para terminar.");
			if(valDiditado.equals("s"))
				break;
			
			valor = Integer.parseInt(valDiditado);
			
			
			if(contador == 0){
				maior = valor;
				menor = valor;
			}
			
			if(valor > maior){
				maior = valor;
			}
			
			if(valor < menor){
		       menor = valor;
			}

			valConcatenados = valConcatenados + valDiditado + " ";
			
			contador++;
			
		}while(!valDiditado.equals("s"));
		
		JOptionPane.showMessageDialog(null, "Maior valor:" + maior+"\n"
				+ "Menor valor:" + menor+"\n"
						+ "\nValores digitados foram:" + valConcatenados);
	}
}