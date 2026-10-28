package project6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.awt.Point;
import plotter.Plotter;
import plotter.Polyline;
import java.util.ArrayList;

public class TestPlotter
{
	  public static void main(String[] args) throws FileNotFoundException
	  {
	    ArrayList<Polyline> list = readFile("hello.txt");
	    Plotter plotter = new Plotter();

	    for (Polyline p : list)
	    {
	      plotter.plot(p);
	    }
	  }

  private static Polyline parseOneLine(String line)
  {
	  Polyline p;
	  int width = -1;
	  Scanner scannedLine = new Scanner(line);


	  if (scannedLine.hasNextInt()) {
		  width = scannedLine.nextInt();
	  }

	  if (width > -1) {
		  p = new Polyline(scannedLine.next(), width);
	  } else {
		  p = new Polyline(scannedLine.next());
	  }

	  while(scannedLine.hasNextInt()) {
		  p.addPoint(new Point(scannedLine.nextInt(), scannedLine.nextInt()));
	  }

	  scannedLine.close();

	  return p;
  }
  
  private static ArrayList<Polyline> readFile(String filename)
	      throws FileNotFoundException
	  {
	  ArrayList<Polyline> results = new ArrayList<>();
	  
	  File file = new File(filename);
	  Scanner scanner = new Scanner(file);
	  
	  String line = scanner.nextLine();
	  
	  while (scanner.hasNextLine())
	  {
		  line = scanner.nextLine();
		  
		  if ((line.trim()).length() != 0) {
			  Polyline result = parseOneLine(line);
			  results.add(result);
		  }
	  }
	  scanner.close();

	  return results;
	  }
}
