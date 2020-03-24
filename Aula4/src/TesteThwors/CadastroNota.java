package TesteThwors;



public class CadastroNota {

	
	public static void main(String args[]) {

		try {
		NotaTO nota = new NotaTO("Cirilo",11);
		nota.mostra();

		}catch (NotaInvalidaExceptio e) {
		System.out.println("Nota Invalida = "+e.getMessage());
		System.out.println("Causa = " + e.getCause());
		e.printStackTrace(); 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              				}	
			
	
		try {
			
		String texto = "1023";
		int idade = Integer.parseInt(texto);
		
		System.out.println("Parabens pelos seus" + idade + "anos de idade");
		
		}catch(NumberFormatException e) {
			System.out.println("Numero Invalido");
			e.printStackTrace();
		}
		} 
}
