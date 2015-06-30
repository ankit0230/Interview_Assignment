//Author: Ankit Gajbhiye

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Job_Assignment {

	public static void main(String[] args) {
		//call to reverse function with given command line arguments
        String output = reverse(args[1]) + reverse(args[0]);
		
        //printing the output
        System.out.println("The Output of a program is: " + output);


	
	}
	
	public static String reverse(String file){

		   String line = null;           //to read line by line
	        String content = "";        //stores content of file in single string
	        String reverse = "";		//to reverse the content of file
	    try {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = 
	            new FileReader(file);
	
	        // BufferedReader to read buffer 
	        BufferedReader bufferedReader = 
	            new BufferedReader(fileReader);
	        
	        //reads file and stores the content in content variable
			while((line = bufferedReader.readLine()) != null) {
	           //System.out.println(line);
	            content = content + line+ "\n";   	      
	        }
			//output content of file
			if(content == ""){
				System.out.println(file + " is empty");
			}
			else{
			System.out.println("Content of file " + file + " is: "+"\n"+ content);
			}
			int length = content.length();  //length of content
            
			//reversing the content
            for ( int i = length - 1 ; i >= 0 ; i-- )
               reverse = reverse + content.charAt(i);
       
            //System.out.println("Reverse of entered string is: "+reverse);
       
		     
	
	        // buffer close
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

