package ExemploArray;

import principal.ClienteTO;

public class TesteArrayCliente {

	public static void main(String[] args) {
		
		ClienteTO objCli[] = new ClienteTO[3];
		
		objCli[0] = new ClienteTO(1,"Francisco");
		objCli[1] = new ClienteTO(2,"Cirilo");
		objCli[2] = new ClienteTO(3,"Teste");
		objCli[2] = new ClienteTO(1,"Cirilo","Maria Silvina","09","","trav 04","Morro do Indio","111111","Pais","Sao Paulo");
		
		
		for(ClienteTO x : objCli) {
			System.out.println(x.getNome());
			System.out.println(x.getCodigo());
			
			// ou chamado ou metodo. 
			
			x.imprimir();
		}
		
		

	}
}