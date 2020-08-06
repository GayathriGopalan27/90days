package day1;

public class SumOverloading {
	
	public int add(int a , int b)
	{
		int result = a+b;
		return result;
	}
	public int add(int a , int b ,int c)
	{
		int result = a+b+c;
		return result;
	}
	
	public float add(float a , float b )
	{
		float result = a+b;
		return result;
	}
	public float add(float a , float b,float c )
	{
		float result = a+b+c;
		return result;
	}
	public double add(double a , double b )
	{
		double result = a+b;
		return result;
	}
	public static void main(String[] args) {
		
		
		SumOverloading obj = new  SumOverloading();
		
		System.out.println(obj.add(5, 6));
		System.out.println(obj.add(5, 6,7)); 
		System.out.println(obj.add(5.1f, 6.3f,7.7f));
		System.out.println(obj.add(6.8f,3.1f));
		System.out.println(obj.add(6.8,3.1));

	}

}
