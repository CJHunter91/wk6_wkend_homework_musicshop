import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import music_management.*;

public class GuitarTest{
  
  Guitar guitar; 
  
  @Before

  public void before(){
    guitar = new Guitar(6, InstrumentType.STRINGS, InstrumentColour.RED, 100, 200); 
  }

  @Test
  public void canPlay(){
    assertEquals("Strum", guitar.play());
  }

  @Test
  public void canCalculateMarkUp(){
    assertEquals(100, guitar.calculateMarkUp());
  }

  
}