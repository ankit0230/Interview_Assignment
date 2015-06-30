import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Job_Assignment {

	public static void main(String[] args) {
		
		String file1 = args[0];
		String file2 = args[1];
        String output = reverse(file2) + reverse(file1);
		System.out.println("The Output of a program is: " + output);


	
	}
	
	public static String reverse(String file){

		   String line = null;
	        String content = "";
	        String reverse = "";
	    try {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = 
	            new FileReader(file);
	
	        // Always wrap FileReader in BufferedReader.
	        BufferedReader bufferedReader = 
	            new BufferedReader(fileReader);
	    
			while((line = bufferedReader.readLine()) != null) {
	           // System.out.println(line);
	            content = content + line+ "\n";
	   	      
	        }
			
			System.out.println("Content of file " + file + " is: "+"\n"+ content);
			int length = content.length();
            
            for ( int i = length - 1 ; i >= 0 ; i-- )
               reverse = reverse + content.charAt(i);
       
            //System.out.println("Reverse of entered string is: "+reverse);
       
		     
	
	        // Always close files.
	        bufferedReader.close();
	    }
	    catch(FileNotFoundException ex) {
	        System.out.println(
	            "Unable to open file '" + 
	            file + "'");                
	    }
	    catch(IOException ex) {
	        System.out.println(
	            "Error reading file '" 
	            + file + "'");                   
	        // Or we could just do this: 
	        // ex.printStackTrace();
	    }
	    return reverse; 

	}

}

