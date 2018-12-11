package Lab7.Exercise2;


public class MyCalculator {

	public static void main(String[] args) {
		int x = 360;
		int y = 60;
		System.out.println(x + "+" + y + "=" + getCalculator('+').CalculatorInt(x, y));
		
		System.out.println(x + "-" + y + "=" + getCalculator('-').CalculatorInt(x, y));

		System.out.println(x + "*" + y + "=" + getCalculator('*').CalculatorInt(x, y));
		
		System.out.println(x + "/" + y + "=" + getCalculator('/').CalculatorInt(x, y));
	}
	
	static Calculator getCalculator(char operator) {
		if (operator=='+') {
			return (int x,int y)->x+y;
		}else if(operator=='-') {
			return (int x,int y)->x-y;
		}else if(operator=='*') {
			return (int x,int y)->x*y;
		}else  {
			return (int x,int y)->x/y;
		}
		
		
		
		
		//write your code here
	}
}
