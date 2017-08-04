import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import music_management.*;

public class ShopTest{

  Shop shop;

  @Before
  public void before(){
    shop = new Shop();
  }

  @Test
  public void canCountStock(){
    assertEquals(0, shop.countStock());
  }
}