import javax.swing.JOptionPane;

public class Palindromo {
	
    boolean ehPalindromo(String s){
        int qtde = s.length() / 2;
        
        for (int i = 0; i < qtde; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1 - i)){
            	JOptionPane.showMessageDialog(null, s + " nao � um pal�ndromo! que pena! :(");
               return false;
            }
//            System.out.println("char na posicação "+i+": "+ s.charAt(i));
//            System.out.println("char na posicação "+(s.length()-1 - i)+": "+ (s.charAt(s.length()-1 - i)));
        }
        JOptionPane.showMessageDialog(null, s + " � um pald�nromo! Parab�ns!");
        return true;
    }
//    public static void main(String[] args) {
//            Palindromo objPalindromo = new Palindromo();
//            objPalindromo.ehPalindromo("eu amo oma ue");
//            
//        }
}