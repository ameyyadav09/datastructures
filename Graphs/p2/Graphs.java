import java.util.Scanner;
class Graphs {
	public void check(int [][] array) {
		int count = 0;
	for ( int i = 0; i < array.length ; i++) {
			for( int j = 0; j< array.length ; j++) {
				if(array[i][j] == 1 && array[j][i] == 1) {
					if(i != j) {
						array[j][i] = 0;
					}
						count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int [][] array =  new int[num][num];
		for ( int i = 0; i < num ; i++) {
			for( int j = 0; j< num ; j++) {
				array[i][j] = Integer.parseInt(sc.next());
			}
		}
		Graphs obj = new Graphs();
		obj.check(array);
	}
	
}