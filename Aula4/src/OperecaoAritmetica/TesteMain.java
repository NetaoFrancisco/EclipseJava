package OperecaoAritmetica;

public class TesteMain  {

	public static void main(String[] args) {
		
		
		//Usado o programa�ao Funcional, forma de programa��o, metodo Lamb. 
		// na onde minha interfaceFunional, onde minha classe Intaface so poder ter metodo caracterista de intaface funcional
		OperacaoAritmetica operacao = (x,y) -> x+y;  
				
		double recebe = 0;
		recebe = operacao.execute(4.4, 4.4);
		System.out.println(recebe);
		
		 
		operacao = (x,y) -> x-y;  
		int recebe1 = (int) operacao.execute(15.8,4.8);
		System.out.println(recebe1);
		
		/*
		 //Este e a maneira antiga de fazer a implemnte��o das classe Calculadoras chamado minha intaface 
		 // e estanciado classe por classe.
		 
		operacao = new Soma();
		recebe = operacao.execute(3.8, 3.7);
		System.out.println(recebe);
		
		operacao = new Subtracao();
		recebe = operacao.execute(2, 2);
		System.out.println(recebe);
		
		operacao = new Multiplicao();
		recebe = operacao.execute(4, 1);
		System.out.println(recebe);
		/*
		 *
		 */
		
	}

}
