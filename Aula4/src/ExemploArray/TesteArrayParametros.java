package ExemploArray;

public class TesteArrayParametros {
	
	public static void main(String args[]) {
		
		int valoresA[] = new int[3];
		int valoresB[] = new int[3];
		
		for(int cont =0; cont<3; cont++) {
			 int valor = 10;
			 valoresA[cont] = 10;	 
			 valor = valor + 10;
		}
		
		valoresB = dobraValores(valoresA);
		
			for(int i = 0; i < valoresB.length; i++) {
				
				System.out.println("ValoresB [ "+ i + "] = " +valoresB[i]);
			}
	}
		
	
	
	static int[] dobraValores(int x[]) {
		
		for(int i = 0; i< x.length; i++) {
			
			x[i] *=2;
		
		
		}
		return x;
	}
}

