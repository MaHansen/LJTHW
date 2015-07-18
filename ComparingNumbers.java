import java.util.Scanner;

//Exercise 16
public class ComparingNumbers
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double first, second;
		
		System.out.print( "Give me two numbers. First: " );
		first = keyboard.nextDouble();
		System.out.print( "Second: " );
		second = keyboard.nextDouble();
		
		if ( first < second )
		{
			System.out.println( first + " is LESS THEN " + second );
		}
		if ( first <= second )
		{
			System.out.println( first + " is LESS THAN or EQUAL TO " + second );
		}
		if ( first == second )
		{
			System.out.println( first + " is EQUAL TO " + second );
		}
		if ( first >= second )
		{
			System.out.println( first + " is GREATER THAN or EQUAL TO " + second );
		}
		if ( first > second )
		{
			System.out.println( first + " is GREATER THAN " + second );
		}
		if ( first != second )
		{
			System.out.println( first + " is NOT EQUAL TO " + second );
		}
	}
}