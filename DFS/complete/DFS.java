import java.util.Scanner;
import java.util.StringTokenizer;
//stack class implimentation
class Stack {
	private int [] stackArray;
	private int count;
	private int top;
	Stack() {
		count = 20;
		top = -1;
		stackArray = new int [count];
	}
	public void push(int value) {
		if(top == count-1) {
			// System.out.println("stack full");
		}
		else {
			top++;
			stackArray[top] = value;
		}
	}
	public void pop() {
		if(isEmpty()) {
			// System.out.println("stack empty");
		}
		else {
			top--;
		}
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public int top () {
		return stackArray[top];
	}
}
//class methods which has a method called dfs for traversing the given graph
class Methods {
	private int [] visited;
	private int [] traverse;
	private int size;
	Methods(int num) {
		visited = new int[num + 1];
		traverse = new int [num];
		this.size = num ;
	}
	public void dfs(int [] [] array) {
		Stack stack = new Stack();//creating obj for stack class
		int val = 0;
		int i = 1;
		traverse[val++] = i;
		visited[i] = 1;//marking the visited nodes
		stack.push(i);//pushing initial element into stack
		while(!stack.isEmpty()) {
			i = stack.top();//checking the top most element
			int j = i;
			while(j <= size) {
				if(array[i][j] == 1 && visited[j] == 0) {
					stack.push(j);//pushing the next traversed elements
					visited[j] = 1;
					i = j; j = 1;
					traverse[val++] = i;//adding the traversed path elements to array
					continue;
				}
				j++;
			}
			stack.pop();//poping out the traversed element
		}
	}
	public void print() {
		for(int i = 0 ; i < size ; i++) {
			System.out.print(traverse[i] + " ");
		}
	}
}
//main class
class DFS {
	public static void main(String [] args) {
		int j = 0, k = 0;
		Scanner sc = new Scanner(System.in);
		int node = Integer.parseInt(sc.nextLine());
		int type = Integer.parseInt(sc.nextLine());
		int [] [] array = new int[node+1][node+1];
		Methods mj = new Methods(node);
		if( type == 0) {
			for( int i = 0; i < node; i++) {
				String str = sc.nextLine();
				StringTokenizer st = new StringTokenizer(str , "->");
				boolean flag = false;
				while (st.hasMoreTokens()) {
					if(flag == false) {
						j = (Integer.parseInt(st.nextToken()));
						flag = true;
					}
					if(flag == true){
						k = (Integer.parseInt(st.nextToken()));
					}
					array[j][k] = 1;
				}
			}
			mj.dfs(array);
			mj.print();
		}
		else if(type == 1) {
			for(int i = 1; i <= node ; i++) {
				for(j = 1; j <= node ; j++) {
					array[i][j] = Integer.parseInt(sc.next());
				}
			}
			mj.dfs(array);
			mj.print();
		}
	}
}