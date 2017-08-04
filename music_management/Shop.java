package music_management;
import java.util.*;
import behaviours.*;

public class Shop{
  private ArrayList<Sellable> stock;

  public Shop(){
    this.stock = new ArrayList<Sellable>();
  }

  public int countStock(){
    return stock.size();
  }

  public void addStock(Sellable item){
    stock.add(item);
  }

  public void removeStock(){
    stock.clear();
  }
}