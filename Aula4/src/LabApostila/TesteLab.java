package LabApostila;

import javax.swing.JOptionPane;

public class TesteLab {
	
	OperacaoAritmetica op = (x,y) -> (x * (y / 100));
	
		public void chama(){
			double resu = 0;
			double num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero"));
			double num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero"));
			resu = op.execute(num1,num2);
			System.out.printf("Resultado %.1f \n",(num1 + resu));
			
			op = (x,y) -> x-y;
			resu = op.execute(10, 1); 
			System.out.println(resu);
			
			}
		
		
	
}
	
