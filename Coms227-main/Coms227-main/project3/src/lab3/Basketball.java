package lab3;

public class Basketball
{
	private double diameter;
    private boolean inflation;
    
  public Basketball(double givenDiameter)
  {
	  diameter = givenDiameter;
  }

  public boolean isDribbleable()
  {
    return inflation;
  }

  public double getDiameter()
  {
    return diameter;
  }

  public double getCircumference()
  {
    return 0;
  }

  public void inflate()
  {
	  inflation = true;
  }
}
