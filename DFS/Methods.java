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
		Stack stack = new Stack();
		int val = 0;
		int i = 1;
		traverse[val++] = i;
		visited[i] = 1;
		stack.push(i);
		while(!stack.isEmpty()) {
			i = stack.top();
			int j = i;
			while(j <= size) {
				if(array[i][j] == 1 && visited[j] == 0) {
					stack.push(j);
					visited[j] = 1;
					i = j; j = 1;
					traverse[val++] = i;
					continue;
				}
				j++;
			}
			stack.pop();
		}
	}
	public void print() {
		for(int i = 0 ; i < size ; i++) {
			System.out.print(traverse[i] + " ");
		}
	}
}