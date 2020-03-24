/**
 * 
 */
package principal;

/**
 * @author 21sa0916
 *
 */
public class ClienteTO {
	protected int codigo;
	protected String nome;
	protected static int contador=0;
	protected EnderecoTO enderecoCliente; // new EnderecoTO = estou a agragando(AGREGAÇÂO) é não preciso da NEW dentro do construtor ;
	 
	
	
	public ClienteTO() {
		super();
		this.enderecoCliente = new EnderecoTO();//estanciado o Endereco dentro do construtor estou criado uma (COMPOCISÂO);
	}
	
	public ClienteTO(int codigo, String nome) {
		super();
		this.enderecoCliente = new EnderecoTO();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public ClienteTO(int codigo, String nome, String logradouro, String numero, String complemento, String bairro, String cep, String cidade,
			String estado, String pais) {
		super();
		
		this.codigo = codigo;
		this.nome = nome;
		this.enderecoCliente = new EnderecoTO(logradouro,numero,complemento,bairro,cep,cidade,estado,pais);
		

	}
	
	public ClienteTO(int codigo, String nome, EnderecoTO clienteEndereco) {
		super();
		this.enderecoCliente= new EnderecoTO();
		this.codigo = codigo;
		this.nome = nome;
		this.enderecoCliente = clienteEndereco;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public EnderecoTO getEndereco() {
		return this.enderecoCliente;
	}
	public void setEndereco(EnderecoTO enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteTO other = (ClienteTO) obj;
		if (codigo != other.codigo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public void imprimir() {
		System.out.println(this.getCodigo()+"\n"+this.getNome());
		this.enderecoCliente.imprimir();
		
	}

	
}
