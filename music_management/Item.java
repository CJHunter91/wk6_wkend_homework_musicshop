package music_management;
import behaviours.*;

public class Item{

  Sellable item;
  int wholesalePrice;
  int retailPrice;

  public Item(Sellable item, int wholesalePrice, int retailPrice){
    this.item = item;
    this.wholesalePrice = wholesalePrice;
    this.retailPrice = retailPrice;
  }


}