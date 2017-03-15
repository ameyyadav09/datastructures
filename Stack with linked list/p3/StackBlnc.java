import java.util.Scanner;
class StackBlnc {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		String inputString = st.next();
		Stackbalance stackObject = new Stackbalance(inputString.length());			
		for(int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				if(!stackObject.isFull())
					stackObject.push(ch);
		  }
		  else if(ch == '}') {
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
		  else if(ch == ')') {
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
		  else if(ch == ']') {
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