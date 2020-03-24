package principal;

public class TesteClienteTO  {

	public static void main(String[] args) {
		ClienteTO objCli = new ClienteTO(1,"Impacta");
		EnderecoTO objEnd = objCli.getEndereco();
		
		//Pode acessar desta maneira tendo que estancia a classe CleinteTO com objEnd
		objEnd.setLogradouro("Rua Maria Silvina");
		objEnd.setCidade("São Pualo");
		
		//ou pode acessar diretamente.
		 objCli.enderecoCliente.setEstado("São Paulo");
	
		 
		 //objCli.imprimir(); 
		 //System.out.println("------------------------------------");
		 //objCli.enderecoCliente.imprimir();
		 //System.out.println("------------------------------------");
		
		 
		 
		 //----------Estaciado o CLIENTEPFTO.
		 ClientePFTO objPFTO = new ClientePFTO();
		 objPFTO.setCodigo(2);
		 objPFTO.setNome("Cirilo");
		 objPFTO.enderecoCliente.setEstado("São Paulo");
		 System.out.println("Imprimir Pesso Fisica");
		 objPFTO.imprimir();
		 
		 System.out.println("Imprimir Pessoa Juridica");
		 ClientePFTO objPf = new ClientePFTO("123","Cirilo",12999,"Rua Maria","Morro do Indio","058","São Paulo","São Paulo","9","Brasil");
		 objPf.imprimir();
		 
	
		ProtudoTO pro = new ProtudoTO(123,"","");
		 pro.imprimir();
		 
		 
		 
		 
			 
			 
		 
	}
}