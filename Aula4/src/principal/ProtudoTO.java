package principal;

public class ProtudoTO {
	
	private int codigo;
	private String nome;
	private String EAN;
	
	
	public ProtudoTO() {
		super();
	}


	public ProtudoTO(int codigo, String nome, String eAN) {
		super();
		setCodigo(codigo);
		setNome(nome);
		setEAN(eAN);
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEAN() {
		return EAN;
	}


	public void setEAN(String eAN) {
		EAN = eAN;
	} 
	
	public void imprimir() {
	Impressao impri = ( ) -> System.out.println("codigo " + getCodigo());
	impri.imprimir();
		
	}
	
	
	

}
