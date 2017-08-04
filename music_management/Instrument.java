package music_management;
import behaviours.*;

public abstract class Instrument implements Playable, Sellable{

  private InstrumentColour colour;
  private InstrumentType type;
  private int wholesalePrice;
  private int retailPrice;

  public Instrument(InstrumentColour colour, InstrumentType type, int wholesalePrice, int retailPrice){

    this.colour = colour;
    this.type = type;
    this.wholesalePrice = wholesalePrice;
    this.retailPrice = retailPrice;
  }

  public int calculateMarkUp(){
    return this.retailPrice - this.wholesalePrice;
  }


}