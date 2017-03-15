import java.util.Comparator;
class Compare implements Comparator<File>{
	public int compare(File file1, File file2) {
		if(file1.total >= file2.total)
			return -1;
		else
			return 1;
	}
}