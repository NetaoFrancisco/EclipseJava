package ExemploArray;

public class ExemploArrayAnonimoDianamico {

			public static void receberMatriz(int[] arr) {
				
				for(int x : arr) {
					
					System.out.println("Numeros: "+x);
				}
			}
			
	public static void main(String[] args) {
		
		receberMatriz( new int[] {10,20,30,40,50});
		
		
		
	}




}

