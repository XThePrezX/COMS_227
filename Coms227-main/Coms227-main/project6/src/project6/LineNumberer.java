package project6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineNumberer {
	public static void main(String[] args) throws FileNotFoundException
	  {
	    File file = new File("U:/cs227/workspace/project1/src/lab1/Greeter.java");
	    Scanner scanner = new Scanner(file);
	    int lineCount = 1;

	    while (scanner.hasNextLine())
	    {
	      String line = scanner.nextLine();
	      System.out.print(lineCount + " ");
	      System.out.println(line);
	      lineCount += 1;
	    }
	    scanner.close();
	  }

}
