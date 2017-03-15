abstract class x
{
	abstract void x();
	void move()
	{
	System.out.println("hello moving");
	}
}
class y extends x
{
	void y()
	{
	System.out.println("hello y");
	}
	void x()
	{
	System.out.println("overridden method");
	}
}
public class Demo
{
	public static void main(String args[])
	{
	y obj = new y();
	// x j = new x();
	// j.move();
	obj.x();
	obj.y();
	obj.move();
	}
}