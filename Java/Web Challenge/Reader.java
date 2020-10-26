package Reader;

import java.io.IOException;
import java.io.InputStream;
import org.json.*;
import com.google.gson.*;

public class Reader {
	public static void main(String[] args) throws MalformedURLException, IOException{
		//get a url
		String url = "http://open.mapquestapi.com/geocoding/v1/reverse?key=SAd4Ez053FHMazmKomIl1l87zIrtLmFO&location=100,100&includeRoadMetadata=false&includeNearestIntersection=false\\\\r\\\\n";
		System.out.println(readJsonFromUrl(url));
	}
	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();//retruns the String of the JSON
	}
	
	public static JSONObject  (String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();//gets the JSON
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;//makes JSON usable
		} finally {
			is.close();
		}
	}
}
