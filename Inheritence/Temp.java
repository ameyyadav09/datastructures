import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Temp {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String str = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < str.length()-n+1; i++) {
            // System.out.println(str.substring(i,i+n));
            list.add(str.substring(i,i+n));
        }
        Collections.sort(list);
        Iterator it = list.iterator();

        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}