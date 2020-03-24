package InteretorTreeSet;

import java.util.TreeSet;

public class ExemploTreeSetForEach {
		
		public static void main(String args[]) {
			

			 TreeSet<String> cursos = new TreeSet<>();// Lista TreeeSET, ja criar a lista ordenada. 
		        
		        cursos.add("PHP");
		        cursos.add("Linux");
		        cursos.add("Asp");
		        cursos.add("Java");
		        cursos.add("Delphi");
		        
		        System.out.println("Curso em ordem Alfabatica: \n");
		        
		        cursos.forEach(c -> System.out.println("Curso: " + c));//Estanciado o metodo, com Lamb
		        //Neste exemplo a c e a variavel que esta correndo dentro da minha lista. 
		        
		       
		        
		        
		        //***LEMBRENTE***
		        
		        //Nas versão mais antiga do JAVA, era necessario fazer este caminha para navegaçã da Lista. 
			   //Após a versão 8 do Java não mas necessario fazer o Interator podemos fazer uma ForEach para precorret a lista.  
		        
			
		}

}
