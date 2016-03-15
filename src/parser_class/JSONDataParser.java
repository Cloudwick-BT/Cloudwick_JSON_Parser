package parser_class;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

/**
 * 
 * @author Bhavin
 * @since 15/03/2016; 15:39
 */

public class JSONDataParser extends JSONData {
	
	public static Reader getFileReader(String fileName){
		Reader in = null;
		try{
			in = new FileReader(fileName);
		}
		catch (FileNotFoundException e) { 
		e.printStackTrace();
		}
		return in;
	}
	
		
	public static void main(String[] args) throws UnsupportedEncodingException, IOException{
		String location =  "F:\\Cloudwick\\java_Cloudwick\\JSON Parser\\data.json";
		Reader input = getFileReader(location);
		//Map<String, String> dataMap ; 
		if (input == null){
			System.out.println("File not found !");
			return;
		}
		BufferedReader reader = new BufferedReader(input);
		
		/*InputStream in = JSONDataParser.class.getResourceAsStream(location);
		if(in==null) {
		  System.out.println("Did not find the file 'data.json' in the class path");
		  return;
		}*/

		//Reader reader = new InputStreamReader(in, "UTF-8");
            Gson gson = new GsonBuilder().create();
            JSONData p = gson.fromJson(reader, JSONData.class);
            System.out.println(p.toString());
            System.out.println(p.address);
                    
	
	
	}


}
