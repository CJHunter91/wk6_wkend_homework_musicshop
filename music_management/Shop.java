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

  public void removeAllStock(){
    stock.clear();
  }

  public int totalPotentialProfit(){
    int potentialProfit = 0;
    for(Sellable item: this.stock){
      potentialProfit += item.calculateMarkUp();
    }
    return potentialProfit;
  }
}