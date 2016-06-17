//package general;
 
// This file reads file in 7 formats but not binary
 
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.zip.GZIPInputStream; 
import org.apache.commons.io.FilenameUtils; //needs apache commons jars

public class PrintFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
			String filename = "file.txt";
			String ext = FilenameUtils.getExtension(filename);
			if(ext.equals("txt")||ext.equals("css")||ext.equals("html")||ext.equals("json")||ext.equals("py")||ext.equals("doc"))
			{
				FileReader fileReader = new FileReader(filename);
				
		            BufferedReader bufferedReader = 
		                new BufferedReader(fileReader);
		            
		            String line;
					while((line = bufferedReader.readLine()) != null) {
		                System.out.println(line);
		            }   
		            bufferedReader.close();         
			}
			else if(ext.equals("gz"))  // not for Binary
			{
	        GZIPInputStream in = new GZIPInputStream(new FileInputStream(filename));
	 
	        byte[] buf = new byte[1024];
	        int len;
	        while ((len = in.read(buf)) > 0) {
	            System.out.write(buf, 0, len);
	        }
	        in.close();
			}
		}
		catch(Exception e ){
			System.out.print(e);;
		}
	}

}
