import javax.swing.JOptionPane;

public class Palindromo {
	
    boolean ehPalindromo(String s){
        int qtde = s.length() / 2;
        
        for (int i = 0; i < qtde; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1 - i)){
            	JOptionPane.showMessageDialog(null, s + " nao é um palíndromo! que pena! :(");
               return false;
            }
//            System.out.println("char na posicaÃ§Ã£o "+i+": "+ s.charAt(i));
//            System.out.println("char na posicaÃ§Ã£o "+(s.length()-1 - i)+": "+ (s.charAt(s.length()-1 - i)));
        }
        JOptionPane.showMessageDialog(null, s + " é um paldínromo! Parabéns!");
        return true;
    }
//    public static void main(String[] args) {
//            Palindromo objPalindromo = new Palindromo();
//            objPalindromo.ehPalindromo("eu amo oma ue");
//            
//        }
}