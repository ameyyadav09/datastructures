import java.util.ArrayList;
import java.util.Collections;
public class File {
	String filename;
	ArrayList<Integer> countList = new ArrayList<Integer>(); //stores countList of searh words in each line
	ArrayList<String> linesList = new ArrayList<String>();  //stores the linesList in which search words occur
	int total = 0; //to store total number of searchwords present in the file
	public File(String filename) {
		this.filename = filename;
	}
	public String getName() {
		return this.filename;
	}
	public void setcountList(int n) {
		countList.add(n);
	}	
	public ArrayList<Integer> getcountLists() {
		if(countList.size() <= 0)
			return null;
		else
			return countList;
	}
	public void addLine(String str) {
		linesList.add(str);
	}
	public ArrayList<String> getlinesList(){
		return linesList;
	}
	public void calculateTotal(){
		for(int i : countList) {
			total = total + i;
		}
	}
	public int getTotal() {
		return total;
	}
	public void sort() {
		int i;
		int j;
		for (i = 0; i < countList.size(); i++) {
			for (j = i + 1; j < countList.size(); j++) {
				if (countList.get(i) < countList.get(j))
					Collections.swap(countList,i,j);
			}
		}
	}
}


