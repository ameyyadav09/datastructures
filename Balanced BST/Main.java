import java.util.Scanner;
@SuppressWarnings("unchecked")
public class Main<T extends Comparable<T>> {
	public static void main(String[] args) {
		Avl obj = new Avl();
    boolean result;
		Scanner sc = new Scanner(System.in);
    String command = sc.nextLine();
    String []splitCommands = command.split(",");
    for(int i = 0; i < splitCommands.length ; i ++) {
      String opr = splitCommands[i].charAt(0) + "";
      if(opr.equals("e")) {
        break;
      }
      int num = Integer.parseInt(splitCommands[i].substring(2) +"");
      if(opr.equals("I")) {
        obj.insert(num);
        obj.inorder();
      }
      if(opr.equals("R")) {
        obj.delete(num);
      }
      if(opr.equals("S")) {
      	try{
         result = obj.search(num);
	       if(result) {
	        System.out.println("true,"+obj.getCount());
	        }
	        else {
	        	obj.getPos(num);
	        }
      	}
      	catch(Exception e) {
      		System.out.println("false,0");
      	}
    	}
 		}
 		System.out.println("height is: " + (obj.height()-1));
  }
}