class x {
	x() {
		System.out.println("hello");
	}
}

interface y 
{
	abstract void y();
}

interface a extends x //implements y
{
	abstract void x();
	//abstract void y();
	public void move()
	{
		System.out.println("Hello moving");
	}
}

class z extends a implements y
{
	z()
	{
	System.out.println("this is real");
	}
	public void x()
	{
		System.out.println("this is x");
	}
	public void y()
	{
		System.out.println("this is y");
	}
	
}

public class InterfaceTest
{
	public static void main(String args[])
	{
		z obj = new z();
		obj.y();
		obj.x();
		obj.move();
	}
}