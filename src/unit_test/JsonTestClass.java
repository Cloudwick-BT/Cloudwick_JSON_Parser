package unit_test;

import parser_class.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.Reader;
import org.junit.Test;
public class JsonTestClass {
	
	@Test
	public void testInput(){
		JSONDataParser parser = new JSONDataParser();
		String fileName = "F:\\Cloudwick\\java_Cloudwick\\JSON Parser\\data.json";
		Reader test = parser.getFileReader(fileName);
		assertNotNull(test);
	}
	

	

}
