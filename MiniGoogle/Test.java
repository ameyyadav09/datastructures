import java.io.IOException;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
class Test
{
    public static void main(String args[]) throws IOException
    {
        Document doc = Jsoup.connect("http://www.abfuas.com").get();
         System.out.println(doc);
        String title = doc.title();
        System.out.println(title);
    }
}


 URL oracle = new URL("http://www.google.com/");
       BufferedReader in = new BufferedReader(
       new InputStreamReader(oracle.openStream()));

       String inputLine = in.readLine();
       while (inputLine != null)
           System.out.println(inputLine);
       in.close();