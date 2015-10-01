
public class Aula03 {
	
//	static void imprimiNumeros(){
//		int i = 0;
//		do {
//			//para não imprimir o 5
//			if(i == 5){
//				i++;
//				continue;
//			}
//			System.out.println(i + " ");
//			i++;
//		} while (i<10);
//	}
	
	String mensagem = "Hello World";
	
	void exibir(){
		System.out.println(mensagem);
	}
	
	public static void main(String[] args){
		Aula03 objetoAula3 = new Aula03();
		
		objetoAula3.exibir();
	}
}
