import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.net.*;
import java.io.*;
public class WebCrawler extends WebPage
{
    public static void main(String args[]) throws Exception
    {
    	//int length ;
       WebPage webpageObject = new WebPage();
       Scanner st = new Scanner(System.in);
      // ArrayList<String> linksInAPage = webpageObject.getAllLinks();
       webpageObject.getFullLinks("http://minigoogle.msitprogram.net/");  
       //webpageObject.getContent();
       webpageObject.getWords();
    }
}
//Oracle offers a comprehensive and fully integrated stack of cloud applications and platform services.