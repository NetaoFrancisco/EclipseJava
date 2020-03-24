package principal;

public class EnderecoTO {

	
		private String logradouro;
		private String numero; 
		private String complemento;
		private String bairro; 
		private String cep;
		private String cidade; 
		private String estado;
		
		
	
		
		public EnderecoTO(String logradouro, String numero, String complemento, String bairro, String cep, String cidade,
				String estado, String pais) {
			super();
			this.logradouro = logradouro;
			this.numero = numero;
			this.complemento = complemento;
			this.bairro = bairro;
			this.cep = cep;
			this.cidade = cidade;
			this.estado = estado;
			this.pais = pais;
		}


		private String pais; 
		
		
		public EnderecoTO() {
			super();
			
			
		}


		public String getLogradouro() {
			return logradouro;
		}


		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}


		public String getNumero() {
			return numero;
		}


		public void setNumero(String numero) {
			this.numero = numero;
		}


		public String getComplemento() {
			return complemento;
		}


		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}


		public String getBairro() {
			return bairro;
		}


		public void setBairro(String bairro) {
			this.bairro = bairro;
		}


		public String getCep() {
			return cep;
		}


		public void setCep(String cep) {
			this.cep = cep;
		}


		public String getCidade() {
			return cidade;
		}


		public void setCidade(String cidade) {
			this.cidade = cidade;
		}


		public String getEstado() {
			return estado;
		}


		public void setEstado(String estado) {
			this.estado = estado;
		}


		public String getPais() {
			return pais;
		}


		public void setPais(String pais) {
			this.pais = pais;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
			result = prime * result + ((cep == null) ? 0 : cep.hashCode());
			result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
			result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
			result = prime * result + ((estado == null) ? 0 : estado.hashCode());
			result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
			result = prime * result + ((numero == null) ? 0 : numero.hashCode());
			result = prime * result + ((pais == null) ? 0 : pais.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EnderecoTO other = (EnderecoTO) obj;
			if (bairro == null) {
				if (other.bairro != null)
					return false;
			} else if (!bairro.equals(other.bairro))
				return false;
			if (cep == null) {
				if (other.cep != null)
					return false;
			} else if (!cep.equals(other.cep))
				return false;
			if (cidade == null) {
				if (other.cidade != null)
					return false;
			} else if (!cidade.equals(other.cidade))
				return false;
			if (complemento == null) {
				if (other.complemento != null)
					return false;
			} else if (!complemento.equals(other.complemento))
				return false;
			if (estado == null) {
				if (other.estado != null)
					return false;
			} else if (!estado.equals(other.estado))
				return false;
			if (logradouro == null) {
				if (other.logradouro != null)
					return false;
			} else if (!logradouro.equals(other.logradouro))
				return false;
			if (numero == null) {
				if (other.numero != null)
					return false;
			} else if (!numero.equals(other.numero))
				return false;
			if (pais == null) {
				if (other.pais != null)
					return false;
			} else if (!pais.equals(other.pais))
				return false;
			return true;
		} 
		
		public void imprimir() {
			System.out.println(this.logradouro);
			System.out.println(this.bairro);
			System.out.println(this.cep);
			System.out.println(this.cidade);
			System.out.println(this.estado);
			System.out.println(this.numero);
			System.out.println(this.pais);
			
			
		}
	
		
		
		
		
	
	
	
	
	
}
