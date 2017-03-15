import java.util.Scanner;
class BSTMain {
	public static void main(String[] args) {
		BSTrees obj = new BSTrees();
    boolean result;
		Scanner sc = new Scanner(System.in);
    String command = sc.nextLine();
    String []splitCommands = command.split(",");
    for(int i = 0; i < splitCommands.length ; i ++) {
      String opr = splitCommands[i].charAt(0) + "";
      if(opr.equals("e")) {
        break;
      }
      int num = Integer.parseInt(splitCommands[i].substring(1) +"");
      if(opr.equals("I")) {
        obj.insert(num);
        obj.inorder();
        System.out.println();
      }
      if(opr.equals("R")) {
        obj.delete(num);
        obj.postprint();
        System.out.println();
      }
      if(opr.equals("S")) {
         result = obj.search(num);
       if(result) {
        System.out.println("true,"+obj.getCount());
        } else {
        System.out.println("false,"+(obj.getPos()));
        }
      }
	   }
  }
}