
public class Aula3 {

	public static void main(String[] args) {
		int[][] mat;
		
		mat = new int[10][5];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=10;
			}
		}
		
		System.out.println(mat[1].length);//pula linha
		System.out.println();//pula linha
		
		for(int[] obj: mat){
			for(int valor: obj)
				System.out.print(valor+" ");
			System.out.println();//pula linha
		}
		
		System.out.println("\n\n"+ Math.sqrt(144.0));
	}

}
