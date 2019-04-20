package practise_set_02_unit_testing;

public class Calculator {
	/*
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int result = obj.add(5, 5);
		System.out.println("Result is : " + result);
	}
	*/
	public int add(int a, int b) {
		return a+b;
	}
	
	
	public int add(int[] values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}

}
