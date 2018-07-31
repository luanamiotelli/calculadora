package CalculadoraProjeto;

import javax.swing.JOptionPane;

public class CalculadoraMain {

	public static void main(String[] args) {

		Calcula c = new Calcula();
		
		
		int op = 5;
		int num1 = 0;
		int num2 = 0;
		int op2 = 0;

	      op=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n\n"
					+ "1 - Soma\n"
					+ "2 - Subtrai\n"
					+ "3 - Multiplicação\n"
					+ "4 - Divisão\n"
					+ "5 - Encerrar"));
	      
	}
}
