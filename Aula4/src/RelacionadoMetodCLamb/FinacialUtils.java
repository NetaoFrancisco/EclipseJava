package RelacionadoMetodCLamb;

public class FinacialUtils {

		public static double calculaJuros(double valorInicial,double taxaJuros) {
			double razao = taxaJuros / 100; 
			double juros = valorInicial * razao; 
			return valorInicial + juros;
		}
	
	
	
	
}
