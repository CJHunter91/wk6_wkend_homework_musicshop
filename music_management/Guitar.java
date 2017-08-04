package music_management;

public class Guitar extends Instrument{

  private int numberStrings;

  public Guitar(int numberStrings, InstrumentType type, InstrumentColour colour, int wholesalePrice, int retailPrice ){
    super(colour, type, wholesalePrice, retailPrice);
    this.numberStrings = numberStrings;
  }

  public String play(){
    return "Strum";
  }


}