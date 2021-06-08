import java.util.*;
class NonRainbowColour extends Exception
{
	public NonRainbowColour(String s)
	{
		super(s);
	}
}
class Test_NonRainbow
{
	public static void main(String[] args) 
	{		
		String rb[] = { "violet", "indigo", "blue", "yellow", "green", "orange", "red"};
		List<String> list = Arrays.asList(rb);

		String c, s;
		Scanner sc = new Scanner(System.in);

		System.out.println("Rithik Kanojia - 18075");
		System.out.print("Enter a colour : ");
		c = sc.next();
		s = c.toLowerCase();

		try
		{
			if (list.contains(s))
			{
				System.out.print("Colour entered is "+c+" and it is a rainbow colour");
			}else
			{
				throw new InvalidSaarcException("Entered colour is not a Rainbow Colour");
			}
		}catch(InvalidSaarcException e)
		{
			System.out.println(e.toString());
		}
	}
}