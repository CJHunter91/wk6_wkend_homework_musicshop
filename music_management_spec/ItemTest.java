import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import music_management.*;

public class ItemTest{

  Item item;

  @Before
  public void before(){
    item = new Item(new Guitar(6, InstrumentType.STRINGS, InstrumentColour.RED), 10, 20);
  }


}