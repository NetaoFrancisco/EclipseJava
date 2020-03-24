package ExemploArray;

public class TesteArrayInt {

	public static void main(String[] args) {
		
		int numero[] = new int[5];
		int valor[] = {10,20,30,40,50}; 
		
		numero[0] = 10;
		numero[1] = 20;
		numero[2] = 30;
		numero[3] = 40;
		numero[4] = 50;
		
		for( int x : numero) {// crio uma variavel, e depois chamo o VETOR sem conchetesd
							// so consegue apresenta um Array de uma vez
			System.out.println(x);
			
		}
		
			

	}

}
