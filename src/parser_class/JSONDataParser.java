package parser_class;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author Bhavin
 * @since 15/03/2016; 15:39
 */

public class JSONDataParser {
	
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
	


}
