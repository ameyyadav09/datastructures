import java.util.Scanner;
class DemoMain {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	char ch;
	ch = input.next().charAt(0);
	String str;
	String str1;
	int value;
	switch (ch) {
		case 'I': Methods mObject = new Methods<Integer>(1);
							do {
								str = input.next();
								switch (str) {
									case "add": value = Integer.parseInt(input.next());
															mObject.add(value);break;
									case "removeIndex": value = Integer.parseInt(input.next());
																			mObject.removeIndex(value);break;
									case "removeElement": value = Integer.parseInt(input.next());
																				mObject.removeElement(value);break;
									case "read": value = Integer.parseInt(input.next());
																mObject.read(value);break;
									case "modifyIndex": value = Integer.parseInt(input.next());
																			int value1 = Integer.parseInt(input.next());
																			mObject.modifyIndex(value,value1);break;
									case "modifyElement": value = Integer.parseInt(input.next());
																				int value2 = Integer.parseInt(input.next());
																				mObject.modifyElement(value , value2);break;
									case "print": mObject.print();break;
									default: break;
									}
							}while(!str.equals("end"));break;
			case 'C': Methods mObject3 = new Methods<Character>(10);
								do {
										str = input.next();
										switch (str) {
										case "add": str1 = input.next();
																mObject3.add(str1.charAt(0));break;
										case "removeIndex": value = Integer.parseInt(input.next());
																				mObject3.removeIndex(value);break;
										case "removeElement": str1 = input.next();
																					mObject3.removeElement(str1.charAt(0));break;
										case "read": mObject3.read(Integer.parseInt(input.next()));break;
										case "modifyIndex": value = Integer.parseInt(input.next());
																				str1 = input.next();
																				mObject3.modifyIndex(value,str1.charAt(0));break;
										case "modifyElement": str1 = input.next();
																					String str2 = input.next();
																					mObject3.modifyElement(str1.charAt(0) , str2.charAt(0));break;
										case "print": mObject3.print();break;
										default: break;
									}
								}while(!str.equals("end"));break;

			case 'S': Methods mObject1 = new Methods<Integer>(10);
								do {
								str = input.next();
								switch (str) {
									case "add": str1 = input.next();
															mObject1.add(str1);break;
									case "removeIndex": value = Integer.parseInt(input.next());
																				mObject1.removeIndex(value);break;						
									case "removeElement": str1 = input.next();
																				mObject1.removeElement(str1);break;
									case "read": value = Integer.parseInt(input.next());
																mObject1.read(value);break;
									case "modifyIndex": value = Integer.parseInt(input.next());
																			str1 = input.next();
																			mObject1.modifyIndex(value,str1);break;
									case "modifyElement": str1 = input.next();
																				String str2 = input.next();
																				mObject1.modifyElement(str1 , str2);break;
									case "print": mObject1.print();break;
									default: break;
									}
							}while(!str.equals("end"));break;

			case 'F': Methods mObject2 = new Methods<Float>(10);
								do {
								str = input.next();
								switch (str) {
									case "add": float f = Float.parseFloat(input.next());
															mObject2.add(f);break;
									case "removeIndex": value = Integer.parseInt(input.next());
																				mObject2.removeIndex(value);break;						
									case "removeElement": float valu = Float.parseFloat(input.next());
																				mObject2.removeElement(valu);break;
									case "read": value = Integer.parseInt(input.next());
																			mObject2.read(value);break;
									case "modifyIndex": value = Integer.parseInt(input.next());
																			float f1 = Float.parseFloat(input.next());
																			mObject2.modifyIndex(value,f1);break;
									case "modifyElement": float f2 = Float.parseFloat(input.next());
																				float f3 = Float.parseFloat(input.next());
																				mObject2.modifyElement(f2 , f3);break;
									case "print": mObject2.print();break;
									default: break;
									}
							}while(!str.equals("end"));break;
			default: break;
		}
	}
}
