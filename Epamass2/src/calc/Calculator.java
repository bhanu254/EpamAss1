package calc;
public class Calculator {
	public static double operand1;
	public static double operand2;
	public static char operator;
	public static void calculate() 
	{ 
	double result = Double.NaN; 
	switch(operator) { 
	case '+': 
	result = operand1 + operand2; 
	break; 
	case '-': 
	result = operand1 - operand2; 
	break; case '*': 
	result = operand1 * operand2; 
	break; 
	case '/': 
	result = operand1 / operand2; 
	break; 
	default: System.out.printf("Unrecognised operator %c\n", operator); 
	} 
	System.out.printf("%f %c %f = %f\n",   operand1, operator, operand2, result); 
	}
	public static void main(String[] args) {
	String line=System.console().readLine();
	String[] parts=line.split(" ");
	Calculator.operand1=Double.parseDouble(parts[0]);
	Calculator.operator = parts[1].charAt(0); 
	Calculator.operand2 = Double.parseDouble(parts[2]); 
	Calculator.calculate(); 
	} 
	}