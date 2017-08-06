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

  @Test
  public void canRemoveSpecificStock(){
    shop.addStock(guitar);
    shop.removeStock(guitar);
    assertEquals(0, shop.countStock());
  }

  @Test
  public void canRemoveAllStock(){
    shop.addStock(guitar);
    shop.removeAllStock();
    assertEquals(0, shop.countStock());
  }
  @Test 
  public void canGetTotalPotentialProfit(){
    Guitar guitar2 = new Guitar(6, InstrumentType.STRINGS, InstrumentColour.RED, 100, 200); 
    shop.addStock(guitar);
    shop.addStock(guitar2);
    assertEquals(200, shop.totalPotentialProfit());
  }

  @Test 
  public void cancanGetTotalPotentialProfitFromItems(){
    Guitar guitar2 = new Guitar(6, InstrumentType.STRINGS, InstrumentColour.RED, 100, 200);
    Item item = new Item("Sheet Music", 10, 20); 
    shop.addStock(guitar);
    shop.addStock(guitar2);
    shop.addStock(item);
    assertEquals(210, shop.totalPotentialProfit());

  }
}