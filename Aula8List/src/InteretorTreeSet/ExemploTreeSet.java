package InteretorTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		
		
		 TreeSet<String> cursos = new TreeSet<>();
	        
	        cursos.add("PHP");
	        cursos.add("Linux");
	        cursos.add("Asp");
	        cursos.add("Java");
	        cursos.add("Delphi");
	        
	     System.out.println(cursos.first());//Monstra o primeiro elementeo da lista. 
	     System.out.println(cursos.last()); // mostra o ultimo valor. 
	        
	        Iterator<String> iterator = cursos.iterator();
	        System.out.println("Curso en ordem alfabetica: \n");
	        
	        //Nas vers�o mais antiga do JAVA, era necessario fazer este caminha para navega�� da Lista. 
	       //Ap�s a vers�o 8 do Java n�o mas necessario fazer o Interator podemos fazer uma ForEach para precorret a lista.  
	       
	        while(iterator.hasNext()) {
	        	String curso = iterator.next();
	        	System.out.println("Curso "+ curso);
	        	
	        }
	        

	}

}
