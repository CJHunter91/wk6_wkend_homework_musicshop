
import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import music_management.*;

public class GuitarTest{
  
  Guitar guitar; 
  
  @Before

  public void before(){
    guitar = new Guitar(6, InstrumentType.STRINGS, InstrumentColour.RED); 
  }

  @Test
  public void canStrum(){
    assertEquals("Strum", guitar.play());
  }
}