package jogos;

import java.util.Random;

import javax.swing.JOptionPane;

public class JogoMoeda {
	String cara, coroa;
	int qtdLanca;
//	smilebranco = "\u263a";
//	smilenegro = "\u263b";
	
	public JogoMoeda(int qtdLancamento) {
		this.qtdLanca = qtdLancamento;
	}
	
	String faceMoeda(){
		String imprimi;
		
		if(Math.random() % 2 > 0.5){
			imprimi = "\nCara - \u263a";
			return imprimi;
		}else {
			imprimi = "\nCoroa - \u263b";
			return imprimi;
		}
	}
	
	public void lancamento(){
		for (int i = 0; i < qtdLanca; i++) {
			JOptionPane.showMessageDialog(null,"Lançamento "+(i+1)+"\n"+faceMoeda());
		}
		
	}
	
	
}
