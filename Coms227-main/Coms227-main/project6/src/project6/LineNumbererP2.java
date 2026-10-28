package project6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineNumbererP2 {
	public static void main(String[] args) throws FileNotFoundException
	  {
	    File file = new File("story.txt");

	    Scanner scanner = new Scanner(file);
	    int loopIteration = 0;
	    int spaces = 0;

	    while (scanner.hasNextLine())
	    {
	      String line = scanner.nextLine();
	      
	      while(line.length() != loopIteration) {
	    	  if (line.charAt(loopIteration) == ' ') {
	    		  if (spaces == 0) {
	    			  spaces += 1;
	    		  }
	    		  spaces += 1;
	    	  }
	    	  loopIteration++;
	      }
	      System.out.println(spaces);
	      
	      spaces = 0;
	      loopIteration = 0;
	    }
	    scanner.close();
	  }

}
