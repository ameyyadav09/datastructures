import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class WebPage
{
	private ArrayList<String> masterList;
	private ArrayList<String> wordList;
	WebPage() {
		wordList = new ArrayList<String>();
		masterList = new ArrayList<String>();
	}

	public ArrayList<String> getAllLinks(String str)
	{
		ArrayList<String> linksInAPage = new ArrayList<String>();
		try {
	        Document doc = Jsoup.connect(str).get(); 
    		Elements links = doc.select("a[href]");
        	for ( Element link : links) {
        		linksInAPage.add(link.attr("abs:href"));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return linksInAPage;
	}

	public void getFullLinks(String url) {		
		ArrayList<String> tempList = new ArrayList<String>();
		masterList.add(url);		 
	    for (int i = 0; i < masterList.size(); i++) {
	    	tempList = getAllLinks(masterList.get(i));
	   		if(tempList == null)continue;
	    	for( int j = 0; j < tempList.size(); j++) {
	    		if(masterList.contains(tempList.get(j)) == false) {
	    			masterList.add(tempList.get(j));
	    		}
	    	}
	    	tempList.clear();
       }

	}

	public ArrayList<String> getContent(String url) throws IOException
	{
		ArrayList<String> contentList = new ArrayList<String>();
		Document doc = Jsoup.connect(url).get();
		Elements paragraphs = doc.select("html");
		//System.out.println(masterList.get(i));
		for(Element p : paragraphs) {
			StringTokenizer st = new StringTokenizer(p.text(),"`~!@#$%^&*()_+-={}[]|;:,<.>/?\'\" \t\n\b\r\0");
			while(st.hasMoreTokens()) {
				contentList.add(st.nextToken());
			}
		}
		return contentList;
			// System.out.println(masterList.get(i) + "\n");
			// System.out.print(contentList);
	}
	public void getWords() throws IOException
	{
		int count = 0;
		
		ArrayList<String> stopList = new ArrayList<String>();
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("StopWords.txt"));
				while ((sCurrentLine = br.readLine()) != null) {
				stopList.add(sCurrentLine);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (br != null)br.close();
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		for (int i =0 ; i < masterList.size(); i++) {
			ArrayList<String> tempList = getContent(masterList.get(i));
			for(int j = 0; j < tempList.size(); j++) {
				if(stopList.contains(tempList.get(j).toLowerCase()) == false) {
					wordList.add(tempList.get(j));
				}
			}
			tempList.clear();
		}
		//System.out.println(wordList);
	}

	public void getFrequencyCount()
	{

	}
}