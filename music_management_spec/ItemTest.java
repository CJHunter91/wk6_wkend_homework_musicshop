import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import music_management.*;

public class ItemTest{

  Item item;

  @Before
  public void before(){
    item = new Item("Guitar Strings", 10, 20);
  }

  @Test
  public void canGetMarkup(){
    assertEquals(10, item.calculateMarkUp());
  }


}