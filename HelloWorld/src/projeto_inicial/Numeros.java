package projeto_inicial;
import javax.swing.JOptionPane;

public class Numeros {
     
    int []valores;
    
    void leValores(){
    	String recebeValor, valoresRecebidos="";
        String vetSting[];							//para conter o metodo split
        
    	do{
    		recebeValor = JOptionPane.showInputDialog("Digite o valor: \n\nOu X para terminar.");
    		
            //parar de inserir valores
            if(recebeValor.equals("x") || recebeValor.equals("X")) {
            	break;
            }
            else {
            	valoresRecebidos += recebeValor ;
            	valoresRecebidos += " ";
            }
            
            
		}while(!recebeValor.equals("x"));
    	
    	vetSting = valoresRecebidos.split(" ");
    	
    	//instanciando o vetor
    	valores = new int[vetSting.length];
    	
    	//populando o vetor
    	for(int i=0; i<vetSting.length; i++){
    		valores[i] = Integer.parseInt(vetSting[i]);
    	}
    }

//  int []vetor,n;  
//  int[] vetor1, vetor2, vetor3;
//  
//  String s = "10 20 30", vetString[];
//  
//  //split " " quebra nossa string s em outras strings sempre que encontrar um " "
//  //e aloca isto em um array
//  vetString = s.split(" ");
//  
//  //
//  vetor = new int[vetString.length];
//  for (int i = 0; i < vetString.length; i++)
//      vetor[i] = Integer.parseInt(vetString[i]);
//  
//  for (int i = 0; i < vetString.length; i++)
//      System.out.print(vetor[i] + " ");
//  
//  Numeros objNumeros = new Numeros();
//  objNumeros.leValores();
    
    void achaMaior(){
    	int valorMaior = valores[0];
    	
    	for (int i = 0; i < valores.length; i++) {
    		
    		if(valorMaior <= valores[i])
        		valorMaior = valores[i];
    		
    		System.out.print(valores[i] + " ");
		}
    	
    	JOptionPane.showMessageDialog(null, "Valor maior lido: "+valorMaior);
    }
    
    void achaMenor(){
    	int valorMenor= valores[0];
    	
    	for (int i = 0; i < valores.length; i++) {
    		if(valorMenor >= valores[i])
    			valorMenor = valores[i];
    		
    		System.out.print(valores[i] + " ");
		}
    	
    	JOptionPane.showMessageDialog(null, "Valor menor lido: "+valorMenor);
    }
    
    void multiplicaValores(int valor){
    	   	
    	String vetValMultiplicados = "";
    	 	
    	for (int i = 0; i < valores.length; i++) 
			vetValMultiplicados += (valores[i] * valor) + " ";
		
    	System.out.print(vetValMultiplicados + " ");
    	
    	JOptionPane.showMessageDialog(null, "Os valores lidos multiplicados se tornaram:\n "+vetValMultiplicados);
    }
    
    void ordenaValores(){
    	String vetValores = "";
    	int aux;
    	
    	//forma encontrada para n�o alterar a ordem de valore inseridas originalmente
    	int []vetValoresOrdenados = new int[valores.length];
    	for (int cont = 0; cont < vetValoresOrdenados.length; cont++)
			vetValoresOrdenados[cont] = valores[cont];

    	
    	for (int i = 0; i < vetValoresOrdenados.length; i++) {
    		for (int j = 0; j < (vetValoresOrdenados.length-1); j++) {
						
    			if(vetValoresOrdenados[j] > vetValoresOrdenados[j+1]){
    				aux = vetValoresOrdenados[j+1];
    				vetValoresOrdenados[j+1] = vetValoresOrdenados[j];
    				vetValoresOrdenados[j]=aux;
				}
			}//forj
		}//fori
    	
    	for (int k = 0; k < vetValoresOrdenados.length; k++) 
    		vetValores += vetValoresOrdenados[k] + " ";   	
    	
    	JOptionPane.showMessageDialog(null, "Os valores ordenados ficam da seguinte forma:\n "+ vetValores);
    }
    
    void mostraValores(){
    	String vetValores = "";
    	
    	for (int i = 0; i < valores.length; i++)
    		vetValores += valores[i] + " ";
    	
    	JOptionPane.showMessageDialog(null, "Os valores lidos foram:\n "+vetValores);
	    	
    }
    
    
//    public static void main(String[] args) {
//        String s;
//        
//        int []vetor,n;  //desta forma só vetor é um array
//        
//        int[] vetor1, vetor2, vetor3;   //desta forma vetor1, vetor2, vetor3 pois o vetor indicicação de vetor está associado ao tipó da variável
//        
//        vetor3 = new int[30];
//        
//        s = JOptionPane.showInputDialog("Digite o tamanho do vetor:");
//        vetor = new int[Integer.parseInt(s)];
//        
//        for (int i = 0; i < vetor.length; i++) 
//            vetor[i] = i;
//        
//        for (int i = 0; i < Integer.parseInt(s); i++)
//            System.out.print(vetor[i] + " ");

        
//       
//        int []vetor,n;  
//        int[] vetor1, vetor2, vetor3;
//        
//        String s = "10 20 30", vetString[];
//        
//        //split " " quebra nossa string s em outras strings sempre que encontrar um " "
//        //e aloca isto em um array
//        vetString = s.split(" ");
//        
//        //
//        vetor = new int[vetString.length];
//        for (int i = 0; i < vetString.length; i++)
//            vetor[i] = Integer.parseInt(vetString[i]);
//        
//        for (int i = 0; i < vetString.length; i++)
//            System.out.print(vetor[i] + " ");
//        
//        Numeros objNumeros = new Numeros();
//        objNumeros.leValores();
//    }   
    
}