import java.util.Scanner;

public class dynamicList{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		char dataType;
		System.out.println("enter I,F,");
		dataType = input.next().charAt(0);
		String command1;
		int command2;
		
		switch(dataType) {
			
			case 'I': 		MyArrayList m = new MyArrayList<Integer>(10);
							do {
							System.out.println("enter command-add,remove");
							command1 = input.next();
							if(command1.equals("add")) {
								System.out.println("enter num-1,2,3");
								command2 = Integer.parseInt(input.next());
								m.add(command2);
							}
							else if(command1.equals("removeElement")) {	//String cmd = input.next()
								System.out.println("enter num 1,2 3");
								command2 = Integer.parseInt(input.next());
								m.removeElement(command2);
							}
							else if(command1.equals("read")) {
								System.out.println("enter num");
								command2 = Integer.parseInt(input.next());
								m.readElement(command2);
							}
							else if(command1.equals("modify")) {
								System.out.println("enter i5 or 5");
								String command3 = input.next();
								if((command3.charAt(0)+"").equals("i")) {
									System.out.println("enter 5");
									command2 = Integer.parseInt(input.next());
									int x = Integer.parseInt(command3.charAt(1)+"");
									m.modifyAtIndex(x,command2);
								}
								else {
									System.out.println("enter 5");
									int x = Integer.parseInt(command3.charAt(0)+"");
									command2 = Integer.parseInt(input.next());
									m.modifyElement(command3,command2);
								}
							}
							else if(command1.equals("print")) {
								m.display();
							}
							else
								command1 = "end";
							//command1 = input.next();
						}while(!command1.equals("end"));
						break;
			case 'C': 	MyArrayList m1 = new MyArrayList<String>(10);
						break;
			case 'S':	
						break;
			case 'F':
						break;
		}
		// MyArrayList<Integer> m=new MyArrayList<Integer>(10);
		// m.add(20);
		// m.add(30);
		// m.add(40);
		// m.display();
		// m.readElement(1);
		// m.display();
		// MyArrayList<String> s = new MyArrayList<String>(10);
		// // m.removeElement(30);
		// // m.display();
		// // m.removeAtIndex(1);
		// // m.display();
		// //Integer[] data = m.setData();
		
	}
}