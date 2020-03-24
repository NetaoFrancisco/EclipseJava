package ExLangFuncional;



public class TesteMainLANG {
			public static void main(String args[]) {
							//Criando as variavei	
			ExemploFuncional eFunc = (i,n,s) -> System.out.println("Parabens: " + n.toUpperCase() + " Pelos seu "+ i + 
					" Ano de vida. Seu novo Salario é:  "+s);
			
			eFunc.exibirDados(19, "Manuel", 4666);
			
				
				
			}
}
 