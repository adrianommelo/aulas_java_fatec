package calculos;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class MediaFatec {

	double provaUm, provaDois, trabUm, trabDois, provaF;
	double media, mediaF;
	
	public void calcularMedia(){
		provaUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da P1: "));
		trabUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da T1: "));
		provaDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da P2: "));
		trabDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da T2: "));
		
		//para formatar a saida numérica
		DecimalFormat dFormat = new DecimalFormat("00.00");
		
				
		provaUm = provaUm * 0.7;
		provaDois = provaDois * 0.7;
		trabUm = trabUm * 0.3;
		trabDois = trabDois * 0.3;
		
		media = (provaUm + trabUm + provaDois + trabDois)/2;
		//System.out.println(media);
		
		if(media >= 6.0){
			JOptionPane.showMessageDialog(null, "Média = "+ dFormat.format(media) +"\n\nAprovado!");
		}else if(media <6.0 && media >2.0){
			provaF = Double.parseDouble(JOptionPane.showInputDialog("Media foi " + dFormat.format(media)+"\n\n Precisa de prova final!"
					+ "\nDigite o valor da Prova Final: "));
			mediaF = (media + provaF)/2;
			System.out.println(dFormat.format(mediaF));
			if(mediaF >= 6.0){
				JOptionPane.showMessageDialog(null, "Média Final = "+ dFormat.format(mediaF) +"\n\nAprovado!");
			}else
				JOptionPane.showMessageDialog(null, "Reprovado!");
		}else
			JOptionPane.showMessageDialog(null, "Média = "+dFormat.format(media)+"\n\nReprovado!");		
	}

	
//	public static void main(String[] args) {
//		double provaUm, provaDois, trabUm, trabDois, provaF;
//		double media, mediaF;
//		
//		provaUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da P1: "));
//		trabUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da T1: "));
//		provaDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da P2: "));
//		trabDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da T2: "));
//		
//		provaUm = provaUm * 0.7;
//		provaDois = provaDois * 0.7;
//		trabUm = trabUm * 0.3;
//		trabDois = trabDois * 0.3;
//		
//		media = (provaUm + trabUm + provaDois + trabDois)/2;
//		//System.out.println(media);
//		
//		if(media >= 6.0){
//			JOptionPane.showMessageDialog(null, "Média = "+media+".\n\nAprovado!");
//		}else if(media <6.0 && media >2.0){
//			provaF = Double.parseDouble(JOptionPane.showInputDialog("Media foi " + media+". Precisa de prova final!"
//					+ "\nDigite o valor da Prova Final: "));
//			mediaF = (media + provaF)/2;
//			System.out.println(mediaF);
//			if(mediaF >= 6.0){
//				JOptionPane.showMessageDialog(null, "Média Final = "+mediaF+".\n\nAprovado!");
//			}else
//				JOptionPane.showMessageDialog(null, "Reprovado!");
//		}else
//			JOptionPane.showMessageDialog(null, "Média = "+media+".\n\nReprovado!");
//	}

}
