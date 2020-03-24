package RelacionadoMetodCLamb;

public class Executando {

	public static void main(String[] args) {

			
			// Neste Exemplo com metodo Estatico.
		
		OperacaoAritmetica funcao = FinacialUtils::calculaJuros;
		
			//"Instaciado" a classe OperacaoAritmetica / dando o apelido de Funcao. 
			//Chamado a classe FinacialUtils e o metodo estatico clacularJuros
		
			// SO foi preciso instacia o metodo desça forma, pq o mesmo é estatico, então não a nececidade de instancia 
			// a classe FinacialUtil. 
		System.out.println("Valor Final: "+funcao.execute(1000.0, 10.0));
		
	
			//Neste Exemplo, sem metodos Estatico. 
			Produto produto = new Produto("Tennis",39);
			
			funcao = produto::aumentarPreco;
			System.out.println("Valor Final "+funcao.execute(1000, 10.0));
			
		}	
	}
		