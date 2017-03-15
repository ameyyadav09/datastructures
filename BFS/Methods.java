import java.util.ArrayList;
class Methods {
	private ArrayList<Integer> comp;
	private int [] visited;
	private int [] traverse;
	private ArrayList<Integer> node;
	private int size;
	Methods(int num) {
		node = new ArrayList<Integer>();
		comp = new ArrayList<Integer>();
		visited = new int[num + 1];
		traverse = new int [num];
		this.size = num ;
	}
	public void bfs (int [][] array) {
		int i , element;
		visited[1] = 1;
		comp.add(1);
		node.add(1);
		while (node.size() != 0) {
			element = node.remove(0);
			i = 1;
			System.out.print(element + " ");
	      	while (i <= size) {
		        if (array[element][i] == 1) {
		        	if(visited[i] == 0) {
		            	node.add(i);
		      			visited[i] = 1;
		      		}
		      		comp.add(i);
		        }
	        	i++;
	      	}
	  	}
	}
}