package Reader;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

public class Reader {
	public static void main(String[] args) throws MalformedURLException, IOException{
		//get a url
		String url = "https://docs.google.com/document/d/1ygnI0izMC6MGE5jK14e6mIzfu1wtyIq2N7rueqqlkrA/edit";
		System.out.println(fromURL);
	}
	public static String fromURL(String url) throws MalformedURLException, IOException{
		InputStream is = new URL(url).openStream();
		return is.toString();
	}
}
