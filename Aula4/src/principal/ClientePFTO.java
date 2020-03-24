package principal;

public class ClientePFTO extends ClienteTO implements Impressao {

	private String CPF;

	public ClientePFTO() {
		super();
	}

	public ClientePFTO(String CPF) {
		super();
		CPF = CPF;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientePFTO other = (ClientePFTO) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		return true;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println(this.CPF);
		
	}



	public ClientePFTO(String cpf,String nome, int codigo,String logadouro,String bairro,String CEP,String cidade,String estado,
			String numero,String pais) {
		
			setCPF(cpf);
			setNome(nome);
			setCodigo(codigo);
			super.enderecoCliente.setLogradouro(logadouro);
			super.enderecoCliente.setBairro(bairro);
			super.enderecoCliente.setCep(CEP);
			super.enderecoCliente.setCidade(cidade);
			super.enderecoCliente.setEstado(estado);
			super.enderecoCliente.setNumero(numero);
			super.enderecoCliente.setPais(pais);
	}
	
	
	
	
}
