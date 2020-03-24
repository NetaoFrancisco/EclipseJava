package TesteThwors;

public class NotaTO {
	

		private String aluno;
		private int nota;


		public NotaTO(String aluno, int nota)  throws NotaInvalidaExceptio{
		super();
		this.setAluno(aluno);
		this.setNota(nota);
		}


		public String getAluno() {
		return aluno;
		}
		public void setAluno(String aluno) {
		this.aluno = aluno;
		}
		public int getNota() {
		return nota;
		}
		
		public void setNota(int nota) throws NotaInvalidaExceptio {
		if(nota < 0 || nota>10) {
		NotaInvalidaExceptio e = new NotaInvalidaExceptio();
		throw e;
		}
		else {
		this.nota = nota;
		}
		}
		public void mostra() {
		System.out.println(getAluno()  +"  "+  getNota());
			}
		}
	
