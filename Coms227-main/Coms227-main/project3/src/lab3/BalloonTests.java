package lab3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import balloon4.Balloon;

public class BalloonTests {
    
	@Test
    public void getRadius()
    {
    	Balloon b = new Balloon(10);
      assertEquals(0, b.getRadius());
    }
	
    //Behavior
    @Test
    public void testifPopped()
    {
    	Balloon b = new Balloon(10);
      assertEquals(false, b.isPopped());
    }
    
 
    //Test cases
    @Test
    public void testBlow()
    {
    	Balloon b = new Balloon(10);
      b.blow(5);
      assertEquals(5, b.getRadius());
    }
    
    public void testBlow3()
    {
    	Balloon b = new Balloon(10);
      b.blow(10);
      assertEquals(10, b.getRadius());
    }
    
    public void testBlow4()
    {
    	Balloon b = new Balloon(10);
      b.blow(0);
      assertEquals(0, b.getRadius());
    }
    
    
    
    

    @Test
    public void testD()
    {
    	Balloon b = new Balloon(0);
     
      b.deflate();
      assertEquals(0, b.getRadius());
      assertEquals(false, b.isPopped());
    }

    
    @Test
    public void testDeflate()
    {
    	Balloon b = new Balloon(10);
      b.deflate();
      assertEquals(0, b.getRadius());
    }
    
    @Test
    public void doubleBlow()
    {
    	Balloon b = new Balloon(10);
    	b.blow(3);
    	b.blow(3);
      assertEquals(6, b.getRadius());
    }
    
    @Test
    public void popBlow()
    {
    	Balloon b = new Balloon(10);
    	b.pop();
    	b.blow(3);
      assertEquals(0, b.getRadius());
    }


    @Test
    public void testPop()
    {
    	Balloon b = new Balloon(10);
      b.pop();
      assertEquals(true, b.isPopped());
      assertEquals(0, b.getRadius());
    }
    
}
