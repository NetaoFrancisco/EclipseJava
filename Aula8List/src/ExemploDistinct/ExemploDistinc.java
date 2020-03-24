package ExemploDistinct;


import java.util.ArrayList;
import java.util.List;

public class ExemploDistinc {

    public static void main(String[] args) {

        List<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario(3018, "Joaquim Batista", "Desenvolvedor", 5550.0));
        lista.add(new Funcionario(1045, "Maria das Dores", "Analista", 6250.0));
        lista.add(new Funcionario(1780, "Jo�o Ricardo",    "Desenvolvedor", 7100.0));
        lista.add(new Funcionario(5200, "Ana Maria",       "Vendedor", 4100.0));
        lista.add(new Funcionario(3999, "Robson Gusm�o",   "Desenvolvedor", 6500.0));
        lista.add(new Funcionario(2389, "Eduardo Alves",   "Vendedor", 3200.0));

        lista.stream()
             .map(Funcionario::getCargo)
             .distinct()//Monstra quantos cargo est�o na lista, sem os respetir
             .forEach(System.out::println);
    }
}
