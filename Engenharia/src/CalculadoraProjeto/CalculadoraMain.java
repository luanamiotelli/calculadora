package CalculadoraProjeto;

import javax.swing.JOptionPane;

public class CalculadoraMain {

	public static void main(String[] args) {

		Calcula c = new Calcula();
		
		
		int op = 5;
		int num1 = 0;
		int num2 = 0;
		int op2 = 0;

	      op=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o: \n\n"
					+ "1 - Soma\n"
					+ "2 - Subtrai\n"
					+ "3 - Multiplica��o\n"
					+ "4 - Divis�o\n"
					+ "5 - Encerrar"));
	      
	      while (op != 0) {
    	if (op == 1) {
    		
    		op2=Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro n�mero? \n\n"));
    		num1 = op2;
    		op2=Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo n�mero? \n\n"));
    		num2 = op2;
    		
    			int opera = c.soma(num1, num2);
    			JOptionPane.showMessageDialog(null, opera);
    		break;
    	}
    	 	if (op == 2) {
    	 		op2=Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro n�mero? \n\n"));
        		num1 = op2;
        		op2=Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo n�mero? \n\n"));
        		num2 = op2;
        		
  	    			int opera = c.subtrai(num1, num2);
  	    			JOptionPane.showMessageDialog(null, opera);
	    		break;
	    		}
			if (op == 3) {
	    	 		op2=Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro n�mero? \n\n"));
	        		num1 = op2;
	        		op2=Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo n�mero? \n\n"));
	        		num2 = op2;
	  	    			int opera = c.multiplica(num1, num2);
	  	    			JOptionPane.showMessageDialog(null, opera);
		    		break;
	    	 	}
			if (op == 4) {
		    	 		op2=Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro n�mero? \n\n"));
		        		num1 = op2;
		        		op2=Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo n�mero? \n\n"));
		        		num2 = op2;
		  	    			int opera = c.divide(num1, num2);
		  	    			JOptionPane.showMessageDialog(null, opera);
			    		break;
			    		}
		    	 	else{
				    		System.out.println("ERRO");
				    		break;
				    		}
    }
}
}
