package OperecaoAritmetica;

public class Subtracao implements OperacaoAritmetica{

	@Override
	public double execute(double value1, double value2) {
		double resu = value1 - value2;
		return resu;
	}

}
