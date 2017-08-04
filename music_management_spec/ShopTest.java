import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import music_management.*;

public class ShopTest{

  Shop shop;
  Sellable guitar;

  @Before
  public void before(){
    shop = new Shop();
    guitar = new Guitar(6, InstrumentType.STRINGS, InstrumentColour.RED, 100, 200); 

  }

  @Test
  public void canCountStock(){
    assertEquals(0, shop.countStock());
  }

  @Test
  public void canAddStock(){
    shop.addStock(guitar);
    assertEquals(1, shop.countStock());
  }
}