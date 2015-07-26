//Exercise 25
public class RandomNumbers2
{
	public static void main( String[] args )
	{
		int a, b, c, d, e, low, high;
		
		a = 1 + (int)(Math.random()*10);
		b = 1 + (int)(Math.random()*10);
		c = 1 + (int)(Math.random()*10);
		d = 1 + (int)(Math.random()*10);
		e = 1 + (int)(Math.random()*10);
		
		System.out.println( a + "\t" + b + "\t" + c + "\t" + d + "\t" + e );
		
		a = 1 + (int)(Math.random()*100);
		b = 1 + (int)(Math.random()*100);
		c = 1 + (int)(Math.random()*100);
		d = 1 + (int)(Math.random()*100);
		e = 1 + (int)(Math.random()*100);
		
		System.out.println( a + "\t" + b + "\t" + c + "\t" + d + "\t" + e );
		
		a = 1 + (int)(Math.random()*31); // 31 = 100-70+1?
		b = 1 + (int)(Math.random()*31);
		c = 1 + (int)(Math.random()*31);
		d = 1 + (int)(Math.random()*31);
		e = 1 + (int)(Math.random()*31);
		
		System.out.println( a + "\t" + b + "\t" + c + "\t" + d + "\t" + e );
		
		low  =  70;
		high = 100;
		
		a = 1 + (int)(Math.random()*(high-low+1));
		b = 1 + (int)(Math.random()*(high-low+1));
		c = 1 + (int)(Math.random()*(high-low+1));
		d = 1 + (int)(Math.random()*(high-low+1));
		e = 1 + (int)(Math.random()*(high-low+1));
		
		System.out.println( a + "\t" + b + "\t" + c + "\t" + d + "\t" + e );
	}
}