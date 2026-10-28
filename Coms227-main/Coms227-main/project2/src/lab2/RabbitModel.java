package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel
{
  // TODO - add instance variables as needed
	private int Population;
	private int lastPopulation;
	private int beforePopulation;
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel()
  {
    // TODO
	  lastPopulation = 1;
	  beforePopulation = 0;
	  Population = 0;
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    // TODO - returns a dummy value so code will compile
    return Population;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
    // TODO
	  Population = beforePopulation + lastPopulation;
	  
	  beforePopulation = lastPopulation;
	  lastPopulation = Population;
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    // TODO
	  lastPopulation = 1;
	  beforePopulation = 0;
	  Population = 0;
  }
}
