package ExemploRemoveIf;

import java.util.HashSet;
import java.util.Set;

public class RemoveIf {

    public static void main(String[] args) {
        
       Produto pro = new Produto();
    	
    	Set<Produto> cursos = new HashSet<>();
        
        cursos.add(new Produto("Leite em pó", "Laticínios", 5.80));
        cursos.add(new Produto("Cerveja em lata", "Bebidas", 1.89));
        cursos.add(new Produto("Detergente", "Limpeza", 2.49));
        cursos.add(new Produto("Manteiga", "Laticínios", 2.90));
        cursos.add(new Produto("Pasta de dente", "Limpeza", 1.75));

        cursos.removeIf(p -> p.getPreco() > 2.5);//removeIF esta removendo todos os precos acima de 2.5
        
        //quando trabalhamos com lista, conseguemos aciona não so um elemento, mais varios elementos 
        // dentro de uma pocisão da Lista. 
        System.out.println("Lista de produtos: \n");
        cursos.forEach(p -> System.out.println("Produto: " + p));
        
     
    }
}