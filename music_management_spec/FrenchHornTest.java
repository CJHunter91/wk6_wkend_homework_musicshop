import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import music_management.*;

public class FrenchHornTest{

  FrenchHorn horn;

  @Before
  public void before(){
    horn = new FrenchHorn(InstrumentType.WIND, InstrumentColour.GOLD, 300, 500);
  }

  @Test
  public void canGetMarkUp(){
    assertEquals(200, horn.calculateMarkUp());
  }
}