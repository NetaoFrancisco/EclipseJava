package OperecaoAritmetica;

public class Multiplicao implements OperacaoAritmetica{

	@Override
	public double execute(double value1, double value2) {
		double retu = value1 * value2;
		return retu;
	}

}
