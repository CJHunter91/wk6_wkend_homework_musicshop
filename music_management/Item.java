package music_management;
import behaviours.*;

public class Item implements Sellable{

  String item;
  int wholesalePrice;
  int retailPrice;

  public Item(String item, int wholesalePrice, int retailPrice){
    this.item = item;
    this.wholesalePrice = wholesalePrice;
    this.retailPrice = retailPrice;
  }

  public int calculateMarkUp(){
    return this.retailPrice - this.wholesalePrice;
  }

}