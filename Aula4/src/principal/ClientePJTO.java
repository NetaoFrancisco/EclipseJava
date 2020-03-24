package principal;

public class ClientePJTO extends ClienteTO implements Impressao {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ClientePJTO(String cnpj) {
		super();
		this.cnpj = cnpj;
	} 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		ClientePJTO other = (ClientePJTO) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}

	public ClientePJTO(String cnpj,String nome, int codigo,String logadouro,String bairro,String CEP,String cidade,String estado,
			String numero,String pais) {
		
		setCnpj(cnpj);
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
	@Override
	public void imprimir() {
		
		super.imprimir();
		System.out.println(getCnpj());
	}

}
