import java.util.Scanner;
class StackBlnc {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		String inputString = st.next();
		Stackbalance stackObject = new Stackbalance(inputString.length());			
		for(int i = 0; i < inputString.length(); i++) {
			if(inputString.charAt(i) == '(' || inputString.charAt(i) == '{' || inputString.charAt(i) == '[') {
				stackObject.push(inputString.charAt(i));
		  }
		  else if(inputString.charAt(i) == '}') {
		   	if(!stackObject.isEmpty()) {
			    if(stackObject.top() == '{') {
				    stackObject.pop();
			    } 
			  }
			  else {
				  System.out.println("Unbalanced inputString");
				  return;
			  } 
		  }
		  else if(inputString.charAt(i) == ')') {
			  if(!stackObject.isEmpty()) {
			    if(stackObject.top() == '(') {
				    stackObject.pop();
			    }
			  }
			  else {
				  System.out.println("Unbalanced inputString");
				  return;
		    }
		  }
		  else if(inputString.charAt(i) == ']') {
			  if(!stackObject.isEmpty()) {
			  	if(stackObject.top() == '[') {
				  	stackObject.pop();
			  	}
			  }
			  else {
				  System.out.println("Unbalanced inputString");
				  return;
			  }
			}
	  }
	  if(!stackObject.isEmpty()) {
	  	System.out.println("Unbalanced inputString");
	  }
	  else {
	  	System.out.println("Balanced inputString");
	  }
	}
}