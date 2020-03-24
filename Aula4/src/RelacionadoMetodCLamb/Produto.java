package RelacionadoMetodCLamb;

public class Produto {
	
		public String descricao; 
		public int tamanho;
		
		
		public Produto() {
			super();
		}


		public Produto(String descricao, int tamanho) {
			super();
			setDescricao(descricao);
			setTamanho(tamanho);
		}


		public String getDescricao() {
			return descricao;
		}


		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}


		public int getTamanho() {
			return tamanho;
		}


		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		} 
		
		public double aumentarPreco(double precoAtual, double taxaAumento) {
			double aumento = precoAtual * taxaAumento / 100;
			double precoAumentado  = precoAtual  + aumento;
			return precoAumentado;
			
		}
		
		

}
