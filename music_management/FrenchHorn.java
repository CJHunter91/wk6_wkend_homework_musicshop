package music_management;

public class FrenchHorn extends Instrument{

  public FrenchHorn(InstrumentType type, InstrumentColour colour, int wholesalePrice, int retailPrice ){
    super(colour, type, wholesalePrice, retailPrice);
  }

  public String play(){
    return "Broot";
  }
}