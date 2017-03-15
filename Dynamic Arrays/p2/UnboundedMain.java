import java.util.Scanner;
@SuppressWarnings("unchecked")
class UnboundedMain {
	public static void main(String [] args) {
	Scanner st = new Scanner(System.in);

	String str = "";
	int value;
	char ch = st.next().charAt(0);
	switch (ch) {
		case 'I': Unbounded ub = new Unbounded<Integer>(1);
							do {
									str = st.next();
									switch (str) {
										case "push": value = Integer.parseInt(st.next());
																ub.pushBack(value);break;
										case "pop": ub.popBack();break;
										case "size": ub.sizeOf();break;
										case "capacity": ub.capacityOf();break;
										case "print": ub.print();break;
										default: break;
										}
								}while(!str.equals("end"));break;
		case 'C':Unbounded ub1 = new Unbounded<Character>(1);
							do {
									str = st.next();
									switch (str) {
										case "push": str = st.next();
																ub1.pushBack(str.charAt(0));break;
										case "pop": ub1.popBack();break;
										case "size": ub1.sizeOf();break;
										case "capacity": ub1.capacityOf();break;
										case "print": ub1.print();break;
										default: break;
										}
								}while(!str.equals("end"));break;
		case 'S': Unbounded ub2 = new Unbounded<String>(1);
							do {
									str = st.next();
									switch (str) {
										case "push": str = st.next();
																ub2.pushBack(str);break;
										case "pop": ub2.popBack();break;
										case "size": ub2.sizeOf();break;
										case "capacity": ub2.capacityOf();break;
										case "print": ub2.print();break;
										default: break;
										}
								}while(!str.equals("end"));break;
		case 'F':	Unbounded ub3 = new Unbounded<Float>(1);
							do {
									str = st.next();
									switch (str) {
										case "push": Float val = Float.parseFloat(st.next());
																ub3.pushBack(val);break;
										case "pop": ub3.popBack();break;
										case "size": ub3.sizeOf();break;
										case "capacity": ub3.capacityOf();break;
										case "print": ub3	.print();break;
										default: break;
										}
								}while(!str.equals("end"));break;
		}
	}
}