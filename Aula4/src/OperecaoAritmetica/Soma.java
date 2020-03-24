package OperecaoAritmetica;

public class Soma implements OperacaoAritmetica {



	@Override
	public double execute(double value1, double value2) {
		double resul = value1 + value2;
		return resul;
	}

}
